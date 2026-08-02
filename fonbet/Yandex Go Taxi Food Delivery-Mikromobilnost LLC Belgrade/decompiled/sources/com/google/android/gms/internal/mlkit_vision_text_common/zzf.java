package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final float zze;

    public zzf(int i, int i2, int i3, int i4, float f) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int n0 = bb1.n0(parcel, 20293);
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
        float f = this.zze;
        bb1.m0(6, parcel, 4);
        parcel.writeFloat(f);
        bb1.o0(parcel, n0);
    }
}
