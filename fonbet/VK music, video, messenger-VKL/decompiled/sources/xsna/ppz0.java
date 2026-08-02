package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.SafeParcelResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class ppz0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        int i = 0;
        Parcel parcel2 = null;
        com.google.android.gms.common.server.response.zan zanVar = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.w(parcel, readInt);
            } else if (c == 2) {
                int B = SafeParcelReader.B(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (B == 0) {
                    parcel2 = null;
                } else {
                    Parcel obtain = Parcel.obtain();
                    obtain.appendFrom(parcel, dataPosition, B);
                    parcel.setDataPosition(dataPosition + B);
                    parcel2 = obtain;
                }
            } else if (c != 3) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                zanVar = (com.google.android.gms.common.server.response.zan) SafeParcelReader.h(parcel, readInt, com.google.android.gms.common.server.response.zan.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new SafeParcelResponse(i, parcel2, zanVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }
}
