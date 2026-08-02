package com.google.android.gms.auth.blockstore.restorecredential;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bb1;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class CreateRestoreCredentialRequestCreator implements Parcelable.Creator<CreateRestoreCredentialRequest> {
    public static void writeToParcel(CreateRestoreCredentialRequest createRestoreCredentialRequest, Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.U(parcel, 1, createRestoreCredentialRequest.getRequestBundle(), false);
        bb1.o0(parcel, n0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public CreateRestoreCredentialRequest createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                cma1.A0(parcel, readInt);
            } else {
                bundle = cma1.s(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new CreateRestoreCredentialRequest(bundle);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public CreateRestoreCredentialRequest[] newArray(int i) {
        return new CreateRestoreCredentialRequest[i];
    }
}
