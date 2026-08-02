package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        boolean z = false;
        long j = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                j = cma1.u0(parcel, readInt);
            } else if (c != 6) {
                cma1.A0(parcel, readInt);
            } else {
                z = cma1.k0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new DeviceOrientationRequest(j, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceOrientationRequest[i];
    }
}
