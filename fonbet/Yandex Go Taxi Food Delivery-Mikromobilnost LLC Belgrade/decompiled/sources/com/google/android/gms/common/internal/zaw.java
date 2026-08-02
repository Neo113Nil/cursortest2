package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zaw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = cma1.r0(parcel, readInt);
            } else if (c == 2) {
                iBinder = cma1.q0(parcel, readInt);
            } else if (c == 3) {
                connectionResult = (ConnectionResult) cma1.y(parcel, readInt, ConnectionResult.CREATOR);
            } else if (c == 4) {
                z = cma1.k0(parcel, readInt);
            } else if (c != 5) {
                cma1.A0(parcel, readInt);
            } else {
                z2 = cma1.k0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new zav(i, iBinder, connectionResult, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zav[i];
    }
}
