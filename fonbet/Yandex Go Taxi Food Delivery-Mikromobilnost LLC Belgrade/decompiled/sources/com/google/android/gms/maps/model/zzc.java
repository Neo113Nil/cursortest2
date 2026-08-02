package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zzc implements Parcelable.Creator<CircleOptions> {
    @Override // android.os.Parcelable.Creator
    public final CircleOptions createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        LatLng latLng = null;
        ArrayList arrayList = null;
        double d = 0.0d;
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    latLng = (LatLng) cma1.y(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    d = cma1.m0(parcel, readInt);
                    break;
                case 4:
                    f = cma1.o0(parcel, readInt);
                    break;
                case 5:
                    i = cma1.r0(parcel, readInt);
                    break;
                case 6:
                    i2 = cma1.r0(parcel, readInt);
                    break;
                case 7:
                    f2 = cma1.o0(parcel, readInt);
                    break;
                case '\b':
                    z = cma1.k0(parcel, readInt);
                    break;
                case '\t':
                    z2 = cma1.k0(parcel, readInt);
                    break;
                case '\n':
                    arrayList = cma1.D(parcel, readInt, PatternItem.CREATOR);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new CircleOptions(latLng, d, f, i, i2, f2, z, z2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CircleOptions[] newArray(int i) {
        return new CircleOptions[i];
    }
}
