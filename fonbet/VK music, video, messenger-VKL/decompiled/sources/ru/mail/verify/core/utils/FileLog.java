package ru.mail.verify.core.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes11.dex */
public class FileLog {

    @Nullable
    private static volatile LogReceiver a;

    private static boolean a() {
        return a != null;
    }

    public static void d(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (a()) {
            LogReceiver logReceiver = a;
            Objects.requireNonNull(logReceiver);
            logReceiver.d(str, str2, th);
        }
    }

    public static void e(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (a()) {
            LogReceiver logReceiver = a;
            Objects.requireNonNull(logReceiver);
            logReceiver.e(str, str2, th);
        }
    }

    public static void init(@Nullable LogReceiver logReceiver) {
        a = logReceiver;
    }

    public static void v(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (a()) {
            LogReceiver logReceiver = a;
            Objects.requireNonNull(logReceiver);
            logReceiver.v(str, str2, th);
        }
    }

    public static void d(@NonNull String str, @NonNull String str2) {
        if (a()) {
            LogReceiver logReceiver = a;
            Objects.requireNonNull(logReceiver);
            logReceiver.d(str, str2);
        }
    }

    public static void e(@NonNull String str, @NonNull String str2) {
        if (a()) {
            LogReceiver logReceiver = a;
            Objects.requireNonNull(logReceiver);
            logReceiver.e(str, str2);
        }
    }

    public static void v(@NonNull String str, @NonNull String str2) {
        if (a()) {
            LogReceiver logReceiver = a;
            Objects.requireNonNull(logReceiver);
            logReceiver.v(str, str2);
        }
    }

    public static void d(@NonNull String str, @NonNull Throwable th, @NonNull String str2, @NonNull Object... objArr) {
        if (a()) {
            String format = String.format(Locale.US, str2, objArr);
            LogReceiver logReceiver = a;
            Objects.requireNonNull(logReceiver);
            logReceiver.d(str, format, th);
        }
    }

    public static void e(@NonNull String str, @NonNull Throwable th, @NonNull String str2, @NonNull Object... objArr) {
        if (a()) {
            String format = String.format(Locale.US, str2, objArr);
            LogReceiver logReceiver = a;
            Objects.requireNonNull(logReceiver);
            logReceiver.e(str, format, th);
        }
    }

    public static void v(@NonNull String str, @NonNull Throwable th, @NonNull String str2, @NonNull Object... objArr) {
        if (a()) {
            String format = String.format(Locale.US, str2, objArr);
            LogReceiver logReceiver = a;
            Objects.requireNonNull(logReceiver);
            logReceiver.v(str, format, th);
        }
    }

    public static void d(@NonNull String str, @NonNull String str2, @NonNull Object... objArr) {
        if (a()) {
            String format = String.format(Locale.US, str2, objArr);
            LogReceiver logReceiver = a;
            Objects.requireNonNull(logReceiver);
            logReceiver.d(str, format);
        }
    }

    public static void e(@NonNull String str, @NonNull String str2, @NonNull Object... objArr) {
        if (a()) {
            String format = String.format(Locale.US, str2, objArr);
            LogReceiver logReceiver = a;
            Objects.requireNonNull(logReceiver);
            logReceiver.e(str, format);
        }
    }

    public static void v(@NonNull String str, @NonNull String str2, @NonNull Object... objArr) {
        if (a()) {
            String format = String.format(Locale.US, str2, objArr);
            LogReceiver logReceiver = a;
            Objects.requireNonNull(logReceiver);
            logReceiver.v(str, format);
        }
    }
}
