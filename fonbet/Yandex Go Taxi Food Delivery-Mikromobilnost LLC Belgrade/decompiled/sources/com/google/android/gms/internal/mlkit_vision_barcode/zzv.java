package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        zzn zznVar = null;
        zzq zzqVar = null;
        zzr zzrVar = null;
        zzt zztVar = null;
        zzs zzsVar = null;
        zzo zzoVar = null;
        zzk zzkVar = null;
        zzl zzlVar = null;
        zzm zzmVar = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = cma1.r0(parcel, readInt);
                    break;
                case 3:
                    str = cma1.z(parcel, readInt);
                    break;
                case 4:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 5:
                    i2 = cma1.r0(parcel, readInt);
                    break;
                case 6:
                    pointArr = (Point[]) cma1.C(parcel, readInt, Point.CREATOR);
                    break;
                case 7:
                    zznVar = (zzn) cma1.y(parcel, readInt, zzn.CREATOR);
                    break;
                case '\b':
                    zzqVar = (zzq) cma1.y(parcel, readInt, zzq.CREATOR);
                    break;
                case '\t':
                    zzrVar = (zzr) cma1.y(parcel, readInt, zzr.CREATOR);
                    break;
                case '\n':
                    zztVar = (zzt) cma1.y(parcel, readInt, zzt.CREATOR);
                    break;
                case 11:
                    zzsVar = (zzs) cma1.y(parcel, readInt, zzs.CREATOR);
                    break;
                case '\f':
                    zzoVar = (zzo) cma1.y(parcel, readInt, zzo.CREATOR);
                    break;
                case '\r':
                    zzkVar = (zzk) cma1.y(parcel, readInt, zzk.CREATOR);
                    break;
                case 14:
                    zzlVar = (zzl) cma1.y(parcel, readInt, zzl.CREATOR);
                    break;
                case 15:
                    zzmVar = (zzm) cma1.y(parcel, readInt, zzm.CREATOR);
                    break;
                case 16:
                    bArr = cma1.t(parcel, readInt);
                    break;
                case 17:
                    z = cma1.k0(parcel, readInt);
                    break;
                case 18:
                    d = cma1.m0(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new zzu(i, str, str2, i2, pointArr, zznVar, zzqVar, zzrVar, zztVar, zzsVar, zzoVar, zzkVar, zzlVar, zzmVar, bArr, z, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzu[i];
    }
}
