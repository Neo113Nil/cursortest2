package com.google.android.gms.wallet.firstparty.setupwizard;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        boolean z = false;
        boolean z2 = false;
        Account account = null;
        byte[] bArr = null;
        BuyFlowConfig buyFlowConfig = null;
        String str = null;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    account = (Account) cma1.y(parcel, readInt, Account.CREATOR);
                    break;
                case 2:
                    bArr = cma1.t(parcel, readInt);
                    break;
                case 3:
                    buyFlowConfig = (BuyFlowConfig) cma1.y(parcel, readInt, BuyFlowConfig.CREATOR);
                    break;
                case 4:
                    str = cma1.z(parcel, readInt);
                    break;
                case 5:
                    bArr2 = cma1.t(parcel, readInt);
                    break;
                case 6:
                    z = cma1.k0(parcel, readInt);
                    break;
                case 7:
                    z2 = cma1.k0(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new SetupWizardInstrumentManagerParams(account, bArr, buyFlowConfig, str, bArr2, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SetupWizardInstrumentManagerParams[i];
    }
}
