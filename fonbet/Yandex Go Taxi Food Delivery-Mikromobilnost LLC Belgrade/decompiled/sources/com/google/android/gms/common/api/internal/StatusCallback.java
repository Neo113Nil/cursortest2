package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.o25;

/* loaded from: classes11.dex */
public class StatusCallback extends IStatusCallback.Stub {
    private final o25 resultHolder;

    public StatusCallback(o25 o25Var) {
        this.resultHolder = o25Var;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback.Stub, com.google.android.gms.common.api.internal.IStatusCallback
    public void onResult(Status status) {
        this.resultHolder.a(status);
    }
}
