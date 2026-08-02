package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import java.util.List;

/* loaded from: classes11.dex */
public final class zzow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzow> CREATOR = new zzox();
    private final int zza;
    private final Rect zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final float zzf;
    private final float zzg;
    private final float zzh;
    private final float zzi;
    private final List zzj;
    private final List zzk;

    public zzow(int i, Rect rect, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2) {
        this.zza = i;
        this.zzb = rect;
        this.zzc = f;
        this.zzd = f2;
        this.zze = f3;
        this.zzf = f4;
        this.zzg = f5;
        this.zzh = f6;
        this.zzi = f7;
        this.zzj = list;
        this.zzk = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        bb1.f0(parcel, 2, this.zzb, i, false);
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
        float f7 = this.zzi;
        bb1.m0(9, parcel, 4);
        parcel.writeFloat(f7);
        bb1.k0(parcel, 10, this.zzj, false);
        bb1.k0(parcel, 11, this.zzk, false);
        bb1.o0(parcel, n0);
    }

    public final float zza() {
        return this.zzf;
    }

    public final float zzb() {
        return this.zzd;
    }

    public final float zzc() {
        return this.zzg;
    }

    public final float zzd() {
        return this.zzc;
    }

    public final float zze() {
        return this.zzh;
    }

    public final float zzf() {
        return this.zze;
    }

    public final int zzg() {
        return this.zza;
    }

    public final Rect zzh() {
        return this.zzb;
    }

    public final List zzi() {
        return this.zzk;
    }

    public final List zzj() {
        return this.zzj;
    }
}
