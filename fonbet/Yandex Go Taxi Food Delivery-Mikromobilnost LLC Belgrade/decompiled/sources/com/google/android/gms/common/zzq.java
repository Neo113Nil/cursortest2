package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = cma1.z(parcel, readInt);
                    break;
                case 2:
                    z = cma1.k0(parcel, readInt);
                    break;
                case 3:
                    z2 = cma1.k0(parcel, readInt);
                    break;
                case 4:
                    iBinder = cma1.q0(parcel, readInt);
                    break;
                case 5:
                    z3 = cma1.k0(parcel, readInt);
                    break;
                case 6:
                    z4 = cma1.k0(parcel, readInt);
                    break;
                case 7:
                default:
                    cma1.A0(parcel, readInt);
                    break;
                case '\b':
                    z5 = cma1.k0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new zzp(str, z, z2, iBinder, z3, z4, z5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzp[i];
    }
}
