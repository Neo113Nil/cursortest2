package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.m091;
import defpackage.sn2;

/* loaded from: classes11.dex */
final class zbz extends zbi {
    final /* synthetic */ atx0 zba;

    public zbz(m091 m091Var, atx0 atx0Var) {
        this.zba = atx0Var;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbi, com.google.android.gms.internal.p000authapi.zbj
    public final void zbb(Status status, AuthorizationResult authorizationResult) throws RemoteException {
        boolean isSuccess = status.isSuccess();
        atx0 atx0Var = this.zba;
        if (isSuccess) {
            atx0Var.a(authorizationResult);
        } else {
            atx0Var.a.r(sn2.a(status));
        }
    }
}
