package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzs implements Parcelable.Creator<Tile> {
    @Override // android.os.Parcelable.Creator
    public final Tile createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = cma1.r0(parcel, readInt);
            } else if (c == 3) {
                i2 = cma1.r0(parcel, readInt);
            } else if (c != 4) {
                cma1.A0(parcel, readInt);
            } else {
                bArr = cma1.t(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new Tile(i, i2, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Tile[] newArray(int i) {
        return new Tile[i];
    }
}
