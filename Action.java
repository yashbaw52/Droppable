package seleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C://Users//Yash//Downloads//chromedriver_win32//chromedriver.exe");

		driver = new ChromeDriver();

		driver.navigate().to("https://demoqa.com/droppable");

		Actions action = new Actions(driver);

		WebElement from = driver.findElement(By.id("draggable"));

		WebElement to = driver.findElement(By.id("droppable"));

		action.dragAndDrop(from, to).build().perform();

		String text = to.getText();
		System.out.println(text);
		
		if(text.equals("Dropped!")) {
			System.out.println("Passed : the text matches with the given text");
			
		}
		else {
			System.out.println("Failed : the text does not matches the given text");
		}

	}

}
