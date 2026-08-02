package org.chromium.base;

import java.util.Locale;
import xsna.go9;

/* loaded from: classes11.dex */
public class Log {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    private Log() {
    }

    public static void d(String str, String str2, Object... objArr) {
        if (isLoggable(str, 3)) {
            formatLog(str2, getThrowableToLog(objArr), objArr);
            normalizeTag(str);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        Throwable throwableToLog = getThrowableToLog(objArr);
        String formatLog = formatLog(str2, throwableToLog, objArr);
        String normalizeTag = normalizeTag(str);
        if (throwableToLog != null) {
            android.util.Log.e(normalizeTag, formatLog, throwableToLog);
        } else {
            android.util.Log.e(normalizeTag, formatLog);
        }
    }

    private static String formatLog(String str, Throwable th, Object[] objArr) {
        return objArr != null ? ((th != null || objArr.length <= 0) && objArr.length <= 1) ? str : String.format(Locale.US, str, objArr) : str;
    }

    public static String getStackTraceString(Throwable th) {
        return android.util.Log.getStackTraceString(th);
    }

    private static Throwable getThrowableToLog(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    public static void i(String str, String str2, Object... objArr) {
        formatLog(str2, getThrowableToLog(objArr), objArr);
        normalizeTag(str);
    }

    public static boolean isLoggable(String str, int i) {
        return android.util.Log.isLoggable(str, i);
    }

    public static String normalizeTag(String str) {
        return go9.b("cn_", str);
    }

    public static void v(String str, String str2, Object... objArr) {
        if (isLoggable(str, 2)) {
            formatLog(str2, getThrowableToLog(objArr), objArr);
            normalizeTag(str);
        }
    }

    public static void w(String str, String str2, Object... objArr) {
        formatLog(str2, getThrowableToLog(objArr), objArr);
        normalizeTag(str);
    }

    public static void wtf(String str, String str2, Object... objArr) {
        Throwable throwableToLog = getThrowableToLog(objArr);
        String formatLog = formatLog(str2, throwableToLog, objArr);
        String normalizeTag = normalizeTag(str);
        if (throwableToLog != null) {
            android.util.Log.wtf(normalizeTag, formatLog, throwableToLog);
        } else {
            android.util.Log.wtf(normalizeTag, formatLog);
        }
    }

    public static void i(String str, String str2) {
        normalizeTag(str);
    }

    public static void w(String str, String str2) {
        normalizeTag(str);
    }

    public static void i(String str, String str2, Throwable th) {
        normalizeTag(str);
    }

    public static void w(String str, String str2, Throwable th) {
        normalizeTag(str);
    }

    public static void e(String str, String str2) {
        android.util.Log.e(normalizeTag(str), str2);
    }

    public static void i(String str, String str2, Object obj) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj);
    }

