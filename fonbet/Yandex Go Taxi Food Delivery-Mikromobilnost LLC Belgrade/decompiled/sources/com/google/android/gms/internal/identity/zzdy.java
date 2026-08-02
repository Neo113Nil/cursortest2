package com.google.android.gms.internal.identity;

import android.location.Location;
import com.google.android.gms.location.zzy;
import defpackage.ek91;
import defpackage.lm71;
import defpackage.ouy;

/* loaded from: classes11.dex */
final class zzdy extends zzy {
    private final ek91 zza;

    public zzdy(ek91 ek91Var) {
        this.zza = ek91Var;
    }

    public final zzdy zzc(ouy ouyVar) {
        this.zza.e(ouyVar);
        return this;
    }

    @Override // com.google.android.gms.location.zzy, com.google.android.gms.location.zzz
    public final void zzd(Location location) {
        this.zza.zza().c(new lm71(23, location));
    }

    @Override // com.google.android.gms.location.zzy, com.google.android.gms.location.zzz
    public final void zze() {
        this.zza.zza().c(new a(4, this));
    }

    public final void zzf() {
        this.zza.zza().a();
    }

    public final /* synthetic */ ek91 zzg() {
        return this.zza;
    }
}
