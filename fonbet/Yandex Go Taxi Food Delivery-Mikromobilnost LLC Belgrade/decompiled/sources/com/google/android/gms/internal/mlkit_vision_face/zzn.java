package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new zzo();
    public final int zza;
    public final float zzb;
    public final float zzc;
    public final int zzd;

    public zzn(int i, float f, float f2, int i2) {
        this.zza = i;
        this.zzb = f;
        this.zzc = f2;
        this.zzd = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        int i2 = this.zza;
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        float f = this.zzb;
        bb1.m0(2, parcel, 4);
        parcel.writeFloat(f);
        float f2 = this.zzc;
        bb1.m0(3, parcel, 4);
        parcel.writeFloat(f2);
        int i3 = this.zzd;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(i3);
        bb1.o0(parcel, n0);
    }
}
