package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzuk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = cma1.k0(parcel, readInt);
            } else if (c == 2) {
                z2 = cma1.k0(parcel, readInt);
            } else if (c == 3) {
                z3 = cma1.k0(parcel, readInt);
            } else if (c == 4) {
                z4 = cma1.k0(parcel, readInt);
            } else if (c != 5) {
                cma1.A0(parcel, readInt);
            } else {
                z5 = cma1.k0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new zzuj(z, z2, z3, z4, z5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzuj[i];
    }
}
