package com.yandex.runtime.auth;

/* loaded from: classes7.dex */
public interface TokenListener {
    void onPasswordRequired(PasswordRequiredData passwordRequiredData);

    void onTokenReceived(String str);

    void onTokenRefreshFailed(String str);
}
