package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzef implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = cma1.r0(parcel, readInt);
            } else if (c == 2) {
                iBinder = cma1.q0(parcel, readInt);
            } else if (c == 3) {
                iBinder2 = cma1.q0(parcel, readInt);
            } else if (c == 4) {
                pendingIntent = (PendingIntent) cma1.y(parcel, readInt, PendingIntent.CREATOR);
            } else if (c != 6) {
                cma1.A0(parcel, readInt);
            } else {
                str = cma1.z(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new zzee(i, iBinder, iBinder2, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzee[i];
    }
}
