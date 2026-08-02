package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();
    public int zza;
    public int zzb;
    public int zzc;
    public boolean zzd;
    public boolean zze;
    public float zzf;

    public zzh(int i, int i2, int i3, boolean z, boolean z2, float f) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = z;
        this.zze = z2;
        this.zzf = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i2);
        int i3 = this.zzb;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(i3);
        int i4 = this.zzc;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(i4);
        boolean z = this.zzd;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zze;
        bb1.m0(6, parcel, 4);
        parcel.writeInt(z2 ? 1 : 0);
        float f = this.zzf;
        bb1.m0(7, parcel, 4);
        parcel.writeFloat(f);
        bb1.o0(parcel, n0);
    }

    public zzh() {
    }
}
