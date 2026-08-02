package com.google.android.gms.internal.identity;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.ntx0;

/* loaded from: classes11.dex */
final class zzdk extends zzy {
    final /* synthetic */ atx0 zza;

    public zzdk(atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.internal.identity.zzy, com.google.android.gms.internal.identity.zzz
    public final void zzb(Status status, Location location) {
        ntx0.a(status, location, this.zza);
    }
}
