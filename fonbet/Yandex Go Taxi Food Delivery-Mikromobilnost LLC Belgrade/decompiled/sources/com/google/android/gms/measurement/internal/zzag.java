package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzag implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                j = cma1.u0(parcel, readInt);
            } else if (c == 2) {
                i = cma1.r0(parcel, readInt);
            } else if (c != 3) {
                cma1.A0(parcel, readInt);
            } else {
                j2 = cma1.u0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new zzaf(j, i, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaf[i];
    }
}
