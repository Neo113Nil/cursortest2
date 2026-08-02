package ru.ok.android.externcalls.sdk.api;

import androidx.annotation.Nullable;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.vu5;

/* loaded from: classes9.dex */
public class ExternApiException extends RuntimeException {
    private final int errorCode;
    private final String extErrorCode;

    public ExternApiException(ApiInvocationException apiInvocationException, int i, @Nullable String str) {
        super(apiInvocationException.getErrorMessage(), apiInvocationException);
        this.errorCode = i;
        this.extErrorCode = str;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public String getExtendedError() {
        return this.extErrorCode;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return vu5.b(new StringBuilder("ExternApiException{errorCode="), this.errorCode, '}');
    }
}
