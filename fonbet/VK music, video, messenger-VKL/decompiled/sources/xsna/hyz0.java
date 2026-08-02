package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.zzam;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class hyz0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                f = SafeParcelReader.t(parcel, readInt);
            } else if (c == 3) {
                f2 = SafeParcelReader.t(parcel, readInt);
            } else if (c != 4) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                f3 = SafeParcelReader.t(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzam(f, f2, f3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzam[i];
    }
}
