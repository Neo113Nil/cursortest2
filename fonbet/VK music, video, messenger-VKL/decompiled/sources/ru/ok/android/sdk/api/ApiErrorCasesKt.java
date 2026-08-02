package ru.ok.android.sdk.api;

import ru.ok.android.api.core.ApiInvocationException;
import xsna.drm0;
import xsna.epx;

/* compiled from: ApiErrorCases.kt */
/* loaded from: classes9.dex */
public final class ApiErrorCasesKt {
    public static final boolean isAuthError(ApiInvocationException apiInvocationException) {
        String errorMessage;
        return apiInvocationException.getErrorCode() == 102 || apiInvocationException.getErrorCode() == 103 || (apiInvocationException.getErrorCode() == 100 && (((errorMessage = apiInvocationException.getErrorMessage()) != null && drm0.D(errorMessage, "session_key", false)) || epx.f(apiInvocationException.getErrorField(), "session_key")));
    }
}
