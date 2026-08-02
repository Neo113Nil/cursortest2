package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zaq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        int i = 0;
        Parcel parcel2 = null;
        zan zanVar = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = cma1.r0(parcel, readInt);
            } else if (c == 2) {
                int w0 = cma1.w0(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (w0 == 0) {
                    parcel2 = null;
                } else {
                    Parcel obtain = Parcel.obtain();
                    obtain.appendFrom(parcel, dataPosition, w0);
                    parcel.setDataPosition(dataPosition + w0);
                    parcel2 = obtain;
                }
            } else if (c != 3) {
                cma1.A0(parcel, readInt);
            } else {
                zanVar = (zan) cma1.y(parcel, readInt, zan.CREATOR);
            }
        }
        cma1.E(parcel, P0);
        return new SafeParcelResponse(i, parcel2, zanVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }
}
