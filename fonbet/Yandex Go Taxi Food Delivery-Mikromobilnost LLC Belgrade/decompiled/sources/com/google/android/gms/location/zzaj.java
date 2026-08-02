package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzaj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z = cma1.k0(parcel, readInt);
                    break;
                case 2:
                    z2 = cma1.k0(parcel, readInt);
                    break;
                case 3:
                    z3 = cma1.k0(parcel, readInt);
                    break;
                case 4:
                    z4 = cma1.k0(parcel, readInt);
                    break;
                case 5:
                    z5 = cma1.k0(parcel, readInt);
                    break;
                case 6:
                    z6 = cma1.k0(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new LocationSettingsStates(z, z2, z3, z4, z5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}
