package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import defpackage.atx0;
import defpackage.ntx0;

/* loaded from: classes11.dex */
final class zzdl extends zzw {
    final /* synthetic */ atx0 zza;

    public zzdl(atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.internal.identity.zzw, com.google.android.gms.internal.identity.zzx
    public final void zzb(Status status, LocationAvailability locationAvailability) {
        ntx0.a(status, locationAvailability, this.zza);
    }
}