    public static void w(String str, String str2, Object obj) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj);
    }

    public static void wtf(String str, String str2) {
        android.util.Log.wtf(normalizeTag(str), str2);
    }

    public static void e(String str, String str2, Throwable th) {
        android.util.Log.e(normalizeTag(str), str2, th);
    }

    public static void wtf(String str, String str2, Throwable th) {
        android.util.Log.wtf(normalizeTag(str), str2, th);
    }

    public static void e(String str, String str2, Object obj) {
        android.util.Log.e(normalizeTag(str), String.format(Locale.US, str2, obj));
    }

    public static void i(String str, String str2, Object obj, Throwable th) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj);
    }

    public static void w(String str, String str2, Object obj, Throwable th) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj);
    }

    public static void wtf(String str, String str2, Object obj) {
        android.util.Log.wtf(normalizeTag(str), String.format(Locale.US, str2, obj));
    }

    public static void e(String str, String str2, Object obj, Throwable th) {
        android.util.Log.e(normalizeTag(str), String.format(Locale.US, str2, obj), th);
    }

    public static void i(String str, String str2, Object obj, Object obj2) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj, obj2);
    }

    public static void w(String str, String str2, Object obj, Object obj2) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj, obj2);
    }

    public static void wtf(String str, String str2, Object obj, Throwable th) {
        android.util.Log.wtf(normalizeTag(str), String.format(Locale.US, str2, obj), th);
    }

    public static void e(String str, String str2, Object obj, Object obj2) {
        android.util.Log.e(normalizeTag(str), String.format(Locale.US, str2, obj, obj2));
    }

    public static void i(String str, String str2, Object obj, Object obj2, Throwable th) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj, obj2);
    }

    public static void w(String str, String str2, Object obj, Object obj2, Throwable th) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj, obj2);
    }

    public static void wtf(String str, String str2, Object obj, Object obj2) {
        android.util.Log.wtf(normalizeTag(str), String.format(Locale.US, str2, obj, obj2));
    }

    public static void e(String str, String str2, Object obj, Object obj2, Throwable th) {
        android.util.Log.e(normalizeTag(str), String.format(Locale.US, str2, obj, obj2), th);
    }

    public static void i(String str, String str2, Object obj, Object obj2, Object obj3) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj, obj2, obj3);
    }

    public static void w(String str, String str2, Object obj, Object obj2, Object obj3) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj, obj2, obj3);
    }

    public static void wtf(String str, String str2, Object obj, Object obj2, Throwable th) {
        android.util.Log.wtf(normalizeTag(str), String.format(Locale.US, str2, obj, obj2), th);
    }

    public static void e(String str, String str2, Object obj, Object obj2, Object obj3) {
        android.util.Log.e(normalizeTag(str), String.format(Locale.US, str2, obj, obj2, obj3));
    }

    public static void i(String str, String str2, Object obj, Object obj2, Object obj3, Throwable th) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj, obj2, obj3);
    }

    public static void w(String str, String str2, Object obj, Object obj2, Object obj3, Throwable th) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj, obj2, obj3);
    }

    public static void wtf(String str, String str2, Object obj, Object obj2, Object obj3) {
        android.util.Log.wtf(normalizeTag(str), String.format(Locale.US, str2, obj, obj2, obj3));
    }

    public static void e(String str, String str2, Object obj, Object obj2, Object obj3, Throwable th) {
        android.util.Log.e(normalizeTag(str), String.format(Locale.US, str2, obj, obj2, obj3), th);
    }

    public static void i(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj, obj2, obj3, obj4);
    }

    public static void w(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj, obj2, obj3, obj4);
    }

    public static void wtf(String str, String str2, Object obj, Object obj2, Object obj3, Throwable th) {
        android.util.Log.wtf(normalizeTag(str), String.format(Locale.US, str2, obj, obj2, obj3), th);
    }

    public static void e(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        android.util.Log.e(normalizeTag(str), String.format(Locale.US, str2, obj, obj2, obj3, obj4));
    }

    public static void i(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Throwable th) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj, obj2, obj3, obj4);
    }

    public static void w(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Throwable th) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj, obj2, obj3, obj4);
    }

    public static void wtf(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        android.util.Log.wtf(normalizeTag(str), String.format(Locale.US, str2, obj, obj2, obj3, obj4));
    }

    public static void i(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj, obj2, obj3, obj4, obj5);
    }

    public static void w(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj, obj2, obj3, obj4, obj5);
    }

    public static void e(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Throwable th) {
        android.util.Log.e(normalizeTag(str), String.format(Locale.US, str2, obj, obj2, obj3, obj4), th);
    }

    public static void i(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Throwable th) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj, obj2, obj3, obj4, obj5);
    }

    public static void w(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Throwable th) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj, obj2, obj3, obj4, obj5);
    }

    public static void wtf(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Throwable th) {
        android.util.Log.wtf(normalizeTag(str), String.format(Locale.US, str2, obj, obj2, obj3, obj4), th);
    }

    public static void e(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        android.util.Log.e(normalizeTag(str), String.format(Locale.US, str2, obj, obj2, obj3, obj4, obj5));
    }

    public static void i(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static void w(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static void wtf(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        android.util.Log.wtf(normalizeTag(str), String.format(Locale.US, str2, obj, obj2, obj3, obj4, obj5));
    }

    public static void e(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Throwable th) {
        android.util.Log.e(normalizeTag(str), String.format(Locale.US, str2, obj, obj2, obj3, obj4, obj5), th);
    }

    public static void i(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Throwable th) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static void w(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Throwable th) {
        normalizeTag(str);
        String.format(Locale.US, str2, obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static void wtf(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Throwable th) {
        android.util.Log.wtf(normalizeTag(str), String.format(Locale.US, str2, obj, obj2, obj3, obj4, obj5), th);
    }

    public static void e(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        android.util.Log.e(normalizeTag(str), String.format(Locale.US, str2, obj, obj2, obj3, obj4, obj5, obj6));
    }

    public static void wtf(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        android.util.Log.wtf(normalizeTag(str), String.format(Locale.US, str2, obj, obj2, obj3, obj4, obj5, obj6));
    }

    public static void e(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Throwable th) {
        android.util.Log.e(normalizeTag(str), String.format(Locale.US, str2, obj, obj2, obj3, obj4, obj5, obj6), th);
    }

    public static void wtf(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Throwable th) {
        android.util.Log.wtf(normalizeTag(str), String.format(Locale.US, str2, obj, obj2, obj3, obj4, obj5, obj6), th);
    }
}
