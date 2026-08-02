package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzoq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoq> CREATOR = new zzor();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;

    public zzoq(int i, int i2, int i3, int i4, long j) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = j;
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
        long j = this.zze;
        bb1.m0(5, parcel, 8);
        parcel.writeLong(j);
        bb1.o0(parcel, n0);
    }
}
