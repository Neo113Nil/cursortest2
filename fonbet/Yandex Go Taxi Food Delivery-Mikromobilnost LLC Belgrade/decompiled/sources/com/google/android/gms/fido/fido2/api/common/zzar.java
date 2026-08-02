package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zzar implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        byte[] bArr = null;
        Double d = null;
        String str = null;
        ArrayList arrayList = null;
        Integer num = null;
        TokenBinding tokenBinding = null;
        String str2 = null;
        AuthenticationExtensions authenticationExtensions = null;
        Long l = null;
        String str3 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    bArr = cma1.t(parcel, readInt);
                    break;
                case 3:
                    d = cma1.n0(parcel, readInt);
                    break;
                case 4:
                    str = cma1.z(parcel, readInt);
                    break;
                case 5:
                    arrayList = cma1.D(parcel, readInt, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 6:
                    num = cma1.s0(parcel, readInt);
                    break;
                case 7:
                    tokenBinding = (TokenBinding) cma1.y(parcel, readInt, TokenBinding.CREATOR);
                    break;
                case '\b':
                    str2 = cma1.z(parcel, readInt);
                    break;
                case '\t':
                    authenticationExtensions = (AuthenticationExtensions) cma1.y(parcel, readInt, AuthenticationExtensions.CREATOR);
                    break;
                case '\n':
                    l = cma1.v0(parcel, readInt);
                    break;
                case 11:
                    str3 = cma1.z(parcel, readInt);
                    break;
                case '\f':
                    resultReceiver = (ResultReceiver) cma1.y(parcel, readInt, ResultReceiver.CREATOR);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new PublicKeyCredentialRequestOptions(bArr, d, str, arrayList, num, tokenBinding, str2, authenticationExtensions, l, str3, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialRequestOptions[i];
    }
}
