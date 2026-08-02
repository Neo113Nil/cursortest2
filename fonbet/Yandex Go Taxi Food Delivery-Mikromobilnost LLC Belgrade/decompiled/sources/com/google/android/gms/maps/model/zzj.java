package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzj implements Parcelable.Creator<PatternItem> {
    @Override // android.os.Parcelable.Creator
    public final PatternItem createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = 0;
        Float f = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = cma1.r0(parcel, readInt);
            } else if (c != 3) {
                cma1.A0(parcel, readInt);
            } else {
                f = cma1.p0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new PatternItem(i, f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PatternItem[] newArray(int i) {
        return new PatternItem[i];
    }
}
