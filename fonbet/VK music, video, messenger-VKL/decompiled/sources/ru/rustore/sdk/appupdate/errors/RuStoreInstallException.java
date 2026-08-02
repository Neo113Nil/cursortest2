package ru.rustore.sdk.appupdate.errors;

import ru.rustore.sdk.core.exception.RuStoreException;

/* loaded from: classes9.dex */
public final class RuStoreInstallException extends RuStoreException {
    private final int code;

    public RuStoreInstallException(int i) {
        super("app update error");
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }
}
