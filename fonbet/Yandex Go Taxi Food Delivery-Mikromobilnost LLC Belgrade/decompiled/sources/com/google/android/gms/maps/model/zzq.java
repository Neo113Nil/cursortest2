package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzq implements Parcelable.Creator<StreetViewPanoramaOrientation> {
    @Override // android.os.Parcelable.Creator
    public final StreetViewPanoramaOrientation createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                f = cma1.o0(parcel, readInt);
            } else if (c != 3) {
                cma1.A0(parcel, readInt);
            } else {
                f2 = cma1.o0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new StreetViewPanoramaOrientation(f, f2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StreetViewPanoramaOrientation[] newArray(int i) {
        return new StreetViewPanoramaOrientation[i];
    }
}
