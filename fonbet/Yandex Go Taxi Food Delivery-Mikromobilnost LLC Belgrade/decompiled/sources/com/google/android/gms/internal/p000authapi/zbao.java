package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.ntx0;
import defpackage.o091;

/* loaded from: classes11.dex */
final class zbao extends zbq {
    final /* synthetic */ atx0 zba;

    public zbao(o091 o091Var, atx0 atx0Var) {
        this.zba = atx0Var;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbq, com.google.android.gms.internal.p000authapi.zbr
    public final void zbb(Status status, PendingIntent pendingIntent) throws RemoteException {
        ntx0.a(status, pendingIntent, this.zba);
    }
}
