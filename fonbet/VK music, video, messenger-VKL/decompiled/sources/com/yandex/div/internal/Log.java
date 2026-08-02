package com.yandex.div.internal;

import androidx.annotation.NonNull;
import com.yandex.div.logging.Severity;

/* loaded from: classes7.dex */
public class Log {
    private static volatile boolean sEnabled = false;
    private static volatile Severity sSeverity = Severity.VERBOSE;

    public static void d(@NonNull String str, @NonNull String str2) {
        isAtLeast(Severity.DEBUG);
    }

    public static void e(@NonNull String str, @NonNull String str2) {
        if (isAtLeast(Severity.ERROR)) {
            android.util.Log.e(str, str2);
        }
    }

    public static boolean isAtLeast(Severity severity) {
        if (isEnabled()) {
            return sSeverity.isAtLeast(severity);
        }
        return false;
    }

    public static boolean isEnabled() {
        return sEnabled;
    }

    public static void w(@NonNull String str, @NonNull String str2) {
        isAtLeast(Severity.WARNING);
    }

    public static void e(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (isAtLeast(Severity.ERROR)) {
            android.util.Log.e(str, str2, th);
        }
    }
}
