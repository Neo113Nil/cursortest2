package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzai implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                status = (Status) cma1.y(parcel, readInt, Status.CREATOR);
            } else if (c != 2) {
                cma1.A0(parcel, readInt);
            } else {
                locationSettingsStates = (LocationSettingsStates) cma1.y(parcel, readInt, LocationSettingsStates.CREATOR);
            }
        }
        cma1.E(parcel, P0);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsResult[i];
    }
}
