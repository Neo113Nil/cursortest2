package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        FidoAppIdExtension fidoAppIdExtension = null;
        zzs zzsVar = null;
        UserVerificationMethodExtension userVerificationMethodExtension = null;
        zzz zzzVar = null;
        zzab zzabVar = null;
        zzad zzadVar = null;
        zzu zzuVar = null;
        zzag zzagVar = null;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
        zzak zzakVar = null;
        zzaw zzawVar = null;
        zzai zzaiVar = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    fidoAppIdExtension = (FidoAppIdExtension) cma1.y(parcel, readInt, FidoAppIdExtension.CREATOR);
                    break;
                case 3:
                    zzsVar = (zzs) cma1.y(parcel, readInt, zzs.CREATOR);
                    break;
                case 4:
                    userVerificationMethodExtension = (UserVerificationMethodExtension) cma1.y(parcel, readInt, UserVerificationMethodExtension.CREATOR);
                    break;
                case 5:
                    zzzVar = (zzz) cma1.y(parcel, readInt, zzz.CREATOR);
                    break;
                case 6:
                    zzabVar = (zzab) cma1.y(parcel, readInt, zzab.CREATOR);
                    break;
                case 7:
                    zzadVar = (zzad) cma1.y(parcel, readInt, zzad.CREATOR);
                    break;
                case '\b':
                    zzuVar = (zzu) cma1.y(parcel, readInt, zzu.CREATOR);
                    break;
                case '\t':
                    zzagVar = (zzag) cma1.y(parcel, readInt, zzag.CREATOR);
                    break;
                case '\n':
                    googleThirdPartyPaymentExtension = (GoogleThirdPartyPaymentExtension) cma1.y(parcel, readInt, GoogleThirdPartyPaymentExtension.CREATOR);
                    break;
                case 11:
                    zzakVar = (zzak) cma1.y(parcel, readInt, zzak.CREATOR);
                    break;
                case '\f':
                    zzawVar = (zzaw) cma1.y(parcel, readInt, zzaw.CREATOR);
                    break;
                case '\r':
                    zzaiVar = (zzai) cma1.y(parcel, readInt, zzai.CREATOR);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new AuthenticationExtensions(fidoAppIdExtension, zzsVar, userVerificationMethodExtension, zzzVar, zzabVar, zzadVar, zzuVar, zzagVar, googleThirdPartyPaymentExtension, zzakVar, zzawVar, zzaiVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticationExtensions[i];
    }
}
