package com.vungle.ads.internal.network;

import android.os.Build;
import com.vungle.ads.BuildConfig;

/* loaded from: classes7.dex */
public abstract class d0 {
    public static String a = a();
    public static String b;
    public static String c;

    public static void a(String str) {
        b = str;
    }

    public static String b() {
        return b;
    }

    public static void c(String str) {
        a = str;
    }

    public static String d() {
        return a;
    }

    public static String a() {
        return ("Amazon".equals(Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/").concat(BuildConfig.VERSION_NAME);
    }

    public static void b(String str) {
        c = str;
    }

    public static String c() {
        return c;
    }
}
