package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzab implements Parcelable.Creator<GoogleMapOptions> {
    @Override // android.os.Parcelable.Creator
    public final GoogleMapOptions createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        byte b = -1;
        byte b2 = -1;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        int i = 0;
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        Integer num = null;
        String str = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    b = cma1.l0(parcel, readInt);
                    break;
                case 3:
                    b2 = cma1.l0(parcel, readInt);
                    break;
                case 4:
                    i = cma1.r0(parcel, readInt);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) cma1.y(parcel, readInt, CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = cma1.l0(parcel, readInt);
                    break;
                case 7:
                    b4 = cma1.l0(parcel, readInt);
                    break;
                case '\b':
                    b5 = cma1.l0(parcel, readInt);
                    break;
                case '\t':
                    b6 = cma1.l0(parcel, readInt);
                    break;
                case '\n':
                    b7 = cma1.l0(parcel, readInt);
                    break;
                case 11:
                    b8 = cma1.l0(parcel, readInt);
                    break;
                case '\f':
                    b9 = cma1.l0(parcel, readInt);
                    break;
                case '\r':
                default:
                    cma1.A0(parcel, readInt);
                    break;
                case 14:
                    b10 = cma1.l0(parcel, readInt);
                    break;
                case 15:
                    b11 = cma1.l0(parcel, readInt);
                    break;
                case 16:
                    f = cma1.p0(parcel, readInt);
                    break;
                case 17:
                    f2 = cma1.p0(parcel, readInt);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) cma1.y(parcel, readInt, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b12 = cma1.l0(parcel, readInt);
                    break;
                case 20:
                    num = cma1.s0(parcel, readInt);
                    break;
                case 21:
                    str = cma1.z(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new GoogleMapOptions(b, b2, i, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10, b11, f, f2, latLngBounds, b12, num, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleMapOptions[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
