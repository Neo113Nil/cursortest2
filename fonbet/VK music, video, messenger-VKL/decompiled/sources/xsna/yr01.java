package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.PaymentMethodToken;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class yr01 implements Parcelable.Creator<PaymentMethodToken> {
    @Override // android.os.Parcelable.Creator
    public final PaymentMethodToken createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = SafeParcelReader.w(parcel, readInt);
            } else if (c != 3) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                str = SafeParcelReader.i(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        PaymentMethodToken paymentMethodToken = new PaymentMethodToken();
        paymentMethodToken.b = i;
        paymentMethodToken.c = str;
        return paymentMethodToken;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PaymentMethodToken[] newArray(int i) {
        return new PaymentMethodToken[i];
    }
}
