package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = 0;
        LoyaltyWalletObject loyaltyWalletObject = null;
        OfferWalletObject offerWalletObject = null;
        GiftCardWalletObject giftCardWalletObject = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                loyaltyWalletObject = (LoyaltyWalletObject) cma1.y(parcel, readInt, LoyaltyWalletObject.CREATOR);
            } else if (c == 3) {
                offerWalletObject = (OfferWalletObject) cma1.y(parcel, readInt, OfferWalletObject.CREATOR);
            } else if (c == 4) {
                giftCardWalletObject = (GiftCardWalletObject) cma1.y(parcel, readInt, GiftCardWalletObject.CREATOR);
            } else if (c != 5) {
                cma1.A0(parcel, readInt);
            } else {
                i = cma1.r0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new CreateWalletObjectsRequest(loyaltyWalletObject, offerWalletObject, giftCardWalletObject, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CreateWalletObjectsRequest[i];
    }
}
