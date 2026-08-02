package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class ruz0 implements Parcelable.Creator<GoogleMapOptions> {
    @Override // android.os.Parcelable.Creator
    public final GoogleMapOptions createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        int i = 0;
        byte b = -1;
        byte b2 = -1;
        CameraPosition cameraPosition = null;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        byte b12 = -1;
        Integer num = null;
        String str = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    b = SafeParcelReader.q(parcel, readInt);
                    break;
                case 3:
                    b2 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 4:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) SafeParcelReader.h(parcel, readInt, CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 7:
                    b4 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\b':
                    b5 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\t':
                    b6 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\n':
                    b7 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 11:
                    b8 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\f':
                    b9 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\r':
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
                case 14:
                    b10 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 15:
                    b11 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 16:
                    f = SafeParcelReader.u(parcel, readInt);
                    break;
                case 17:
                    f2 = SafeParcelReader.u(parcel, readInt);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) SafeParcelReader.h(parcel, readInt, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b12 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 20:
                    num = SafeParcelReader.x(parcel, readInt);
                    break;
                case 21:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.d = -1;
        googleMapOptions.o = null;
        googleMapOptions.p = null;
        googleMapOptions.q = null;
        googleMapOptions.s = null;
        googleMapOptions.t = null;
        googleMapOptions.b = alk.J(b);
        googleMapOptions.c = alk.J(b2);
        googleMapOptions.d = i;
        googleMapOptions.e = cameraPosition;
        googleMapOptions.f = alk.J(b3);
        googleMapOptions.g = alk.J(b4);
        googleMapOptions.h = alk.J(b5);
        googleMapOptions.i = alk.J(b6);
        googleMapOptions.j = alk.J(b7);
        googleMapOptions.k = alk.J(b8);
        googleMapOptions.l = alk.J(b9);
        googleMapOptions.m = alk.J(b10);
        googleMapOptions.n = alk.J(b11);
        googleMapOptions.o = f;
        googleMapOptions.p = f2;
        googleMapOptions.q = latLngBounds;
        googleMapOptions.r = alk.J(b12);
        googleMapOptions.s = num;
        googleMapOptions.t = str;
        return googleMapOptions;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleMapOptions[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
