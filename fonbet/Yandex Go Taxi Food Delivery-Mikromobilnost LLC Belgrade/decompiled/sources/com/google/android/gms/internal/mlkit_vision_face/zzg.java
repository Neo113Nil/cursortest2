package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = Float.MAX_VALUE;
        float f9 = Float.MAX_VALUE;
        float f10 = Float.MAX_VALUE;
        zzn[] zznVarArr = null;
        zzd[] zzdVarArr = null;
        float f11 = -1.0f;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = cma1.r0(parcel, readInt);
                    break;
                case 2:
                    i2 = cma1.r0(parcel, readInt);
                    break;
                case 3:
                    f = cma1.o0(parcel, readInt);
                    break;
                case 4:
                    f2 = cma1.o0(parcel, readInt);
                    break;
                case 5:
                    f3 = cma1.o0(parcel, readInt);
                    break;
                case 6:
                    f4 = cma1.o0(parcel, readInt);
                    break;
                case 7:
                    f8 = cma1.o0(parcel, readInt);
                    break;
                case '\b':
                    f9 = cma1.o0(parcel, readInt);
                    break;
                case '\t':
                    zznVarArr = (zzn[]) cma1.C(parcel, readInt, zzn.CREATOR);
                    break;
                case '\n':
                    f5 = cma1.o0(parcel, readInt);
                    break;
                case 11:
                    f6 = cma1.o0(parcel, readInt);
                    break;
                case '\f':
                    f7 = cma1.o0(parcel, readInt);
                    break;
                case '\r':
                    zzdVarArr = (zzd[]) cma1.C(parcel, readInt, zzd.CREATOR);
                    break;
                case 14:
                    f10 = cma1.o0(parcel, readInt);
                    break;
                case 15:
                    f11 = cma1.o0(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new zzf(i, i2, f, f2, f3, f4, f8, f9, f10, zznVarArr, f5, f6, f7, zzdVarArr, f11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzf[i];
    }
}
