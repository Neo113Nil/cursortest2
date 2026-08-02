package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes11.dex */
public abstract class zzd extends com.google.android.gms.internal.auth.zzb implements zze {
    public static zze zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return queryLocalInterface instanceof zze ? (zze) queryLocalInterface : new zzc(iBinder);
    }

    @Override // com.google.android.gms.auth.account.zze
    public abstract /* synthetic */ void zzd(zzb zzbVar, String str) throws RemoteException;

    @Override // com.google.android.gms.auth.account.zze
    public abstract /* synthetic */ void zze(zzb zzbVar, Account account) throws RemoteException;

    @Override // com.google.android.gms.auth.account.zze
    public abstract /* synthetic */ void zzf(boolean z) throws RemoteException;
}
