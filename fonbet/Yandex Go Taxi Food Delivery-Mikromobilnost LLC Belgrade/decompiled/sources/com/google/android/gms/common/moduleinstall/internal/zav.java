package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.atx0;
import defpackage.ntx0;

/* loaded from: classes11.dex */
final class zav extends IStatusCallback.Stub {
    final /* synthetic */ atx0 zaa;

    public zav(c cVar, atx0 atx0Var) {
        this.zaa = atx0Var;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback.Stub, com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        ntx0.b(status, Boolean.TRUE, this.zaa);
    }
}
