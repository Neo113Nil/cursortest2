package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        int i2 = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = cma1.r0(parcel, readInt);
            } else if (c == 2) {
                f = cma1.o0(parcel, readInt);
            } else if (c == 3) {
                f2 = cma1.o0(parcel, readInt);
            } else if (c != 4) {
                cma1.A0(parcel, readInt);
            } else {
                i2 = cma1.r0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new zzn(i, f, f2, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzn[i];
    }
}
