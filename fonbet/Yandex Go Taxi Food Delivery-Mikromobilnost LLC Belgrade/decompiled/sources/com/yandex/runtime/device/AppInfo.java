package com.yandex.runtime.device;

import android.content.Context;
import android.os.Bundle;
import com.yandex.runtime.Runtime;

/* loaded from: classes8.dex */
public class AppInfo {
    public static String appInfo(String str) {
        try {
            Context applicationContext = Runtime.getApplicationContext();
            Bundle bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
            Object obj = bundle.get(str);
            if (obj == null) {
                return null;
            }
            return obj instanceof Boolean ? ((Boolean) obj).booleanValue() ? "true" : "false" : obj instanceof Integer ? String.valueOf((Integer) obj) : obj instanceof Float ? String.valueOf((Float) obj) : obj instanceof Double ? String.valueOf((Double) obj) : obj instanceof Long ? String.valueOf((Long) obj) : bundle.getString(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
