package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bb1;
import defpackage.cma1;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class RegistrationRequestCreator implements Parcelable.Creator<RegistrationRequest> {
    public static void writeToParcel(RegistrationRequest registrationRequest, Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.V(parcel, 1, registrationRequest.getCredentials(), false);
        bb1.V(parcel, 2, registrationRequest.getMatcher(), false);
        bb1.g0(parcel, 3, registrationRequest.getType(), false);
        bb1.g0(parcel, 4, registrationRequest.getRequestType(), false);
        bb1.i0(parcel, 5, registrationRequest.getProtocolTypes());
        bb1.o0(parcel, n0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RegistrationRequest createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        List list = Collections.EMPTY_LIST;
        String str = "";
        String str2 = str;
        byte[] bArr = null;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bArr = cma1.t(parcel, readInt);
            } else if (c == 2) {
                bArr2 = cma1.t(parcel, readInt);
            } else if (c == 3) {
                str = cma1.z(parcel, readInt);
            } else if (c == 4) {
                str2 = cma1.z(parcel, readInt);
            } else if (c != 5) {
                cma1.A0(parcel, readInt);
            } else {
                list = cma1.B(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new RegistrationRequest(bArr, bArr2, str, str2, list);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RegistrationRequest[] newArray(int i) {
        return new RegistrationRequest[i];
    }
}
