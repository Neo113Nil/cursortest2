package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zza implements Parcelable.Creator<CountrySpecification> {
    @Override // android.os.Parcelable.Creator
    public final CountrySpecification createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                cma1.A0(parcel, readInt);
            } else {
                str = cma1.z(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new CountrySpecification(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CountrySpecification[] newArray(int i) {
        return new CountrySpecification[i];
    }
}
