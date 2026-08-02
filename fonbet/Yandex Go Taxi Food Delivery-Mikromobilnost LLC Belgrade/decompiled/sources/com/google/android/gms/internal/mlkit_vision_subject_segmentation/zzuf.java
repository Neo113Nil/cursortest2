package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzuf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuf> CREATOR = new zzug();
    private final float[] zza;
    private final Bitmap zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;

    public zzuf(float[] fArr, Bitmap bitmap, int i, int i2, int i3, int i4, int i5) {
        this.zza = fArr;
        this.zzb = bitmap;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float[] fArr = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.Y(parcel, 1, fArr, false);
        bb1.f0(parcel, 2, this.zzb, i, false);
        int i2 = this.zzc;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(i2);
        int i3 = this.zzd;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(i3);
        int i4 = this.zze;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(i4);
        int i5 = this.zzf;
        bb1.m0(6, parcel, 4);
        parcel.writeInt(i5);
        int i6 = this.zzg;
        bb1.m0(7, parcel, 4);
        parcel.writeInt(i6);
        bb1.o0(parcel, n0);
    }

    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zze;
    }

    public final int zzc() {
        return this.zzf;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final Bitmap zze() {
        return this.zzb;
    }

    public final float[] zzf() {
        return this.zza;
    }
}
