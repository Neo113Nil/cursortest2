package com.google.android.gms.auth.blockstore.restorecredential;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bb1;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class GetRestoreCredentialRequestCreator implements Parcelable.Creator<GetRestoreCredentialRequest> {
    public static void writeToParcel(GetRestoreCredentialRequest getRestoreCredentialRequest, Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.U(parcel, 1, getRestoreCredentialRequest.getRequestBundle(), false);
        bb1.o0(parcel, n0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public GetRestoreCredentialRequest createFromParcel(Parcel parcel) {
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
        return new GetRestoreCredentialRequest(bundle);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public GetRestoreCredentialRequest[] newArray(int i) {
        return new GetRestoreCredentialRequest[i];
    }
}
