package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.identity.ClientIdentity;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzaa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        ClientIdentity clientIdentity = null;
        int i = 0;
        boolean z = false;
        long j = Long.MAX_VALUE;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                j = cma1.u0(parcel, readInt);
            } else if (c == 2) {
                i = cma1.r0(parcel, readInt);
            } else if (c == 3) {
                z = cma1.k0(parcel, readInt);
            } else if (c != 5) {
                cma1.A0(parcel, readInt);
            } else {
                clientIdentity = (ClientIdentity) cma1.y(parcel, readInt, ClientIdentity.CREATOR);
            }
        }
        cma1.E(parcel, P0);
        return new LastLocationRequest(j, i, z, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LastLocationRequest[i];
    }
}
