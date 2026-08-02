package ru.ok.android.api.core;

/* compiled from: ApiRequestException.kt */
/* loaded from: classes9.dex */
public class ApiRequestException extends ApiException {
    public ApiRequestException(Throwable th) {
        super(th);
    }

    public ApiRequestException(String str) {
        super(str);
    }

    public ApiRequestException(String str, Throwable th) {
        super(str, th);
    }
}
