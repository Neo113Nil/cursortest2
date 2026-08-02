package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zze implements Parcelable.Creator<UserAddressRequest> {
    @Override // android.os.Parcelable.Creator
    public final UserAddressRequest createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                cma1.A0(parcel, readInt);
            } else {
                arrayList = cma1.D(parcel, readInt, CountrySpecification.CREATOR);
            }
        }
        cma1.E(parcel, P0);
        return new UserAddressRequest(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UserAddressRequest[] newArray(int i) {
        return new UserAddressRequest[i];
    }
}
