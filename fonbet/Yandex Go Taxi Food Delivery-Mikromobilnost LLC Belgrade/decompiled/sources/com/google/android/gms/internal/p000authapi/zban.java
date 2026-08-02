package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.atx0;
import defpackage.ntx0;
import defpackage.o091;

/* loaded from: classes11.dex */
final class zban extends IStatusCallback.Stub {
    final /* synthetic */ atx0 zba;

    public zban(o091 o091Var, atx0 atx0Var) {
        this.zba = atx0Var;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback.Stub, com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) throws RemoteException {
        ntx0.a(status, null, this.zba);
    }
}
