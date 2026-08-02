package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import defpackage.cma1;
import defpackage.oyr;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes11.dex */
public final class zzp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        zzs zzsVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = cma1.r0(parcel, readInt);
                hashSet.add(1);
            } else if (c == 2) {
                arrayList = cma1.D(parcel, readInt, zzu.CREATOR);
                hashSet.add(2);
            } else if (c == 3) {
                i2 = cma1.r0(parcel, readInt);
                hashSet.add(3);
            } else if (c != 4) {
                cma1.A0(parcel, readInt);
            } else {
                zzsVar = (zzs) cma1.y(parcel, readInt, zzs.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == P0) {
            return new zzo(hashSet, i, arrayList, i2, zzsVar);
        }
        throw new SafeParcelReader$ParseException(oyr.i(P0, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
