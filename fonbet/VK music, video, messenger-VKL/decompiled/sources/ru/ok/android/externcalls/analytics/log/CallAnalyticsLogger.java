package ru.ok.android.externcalls.analytics.log;

/* compiled from: CallAnalyticsLogger.kt */
/* loaded from: classes9.dex */
public interface CallAnalyticsLogger {
    void d(String str, String str2);

    void e(String str, String str2);

    void e(String str, String str2, Throwable th);

    void i(String str, String str2);

    default void report(String str, String str2, Throwable th) {
        e(str, str2, th);
    }

    void v(String str, String str2);

    void w(String str, String str2);

    void w(String str, String str2, Throwable th);
}
