package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        int i3 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str11 = null;
        String str12 = null;
        int i4 = 100;
        boolean z4 = true;
        boolean z5 = true;
        long j8 = -2147483648L;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str5 = cma1.z(parcel, readInt);
                    break;
                case 3:
                    str6 = cma1.z(parcel, readInt);
                    break;
                case 4:
                    str7 = cma1.z(parcel, readInt);
                    break;
                case 5:
                    str8 = cma1.z(parcel, readInt);
                    break;
                case 6:
                    j = cma1.u0(parcel, readInt);
                    break;
                case 7:
                    j2 = cma1.u0(parcel, readInt);
                    break;
                case '\b':
                    str9 = cma1.z(parcel, readInt);
                    break;
                case '\t':
                    z4 = cma1.k0(parcel, readInt);
                    break;
                case '\n':
                    z = cma1.k0(parcel, readInt);
                    break;
                case 11:
                    j8 = cma1.u0(parcel, readInt);
                    break;
                case '\f':
                    str10 = cma1.z(parcel, readInt);
                    break;
                case '\r':
                case 17:
                case 19:
                case 20:
                case 24:
                case '!':
                default:
                    cma1.A0(parcel, readInt);
                    break;
                case 14:
                    j3 = cma1.u0(parcel, readInt);
                    break;
                case 15:
                    i = cma1.r0(parcel, readInt);
                    break;
                case 16:
                    z5 = cma1.k0(parcel, readInt);
                    break;
                case 18:
                    z2 = cma1.k0(parcel, readInt);
                    break;
                case 21:
                    int w0 = cma1.w0(parcel, readInt);
                    if (w0 != 0) {
                        cma1.T0(w0, parcel, 4);
                        bool = Boolean.valueOf(parcel.readInt() != 0);
                        break;
                    } else {
                        bool = null;
                        break;
                    }
                case 22:
                    j4 = cma1.u0(parcel, readInt);
                    break;
                case 23:
                    arrayList = cma1.B(parcel, readInt);
                    break;
                case 25:
                    str = cma1.z(parcel, readInt);
                    break;
                case 26:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 27:
                    str11 = cma1.z(parcel, readInt);
                    break;
                case 28:
                    z3 = cma1.k0(parcel, readInt);
                    break;
                case 29:
                    j5 = cma1.u0(parcel, readInt);
                    break;
                case 30:
                    i4 = cma1.r0(parcel, readInt);
                    break;
                case 31:
                    str3 = cma1.z(parcel, readInt);
                    break;
                case ' ':
                    i2 = cma1.r0(parcel, readInt);
                    break;
                case '\"':
                    j6 = cma1.u0(parcel, readInt);
                    break;
                case '#':
                    str12 = cma1.z(parcel, readInt);
                    break;
                case '$':
                    str4 = cma1.z(parcel, readInt);
                    break;
                case '%':
                    j7 = cma1.u0(parcel, readInt);
                    break;
                case '&':
                    i3 = cma1.r0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new zzr(str5, str6, str7, str8, j, j2, str9, z4, z, j8, str10, j3, i, z5, z2, bool, j4, arrayList, str, str2, str11, z3, j5, i4, str3, i2, j6, str12, str4, j7, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}
