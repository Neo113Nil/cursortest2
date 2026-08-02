package com.yandex.div.data;

import xsna.zcl;

/* compiled from: VariableMutationException.kt */
/* loaded from: classes7.dex */
public final class VariableMutationException extends RuntimeException {
    /* JADX WARN: Multi-variable type inference failed */
    public VariableMutationException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ VariableMutationException(String str, Throwable th, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    public VariableMutationException(String str, Throwable th) {
        super(str, th);
    }
}
