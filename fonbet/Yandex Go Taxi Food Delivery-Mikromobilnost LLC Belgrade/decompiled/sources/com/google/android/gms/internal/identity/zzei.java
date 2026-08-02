package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzv;
import com.google.android.gms.location.zzw;
import com.google.android.gms.location.zzy;
import com.google.android.gms.location.zzz;
import defpackage.bb1;

@Deprecated
/* loaded from: classes11.dex */
public final class zzei extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzei> CREATOR = new zzej();
    private final int zza;
    private final zzeg zzb;
    private final zzz zzc;
    private final zzw zzd;
    private final PendingIntent zze;
    private final zzr zzf;
    private final String zzg;

    public zzei(int i, zzeg zzegVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        this.zza = i;
        this.zzb = zzegVar;
        zzr zzrVar = null;
        this.zzc = iBinder != null ? zzy.zzb(iBinder) : null;
        this.zze = pendingIntent;
        this.zzd = iBinder2 != null ? zzv.zzb(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzrVar = queryLocalInterface instanceof zzr ? (zzr) queryLocalInterface : new zzp(iBinder3);
        }
        this.zzf = zzrVar;
        this.zzg = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        bb1.f0(parcel, 2, this.zzb, i, false);
        zzz zzzVar = this.zzc;
        bb1.a0(parcel, 3, zzzVar == null ? null : zzzVar.asBinder());
        bb1.f0(parcel, 4, this.zze, i, false);
        zzw zzwVar = this.zzd;
        bb1.a0(parcel, 5, zzwVar == null ? null : zzwVar.asBinder());
        zzr zzrVar = this.zzf;
        bb1.a0(parcel, 6, zzrVar != null ? zzrVar.asBinder() : null);
        bb1.g0(parcel, 8, this.zzg, false);
        bb1.o0(parcel, n0);
    }
}
