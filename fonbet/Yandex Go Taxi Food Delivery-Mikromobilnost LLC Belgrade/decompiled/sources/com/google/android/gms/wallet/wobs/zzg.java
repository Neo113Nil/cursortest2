package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = cma1.z(parcel, readInt);
            } else if (c != 3) {
                cma1.A0(parcel, readInt);
            } else {
                str2 = cma1.z(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new TextModuleData(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TextModuleData[i];
    }
}
