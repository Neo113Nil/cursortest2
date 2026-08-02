package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzab implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                d = cma1.m0(parcel, readInt);
            } else if (c != 3) {
                cma1.A0(parcel, readInt);
            } else {
                d2 = cma1.m0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new zzo(d, d2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
