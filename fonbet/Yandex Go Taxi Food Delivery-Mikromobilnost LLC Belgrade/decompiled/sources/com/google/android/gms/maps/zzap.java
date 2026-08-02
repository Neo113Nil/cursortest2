package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzap implements Parcelable.Creator<StreetViewPanoramaOptions> {
    @Override // android.os.Parcelable.Creator
    public final StreetViewPanoramaOptions createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String str = null;
        LatLng latLng = null;
        Integer num = null;
        StreetViewSource streetViewSource = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) cma1.y(parcel, readInt, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = cma1.z(parcel, readInt);
                    break;
                case 4:
                    latLng = (LatLng) cma1.y(parcel, readInt, LatLng.CREATOR);
                    break;
                case 5:
                    num = cma1.s0(parcel, readInt);
                    break;
                case 6:
                    b = cma1.l0(parcel, readInt);
                    break;
                case 7:
                    b2 = cma1.l0(parcel, readInt);
                    break;
                case '\b':
                    b3 = cma1.l0(parcel, readInt);
                    break;
                case '\t':
                    b4 = cma1.l0(parcel, readInt);
                    break;
                case '\n':
                    b5 = cma1.l0(parcel, readInt);
                    break;
                case 11:
                    streetViewSource = (StreetViewSource) cma1.y(parcel, readInt, StreetViewSource.CREATOR);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new StreetViewPanoramaOptions(streetViewPanoramaCamera, str, latLng, num, b, b2, b3, b4, b5, streetViewSource);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ StreetViewPanoramaOptions[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}
