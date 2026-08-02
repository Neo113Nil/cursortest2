package ru.ok.android.api.core;

/* compiled from: ApiException.kt */
/* loaded from: classes11.dex */
public class ApiException extends Exception {
    public ApiException() {
    }

    public ApiException(Throwable th) {
        super(th);
    }

    public ApiException(String str) {
        super(str);
    }

    public ApiException(String str, Throwable th) {
        super(str, th);
    }
}
