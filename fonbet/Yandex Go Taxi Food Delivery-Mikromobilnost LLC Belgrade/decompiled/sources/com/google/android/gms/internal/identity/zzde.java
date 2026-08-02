package com.google.android.gms.internal.identity;

import com.google.android.gms.location.LocationSettingsResult;
import defpackage.atx0;
import defpackage.cdz;
import defpackage.ntx0;

/* loaded from: classes11.dex */
final class zzde extends zzaa {
    final /* synthetic */ atx0 zza;

    public zzde(atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.internal.identity.zzaa, com.google.android.gms.internal.identity.zzab
    public final void zzb(LocationSettingsResult locationSettingsResult) {
        ntx0.a(locationSettingsResult.getStatus(), new cdz(), this.zza);
    }
}
