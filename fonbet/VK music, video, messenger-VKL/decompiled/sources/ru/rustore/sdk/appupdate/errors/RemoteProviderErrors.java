package ru.rustore.sdk.appupdate.errors;

import ru.rustore.sdk.core.exception.RuStoreApplicationBannedException;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.exception.RuStoreUserBannedException;
import ru.rustore.sdk.core.exception.RuStoreUserUnauthorizedException;

/* loaded from: classes9.dex */
public final class RemoteProviderErrors {
    private static final int ERROR_COMMON = 999;
    public static final RemoteProviderErrors INSTANCE = new RemoteProviderErrors();
    private static final int OWNER_BLOCKED = 1005;
    private static final int USER_BLOCKED = 1004;
    private static final int USER_UNAUTHORIZED_ERROR = 1001;

    private RemoteProviderErrors() {
    }

    public final RuStoreException toRuStoreException(int i, String str) {
        return i != 999 ? i != 1001 ? i != 1004 ? i != 1005 ? new RuStoreInstallException(i) : new RuStoreApplicationBannedException() : new RuStoreUserBannedException() : new RuStoreUserUnauthorizedException() : new RuStoreException(str);
    }
}
