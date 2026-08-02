package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzk implements Parcelable.Creator<PointOfInterest> {
    @Override // android.os.Parcelable.Creator
    public final PointOfInterest createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                latLng = (LatLng) cma1.y(parcel, readInt, LatLng.CREATOR);
            } else if (c == 3) {
                str = cma1.z(parcel, readInt);
            } else if (c != 4) {
                cma1.A0(parcel, readInt);
            } else {
                str2 = cma1.z(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new PointOfInterest(latLng, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PointOfInterest[] newArray(int i) {
        return new PointOfInterest[i];
    }
}
