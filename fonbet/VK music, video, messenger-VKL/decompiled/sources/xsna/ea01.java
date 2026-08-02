package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class ea01 implements Parcelable.Creator<LatLngBounds> {
    @Override // android.os.Parcelable.Creator
    public final LatLngBounds createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                latLng = (LatLng) SafeParcelReader.h(parcel, readInt, LatLng.CREATOR);
            } else if (c != 3) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                latLng2 = (LatLng) SafeParcelReader.h(parcel, readInt, LatLng.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new LatLngBounds(latLng, latLng2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LatLngBounds[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
