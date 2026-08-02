package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzd implements Parcelable.Creator<GroundOverlayOptions> {
    @Override // android.os.Parcelable.Creator
    public final GroundOverlayOptions createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        IBinder iBinder = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    iBinder = cma1.q0(parcel, readInt);
                    break;
                case 3:
                    latLng = (LatLng) cma1.y(parcel, readInt, LatLng.CREATOR);
                    break;
                case 4:
                    f = cma1.o0(parcel, readInt);
                    break;
                case 5:
                    f2 = cma1.o0(parcel, readInt);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) cma1.y(parcel, readInt, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = cma1.o0(parcel, readInt);
                    break;
                case '\b':
                    f4 = cma1.o0(parcel, readInt);
                    break;
                case '\t':
                    z = cma1.k0(parcel, readInt);
                    break;
                case '\n':
                    f5 = cma1.o0(parcel, readInt);
                    break;
                case 11:
                    f6 = cma1.o0(parcel, readInt);
                    break;
                case '\f':
                    f7 = cma1.o0(parcel, readInt);
                    break;
                case '\r':
                    z2 = cma1.k0(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new GroundOverlayOptions(iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GroundOverlayOptions[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
