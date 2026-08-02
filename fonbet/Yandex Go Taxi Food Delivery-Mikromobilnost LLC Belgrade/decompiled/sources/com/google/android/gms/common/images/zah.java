package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zah implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = 0;
        int i2 = 0;
        Uri uri = null;
        int i3 = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = cma1.r0(parcel, readInt);
            } else if (c == 2) {
                uri = (Uri) cma1.y(parcel, readInt, Uri.CREATOR);
            } else if (c == 3) {
                i3 = cma1.r0(parcel, readInt);
            } else if (c != 4) {
                cma1.A0(parcel, readInt);
            } else {
                i2 = cma1.r0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new WebImage(i, uri, i3, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WebImage[i];
    }
}
