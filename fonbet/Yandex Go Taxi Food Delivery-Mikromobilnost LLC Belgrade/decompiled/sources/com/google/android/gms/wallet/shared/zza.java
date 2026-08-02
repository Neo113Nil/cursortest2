package com.google.android.gms.wallet.shared;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        Account account = null;
        Bundle bundle = null;
        WalletCustomTheme walletCustomTheme = null;
        int i4 = 1;
        int i5 = 1;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i4 = cma1.r0(parcel, readInt);
                    break;
                case 3:
                    account = (Account) cma1.y(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = cma1.s(parcel, readInt);
                    break;
                case 5:
                    z = cma1.k0(parcel, readInt);
                    break;
                case 6:
                    i5 = cma1.r0(parcel, readInt);
                    break;
                case 7:
                    walletCustomTheme = (WalletCustomTheme) cma1.y(parcel, readInt, WalletCustomTheme.CREATOR);
                    break;
                case '\b':
                    i = cma1.r0(parcel, readInt);
                    break;
                case '\t':
                    d = cma1.m0(parcel, readInt);
                    break;
                case '\n':
                    d2 = cma1.m0(parcel, readInt);
                    break;
                case 11:
                    i2 = cma1.r0(parcel, readInt);
                    break;
                case '\f':
                    i3 = cma1.r0(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new ApplicationParameters(i4, account, bundle, z, i5, walletCustomTheme, i, d, d2, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ApplicationParameters[i];
    }
}
