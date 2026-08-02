package xsna;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.CardInfo;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentMethodToken;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class iq01 implements Parcelable.Creator<PaymentData> {
    @Override // android.os.Parcelable.Creator
    public final PaymentData createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        CardInfo cardInfo = null;
        UserAddress userAddress = null;
        PaymentMethodToken paymentMethodToken = null;
        String str2 = null;
        Bundle bundle = null;
        String str3 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 2:
                    cardInfo = (CardInfo) SafeParcelReader.h(parcel, readInt, CardInfo.CREATOR);
                    break;
                case 3:
                    userAddress = (UserAddress) SafeParcelReader.h(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 4:
                    paymentMethodToken = (PaymentMethodToken) SafeParcelReader.h(parcel, readInt, PaymentMethodToken.CREATOR);
                    break;
                case 5:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    bundle = SafeParcelReader.b(parcel, readInt);
                    break;
                case 7:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        PaymentData paymentData = new PaymentData();
        paymentData.b = str;
        paymentData.c = cardInfo;
        paymentData.d = userAddress;
        paymentData.e = paymentMethodToken;
        paymentData.f = str2;
        paymentData.g = bundle;
        paymentData.h = str3;
        return paymentData;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PaymentData[] newArray(int i) {
        return new PaymentData[i];
    }
}
