package com.yandex.div.storage.database;

import java.util.List;

/* compiled from: ExecutionResult.kt */
/* loaded from: classes7.dex */
public class ExecutionResult {
    private final List<StorageException> errors;

    /* JADX WARN: Multi-variable type inference failed */
    public ExecutionResult(List<? extends StorageException> list) {
        this.errors = list;
    }

    public List<StorageException> getErrors() {
        return this.errors;
    }
}
