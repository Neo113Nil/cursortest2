package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzw();
    public int zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public String zzh;

    public zzj(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
        this.zzg = z;
        this.zzh = str;
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
        int i5 = this.zzd;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(i5);
        int i6 = this.zze;
        bb1.m0(6, parcel, 4);
        parcel.writeInt(i6);
        int i7 = this.zzf;
        bb1.m0(7, parcel, 4);
        parcel.writeInt(i7);
        boolean z = this.zzg;
        bb1.m0(8, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        bb1.g0(parcel, 9, this.zzh, false);
        bb1.o0(parcel, n0);
    }

    public zzj() {
    }
}
