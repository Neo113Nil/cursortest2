package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzam implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = cma1.z(parcel, readInt);
            } else if (c == 3) {
                str2 = cma1.z(parcel, readInt);
            } else if (c == 4) {
                i = cma1.r0(parcel, readInt);
            } else if (c != 5) {
                cma1.A0(parcel, readInt);
            } else {
                i2 = cma1.r0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new ProxyCard(str, str2, i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyCard[i];
    }
}
