package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.InstrumentInfo;
import com.google.android.gms.wallet.PaymentMethodToken;
import com.google.android.gms.wallet.zzac;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class hf01 implements Parcelable.Creator<FullWallet> {
    @Override // android.os.Parcelable.Creator
    public final FullWallet createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        String str2 = null;
        zzac zzacVar = null;
        String str3 = null;
        com.google.android.gms.wallet.zzb zzbVar = null;
        com.google.android.gms.wallet.zzb zzbVar2 = null;
        String[] strArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
        PaymentMethodToken paymentMethodToken = null;
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
                    zzacVar = (zzac) SafeParcelReader.h(parcel, readInt, zzac.CREATOR);
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
                    strArr = SafeParcelReader.j(parcel, readInt);
                    break;
                case '\t':
                    userAddress = (UserAddress) SafeParcelReader.h(parcel, readInt, UserAddress.CREATOR);
                    break;
                case '\n':
                    userAddress2 = (UserAddress) SafeParcelReader.h(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 11:
                    instrumentInfoArr = (InstrumentInfo[]) SafeParcelReader.l(parcel, readInt, InstrumentInfo.CREATOR);
                    break;
                case '\f':
                    paymentMethodToken = (PaymentMethodToken) SafeParcelReader.h(parcel, readInt, PaymentMethodToken.CREATOR);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        FullWallet fullWallet = new FullWallet();
        fullWallet.b = str;
        fullWallet.c = str2;
        fullWallet.d = zzacVar;
        fullWallet.e = str3;
        fullWallet.f = zzbVar;
        fullWallet.g = zzbVar2;
        fullWallet.h = strArr;
        fullWallet.i = userAddress;
        fullWallet.j = userAddress2;
        fullWallet.k = instrumentInfoArr;
        fullWallet.l = paymentMethodToken;
        return fullWallet;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FullWallet[] newArray(int i) {
        return new FullWallet[i];
    }
}
