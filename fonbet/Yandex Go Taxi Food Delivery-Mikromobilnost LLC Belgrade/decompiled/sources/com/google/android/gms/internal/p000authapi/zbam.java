package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.ntx0;
import defpackage.o091;

/* loaded from: classes11.dex */
final class zbam extends zbl {
    final /* synthetic */ atx0 zba;

    public zbam(o091 o091Var, atx0 atx0Var) {
        this.zba = atx0Var;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbl, com.google.android.gms.internal.p000authapi.zbm
    public final void zbb(Status status, BeginSignInResult beginSignInResult) throws RemoteException {
        ntx0.a(status, beginSignInResult, this.zba);
    }
}
