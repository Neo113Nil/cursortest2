package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.ActivityTransition;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public final class j801 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.w(parcel, readInt);
            } else if (c != 2) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                i2 = SafeParcelReader.w(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new ActivityTransition(i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransition[i];
    }
}
