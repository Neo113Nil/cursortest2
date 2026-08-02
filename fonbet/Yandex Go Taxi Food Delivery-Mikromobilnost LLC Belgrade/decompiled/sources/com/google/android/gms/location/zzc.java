package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        WorkSource workSource = null;
        String str = null;
        int[] iArr = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        long j2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = cma1.u0(parcel, readInt);
                    break;
                case 2:
                    z = cma1.k0(parcel, readInt);
                    break;
                case 3:
                    workSource = (WorkSource) cma1.y(parcel, readInt, WorkSource.CREATOR);
                    break;
                case 4:
                    str = cma1.z(parcel, readInt);
                    break;
                case 5:
                    iArr = cma1.w(parcel, readInt);
                    break;
                case 6:
                    z2 = cma1.k0(parcel, readInt);
                    break;
                case 7:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case '\b':
                    j2 = cma1.u0(parcel, readInt);
                    break;
                case '\t':
                    str3 = cma1.z(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new zzb(j, z, workSource, str, iArr, z2, str2, j2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzb[i];
    }
}
