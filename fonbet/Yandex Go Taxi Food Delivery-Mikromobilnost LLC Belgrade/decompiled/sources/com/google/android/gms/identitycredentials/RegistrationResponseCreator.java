package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bb1;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class RegistrationResponseCreator implements Parcelable.Creator<RegistrationResponse> {
    public static void writeToParcel(RegistrationResponse registrationResponse, Parcel parcel, int i) {
        bb1.o0(parcel, bb1.n0(parcel, 20293));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RegistrationResponse createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        while (parcel.dataPosition() < P0) {
            cma1.A0(parcel, parcel.readInt());
        }
        cma1.E(parcel, P0);
        return new RegistrationResponse();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RegistrationResponse[] newArray(int i) {
        return new RegistrationResponse[i];
    }
}
