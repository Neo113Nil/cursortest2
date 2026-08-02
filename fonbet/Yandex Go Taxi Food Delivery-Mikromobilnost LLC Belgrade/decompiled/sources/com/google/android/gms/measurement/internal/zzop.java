package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzop implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                cma1.A0(parcel, readInt);
            } else {
                arrayList = cma1.x(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new zzoo(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzoo[i];
    }
}
