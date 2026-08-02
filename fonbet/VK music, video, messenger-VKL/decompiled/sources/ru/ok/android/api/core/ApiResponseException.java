package ru.ok.android.api.core;

/* compiled from: ApiResponseException.kt */
/* loaded from: classes9.dex */
public final class ApiResponseException extends ApiException {
    public ApiResponseException(Throwable th) {
        super(th);
    }

    public ApiResponseException(String str) {
        super(str);
    }

    public ApiResponseException(String str, Throwable th) {
        super(str, th);
    }
}
