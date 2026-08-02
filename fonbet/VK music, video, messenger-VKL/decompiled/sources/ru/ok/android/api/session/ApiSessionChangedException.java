package ru.ok.android.api.session;

import java.util.Arrays;
import java.util.Locale;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.h5s;
import xsna.jax0;
import xsna.n6j;
import xsna.xe9;

/* compiled from: ApiSessionChangedException.kt */
/* loaded from: classes9.dex */
public final class ApiSessionChangedException extends ApiInvocationException {
    private final String sessionKey;
    private final String sessionSecret;

    public ApiSessionChangedException(String str, String str2, String str3) {
        super(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, str);
        this.sessionKey = str2;
        this.sessionSecret = str3;
    }

    public final String getSessionKey() {
        return this.sessionKey;
    }

    public final String getSessionSecret() {
        return this.sessionSecret;
    }

    @Override // ru.ok.android.api.core.ApiInvocationException, java.lang.Throwable
    public String toString() {
        String str = this.sessionKey;
        String format = String.format(Locale.US, "0x%08x", Arrays.copyOf(new Object[]{Integer.valueOf(this.sessionSecret.hashCode())}, 1));
        int errorCode = getErrorCode();
        String errorMessage = getErrorMessage();
        String errorField = getErrorField();
        String errorData = getErrorData();
        String errorCustomJson = getErrorCustomJson();
        String errorCustomKey = getErrorCustomKey();
        StringBuilder a = xe9.a("ApiSessionChangedException{sessionKey=", str, "sessionSecret='", format, "', errorCode=");
        jax0.a(errorCode, ", errorMessage='", errorMessage, "', errorField='", a);
        n6j.b(a, errorField, "', errorData='", errorData, "', errorCustomData=");
        return h5s.d(a, errorCustomJson, ", errorCustomKey='", errorCustomKey, "'}");
    }
}
