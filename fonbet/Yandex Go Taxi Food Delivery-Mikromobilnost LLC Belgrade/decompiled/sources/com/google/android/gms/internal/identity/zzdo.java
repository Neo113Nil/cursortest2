package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.location.zzz;
import defpackage.atx0;
import defpackage.ntx0;

/* loaded from: classes11.dex */
final class zzdo extends zzq {
    final /* synthetic */ atx0 zza;
    final /* synthetic */ zzz zzb;

    public zzdo(atx0 atx0Var, zzz zzzVar) {
        this.zza = atx0Var;
        this.zzb = zzzVar;
    }

    @Override // com.google.android.gms.internal.identity.zzq, com.google.android.gms.internal.identity.zzr
    public final void zzd(zzl zzlVar) {
        ntx0.a(zzlVar.getStatus(), null, this.zza);
    }

    @Override // com.google.android.gms.internal.identity.zzq, com.google.android.gms.internal.identity.zzr
    public final void zze() throws RemoteException {
        this.zzb.zze();
    }
}
