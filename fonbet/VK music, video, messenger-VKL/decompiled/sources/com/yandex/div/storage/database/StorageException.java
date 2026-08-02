package com.yandex.div.storage.database;

import xsna.zcl;

/* compiled from: StorageException.kt */
/* loaded from: classes7.dex */
public abstract class StorageException extends Exception {
    private final String cardId;

    public StorageException() {
        this(null, null, null, 7, null);
    }

    public final String getCardId() {
        return this.cardId;
    }

    public /* synthetic */ StorageException(String str, Throwable th, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : str2);
    }

    public StorageException(String str, Throwable th, String str2) {
        super(str, th);
        this.cardId = str2;
    }
}
