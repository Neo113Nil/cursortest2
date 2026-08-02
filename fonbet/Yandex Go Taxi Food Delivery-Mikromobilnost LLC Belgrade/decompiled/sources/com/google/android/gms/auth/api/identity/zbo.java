package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zbo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        byte[] bArr = null;
        boolean z = false;
        String str = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = cma1.k0(parcel, readInt);
            } else if (c == 2) {
                bArr = cma1.t(parcel, readInt);
            } else if (c != 3) {
                cma1.A0(parcel, readInt);
            } else {
                str = cma1.z(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new BeginSignInRequest.PasskeysRequestOptions(z, bArr, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest.PasskeysRequestOptions[i];
    }
}
