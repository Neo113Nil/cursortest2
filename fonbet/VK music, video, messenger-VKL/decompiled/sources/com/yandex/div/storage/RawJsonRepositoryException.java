package com.yandex.div.storage;

import com.yandex.div.storage.database.StorageException;

/* compiled from: RawJsonRepositoryException.kt */
/* loaded from: classes7.dex */
public final class RawJsonRepositoryException extends Exception {
    private final String jsonId;

    public RawJsonRepositoryException(StorageException storageException) {
        super(storageException.getMessage(), storageException);
        this.jsonId = storageException.getCardId();
    }
}
