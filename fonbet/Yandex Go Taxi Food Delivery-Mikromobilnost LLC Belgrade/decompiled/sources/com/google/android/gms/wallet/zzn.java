package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        CommonWalletObject commonWalletObject = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    commonWalletObject = (CommonWalletObject) cma1.y(parcel, readInt, CommonWalletObject.CREATOR);
                    break;
                case 3:
                    str = cma1.z(parcel, readInt);
                    break;
                case 4:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 5:
                    str3 = cma1.z(parcel, readInt);
                    break;
                case 6:
                    j = cma1.u0(parcel, readInt);
                    break;
                case 7:
                    str4 = cma1.z(parcel, readInt);
                    break;
                case '\b':
                    j2 = cma1.u0(parcel, readInt);
                    break;
                case '\t':
                    str5 = cma1.z(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new GiftCardWalletObject(commonWalletObject, str, str2, str3, j, str4, j2, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GiftCardWalletObject[i];
    }
}
