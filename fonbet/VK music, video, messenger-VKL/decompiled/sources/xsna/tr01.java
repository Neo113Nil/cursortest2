package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.CardRequirements;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.ShippingAddressRequirements;
import com.google.android.gms.wallet.TransactionInfo;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class tr01 implements Parcelable.Creator<PaymentDataRequest> {
    @Override // android.os.Parcelable.Creator
    public final PaymentDataRequest createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        boolean z = false;
        CardRequirements cardRequirements = null;
        ShippingAddressRequirements shippingAddressRequirements = null;
        ArrayList<Integer> arrayList = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
        TransactionInfo transactionInfo = null;
        String str = null;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 2:
                    z3 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 3:
                    cardRequirements = (CardRequirements) SafeParcelReader.h(parcel, readInt, CardRequirements.CREATOR);
                    break;
                case 4:
                    z4 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 5:
                    shippingAddressRequirements = (ShippingAddressRequirements) SafeParcelReader.h(parcel, readInt, ShippingAddressRequirements.CREATOR);
                    break;
                case 6:
                    arrayList = SafeParcelReader.e(parcel, readInt);
                    break;
                case 7:
                    paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) SafeParcelReader.h(parcel, readInt, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                case '\b':
                    transactionInfo = (TransactionInfo) SafeParcelReader.h(parcel, readInt, TransactionInfo.CREATOR);
                    break;
                case '\t':
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\n':
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        PaymentDataRequest paymentDataRequest = new PaymentDataRequest();
        paymentDataRequest.b = z;
        paymentDataRequest.c = z3;
        paymentDataRequest.d = cardRequirements;
        paymentDataRequest.e = z4;
        paymentDataRequest.f = shippingAddressRequirements;
        paymentDataRequest.g = arrayList;
        paymentDataRequest.h = paymentMethodTokenizationParameters;
        paymentDataRequest.i = transactionInfo;
        paymentDataRequest.j = z2;
        paymentDataRequest.k = str;
        return paymentDataRequest;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PaymentDataRequest[] newArray(int i) {
        return new PaymentDataRequest[i];
    }
}
