package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class ac01 implements Parcelable.Creator<LatLng> {
    @Override // android.os.Parcelable.Creator
    public final LatLng createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        double d2 = 0.0d;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                d = SafeParcelReader.r(parcel, readInt);
            } else if (c != 3) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                d2 = SafeParcelReader.r(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new LatLng(d, d2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LatLng[] newArray(int i) {
        return new LatLng[i];
    }
}
