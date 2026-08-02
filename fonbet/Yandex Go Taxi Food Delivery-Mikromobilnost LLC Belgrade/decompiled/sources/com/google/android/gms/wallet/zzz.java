package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        CreditCardExpirationDate creditCardExpirationDate = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = cma1.z(parcel, readInt);
            } else if (c != 2) {
                cma1.A0(parcel, readInt);
            } else {
                creditCardExpirationDate = (CreditCardExpirationDate) cma1.y(parcel, readInt, CreditCardExpirationDate.CREATOR);
            }
        }
        cma1.E(parcel, P0);
        return new PaymentCardRecognitionResult(str, creditCardExpirationDate);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PaymentCardRecognitionResult[i];
    }
}
