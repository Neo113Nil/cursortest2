package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzf implements Parcelable.Creator<LatLngBounds> {
    @Override // android.os.Parcelable.Creator
    public final LatLngBounds createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                latLng = (LatLng) cma1.y(parcel, readInt, LatLng.CREATOR);
            } else if (c != 3) {
                cma1.A0(parcel, readInt);
            } else {
                latLng2 = (LatLng) cma1.y(parcel, readInt, LatLng.CREATOR);
            }
        }
        cma1.E(parcel, P0);
        return new LatLngBounds(latLng, latLng2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LatLngBounds[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
