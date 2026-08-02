package com.google.android.gms.wallet.firstparty;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        Bundle bundle = null;
        String str = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = cma1.r0(parcel, readInt);
            } else if (c == 3) {
                bundle = cma1.s(parcel, readInt);
            } else if (c == 4) {
                str = cma1.z(parcel, readInt);
            } else if (c == 5) {
                i2 = cma1.r0(parcel, readInt);
            } else if (c != 6) {
                cma1.A0(parcel, readInt);
            } else {
                i3 = cma1.r0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new WalletCustomTheme(i, bundle, str, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WalletCustomTheme[i];
    }
}
