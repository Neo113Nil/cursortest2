package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzon implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        byte[] bArr = null;
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = cma1.u0(parcel, readInt);
                    break;
                case 2:
                    bArr = cma1.t(parcel, readInt);
                    break;
                case 3:
                    str = cma1.z(parcel, readInt);
                    break;
                case 4:
                    bundle = cma1.s(parcel, readInt);
                    break;
                case 5:
                    i = cma1.r0(parcel, readInt);
                    break;
                case 6:
                    j2 = cma1.u0(parcel, readInt);
                    break;
                case 7:
                    str2 = cma1.z(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new zzom(j, bArr, str, bundle, i, j2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzom[i];
    }
}
