package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;

/* loaded from: classes11.dex */
public final class WarmUpUiProcessRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WarmUpUiProcessRequest> CREATOR = new zzn();
    final long zza;

    public WarmUpUiProcessRequest() {
        this.zza = SystemClock.elapsedRealtime();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        long j = this.zza;
        bb1.m0(1, parcel, 8);
        parcel.writeLong(j);
        bb1.o0(parcel, n0);
    }

    public WarmUpUiProcessRequest(long j) {
        this.zza = j;
    }
}
