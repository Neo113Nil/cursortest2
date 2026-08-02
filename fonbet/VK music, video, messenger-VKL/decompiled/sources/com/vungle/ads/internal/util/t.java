package com.vungle.ads.internal.util;

import android.util.Log;
import kotlin.text.Regex;
import xsna.gzs;

/* loaded from: classes7.dex */
public abstract class t {
    public static void a(String str) {
        boolean z;
        Regex regex;
        z = u.a;
        if (z) {
            regex = u.b;
            regex.g(str, "xxx.xxx.xxx.xxx");
        }
    }

    public static void b(String str, String str2) {
        boolean z;
        Regex regex;
        z = u.a;
        if (z) {
            regex = u.b;
            Log.e(str, regex.g(str2, "xxx.xxx.xxx.xxx"));
        }
    }

    public static void c(String str, String str2) {
        boolean z;
        Regex regex;
        z = u.a;
        if (z) {
            regex = u.b;
            regex.g(str2, "xxx.xxx.xxx.xxx");
        }
    }

    public static int a(String str, String str2) {
        boolean z;
        Regex regex;
        z = u.a;
        if (!z) {
            return -1;
        }
        regex = u.b;
        return Log.d(str, regex.g(str2, "xxx.xxx.xxx.xxx"));
    }

    public static void a(String str, String str2, Throwable th) {
        boolean z;
        Regex regex;
        z = u.a;
        if (z) {
            StringBuilder sb = new StringBuilder();
            regex = u.b;
            sb.append(regex.g(str2, "xxx.xxx.xxx.xxx"));
            sb.append("; error: ");
            sb.append(th.getLocalizedMessage());
            Log.e(str, sb.toString());
        }
    }

    public static void a(String str, gzs gzsVar) {
        boolean z;
        Regex regex;
        z = u.a;
        if (z) {
            String str2 = (String) gzsVar.invoke();
            regex = u.b;
            regex.g(str2, "xxx.xxx.xxx.xxx");
        }
    }
}
