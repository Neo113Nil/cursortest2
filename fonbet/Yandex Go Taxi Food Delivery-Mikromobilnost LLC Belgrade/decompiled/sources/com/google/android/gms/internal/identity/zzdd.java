package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.location.zzw;
import defpackage.atx0;
import defpackage.ntx0;

/* loaded from: classes11.dex */
final class zzdd extends zzq {
    final /* synthetic */ atx0 zza;
    final /* synthetic */ zzw zzb;

    public zzdd(atx0 atx0Var, zzw zzwVar) {
        this.zza = atx0Var;
        this.zzb = zzwVar;
    }

    @Override // com.google.android.gms.internal.identity.zzq, com.google.android.gms.internal.identity.zzr
    public final void zzd(zzl zzlVar) {
        ntx0.a(zzlVar.getStatus(), null, this.zza);
    }

    @Override // com.google.android.gms.internal.identity.zzq, com.google.android.gms.internal.identity.zzr
    public final void zze() throws RemoteException {
        this.zzb.zzf();
    }
}
