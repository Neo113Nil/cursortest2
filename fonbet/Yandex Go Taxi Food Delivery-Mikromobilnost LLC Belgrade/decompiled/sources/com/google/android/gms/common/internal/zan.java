package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes.dex */
public final class zan implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = cma1.r0(parcel, readInt);
                    break;
                case 2:
                    i3 = cma1.r0(parcel, readInt);
                    break;
                case 3:
                    i4 = cma1.r0(parcel, readInt);
                    break;
                case 4:
                    j = cma1.u0(parcel, readInt);
                    break;
                case 5:
                    j2 = cma1.u0(parcel, readInt);
                    break;
                case 6:
                    str = cma1.z(parcel, readInt);
                    break;
                case 7:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case '\b':
                    i5 = cma1.r0(parcel, readInt);
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
        return new MethodInvocation(i2, i3, i4, j, j2, str, str2, i5, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
