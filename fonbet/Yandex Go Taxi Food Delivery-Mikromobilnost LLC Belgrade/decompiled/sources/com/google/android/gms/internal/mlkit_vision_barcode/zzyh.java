package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzyh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        zzxw zzxwVar = null;
        String str = null;
        String str2 = null;
        zzxx[] zzxxVarArr = null;
        zzxu[] zzxuVarArr = null;
        String[] strArr = null;
        zzxp[] zzxpVarArr = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    zzxwVar = (zzxw) cma1.y(parcel, readInt, zzxw.CREATOR);
                    break;
                case 2:
                    str = cma1.z(parcel, readInt);
                    break;
                case 3:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 4:
                    zzxxVarArr = (zzxx[]) cma1.C(parcel, readInt, zzxx.CREATOR);
                    break;
                case 5:
                    zzxuVarArr = (zzxu[]) cma1.C(parcel, readInt, zzxu.CREATOR);
                    break;
                case 6:
                    strArr = cma1.A(parcel, readInt);
                    break;
                case 7:
                    zzxpVarArr = (zzxp[]) cma1.C(parcel, readInt, zzxp.CREATOR);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new zzxs(zzxwVar, str, str2, zzxxVarArr, zzxuVarArr, strArr, zzxpVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzxs[i];
    }
}
