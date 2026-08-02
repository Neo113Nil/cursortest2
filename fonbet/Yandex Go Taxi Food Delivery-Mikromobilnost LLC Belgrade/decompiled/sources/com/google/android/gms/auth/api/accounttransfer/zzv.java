package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import defpackage.cma1;
import defpackage.oyr;
import java.util.HashSet;

/* loaded from: classes11.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        zzw zzwVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = cma1.r0(parcel, readInt);
                hashSet.add(1);
            } else if (c == 2) {
                zzwVar = (zzw) cma1.y(parcel, readInt, zzw.CREATOR);
                hashSet.add(2);
            } else if (c == 3) {
                str = cma1.z(parcel, readInt);
                hashSet.add(3);
            } else if (c == 4) {
                str2 = cma1.z(parcel, readInt);
                hashSet.add(4);
            } else if (c != 5) {
                cma1.A0(parcel, readInt);
            } else {
                str3 = cma1.z(parcel, readInt);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == P0) {
            return new zzu(hashSet, i, zzwVar, str, str2, str3);
        }
        throw new SafeParcelReader$ParseException(oyr.i(P0, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzu[i];
    }
}
