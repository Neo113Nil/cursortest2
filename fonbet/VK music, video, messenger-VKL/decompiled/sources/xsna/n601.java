package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.zzab;
import com.google.android.gms.fido.fido2.api.common.zzad;
import com.google.android.gms.fido.fido2.api.common.zzag;
import com.google.android.gms.fido.fido2.api.common.zzai;
import com.google.android.gms.fido.fido2.api.common.zzak;
import com.google.android.gms.fido.fido2.api.common.zzaw;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public final class n601 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        FidoAppIdExtension fidoAppIdExtension = null;
        com.google.android.gms.fido.fido2.api.common.zzs zzsVar = null;
        UserVerificationMethodExtension userVerificationMethodExtension = null;
        com.google.android.gms.fido.fido2.api.common.zzz zzzVar = null;
        zzab zzabVar = null;
        zzad zzadVar = null;
        com.google.android.gms.fido.fido2.api.common.zzu zzuVar = null;
        zzag zzagVar = null;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
        zzak zzakVar = null;
        zzaw zzawVar = null;
        zzai zzaiVar = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    fidoAppIdExtension = (FidoAppIdExtension) SafeParcelReader.h(parcel, readInt, FidoAppIdExtension.CREATOR);
                    break;
                case 3:
                    zzsVar = (com.google.android.gms.fido.fido2.api.common.zzs) SafeParcelReader.h(parcel, readInt, com.google.android.gms.fido.fido2.api.common.zzs.CREATOR);
                    break;
                case 4:
                    userVerificationMethodExtension = (UserVerificationMethodExtension) SafeParcelReader.h(parcel, readInt, UserVerificationMethodExtension.CREATOR);
                    break;
                case 5:
                    zzzVar = (com.google.android.gms.fido.fido2.api.common.zzz) SafeParcelReader.h(parcel, readInt, com.google.android.gms.fido.fido2.api.common.zzz.CREATOR);
                    break;
                case 6:
                    zzabVar = (zzab) SafeParcelReader.h(parcel, readInt, zzab.CREATOR);
                    break;
                case 7:
                    zzadVar = (zzad) SafeParcelReader.h(parcel, readInt, zzad.CREATOR);
                    break;
                case '\b':
                    zzuVar = (com.google.android.gms.fido.fido2.api.common.zzu) SafeParcelReader.h(parcel, readInt, com.google.android.gms.fido.fido2.api.common.zzu.CREATOR);
                    break;
                case '\t':
                    zzagVar = (zzag) SafeParcelReader.h(parcel, readInt, zzag.CREATOR);
                    break;
                case '\n':
                    googleThirdPartyPaymentExtension = (GoogleThirdPartyPaymentExtension) SafeParcelReader.h(parcel, readInt, GoogleThirdPartyPaymentExtension.CREATOR);
                    break;
                case 11:
                    zzakVar = (zzak) SafeParcelReader.h(parcel, readInt, zzak.CREATOR);
                    break;
                case '\f':
                    zzawVar = (zzaw) SafeParcelReader.h(parcel, readInt, zzaw.CREATOR);
                    break;
                case '\r':
                    zzaiVar = (zzai) SafeParcelReader.h(parcel, readInt, zzai.CREATOR);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new AuthenticationExtensions(fidoAppIdExtension, zzsVar, userVerificationMethodExtension, zzzVar, zzabVar, zzadVar, zzuVar, zzagVar, googleThirdPartyPaymentExtension, zzakVar, zzawVar, zzaiVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticationExtensions[i];
    }
}
