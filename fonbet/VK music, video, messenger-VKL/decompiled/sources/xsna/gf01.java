package xsna;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.unity3d.services.UnityAdsConstants;
import xsna.vnv;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class gf01 implements Parcelable.Creator<MarkerOptions> {
    @Override // android.os.Parcelable.Creator
    public final MarkerOptions createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f = 0.5f;
        float f2 = 1.0f;
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.h(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    iBinder = SafeParcelReader.v(parcel, readInt);
                    break;
                case 6:
                    f3 = SafeParcelReader.t(parcel, readInt);
                    break;
                case 7:
                    f4 = SafeParcelReader.t(parcel, readInt);
                    break;
                case '\b':
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\t':
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\n':
                    z3 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 11:
                    f5 = SafeParcelReader.t(parcel, readInt);
                    break;
                case '\f':
                    f = SafeParcelReader.t(parcel, readInt);
                    break;
                case '\r':
                    f6 = SafeParcelReader.t(parcel, readInt);
                    break;
                case 14:
                    f2 = SafeParcelReader.t(parcel, readInt);
                    break;
                case 15:
                    f7 = SafeParcelReader.t(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.f = 0.5f;
        markerOptions.g = 1.0f;
        markerOptions.i = true;
        markerOptions.j = false;
        markerOptions.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        markerOptions.l = 0.5f;
        markerOptions.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        markerOptions.n = 1.0f;
        markerOptions.b = latLng;
        markerOptions.c = str;
        markerOptions.d = str2;
        if (iBinder == null) {
            markerOptions.e = null;
        } else {
            markerOptions.e = new tb7(vnv.a.f(iBinder));
        }
        markerOptions.f = f3;
        markerOptions.g = f4;
        markerOptions.h = z;
        markerOptions.i = z2;
        markerOptions.j = z3;
        markerOptions.k = f5;
        markerOptions.l = f;
        markerOptions.m = f6;
        markerOptions.n = f2;
        markerOptions.o = f7;
        return markerOptions;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MarkerOptions[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
