package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.firstparty.zzaw;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class l001 implements Parcelable.Creator<TokenStatus> {
    @Override // android.os.Parcelable.Creator
    public final TokenStatus createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        zzaw zzawVar = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                zzawVar = (zzaw) SafeParcelReader.h(parcel, readInt, zzaw.CREATOR);
            } else if (c == 3) {
                i = SafeParcelReader.w(parcel, readInt);
            } else if (c != 4) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                z = SafeParcelReader.o(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        TokenStatus tokenStatus = new TokenStatus();
        tokenStatus.b = zzawVar;
        tokenStatus.c = i;
        tokenStatus.d = z;
        return tokenStatus;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TokenStatus[] newArray(int i) {
        return new TokenStatus[i];
    }
}
