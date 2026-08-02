package com.yandex.mapkit;

import android.content.Intent;
import android.net.Uri;
import com.yandex.runtime.Runtime;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes15.dex */
public class UrlOpener {
    public static void open(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(SelfTester_JCP.IMITA);
        Runtime.getApplicationContext().startActivity(intent);
    }
}
