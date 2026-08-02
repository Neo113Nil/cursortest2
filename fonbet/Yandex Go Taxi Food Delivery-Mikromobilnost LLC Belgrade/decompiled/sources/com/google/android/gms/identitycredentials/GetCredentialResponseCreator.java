package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bb1;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class GetCredentialResponseCreator implements Parcelable.Creator<GetCredentialResponse> {
    public static void writeToParcel(GetCredentialResponse getCredentialResponse, Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 1, getCredentialResponse.getCredential(), i, false);
        bb1.o0(parcel, n0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public GetCredentialResponse createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                cma1.A0(parcel, readInt);
            } else {
                credential = (Credential) cma1.y(parcel, readInt, Credential.CREATOR);
            }
        }
        cma1.E(parcel, P0);
        return new GetCredentialResponse(credential);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public GetCredentialResponse[] newArray(int i) {
        return new GetCredentialResponse[i];
    }
}
