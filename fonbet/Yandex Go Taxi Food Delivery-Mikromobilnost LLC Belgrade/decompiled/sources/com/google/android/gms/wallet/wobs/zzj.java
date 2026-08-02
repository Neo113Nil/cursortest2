package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        String str2 = null;
        TimeInterval timeInterval = null;
        UriData uriData = null;
        UriData uriData2 = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = cma1.z(parcel, readInt);
            } else if (c == 3) {
                str2 = cma1.z(parcel, readInt);
            } else if (c == 4) {
                timeInterval = (TimeInterval) cma1.y(parcel, readInt, TimeInterval.CREATOR);
            } else if (c == 5) {
                uriData = (UriData) cma1.y(parcel, readInt, UriData.CREATOR);
            } else if (c != 6) {
                cma1.A0(parcel, readInt);
            } else {
                uriData2 = (UriData) cma1.y(parcel, readInt, UriData.CREATOR);
            }
        }
        cma1.E(parcel, P0);
        return new WalletObjectMessage(str, str2, timeInterval, uriData, uriData2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletObjectMessage[i];
    }
}
