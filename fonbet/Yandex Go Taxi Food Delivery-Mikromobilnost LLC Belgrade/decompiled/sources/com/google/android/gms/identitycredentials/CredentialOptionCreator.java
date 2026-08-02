package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bb1;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class CredentialOptionCreator implements Parcelable.Creator<CredentialOption> {
    public static void writeToParcel(CredentialOption credentialOption, Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 1, credentialOption.getType(), false);
        bb1.U(parcel, 2, credentialOption.getCredentialRetrievalData(), false);
        bb1.U(parcel, 3, credentialOption.getCandidateQueryData(), false);
        bb1.g0(parcel, 4, credentialOption.getRequestMatcher(), false);
        bb1.g0(parcel, 5, credentialOption.getRequestType(), false);
        bb1.g0(parcel, 6, credentialOption.getProtocolType(), false);
        bb1.o0(parcel, n0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public CredentialOption createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        Bundle bundle = null;
        Bundle bundle2 = null;
        String str4 = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = cma1.z(parcel, readInt);
                    break;
                case 2:
                    bundle = cma1.s(parcel, readInt);
                    break;
                case 3:
                    bundle2 = cma1.s(parcel, readInt);
                    break;
                case 4:
                    str4 = cma1.z(parcel, readInt);
                    break;
                case 5:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 6:
                    str3 = cma1.z(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new CredentialOption(str, bundle, bundle2, str4, str2, str3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public CredentialOption[] newArray(int i) {
        return new CredentialOption[i];
    }
}
