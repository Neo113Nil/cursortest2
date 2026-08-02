package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = cma1.z(parcel, readInt);
            } else if (c == 2) {
                i2 = cma1.r0(parcel, readInt);
            } else if (c == 3) {
                j = cma1.u0(parcel, readInt);
            } else if (c == 4) {
                bArr = cma1.t(parcel, readInt);
            } else if (c == 5) {
                bundle = cma1.s(parcel, readInt);
            } else if (c != 1000) {
                cma1.A0(parcel, readInt);
            } else {
                i = cma1.r0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new ProxyRequest(i, str, i2, j, bArr, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyRequest[i];
    }
}
