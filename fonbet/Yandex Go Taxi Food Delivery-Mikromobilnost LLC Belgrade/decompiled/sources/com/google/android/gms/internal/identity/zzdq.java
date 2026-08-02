package com.google.android.gms.internal.identity;

import com.google.android.gms.location.DeviceOrientation;
import com.google.android.gms.location.zzs;
import defpackage.ouy;
import defpackage.wdz;

/* loaded from: classes11.dex */
final class zzdq extends zzs {
    private ouy zza;

    public zzdq(ouy ouyVar) {
        this.zza = ouyVar;
    }

    public final synchronized void zzc(ouy ouyVar) {
        ouy ouyVar2 = this.zza;
        if (ouyVar2 != ouyVar) {
            ouyVar2.a();
            this.zza = ouyVar;
        }
    }

    @Override // com.google.android.gms.location.zzs, com.google.android.gms.location.zzt
    public final void zzd(DeviceOrientation deviceOrientation) {
        ouy ouyVar;
        synchronized (this) {
            ouyVar = this.zza;
        }
        ouyVar.c(new wdz());
    }

    public final synchronized void zze() {
        this.zza.a();
    }
}
