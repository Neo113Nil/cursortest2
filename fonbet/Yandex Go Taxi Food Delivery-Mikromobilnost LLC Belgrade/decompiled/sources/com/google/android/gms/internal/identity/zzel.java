package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzel implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = -1;
        int i2 = 0;
        short s = 0;
        int i3 = 0;
        long j = 0;
        float f = 0.0f;
        double d = 0.0d;
        double d2 = 0.0d;
        String str = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = cma1.z(parcel, readInt);
                    break;
                case 2:
                    j = cma1.u0(parcel, readInt);
                    break;
                case 3:
                    cma1.S0(readInt, parcel, 4);
                    s = (short) parcel.readInt();
                    break;
                case 4:
                    d = cma1.m0(parcel, readInt);
                    break;
                case 5:
                    d2 = cma1.m0(parcel, readInt);
                    break;
                case 6:
                    f = cma1.o0(parcel, readInt);
                    break;
                case 7:
                    i2 = cma1.r0(parcel, readInt);
                    break;
                case '\b':
                    i3 = cma1.r0(parcel, readInt);
                    break;
                case '\t':
                    i = cma1.r0(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new zzek(str, i2, s, d, d2, f, j, i3, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzek[i];
    }
}
