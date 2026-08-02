package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        zzr[] zzrVarArr = null;
        zzf zzfVar = null;
        zzf zzfVar2 = null;
        zzf zzfVar3 = null;
        String str = null;
        String str2 = null;
        float f = 0.0f;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    zzrVarArr = (zzr[]) cma1.C(parcel, readInt, zzr.CREATOR);
                    break;
                case 3:
                    zzfVar = (zzf) cma1.y(parcel, readInt, zzf.CREATOR);
                    break;
                case 4:
                    zzfVar2 = (zzf) cma1.y(parcel, readInt, zzf.CREATOR);
                    break;
                case 5:
                    zzfVar3 = (zzf) cma1.y(parcel, readInt, zzf.CREATOR);
                    break;
                case 6:
                    str = cma1.z(parcel, readInt);
                    break;
                case 7:
                    f = cma1.o0(parcel, readInt);
                    break;
                case '\b':
                    str2 = cma1.z(parcel, readInt);
                    break;
                case '\t':
                    i = cma1.r0(parcel, readInt);
                    break;
                case '\n':
                    z = cma1.k0(parcel, readInt);
                    break;
                case 11:
                    i2 = cma1.r0(parcel, readInt);
                    break;
                case '\f':
                    i3 = cma1.r0(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new zzl(zzrVarArr, zzfVar, zzfVar2, zzfVar3, str, f, str2, i, z, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}
