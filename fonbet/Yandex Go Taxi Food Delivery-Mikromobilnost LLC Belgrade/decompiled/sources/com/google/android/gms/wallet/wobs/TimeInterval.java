package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class TimeInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TimeInterval> CREATOR = new zzh();
    long zza;
    long zzb;

    public TimeInterval(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    public long getEndTimestamp() {
        return this.zzb;
    }

    public long getStartTimestamp() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        long j = this.zza;
        bb1.m0(2, parcel, 8);
        parcel.writeLong(j);
        long j2 = this.zzb;
        bb1.m0(3, parcel, 8);
        parcel.writeLong(j2);
        bb1.o0(parcel, n0);
    }

    public TimeInterval() {
    }
}
