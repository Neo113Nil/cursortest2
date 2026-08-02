package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.AdBreakStatus;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class a601 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                j = SafeParcelReader.z(parcel, readInt);
            } else if (c == 3) {
                j2 = SafeParcelReader.z(parcel, readInt);
            } else if (c == 4) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 5) {
                str2 = SafeParcelReader.i(parcel, readInt);
            } else if (c != 6) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                j3 = SafeParcelReader.z(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new AdBreakStatus(str, j, str2, j2, j3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdBreakStatus[i];
    }
}
