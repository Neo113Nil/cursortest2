package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zae implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = cma1.r0(parcel, readInt);
                    break;
                case 2:
                    arrayList = cma1.D(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) cma1.y(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z = cma1.k0(parcel, readInt);
                    break;
                case 5:
                    z2 = cma1.k0(parcel, readInt);
                    break;
                case 6:
                    z3 = cma1.k0(parcel, readInt);
                    break;
                case 7:
                    str = cma1.z(parcel, readInt);
                    break;
                case '\b':
                    str2 = cma1.z(parcel, readInt);
                    break;
                case '\t':
                    arrayList2 = cma1.D(parcel, readInt, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case '\n':
                    str3 = cma1.z(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
