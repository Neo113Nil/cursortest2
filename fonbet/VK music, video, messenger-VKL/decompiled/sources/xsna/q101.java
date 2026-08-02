package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.issuer.TokenStatus;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class q101 implements Parcelable.Creator<TokenStatus> {
    @Override // android.os.Parcelable.Creator
    public final TokenStatus createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 3) {
                i = SafeParcelReader.w(parcel, readInt);
            } else if (c != 4) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                z = SafeParcelReader.o(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new TokenStatus(str, i, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TokenStatus[] newArray(int i) {
        return new TokenStatus[i];
    }
}
