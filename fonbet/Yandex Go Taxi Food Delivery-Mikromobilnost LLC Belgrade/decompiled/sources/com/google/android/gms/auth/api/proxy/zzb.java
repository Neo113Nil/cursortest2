package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i2 = cma1.r0(parcel, readInt);
            } else if (c == 2) {
                pendingIntent = (PendingIntent) cma1.y(parcel, readInt, PendingIntent.CREATOR);
            } else if (c == 3) {
                i3 = cma1.r0(parcel, readInt);
            } else if (c == 4) {
                bundle = cma1.s(parcel, readInt);
            } else if (c == 5) {
                bArr = cma1.t(parcel, readInt);
            } else if (c != 1000) {
                cma1.A0(parcel, readInt);
            } else {
                i = cma1.r0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new ProxyResponse(i, i2, pendingIntent, i3, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyResponse[i];
    }
}
