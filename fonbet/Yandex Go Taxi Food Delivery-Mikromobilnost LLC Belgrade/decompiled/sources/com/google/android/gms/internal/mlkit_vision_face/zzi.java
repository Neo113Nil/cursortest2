package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        float f = -1.0f;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = cma1.r0(parcel, readInt);
                    break;
                case 3:
                    i2 = cma1.r0(parcel, readInt);
                    break;
                case 4:
                    i3 = cma1.r0(parcel, readInt);
                    break;
                case 5:
                    z = cma1.k0(parcel, readInt);
                    break;
                case 6:
                    z2 = cma1.k0(parcel, readInt);
                    break;
                case 7:
                    f = cma1.o0(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new zzh(i, i2, i3, z, z2, f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzh[i];
    }
}
