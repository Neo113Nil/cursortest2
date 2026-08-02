package com.google.android.gms.fido.fido2;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.ntx0;
import defpackage.xwq;

/* loaded from: classes11.dex */
final class zzf extends com.google.android.gms.internal.fido.zzq {
    final /* synthetic */ atx0 zza;

    public zzf(xwq xwqVar, atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.internal.fido.zzq, com.google.android.gms.internal.fido.zzr
    public final void zzb(Status status, PendingIntent pendingIntent) throws RemoteException {
        ntx0.a(status, pendingIntent, this.zza);
    }
}
