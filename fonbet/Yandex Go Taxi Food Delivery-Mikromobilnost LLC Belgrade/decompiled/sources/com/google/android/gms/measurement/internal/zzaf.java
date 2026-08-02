package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzag();
    public final long zza;
    public final int zzb;
    public final long zzc;

    public zzaf(long j, int i, long j2) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 8);
        parcel.writeLong(j);
        int i2 = this.zzb;
        bb1.m0(2, parcel, 4);
        parcel.writeInt(i2);
        long j2 = this.zzc;
        bb1.m0(3, parcel, 8);
        parcel.writeLong(j2);
        bb1.o0(parcel, n0);
    }
}
