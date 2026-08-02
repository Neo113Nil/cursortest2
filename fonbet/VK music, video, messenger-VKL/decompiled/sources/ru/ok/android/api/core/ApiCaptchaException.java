package ru.ok.android.api.core;

/* compiled from: ApiCaptchaException.kt */
/* loaded from: classes9.dex */
public final class ApiCaptchaException extends ApiInvocationException {
    private final String verificationUrl;

    public ApiCaptchaException(String str, String str2) {
        super(403, str);
        this.verificationUrl = str2;
    }

    public final String getVerificationUrl() {
        return this.verificationUrl;
    }

    public ApiCaptchaException(String str, String str2, String str3, String str4) {
        super(403, str, str3, str4);
        this.verificationUrl = str2;
    }

    public ApiCaptchaException(String str, String str2, String str3, String str4, String str5, String str6) {
        super(403, str, str3, str4, str5, str6, null, 64, null);
        this.verificationUrl = str2;
    }
}
