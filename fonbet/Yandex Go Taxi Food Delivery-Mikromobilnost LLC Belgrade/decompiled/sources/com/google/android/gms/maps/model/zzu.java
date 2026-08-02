package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.internal.maps.zzaj;
import defpackage.lm71;
import defpackage.z4z0;

/* loaded from: classes11.dex */
final class zzu extends zzai {
    final /* synthetic */ z4z0 zza;

    public zzu(TileOverlayOptions tileOverlayOptions, z4z0 z4z0Var) {
        this.zza = z4z0Var;
    }

    @Override // com.google.android.gms.internal.maps.zzai, com.google.android.gms.internal.maps.zzaj
    public final Tile zzb(int i, int i2, int i3) {
        lm71 lm71Var = (lm71) this.zza;
        lm71Var.getClass();
        try {
            return ((zzaj) lm71Var.b).zzb(i, i2, i3);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
