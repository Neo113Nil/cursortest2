package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.n091;
import defpackage.ntx0;

/* loaded from: classes11.dex */
final class zbaf extends zbu {
    final /* synthetic */ atx0 zba;

    public zbaf(n091 n091Var, atx0 atx0Var) {
        this.zba = atx0Var;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbu, com.google.android.gms.internal.p000authapi.zbv
    public final void zbb(Status status, SavePasswordResult savePasswordResult) throws RemoteException {
        ntx0.a(status, savePasswordResult, this.zba);
    }
}
