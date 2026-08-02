package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzou extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzou> CREATOR = new zzov();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final boolean zze;
    private final float zzf;

    public zzou(int i, int i2, int i3, int i4, boolean z, float f) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = z;
        this.zzf = f;
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
        int i4 = this.zzc;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(i4);
        int i5 = this.zzd;
        bb1.m0(4, parcel, 4);
        parcel.writeInt(i5);
        boolean z = this.zze;
        bb1.m0(5, parcel, 4);
        parcel.writeInt(z ? 1 : 0);
        float f = this.zzf;
        bb1.m0(6, parcel, 4);
        parcel.writeFloat(f);
        bb1.o0(parcel, n0);
    }
}
