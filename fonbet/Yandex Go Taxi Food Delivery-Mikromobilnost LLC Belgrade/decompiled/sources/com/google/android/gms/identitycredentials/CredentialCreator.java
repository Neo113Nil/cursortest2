package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bb1;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class CredentialCreator implements Parcelable.Creator<Credential> {
    public static void writeToParcel(Credential credential, Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, credential.getType(), false);
        bb1.U(parcel, 2, credential.getData(), false);
        bb1.o0(parcel, n0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public Credential createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = cma1.z(parcel, readInt);
            } else if (c != 2) {
                cma1.A0(parcel, readInt);
            } else {
                bundle = cma1.s(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new Credential(str, bundle);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public Credential[] newArray(int i) {
        return new Credential[i];
    }
}
