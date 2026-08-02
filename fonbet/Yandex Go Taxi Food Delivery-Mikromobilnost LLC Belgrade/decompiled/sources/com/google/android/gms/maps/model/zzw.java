package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzw implements Parcelable.Creator<VisibleRegion> {
    @Override // android.os.Parcelable.Creator
    public final VisibleRegion createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                latLng = (LatLng) cma1.y(parcel, readInt, LatLng.CREATOR);
            } else if (c == 3) {
                latLng2 = (LatLng) cma1.y(parcel, readInt, LatLng.CREATOR);
            } else if (c == 4) {
                latLng3 = (LatLng) cma1.y(parcel, readInt, LatLng.CREATOR);
            } else if (c == 5) {
                latLng4 = (LatLng) cma1.y(parcel, readInt, LatLng.CREATOR);
            } else if (c != 6) {
                cma1.A0(parcel, readInt);
            } else {
                latLngBounds = (LatLngBounds) cma1.y(parcel, readInt, LatLngBounds.CREATOR);
            }
        }
        cma1.E(parcel, P0);
        return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ VisibleRegion[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
