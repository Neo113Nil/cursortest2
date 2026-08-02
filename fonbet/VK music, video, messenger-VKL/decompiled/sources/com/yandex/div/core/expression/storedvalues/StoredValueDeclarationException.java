package com.yandex.div.core.expression.storedvalues;

import xsna.zcl;

/* compiled from: StoredValueDeclarationException.kt */
/* loaded from: classes7.dex */
public final class StoredValueDeclarationException extends RuntimeException {
    /* JADX WARN: Multi-variable type inference failed */
    public StoredValueDeclarationException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ StoredValueDeclarationException(String str, Throwable th, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    public StoredValueDeclarationException(String str, Throwable th) {
        super(str, th);
    }
}
