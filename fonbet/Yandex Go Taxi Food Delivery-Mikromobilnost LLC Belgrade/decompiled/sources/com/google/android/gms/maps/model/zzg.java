package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzg implements Parcelable.Creator<LatLng> {
    @Override // android.os.Parcelable.Creator
    public final LatLng createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                d = cma1.m0(parcel, readInt);
            } else if (c != 3) {
                cma1.A0(parcel, readInt);
            } else {
                d2 = cma1.m0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new LatLng(d, d2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LatLng[] newArray(int i) {
        return new LatLng[i];
    }
}
