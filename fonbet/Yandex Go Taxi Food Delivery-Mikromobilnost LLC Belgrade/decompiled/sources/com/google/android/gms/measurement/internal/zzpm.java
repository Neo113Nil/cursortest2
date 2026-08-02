package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bb1;
import defpackage.cma1;

/* loaded from: classes.dex */
public final class zzpm implements Parcelable.Creator {
    public static void zza(zzpl zzplVar, Parcel parcel, int i) {
        int i2 = zzplVar.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        bb1.g0(parcel, 2, zzplVar.zzb, false);
        long j = zzplVar.zzc;
        bb1.m0(3, parcel, 8);
        parcel.writeLong(j);
        bb1.e0(parcel, 4, zzplVar.zzd);
        bb1.g0(parcel, 6, zzplVar.zze, false);
        bb1.g0(parcel, 7, zzplVar.zzf, false);
        bb1.X(parcel, 8, zzplVar.zzg);
        bb1.o0(parcel, n0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = cma1.r0(parcel, readInt);
                    break;
                case 2:
                    str = cma1.z(parcel, readInt);
                    break;
                case 3:
                    j = cma1.u0(parcel, readInt);
                    break;
                case 4:
                    l = cma1.v0(parcel, readInt);
                    break;
                case 5:
                    f = cma1.p0(parcel, readInt);
                    break;
                case 6:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 7:
                    str3 = cma1.z(parcel, readInt);
                    break;
                case '\b':
                    d = cma1.n0(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new zzpl(i, str, j, l, f, str2, str3, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzpl[i];
    }
}
