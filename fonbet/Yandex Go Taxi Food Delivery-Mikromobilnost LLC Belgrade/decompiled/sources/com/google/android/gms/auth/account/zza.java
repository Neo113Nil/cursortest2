package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.vc91;

/* loaded from: classes11.dex */
public abstract class zza extends com.google.android.gms.internal.auth.zzb implements zzb {
    public zza() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int i3 = vc91.a;
            int readInt = parcel.readInt();
            vc91.b(parcel);
            zzc(readInt != 0);
        } else {
            Account account = (Account) vc91.a(parcel, Account.CREATOR);
            vc91.b(parcel);
            zzb(account);
        }
        return true;
    }

    @Override // com.google.android.gms.auth.account.zzb
    public abstract /* synthetic */ void zzb(Account account) throws RemoteException;

    @Override // com.google.android.gms.auth.account.zzb
    public abstract /* synthetic */ void zzc(boolean z) throws RemoteException;
}
