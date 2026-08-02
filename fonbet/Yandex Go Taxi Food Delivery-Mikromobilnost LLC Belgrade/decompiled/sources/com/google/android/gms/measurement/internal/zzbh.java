package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bb1;
import defpackage.cma1;

/* loaded from: classes.dex */
public final class zzbh implements Parcelable.Creator {
    public static void zza(zzbg zzbgVar, Parcel parcel, int i) {
        String str = zzbgVar.zza;
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, str, false);
        bb1.f0(parcel, 3, zzbgVar.zzb, i, false);
        bb1.g0(parcel, 4, zzbgVar.zzc, false);
        long j = zzbgVar.zzd;
        bb1.m0(5, parcel, 8);
        parcel.writeLong(j);
        bb1.o0(parcel, n0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        long j = 0;
        String str = null;
        zzbe zzbeVar = null;
        String str2 = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = cma1.z(parcel, readInt);
            } else if (c == 3) {
                zzbeVar = (zzbe) cma1.y(parcel, readInt, zzbe.CREATOR);
            } else if (c == 4) {
                str2 = cma1.z(parcel, readInt);
            } else if (c != 5) {
                cma1.A0(parcel, readInt);
            } else {
                j = cma1.u0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new zzbg(str, zzbeVar, str2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbg[i];
    }
}
