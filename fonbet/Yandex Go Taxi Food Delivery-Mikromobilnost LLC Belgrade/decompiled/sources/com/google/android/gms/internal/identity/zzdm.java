package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.ntx0;

/* loaded from: classes11.dex */
final class zzdm extends zzn {
    final /* synthetic */ atx0 zza;

    public zzdm(atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.internal.identity.zzn, com.google.android.gms.internal.identity.zzo
    public final void zzb(Status status, boolean z) {
        ntx0.a(status, Boolean.valueOf(z), this.zza);
    }
}
