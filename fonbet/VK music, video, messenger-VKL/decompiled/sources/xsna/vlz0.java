package xsna;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes13.dex */
public final class vlz0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        Intent intent = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.w(parcel, readInt);
            } else if (c == 2) {
                i2 = SafeParcelReader.w(parcel, readInt);
            } else if (c != 3) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                intent = (Intent) SafeParcelReader.h(parcel, readInt, Intent.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new com.google.android.gms.signin.internal.zaa(i, i2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new com.google.android.gms.signin.internal.zaa[i];
    }
}
