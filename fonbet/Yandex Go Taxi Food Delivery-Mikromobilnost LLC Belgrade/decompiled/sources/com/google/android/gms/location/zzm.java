package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        byte b = 0;
        long j = 0;
        float[] fArr = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c != 1) {
                switch (c) {
                    case 4:
                        f = cma1.o0(parcel, readInt);
                        break;
                    case 5:
                        f2 = cma1.o0(parcel, readInt);
                        break;
                    case 6:
                        j = cma1.u0(parcel, readInt);
                        break;
                    case 7:
                        b = cma1.l0(parcel, readInt);
                        break;
                    case '\b':
                        f3 = cma1.o0(parcel, readInt);
                        break;
                    case '\t':
                        f4 = cma1.o0(parcel, readInt);
                        break;
                    default:
                        cma1.A0(parcel, readInt);
                        break;
                }
            } else {
                fArr = cma1.v(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new DeviceOrientation(fArr, f, f2, j, b, f3, f4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceOrientation[i];
    }
}
