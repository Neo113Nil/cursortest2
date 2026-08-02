package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = cma1.r0(parcel, readInt);
            } else if (c == 2) {
                str = cma1.z(parcel, readInt);
            } else if (c == 3) {
                bArr = cma1.t(parcel, readInt);
            } else if (c != 4) {
                cma1.A0(parcel, readInt);
            } else {
                str2 = cma1.z(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new RegisterRequest(i, str, bArr, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterRequest[i];
    }
}
