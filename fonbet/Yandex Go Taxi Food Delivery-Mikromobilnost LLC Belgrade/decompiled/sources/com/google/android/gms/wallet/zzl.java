package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        String str = null;
        String str2 = null;
        ProxyCard proxyCard = null;
        String str3 = null;
        zza zzaVar = null;
        zza zzaVar2 = null;
        String[] strArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
        PaymentMethodToken paymentMethodToken = null;
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
                    proxyCard = (ProxyCard) cma1.y(parcel, readInt, ProxyCard.CREATOR);
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
                    strArr = cma1.A(parcel, readInt);
                    break;
                case '\t':
                    userAddress = (UserAddress) cma1.y(parcel, readInt, UserAddress.CREATOR);
                    break;
                case '\n':
                    userAddress2 = (UserAddress) cma1.y(parcel, readInt, UserAddress.CREATOR);
                    break;
                case 11:
                    instrumentInfoArr = (InstrumentInfo[]) cma1.C(parcel, readInt, InstrumentInfo.CREATOR);
                    break;
                case '\f':
                    paymentMethodToken = (PaymentMethodToken) cma1.y(parcel, readInt, PaymentMethodToken.CREATOR);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new FullWallet(str, str2, proxyCard, str3, zzaVar, zzaVar2, strArr, userAddress, userAddress2, instrumentInfoArr, paymentMethodToken);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FullWallet[i];
    }
}
