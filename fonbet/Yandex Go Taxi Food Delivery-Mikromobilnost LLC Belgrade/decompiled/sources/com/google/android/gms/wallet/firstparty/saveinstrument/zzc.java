package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String[] strArr = null;
        int[] iArr = null;
        RemoteViews remoteViews = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                strArr = cma1.A(parcel, readInt);
            } else if (c == 2) {
                iArr = cma1.w(parcel, readInt);
            } else if (c == 3) {
                remoteViews = (RemoteViews) cma1.y(parcel, readInt, RemoteViews.CREATOR);
            } else if (c != 4) {
                cma1.A0(parcel, readInt);
            } else {
                bArr = cma1.t(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new GetSaveInstrumentDetailsResponse(strArr, iArr, remoteViews, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetSaveInstrumentDetailsResponse[i];
    }
}
