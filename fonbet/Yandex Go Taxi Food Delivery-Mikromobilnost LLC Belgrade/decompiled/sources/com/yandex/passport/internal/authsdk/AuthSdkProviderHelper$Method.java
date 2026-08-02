package com.yandex.passport.internal.authsdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
final class AuthSdkProviderHelper$Method {
    private static final /* synthetic */ AuthSdkProviderHelper$Method[] $VALUES;
    public static final AuthSdkProviderHelper$Method GetAccounts;

    static {
        AuthSdkProviderHelper$Method authSdkProviderHelper$Method = new AuthSdkProviderHelper$Method("GetAccounts", 0);
        GetAccounts = authSdkProviderHelper$Method;
        $VALUES = new AuthSdkProviderHelper$Method[]{authSdkProviderHelper$Method};
    }

    public static AuthSdkProviderHelper$Method valueOf(String str) {
        return (AuthSdkProviderHelper$Method) Enum.valueOf(AuthSdkProviderHelper$Method.class, str);
    }

    public static AuthSdkProviderHelper$Method[] values() {
        return (AuthSdkProviderHelper$Method[]) $VALUES.clone();
    }
}
