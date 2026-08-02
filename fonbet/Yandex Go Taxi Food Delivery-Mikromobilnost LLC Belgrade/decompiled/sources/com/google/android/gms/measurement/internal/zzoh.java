package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class zzoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoh> CREATOR = new zzoi();
    public final String zza;
    public final long zzb;
    public final int zzc;

    public zzoh(String str, long j, int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, str, false);
        long j = this.zzb;
        bb1.m0(2, parcel, 8);
        parcel.writeLong(j);
        int i2 = this.zzc;
        bb1.m0(3, parcel, 4);
        parcel.writeInt(i2);
        bb1.o0(parcel, n0);
    }
}
