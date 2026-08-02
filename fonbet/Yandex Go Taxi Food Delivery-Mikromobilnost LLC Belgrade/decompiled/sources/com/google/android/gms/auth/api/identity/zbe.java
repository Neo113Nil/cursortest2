package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zbe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        ArrayList arrayList = null;
        String str = null;
        Account account = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    arrayList = cma1.D(parcel, readInt, Scope.CREATOR);
                    break;
                case 2:
                    str = cma1.z(parcel, readInt);
                    break;
                case 3:
                    z = cma1.k0(parcel, readInt);
                    break;
                case 4:
                    z2 = cma1.k0(parcel, readInt);
                    break;
                case 5:
                    account = (Account) cma1.y(parcel, readInt, Account.CREATOR);
                    break;
                case 6:
                    str2 = cma1.z(parcel, readInt);
                    break;
                case 7:
                    str3 = cma1.z(parcel, readInt);
                    break;
                case '\b':
                    z3 = cma1.k0(parcel, readInt);
                    break;
                case '\t':
                    bundle = cma1.s(parcel, readInt);
                    break;
                default:
                    cma1.A0(parcel, readInt);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new AuthorizationRequest(arrayList, str, z, z2, account, str2, str3, z3, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthorizationRequest[i];
    }
}
