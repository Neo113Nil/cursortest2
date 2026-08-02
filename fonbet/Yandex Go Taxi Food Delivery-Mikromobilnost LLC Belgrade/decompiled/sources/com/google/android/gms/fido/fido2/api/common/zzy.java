package com.google.android.gms.fido.fido2.api.common;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        byte[] bArr2 = null;
        Account account = null;
        long j = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = cma1.z(parcel, readInt);
                    break;
                case 2:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 3:
                    bArr = cma1.t(parcel, readInt);
                    break;
                case 4:
                    bArr2 = cma1.t(parcel, readInt);
                    break;
                case 5:
                    z = cma1.k0(parcel, readInt);
                    break;
                case 6:
                    z2 = cma1.k0(parcel, readInt);
                    break;
                case 7:
                    j = cma1.u0(parcel, readInt);
                    break;
                case '\b':
                    account = (Account) cma1.y(parcel, readInt, Account.CREATOR);
                    break;
                case '\t':
                    z3 = cma1.k0(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new FidoCredentialDetails(str, str2, bArr, bArr2, z, z2, j, account, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FidoCredentialDetails[i];
    }
}
