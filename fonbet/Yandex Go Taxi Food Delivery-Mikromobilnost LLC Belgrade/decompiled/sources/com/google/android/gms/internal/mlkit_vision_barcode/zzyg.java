package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzyg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        zzxq zzxqVar = null;
        zzxq zzxqVar2 = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = cma1.z(parcel, readInt);
                    break;
                case 2:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 3:
                    str3 = cma1.z(parcel, readInt);
                    break;
                case 4:
                    str4 = cma1.z(parcel, readInt);
                    break;
                case 5:
                    str5 = cma1.z(parcel, readInt);
                    break;
                case 6:
                    zzxqVar = (zzxq) cma1.y(parcel, readInt, zzxq.CREATOR);
                    break;
                case 7:
                    zzxqVar2 = (zzxq) cma1.y(parcel, readInt, zzxq.CREATOR);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new zzxr(str, str2, str3, str4, str5, zzxqVar, zzxqVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzxr[i];
    }
}
