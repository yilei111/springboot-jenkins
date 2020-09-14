package com.jenkins.springbootjenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yilei
 * @version 1.0
 * @description TODO
 * @className MainController
 * @date 2020/9/13 16:33
 **/
@RestController
@RequestMapping("/main")
public class MainController {

    @GetMapping(value = "/index")
    public String send() {
        return "4444444444！";
    }
}
