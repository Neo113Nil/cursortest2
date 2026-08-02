package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.InstrumentInfo;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.OfferWalletObject;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class rn01 implements Parcelable.Creator<MaskedWallet> {
    @Override // android.os.Parcelable.Creator
    public final MaskedWallet createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        String str3 = null;
        com.google.android.gms.wallet.zzb zzbVar = null;
        com.google.android.gms.wallet.zzb zzbVar2 = null;
        LoyaltyWalletObject[] loyaltyWalletObjectArr = null;
        OfferWalletObject[] offerWalletObjectArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    strArr = SafeParcelReader.j(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    zzbVar = (com.google.android.gms.wallet.zzb) SafeParcelReader.h(parcel, readInt, com.google.android.gms.wallet.zzb.CREATOR);
                    break;
                case 7:
                    zzbVar2 = (com.google.android.gms.wallet.zzb) SafeParcelReader.h(parcel, readInt, com.google.android.gms.wallet.zzb.CREATOR);
                    break;
                case '\b':
                    loyaltyWalletObjectArr = (LoyaltyWalletObject[]) SafeParcelReader.l(parcel, readInt, LoyaltyWalletObject.CREATOR);
                    break;
                case '\t':
                    offerWalletObjectArr = (OfferWalletObject[]) SafeParcelReader.l(parcel, readInt, OfferWalletObject.CREATOR);
                    break;
                case '\n':
                    userAddress = (UserAddress) SafeParcelReader.h(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 11:
                    userAddress2 = (UserAddress) SafeParcelReader.h(parcel, readInt, UserAddress.CREATOR);
                    break;
                case '\f':
                    instrumentInfoArr = (InstrumentInfo[]) SafeParcelReader.l(parcel, readInt, InstrumentInfo.CREATOR);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        MaskedWallet maskedWallet = new MaskedWallet();
        maskedWallet.b = str;
        maskedWallet.c = str2;
        maskedWallet.d = strArr;
        maskedWallet.e = str3;
        maskedWallet.f = zzbVar;
        maskedWallet.g = zzbVar2;
        maskedWallet.h = loyaltyWalletObjectArr;
        maskedWallet.i = offerWalletObjectArr;
        maskedWallet.j = userAddress;
        maskedWallet.k = userAddress2;
        maskedWallet.l = instrumentInfoArr;
        return maskedWallet;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MaskedWallet[] newArray(int i) {
        return new MaskedWallet[i];
    }
}
