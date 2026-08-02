package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        ClientIdentity clientIdentity = null;
        int i = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = cma1.r0(parcel, readInt);
            } else if (c == 3) {
                str = cma1.z(parcel, readInt);
            } else if (c == 4) {
                str2 = cma1.z(parcel, readInt);
            } else if (c == 6) {
                str3 = cma1.z(parcel, readInt);
            } else if (c == 7) {
                clientIdentity = (ClientIdentity) cma1.y(parcel, readInt, ClientIdentity.CREATOR);
            } else if (c != '\b') {
                cma1.A0(parcel, readInt);
            } else {
                arrayList = cma1.D(parcel, readInt, Feature.CREATOR);
            }
        }
        cma1.E(parcel, P0);
        return new ClientIdentity(i, str, str2, str3, arrayList, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ClientIdentity[i];
    }
}
