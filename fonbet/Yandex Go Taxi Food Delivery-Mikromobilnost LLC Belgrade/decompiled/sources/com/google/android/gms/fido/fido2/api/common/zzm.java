package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = cma1.z(parcel, readInt);
            } else if (c == 3) {
                int w0 = cma1.w0(parcel, readInt);
                if (w0 == 0) {
                    bool = null;
                } else {
                    cma1.T0(w0, parcel, 4);
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
            } else if (c == 4) {
                str2 = cma1.z(parcel, readInt);
            } else if (c != 5) {
                cma1.A0(parcel, readInt);
            } else {
                str3 = cma1.z(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new AuthenticatorSelectionCriteria(str, bool, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticatorSelectionCriteria[i];
    }
}
