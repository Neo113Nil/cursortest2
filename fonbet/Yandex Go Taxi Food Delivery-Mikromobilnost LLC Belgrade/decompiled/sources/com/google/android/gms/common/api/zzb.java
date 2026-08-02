package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzb implements Parcelable.Creator {
    public static final ApiMetadata zza(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        boolean z = false;
        ComplianceOptions complianceOptions = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                complianceOptions = (ComplianceOptions) cma1.y(parcel, readInt, ComplianceOptions.CREATOR);
            } else if (c != 2) {
                cma1.A0(parcel, readInt);
            } else {
                z = cma1.k0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new ApiMetadata(complianceOptions, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zza(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ApiMetadata[i];
    }
}
