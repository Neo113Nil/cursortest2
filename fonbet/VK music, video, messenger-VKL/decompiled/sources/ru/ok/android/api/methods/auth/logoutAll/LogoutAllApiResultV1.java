package ru.ok.android.api.methods.auth.logoutAll;

/* compiled from: LogoutAllApiResultV1.kt */
/* loaded from: classes9.dex */
public final class LogoutAllApiResultV1 {
    private String authToken;

    public LogoutAllApiResultV1(String str) {
        this.authToken = str;
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final void setAuthToken(String str) {
        this.authToken = str;
    }
}
