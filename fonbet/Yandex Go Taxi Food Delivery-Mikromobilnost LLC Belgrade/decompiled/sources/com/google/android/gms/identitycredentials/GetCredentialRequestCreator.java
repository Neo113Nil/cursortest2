package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import defpackage.bb1;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class GetCredentialRequestCreator implements Parcelable.Creator<GetCredentialRequest> {
    public static void writeToParcel(GetCredentialRequest getCredentialRequest, Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.k0(parcel, 1, getCredentialRequest.getCredentialOptions(), false);
        bb1.U(parcel, 2, getCredentialRequest.getData(), false);
        bb1.g0(parcel, 3, getCredentialRequest.getOrigin(), false);
        bb1.f0(parcel, 4, getCredentialRequest.getResultReceiver(), i, false);
        bb1.o0(parcel, n0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public GetCredentialRequest createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        ArrayList arrayList = null;
        Bundle bundle = null;
        String str = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = cma1.D(parcel, readInt, CredentialOption.CREATOR);
            } else if (c == 2) {
                bundle = cma1.s(parcel, readInt);
            } else if (c == 3) {
                str = cma1.z(parcel, readInt);
            } else if (c != 4) {
                cma1.A0(parcel, readInt);
            } else {
                resultReceiver = (ResultReceiver) cma1.y(parcel, readInt, ResultReceiver.CREATOR);
            }
        }
        cma1.E(parcel, P0);
        return new GetCredentialRequest(arrayList, bundle, str, resultReceiver);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public GetCredentialRequest[] newArray(int i) {
        return new GetCredentialRequest[i];
    }
}
