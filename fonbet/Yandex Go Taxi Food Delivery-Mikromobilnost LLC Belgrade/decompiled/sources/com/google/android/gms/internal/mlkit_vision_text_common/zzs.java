package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        boolean z = false;
        zzn[] zznVarArr = null;
        zzf zzfVar = null;
        zzf zzfVar2 = null;
        String str = null;
        String str2 = null;
        float f = 0.0f;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    zznVarArr = (zzn[]) cma1.C(parcel, readInt, zzn.CREATOR);
                    break;
                case 3:
                    zzfVar = (zzf) cma1.y(parcel, readInt, zzf.CREATOR);
                    break;
                case 4:
                    zzfVar2 = (zzf) cma1.y(parcel, readInt, zzf.CREATOR);
                    break;
                case 5:
                    str = cma1.z(parcel, readInt);
                    break;
                case 6:
                    f = cma1.o0(parcel, readInt);
                    break;
                case 7:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case '\b':
                    z = cma1.k0(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new zzr(zznVarArr, zzfVar, zzfVar2, str, f, str2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}
