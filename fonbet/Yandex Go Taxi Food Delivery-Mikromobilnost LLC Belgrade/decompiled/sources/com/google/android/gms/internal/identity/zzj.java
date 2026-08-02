package com.google.android.gms.internal.identity;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzs;
import com.google.android.gms.location.zzt;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    final int zza;
    final zzh zzb;
    final zzt zzc;
    final zzr zzd;

    public zzj(int i, zzh zzhVar, IBinder iBinder, IBinder iBinder2) {
        this.zza = i;
        this.zzb = zzhVar;
        zzr zzrVar = null;
        this.zzc = iBinder == null ? null : zzs.zzb(iBinder);
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzrVar = queryLocalInterface instanceof zzr ? (zzr) queryLocalInterface : new zzp(iBinder2);
        }
        this.zzd = zzrVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        bb1.f0(parcel, 2, this.zzb, i, false);
        zzt zztVar = this.zzc;
        bb1.a0(parcel, 3, zztVar == null ? null : zztVar.asBinder());
        zzr zzrVar = this.zzd;
        bb1.a0(parcel, 4, zzrVar != null ? zzrVar.asBinder() : null);
        bb1.o0(parcel, n0);
    }
}
