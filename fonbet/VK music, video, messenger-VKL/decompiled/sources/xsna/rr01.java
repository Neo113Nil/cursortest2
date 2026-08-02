package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class rr01 implements Parcelable.Creator<VisibleRegion> {
    @Override // android.os.Parcelable.Creator
    public final VisibleRegion createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                latLng = (LatLng) SafeParcelReader.h(parcel, readInt, LatLng.CREATOR);
            } else if (c == 3) {
                latLng2 = (LatLng) SafeParcelReader.h(parcel, readInt, LatLng.CREATOR);
            } else if (c == 4) {
                latLng3 = (LatLng) SafeParcelReader.h(parcel, readInt, LatLng.CREATOR);
            } else if (c == 5) {
                latLng4 = (LatLng) SafeParcelReader.h(parcel, readInt, LatLng.CREATOR);
            } else if (c != 6) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                latLngBounds = (LatLngBounds) SafeParcelReader.h(parcel, readInt, LatLngBounds.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ VisibleRegion[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
