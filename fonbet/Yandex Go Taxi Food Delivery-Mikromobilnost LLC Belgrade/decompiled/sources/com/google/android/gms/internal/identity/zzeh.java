package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zzeh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        long j = Long.MAX_VALUE;
        LocationRequest locationRequest = null;
        ArrayList arrayList = null;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                locationRequest = (LocationRequest) cma1.y(parcel, readInt, LocationRequest.CREATOR);
            } else if (c == 5) {
                arrayList = cma1.D(parcel, readInt, ClientIdentity.CREATOR);
            } else if (c == '\b') {
                z = cma1.k0(parcel, readInt);
            } else if (c != '\t') {
                switch (c) {
                    case 11:
                        z3 = cma1.k0(parcel, readInt);
                        break;
                    case '\f':
                        z4 = cma1.k0(parcel, readInt);
                        break;
                    case '\r':
                        str = cma1.z(parcel, readInt);
                        break;
                    case 14:
                        j = cma1.u0(parcel, readInt);
                        break;
                    default:
                        cma1.A0(parcel, readInt);
                        break;
                }
            } else {
                z2 = cma1.k0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new zzeg(locationRequest, arrayList, z, z2, z3, z4, str, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzeg[i];
    }
}
