package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.n091;
import defpackage.sn2;

/* loaded from: classes11.dex */
final class zbae extends zbs {
    final /* synthetic */ atx0 zba;

    public zbae(n091 n091Var, atx0 atx0Var) {
        this.zba = atx0Var;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbs, com.google.android.gms.internal.p000authapi.zbt
    public final void zbb(Status status, SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) throws RemoteException {
        boolean isSuccess = status.isSuccess();
        atx0 atx0Var = this.zba;
        if (isSuccess) {
            atx0Var.a(saveAccountLinkingTokenResult);
        } else {
            atx0Var.a.r(sn2.a(status));
        }
    }
}
