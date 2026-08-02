package com.yandex.div.data;

import xsna.zcl;

/* compiled from: VariableDeclarationException.kt */
/* loaded from: classes7.dex */
public final class VariableDeclarationException extends RuntimeException {
    /* JADX WARN: Multi-variable type inference failed */
    public VariableDeclarationException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ VariableDeclarationException(String str, Throwable th, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    public VariableDeclarationException(String str, Throwable th) {
        super(str, th);
    }
}
