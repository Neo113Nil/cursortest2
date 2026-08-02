package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                bArr = cma1.t(parcel, readInt);
            } else if (c == 3) {
                bArr2 = cma1.t(parcel, readInt);
            } else if (c == 4) {
                bArr3 = cma1.t(parcel, readInt);
            } else if (c == 5) {
                bArr4 = cma1.t(parcel, readInt);
            } else if (c != 6) {
                cma1.A0(parcel, readInt);
            } else {
                bArr5 = cma1.t(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new AuthenticatorAssertionResponse(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticatorAssertionResponse[i];
    }
}
