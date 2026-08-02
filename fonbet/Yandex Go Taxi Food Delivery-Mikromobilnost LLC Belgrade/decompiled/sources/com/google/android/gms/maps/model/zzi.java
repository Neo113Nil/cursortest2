package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzi implements Parcelable.Creator<MarkerOptions> {
    @Override // android.os.Parcelable.Creator
    public final MarkerOptions createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f6 = 0.5f;
        float f7 = 1.0f;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    latLng = (LatLng) cma1.y(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    str = cma1.z(parcel, readInt);
                    break;
                case 4:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 5:
                    iBinder = cma1.q0(parcel, readInt);
                    break;
                case 6:
                    f = cma1.o0(parcel, readInt);
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
                    z3 = cma1.k0(parcel, readInt);
                    break;
                case 11:
                    f3 = cma1.o0(parcel, readInt);
                    break;
                case '\f':
                    f6 = cma1.o0(parcel, readInt);
                    break;
                case '\r':
                    f4 = cma1.o0(parcel, readInt);
                    break;
                case 14:
                    f7 = cma1.o0(parcel, readInt);
                    break;
                case 15:
                    f5 = cma1.o0(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new MarkerOptions(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f6, f4, f7, f5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MarkerOptions[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
