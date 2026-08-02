package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        float f = 0.0f;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = cma1.r0(parcel, readInt);
                    break;
                case 2:
                    j = cma1.u0(parcel, readInt);
                    break;
                case 3:
                case 7:
                case '\t':
                default:
                    cma1.A0(parcel, readInt);
                    break;
                case 4:
                    str = cma1.z(parcel, readInt);
                    break;
                case 5:
                    i3 = cma1.r0(parcel, readInt);
                    break;
                case 6:
                    arrayList = cma1.B(parcel, readInt);
                    break;
                case '\b':
                    j2 = cma1.u0(parcel, readInt);
                    break;
                case '\n':
                    str3 = cma1.z(parcel, readInt);
                    break;
                case 11:
                    i2 = cma1.r0(parcel, readInt);
                    break;
                case '\f':
                    str2 = cma1.z(parcel, readInt);
                    break;
                case '\r':
                    str4 = cma1.z(parcel, readInt);
                    break;
                case 14:
                    i4 = cma1.r0(parcel, readInt);
                    break;
                case 15:
                    f = cma1.o0(parcel, readInt);
                    break;
                case 16:
                    j3 = cma1.u0(parcel, readInt);
                    break;
                case 17:
                    str5 = cma1.z(parcel, readInt);
                    break;
                case 18:
                    z = cma1.k0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
