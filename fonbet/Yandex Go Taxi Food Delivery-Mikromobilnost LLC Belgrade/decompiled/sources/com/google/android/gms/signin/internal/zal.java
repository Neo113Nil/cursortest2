package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zal implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        ConnectionResult connectionResult = null;
        int i = 0;
        zav zavVar = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = cma1.r0(parcel, readInt);
            } else if (c == 2) {
                connectionResult = (ConnectionResult) cma1.y(parcel, readInt, ConnectionResult.CREATOR);
            } else if (c != 3) {
                cma1.A0(parcel, readInt);
            } else {
                zavVar = (zav) cma1.y(parcel, readInt, zav.CREATOR);
            }
        }
        cma1.E(parcel, P0);
        return new zak(i, connectionResult, zavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zak[i];
    }
}
