package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes.dex */
public final class zzde implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        Bundle bundle = null;
        String str = null;
        boolean z = false;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                j = cma1.u0(parcel, readInt);
            } else if (c == 2) {
                j2 = cma1.u0(parcel, readInt);
            } else if (c == 3) {
                z = cma1.k0(parcel, readInt);
            } else if (c == 7) {
                bundle = cma1.s(parcel, readInt);
            } else if (c != '\b') {
                cma1.A0(parcel, readInt);
            } else {
                str = cma1.z(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new zzdd(j, j2, z, bundle, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdd[i];
    }
}
