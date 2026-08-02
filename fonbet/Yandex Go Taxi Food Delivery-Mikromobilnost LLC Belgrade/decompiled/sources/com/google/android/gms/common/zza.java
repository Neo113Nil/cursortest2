package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        Integer num = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = cma1.r0(parcel, readInt);
            } else if (c == 2) {
                i2 = cma1.r0(parcel, readInt);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) cma1.y(parcel, readInt, PendingIntent.CREATOR);
            } else if (c == 4) {
                str = cma1.z(parcel, readInt);
            } else if (c != 5) {
                cma1.A0(parcel, readInt);
            } else {
                num = cma1.s0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new ConnectionResult(i, i2, pendingIntent, str, num);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
