package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        LoyaltyPointsBalance loyaltyPointsBalance = null;
        TimeInterval timeInterval = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = cma1.z(parcel, readInt);
            } else if (c == 3) {
                loyaltyPointsBalance = (LoyaltyPointsBalance) cma1.y(parcel, readInt, LoyaltyPointsBalance.CREATOR);
            } else if (c != 5) {
                cma1.A0(parcel, readInt);
            } else {
                timeInterval = (TimeInterval) cma1.y(parcel, readInt, TimeInterval.CREATOR);
            }
        }
        cma1.E(parcel, P0);
        return new LoyaltyPoints(str, loyaltyPointsBalance, timeInterval);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyPoints[i];
    }
}
