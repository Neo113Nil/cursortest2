package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzac implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        CardInfo cardInfo = null;
        UserAddress userAddress = null;
        PaymentMethodToken paymentMethodToken = null;
        String str2 = null;
        Bundle bundle = null;
        String str3 = null;
        Bundle bundle2 = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = cma1.z(parcel, readInt);
                    break;
                case 2:
                    cardInfo = (CardInfo) cma1.y(parcel, readInt, CardInfo.CREATOR);
                    break;
                case 3:
                    userAddress = (UserAddress) cma1.y(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 4:
                    paymentMethodToken = (PaymentMethodToken) cma1.y(parcel, readInt, PaymentMethodToken.CREATOR);
                    break;
                case 5:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 6:
                    bundle = cma1.s(parcel, readInt);
                    break;
                case 7:
                    str3 = cma1.z(parcel, readInt);
                    break;
                case '\b':
                    bundle2 = cma1.s(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new PaymentData(str, cardInfo, userAddress, paymentMethodToken, str2, bundle, str3, bundle2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PaymentData[i];
    }
}
