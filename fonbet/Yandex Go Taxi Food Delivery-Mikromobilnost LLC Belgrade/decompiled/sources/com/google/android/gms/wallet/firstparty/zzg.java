package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                cma1.A0(parcel, readInt);
            } else {
                bArr = cma1.t(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new GetClientTokenResponse(bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetClientTokenResponse[i];
    }
}
