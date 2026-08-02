package ru.ok.android.externcalls.sdk.audio;

/* compiled from: Logger.kt */
/* loaded from: classes9.dex */
public interface Logger {
    void d(String str, String str2);

    void d(String str, String str2, Throwable th);

    void e(String str, String str2);

    void e(String str, String str2, Throwable th);

    void i(String str, String str2);

    void i(String str, String str2, Throwable th);

    default void reportError(String str, String str2, Throwable th) {
        e(str, str2, th);
    }

    void v(String str, String str2);

    void v(String str, String str2, Throwable th);

    void w(String str, String str2);

    void w(String str, String str2, Throwable th);

    void w(String str, Throwable th);
}
