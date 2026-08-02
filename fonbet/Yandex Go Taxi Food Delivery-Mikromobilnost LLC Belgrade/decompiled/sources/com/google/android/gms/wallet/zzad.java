package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zzad implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        CardRequirements cardRequirements = null;
        ShippingAddressRequirements shippingAddressRequirements = null;
        ArrayList arrayList = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
        TransactionInfo transactionInfo = null;
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z2 = cma1.k0(parcel, readInt);
                    break;
                case 2:
                    z3 = cma1.k0(parcel, readInt);
                    break;
                case 3:
                    cardRequirements = (CardRequirements) cma1.y(parcel, readInt, CardRequirements.CREATOR);
                    break;
                case 4:
                    z4 = cma1.k0(parcel, readInt);
                    break;
                case 5:
                    shippingAddressRequirements = (ShippingAddressRequirements) cma1.y(parcel, readInt, ShippingAddressRequirements.CREATOR);
                    break;
                case 6:
                    arrayList = cma1.x(parcel, readInt);
                    break;
                case 7:
                    paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) cma1.y(parcel, readInt, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                case '\b':
                    transactionInfo = (TransactionInfo) cma1.y(parcel, readInt, TransactionInfo.CREATOR);
                    break;
                case '\t':
                    z = cma1.k0(parcel, readInt);
                    break;
                case '\n':
                    str = cma1.z(parcel, readInt);
                    break;
                case 11:
                    bundle = cma1.s(parcel, readInt);
                    break;
                case '\f':
                    bArr = cma1.t(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new PaymentDataRequest(z2, z3, cardRequirements, z4, shippingAddressRequirements, arrayList, paymentMethodTokenizationParameters, transactionInfo, z, str, bArr, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PaymentDataRequest[i];
    }
}
