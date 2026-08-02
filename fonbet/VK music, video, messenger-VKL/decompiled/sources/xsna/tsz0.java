package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class tsz0 implements Parcelable.Creator<CameraPosition> {
    @Override // android.os.Parcelable.Creator
    public final CameraPosition createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        LatLng latLng = null;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                latLng = (LatLng) SafeParcelReader.h(parcel, readInt, LatLng.CREATOR);
            } else if (c == 3) {
                f = SafeParcelReader.t(parcel, readInt);
            } else if (c == 4) {
                f2 = SafeParcelReader.t(parcel, readInt);
            } else if (c != 5) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                f3 = SafeParcelReader.t(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new CameraPosition(latLng, f, f2, f3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CameraPosition[] newArray(int i) {
        return new CameraPosition[i];
    }
}
