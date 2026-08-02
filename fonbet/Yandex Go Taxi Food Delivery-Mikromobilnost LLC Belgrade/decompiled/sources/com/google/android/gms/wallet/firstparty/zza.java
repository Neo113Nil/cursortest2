package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        WalletCustomTheme walletCustomTheme = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                bArr = cma1.t(parcel, readInt);
            } else if (c == 3) {
                bArr2 = cma1.t(parcel, readInt);
            } else if (c != 4) {
                cma1.A0(parcel, readInt);
            } else {
                walletCustomTheme = (WalletCustomTheme) cma1.y(parcel, readInt, WalletCustomTheme.CREATOR);
            }
        }
        cma1.E(parcel, P0);
        return new ExecuteBuyFlowRequest(bArr, bArr2, walletCustomTheme);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ExecuteBuyFlowRequest[i];
    }
}
