package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzv;
import defpackage.ek91;
import defpackage.i971;
import defpackage.ouy;
import defpackage.sl81;

/* loaded from: classes11.dex */
final class zzdv extends zzv {
    private final ek91 zza;

    public zzdv(ek91 ek91Var) {
        this.zza = ek91Var;
    }

    public final zzdv zzc(ouy ouyVar) {
        this.zza.e(ouyVar);
        return this;
    }

    @Override // com.google.android.gms.location.zzv, com.google.android.gms.location.zzw
    public final void zzd(LocationResult locationResult) throws RemoteException {
        this.zza.zza().c(new i971(25, locationResult));
    }

    @Override // com.google.android.gms.location.zzv, com.google.android.gms.location.zzw
    public final void zze(LocationAvailability locationAvailability) throws RemoteException {
        this.zza.zza().c(new sl81(locationAvailability));
    }

    @Override // com.google.android.gms.location.zzv, com.google.android.gms.location.zzw
    public final void zzf() {
        this.zza.zza().c(new a(3, this));
    }

    public final void zzg() {
        this.zza.zza().a();
    }

    public final /* synthetic */ ek91 zzh() {
        return this.zza;
    }
}
