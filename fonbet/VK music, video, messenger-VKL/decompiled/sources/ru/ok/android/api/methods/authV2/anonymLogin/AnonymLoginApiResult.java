package ru.ok.android.api.methods.authV2.anonymLogin;

/* compiled from: AnonymLoginApiResult.kt */
/* loaded from: classes9.dex */
public final class AnonymLoginApiResult {
    private final String sessionKey;
    private final String sessionSecret;

    public AnonymLoginApiResult(String str, String str2) {
        this.sessionKey = str;
        this.sessionSecret = str2;
    }

    public final String getSessionKey() {
        return this.sessionKey;
    }

    public final String getSessionSecret() {
        return this.sessionSecret;
    }
}
