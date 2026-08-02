package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzv implements Parcelable.Creator<TileOverlayOptions> {
    @Override // android.os.Parcelable.Creator
    public final TileOverlayOptions createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        IBinder iBinder = null;
        boolean z = false;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z2 = true;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                iBinder = cma1.q0(parcel, readInt);
            } else if (c == 3) {
                z = cma1.k0(parcel, readInt);
            } else if (c == 4) {
                f = cma1.o0(parcel, readInt);
            } else if (c == 5) {
                z2 = cma1.k0(parcel, readInt);
            } else if (c != 6) {
                cma1.A0(parcel, readInt);
            } else {
                f2 = cma1.o0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new TileOverlayOptions(iBinder, z, f, z2, f2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TileOverlayOptions[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}
