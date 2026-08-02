package com.google.android.gms.internal.appset;

import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.ntx0;
import defpackage.qw2;
import defpackage.tbb1;

/* loaded from: classes11.dex */
final class zzo extends zze {
    final /* synthetic */ atx0 zza;

    public zzo(tbb1 tbb1Var, atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.internal.appset.zze, com.google.android.gms.internal.appset.zzf
    public final void zzb(Status status, zzc zzcVar) {
        ntx0.a(status, zzcVar != null ? new qw2(zzcVar.zzb(), zzcVar.zza()) : null, this.zza);
    }
}
