package ru.ok.media.logging;

import android.util.Log;

/* loaded from: classes9.dex */
public class Logger {
    private static final String METHOD_D = "d";
    private static final String METHOD_E = "e";
    private static final String METHOD_V = "v";
    private static final String METHOD_W = "w";
    private static volatile boolean loggingEnable = false;

    private static String buildMessageString(String str, String str2) {
        StackTraceElement trace = trace(str);
        return trace.getMethodName() + " (" + trace.getLineNumber() + "): " + str2;
    }

    public static void d(String str, Object... objArr) {
        if (isLoggingEnable()) {
            try {
                d(String.format(str, objArr));
            } catch (Exception unused) {
                d(str);
            }
        }
    }

    public static void e(String str, Object... objArr) {
        if (isLoggingEnable()) {
            try {
                e(String.format(str, objArr));
            } catch (Exception unused) {
                e(str);
            }
        }
    }

    private static String extractClassName(String str) {
        return trace(str).getClassName();
    }

    private static boolean isLoggingEnable() {
        return loggingEnable;
    }

    public static void setLoggingEnabled(boolean z) {
        loggingEnable = z;
    }

    private static StackTraceElement trace(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i = 0;
        boolean z = false;
        while (i < stackTrace.length) {
            boolean equals = stackTrace[i].getMethodName().equals(str);
            if (z && !equals) {
                break;
            }
            i++;
            z = equals;
        }
        return stackTrace[i];
    }

    public static void v(String str) {
        if (isLoggingEnable()) {
            extractClassName("v");
            buildMessageString("v", str);
        }
    }

    public static void w(String str, Object... objArr) {
        if (isLoggingEnable()) {
            try {
                w(String.format(str, objArr));
            } catch (Exception unused) {
                w(str);
            }
        }
    }

    public static void d(String str) {
        if (isLoggingEnable()) {
            extractClassName("d");
            buildMessageString("d", str);
        }
    }

    public static void e(Throwable th, String str, Object... objArr) {
        if (isLoggingEnable()) {
            try {
                e(th, String.format(str, objArr));
            } catch (Exception unused) {
                e(th, str);
            }
        }
    }

    public static void v(String str, Object... objArr) {
        if (isLoggingEnable()) {
            try {
                v(String.format(str, objArr));
            } catch (Exception unused) {
                v(str);
            }
        }
    }

    public static void w(Throwable th, String str, Object... objArr) {
        if (isLoggingEnable()) {
            try {
                w(th, String.format(str, objArr));
            } catch (Exception unused) {
                w(th, str);
            }
        }
    }

    public static void e(Throwable th) {
        if (isLoggingEnable()) {
            e(th, "error");
        }
    }

    public static void w(String str) {
        if (isLoggingEnable()) {
            extractClassName("w");
            buildMessageString("w", str);
        }
    }

    public static void e(String str) {
        if (isLoggingEnable()) {
            e((Throwable) null, str);
        }
    }

    public static void w(Throwable th, String str) {
        if (isLoggingEnable()) {
            extractClassName("w");
            buildMessageString("w", str);
        }
    }

    public static void e(Throwable th, String str) {
        if (isLoggingEnable()) {
            Log.e(extractClassName("e"), buildMessageString("e", str), th);
        }
    }
}
