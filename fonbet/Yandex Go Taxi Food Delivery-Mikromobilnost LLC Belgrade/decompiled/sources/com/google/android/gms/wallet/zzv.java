package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        String str2 = null;
        String[] strArr = null;
        String str3 = null;
        zza zzaVar = null;
        zza zzaVar2 = null;
        LoyaltyWalletObject[] loyaltyWalletObjectArr = null;
        OfferWalletObject[] offerWalletObjectArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = cma1.z(parcel, readInt);
                    break;
                case 3:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 4:
                    strArr = cma1.A(parcel, readInt);
                    break;
                case 5:
                    str3 = cma1.z(parcel, readInt);
                    break;
                case 6:
                    zzaVar = (zza) cma1.y(parcel, readInt, zza.CREATOR);
                    break;
                case 7:
                    zzaVar2 = (zza) cma1.y(parcel, readInt, zza.CREATOR);
                    break;
                case '\b':
                    loyaltyWalletObjectArr = (LoyaltyWalletObject[]) cma1.C(parcel, readInt, LoyaltyWalletObject.CREATOR);
                    break;
                case '\t':
                    offerWalletObjectArr = (OfferWalletObject[]) cma1.C(parcel, readInt, OfferWalletObject.CREATOR);
                    break;
                case '\n':
                    userAddress = (UserAddress) cma1.y(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 11:
                    userAddress2 = (UserAddress) cma1.y(parcel, readInt, UserAddress.CREATOR);
                    break;
                case '\f':
                    instrumentInfoArr = (InstrumentInfo[]) cma1.C(parcel, readInt, InstrumentInfo.CREATOR);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new MaskedWallet(str, str2, strArr, str3, zzaVar, zzaVar2, loyaltyWalletObjectArr, offerWalletObjectArr, userAddress, userAddress2, instrumentInfoArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MaskedWallet[i];
    }
}
