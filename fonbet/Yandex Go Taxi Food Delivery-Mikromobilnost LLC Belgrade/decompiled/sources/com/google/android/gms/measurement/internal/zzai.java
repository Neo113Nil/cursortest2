package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzai implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        String str2 = null;
        zzpl zzplVar = null;
        String str3 = null;
        zzbg zzbgVar = null;
        zzbg zzbgVar2 = null;
        zzbg zzbgVar3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = cma1.z(parcel, readInt);
                    break;
                case 3:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 4:
                    zzplVar = (zzpl) cma1.y(parcel, readInt, zzpl.CREATOR);
                    break;
                case 5:
                    j = cma1.u0(parcel, readInt);
                    break;
                case 6:
                    z = cma1.k0(parcel, readInt);
                    break;
                case 7:
                    str3 = cma1.z(parcel, readInt);
                    break;
                case '\b':
                    zzbgVar = (zzbg) cma1.y(parcel, readInt, zzbg.CREATOR);
                    break;
                case '\t':
                    j2 = cma1.u0(parcel, readInt);
                    break;
                case '\n':
                    zzbgVar2 = (zzbg) cma1.y(parcel, readInt, zzbg.CREATOR);
                    break;
                case 11:
                    j3 = cma1.u0(parcel, readInt);
                    break;
                case '\f':
                    zzbgVar3 = (zzbg) cma1.y(parcel, readInt, zzbg.CREATOR);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new zzah(str, str2, zzplVar, j, z, str3, zzbgVar, j2, zzbgVar2, j3, zzbgVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzah[i];
    }
}
