package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();
    public final int zza;
    public final int zzb;
    public final float zzc;
    public final float zzd;
    public final float zze;
    public final float zzf;
    public final float zzg;
    public final float zzh;
    public final float zzi;
    public final zzn[] zzj;
    public final float zzk;
    public final float zzl;
    public final float zzm;
    public final zzd[] zzn;
    public final float zzo;

    public zzf(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, zzn[] zznVarArr, float f8, float f9, float f10, zzd[] zzdVarArr, float f11) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = f;
        this.zzd = f2;
        this.zze = f3;
        this.zzf = f4;
        this.zzg = f5;
        this.zzh = f6;
        this.zzi = f7;
        this.zzj = zznVarArr;
        this.zzk = f8;
        this.zzl = f9;
        this.zzm = f10;
        this.zzn = zzdVarArr;
        this.zzo = f11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        int i3 = this.zzb;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i3);
        float f = this.zzc;
        bb1.m0(3, parcel, 4);
        parcel.writeFloat(f);
        float f2 = this.zzd;
        bb1.m0(4, parcel, 4);
        parcel.writeFloat(f2);
        float f3 = this.zze;
        bb1.m0(5, parcel, 4);
        parcel.writeFloat(f3);
        float f4 = this.zzf;
        bb1.m0(6, parcel, 4);
        parcel.writeFloat(f4);
        float f5 = this.zzg;
        bb1.m0(7, parcel, 4);
        parcel.writeFloat(f5);
        float f6 = this.zzh;
        bb1.m0(8, parcel, 4);
        parcel.writeFloat(f6);
        bb1.j0(parcel, 9, this.zzj, i);
        float f7 = this.zzk;
        bb1.m0(10, parcel, 4);
        parcel.writeFloat(f7);
        float f8 = this.zzl;
        bb1.m0(11, parcel, 4);
        parcel.writeFloat(f8);
        float f9 = this.zzm;
        bb1.m0(12, parcel, 4);
        parcel.writeFloat(f9);
        bb1.j0(parcel, 13, this.zzn, i);
        float f10 = this.zzi;
        bb1.m0(14, parcel, 4);
        parcel.writeFloat(f10);
        float f11 = this.zzo;
        bb1.m0(15, parcel, 4);
        parcel.writeFloat(f11);
        bb1.o0(parcel, n0);
    }
}
