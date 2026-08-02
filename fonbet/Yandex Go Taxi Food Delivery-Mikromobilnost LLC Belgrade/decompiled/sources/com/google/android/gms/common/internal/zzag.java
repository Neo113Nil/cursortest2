package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzag implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = cma1.r0(parcel, readInt);
            } else if (c == 2) {
                z = cma1.k0(parcel, readInt);
            } else if (c == 3) {
                z2 = cma1.k0(parcel, readInt);
            } else if (c == 4) {
                i2 = cma1.r0(parcel, readInt);
            } else if (c != 5) {
                cma1.A0(parcel, readInt);
            } else {
                i3 = cma1.r0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new RootTelemetryConfiguration(i, z, z2, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RootTelemetryConfiguration[i];
    }
}
