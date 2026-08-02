package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zzw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Cart cart = null;
        CountrySpecification[] countrySpecificationArr = null;
        ArrayList arrayList = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
        ArrayList arrayList2 = null;
        String str5 = null;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = cma1.z(parcel, readInt);
                    break;
                case 3:
                    z3 = cma1.k0(parcel, readInt);
                    break;
                case 4:
                    z4 = cma1.k0(parcel, readInt);
                    break;
                case 5:
                    z5 = cma1.k0(parcel, readInt);
                    break;
                case 6:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 7:
                    str3 = cma1.z(parcel, readInt);
                    break;
                case '\b':
                    str4 = cma1.z(parcel, readInt);
                    break;
                case '\t':
                    cart = (Cart) cma1.y(parcel, readInt, Cart.CREATOR);
                    break;
                case '\n':
                    z6 = cma1.k0(parcel, readInt);
                    break;
                case 11:
                    z7 = cma1.k0(parcel, readInt);
                    break;
                case '\f':
                    countrySpecificationArr = (CountrySpecification[]) cma1.C(parcel, readInt, CountrySpecification.CREATOR);
                    break;
                case '\r':
                    z = cma1.k0(parcel, readInt);
                    break;
                case 14:
                    z2 = cma1.k0(parcel, readInt);
                    break;
                case 15:
                    arrayList = cma1.D(parcel, readInt, com.google.android.gms.identity.intents.model.CountrySpecification.CREATOR);
                    break;
                case 16:
                    paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) cma1.y(parcel, readInt, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                case 17:
                    arrayList2 = cma1.x(parcel, readInt);
                    break;
                case 18:
                    str5 = cma1.z(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new MaskedWalletRequest(str, z3, z4, z5, str2, str3, str4, cart, z6, z7, countrySpecificationArr, z, z2, arrayList, paymentMethodTokenizationParameters, arrayList2, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MaskedWalletRequest[i];
    }
}
