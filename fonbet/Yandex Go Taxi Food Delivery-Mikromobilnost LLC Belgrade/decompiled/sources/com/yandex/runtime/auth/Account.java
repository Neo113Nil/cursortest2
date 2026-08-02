package com.yandex.runtime.auth;

/* loaded from: classes7.dex */
public interface Account {
    String httpAuth(String str);

    void invalidateToken(String str);

    void requestToken(TokenListener tokenListener);

    String uid();
}
