package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zap implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = cma1.r0(parcel, readInt);
            } else if (c == 2) {
                str = cma1.z(parcel, readInt);
            } else if (c != 3) {
                cma1.A0(parcel, readInt);
            } else {
                arrayList = cma1.D(parcel, readInt, zam.CREATOR);
            }
        }
        cma1.E(parcel, P0);
        return new zal(i, str, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zal[i];
    }
}
