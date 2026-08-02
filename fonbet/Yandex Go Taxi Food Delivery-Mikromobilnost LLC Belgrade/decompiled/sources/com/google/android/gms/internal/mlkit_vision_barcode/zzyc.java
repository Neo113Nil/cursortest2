package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzyc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        zzxu zzxuVar = null;
        zzxx zzxxVar = null;
        zzxy zzxyVar = null;
        zzya zzyaVar = null;
        zzxz zzxzVar = null;
        zzxv zzxvVar = null;
        zzxr zzxrVar = null;
        zzxs zzxsVar = null;
        zzxt zzxtVar = null;
        int i = 0;
        int i2 = 0;
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
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 4:
                    bArr = cma1.t(parcel, readInt);
                    break;
                case 5:
                    pointArr = (Point[]) cma1.C(parcel, readInt, Point.CREATOR);
                    break;
                case 6:
                    i2 = cma1.r0(parcel, readInt);
                    break;
                case 7:
                    zzxuVar = (zzxu) cma1.y(parcel, readInt, zzxu.CREATOR);
                    break;
                case '\b':
                    zzxxVar = (zzxx) cma1.y(parcel, readInt, zzxx.CREATOR);
                    break;
                case '\t':
                    zzxyVar = (zzxy) cma1.y(parcel, readInt, zzxy.CREATOR);
                    break;
                case '\n':
                    zzyaVar = (zzya) cma1.y(parcel, readInt, zzya.CREATOR);
                    break;
                case 11:
                    zzxzVar = (zzxz) cma1.y(parcel, readInt, zzxz.CREATOR);
                    break;
                case '\f':
                    zzxvVar = (zzxv) cma1.y(parcel, readInt, zzxv.CREATOR);
                    break;
                case '\r':
                    zzxrVar = (zzxr) cma1.y(parcel, readInt, zzxr.CREATOR);
                    break;
                case 14:
                    zzxsVar = (zzxs) cma1.y(parcel, readInt, zzxs.CREATOR);
                    break;
                case 15:
                    zzxtVar = (zzxt) cma1.y(parcel, readInt, zzxt.CREATOR);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new zzyb(i, str, str2, bArr, pointArr, i2, zzxuVar, zzxxVar, zzxyVar, zzyaVar, zzxzVar, zzxvVar, zzxrVar, zzxsVar, zzxtVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzyb[i];
    }
}
