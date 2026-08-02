package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zzan implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        Double d = null;
        ArrayList arrayList2 = null;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
        Integer num = null;
        TokenBinding tokenBinding = null;
        String str = null;
        AuthenticationExtensions authenticationExtensions = null;
        String str2 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) cma1.y(parcel, readInt, PublicKeyCredentialRpEntity.CREATOR);
                    break;
                case 3:
                    publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) cma1.y(parcel, readInt, PublicKeyCredentialUserEntity.CREATOR);
                    break;
                case 4:
                    bArr = cma1.t(parcel, readInt);
                    break;
                case 5:
                    arrayList = cma1.D(parcel, readInt, PublicKeyCredentialParameters.CREATOR);
                    break;
                case 6:
                    d = cma1.n0(parcel, readInt);
                    break;
                case 7:
                    arrayList2 = cma1.D(parcel, readInt, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case '\b':
                    authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) cma1.y(parcel, readInt, AuthenticatorSelectionCriteria.CREATOR);
                    break;
                case '\t':
                    num = cma1.s0(parcel, readInt);
                    break;
                case '\n':
                    tokenBinding = (TokenBinding) cma1.y(parcel, readInt, TokenBinding.CREATOR);
                    break;
                case 11:
                    str = cma1.z(parcel, readInt);
                    break;
                case '\f':
                    authenticationExtensions = (AuthenticationExtensions) cma1.y(parcel, readInt, AuthenticationExtensions.CREATOR);
                    break;
                case '\r':
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 14:
                    resultReceiver = (ResultReceiver) cma1.y(parcel, readInt, ResultReceiver.CREATOR);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, arrayList, d, arrayList2, authenticatorSelectionCriteria, num, tokenBinding, str, authenticationExtensions, str2, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialCreationOptions[i];
    }
}
