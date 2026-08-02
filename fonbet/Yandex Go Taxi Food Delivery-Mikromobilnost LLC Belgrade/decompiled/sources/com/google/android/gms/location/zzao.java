package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzao implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        int i8 = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = cma1.r0(parcel, readInt);
                    break;
                case 2:
                    i2 = cma1.r0(parcel, readInt);
                    break;
                case 3:
                    i3 = cma1.r0(parcel, readInt);
                    break;
                case 4:
                    i4 = cma1.r0(parcel, readInt);
                    break;
                case 5:
                    i5 = cma1.r0(parcel, readInt);
                    break;
                case 6:
                    i6 = cma1.r0(parcel, readInt);
                    break;
                case 7:
                    i7 = cma1.r0(parcel, readInt);
                    break;
                case '\b':
                    z = cma1.k0(parcel, readInt);
                    break;
                case '\t':
                    i8 = cma1.r0(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new SleepClassifyEvent(i, i2, i3, i4, i5, i6, i7, z, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SleepClassifyEvent[i];
    }
}
