package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class vd01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = SafeParcelReader.w(parcel, readInt);
            } else if (c == 3) {
                i2 = SafeParcelReader.w(parcel, readInt);
            } else if (c != 4) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                i3 = SafeParcelReader.w(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new ImageHints(i, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ImageHints[i];
    }
}
