package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = cma1.r0(parcel, readInt);
            } else if (c == 3) {
                i2 = cma1.r0(parcel, readInt);
            } else if (c == 4) {
                i3 = cma1.r0(parcel, readInt);
            } else if (c == 5) {
                i4 = cma1.r0(parcel, readInt);
            } else if (c != 6) {
                cma1.A0(parcel, readInt);
            } else {
                f = cma1.o0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new zzf(i, i2, i3, i4, f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzf[i];
    }
}
