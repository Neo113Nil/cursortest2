package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.vc91;

/* loaded from: classes11.dex */
public final class zzc extends com.google.android.gms.internal.auth.zza implements zze {
    public zzc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.auth.account.zze
    public final void zzd(zzb zzbVar, String str) throws RemoteException {
        Parcel zza = zza();
        vc91.d(zza, zzbVar);
        zza.writeString(str);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.auth.account.zze
    public final void zze(zzb zzbVar, Account account) throws RemoteException {
        Parcel zza = zza();
        vc91.d(zza, zzbVar);
        vc91.c(zza, account);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.auth.account.zze
    public final void zzf(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = vc91.a;
        zza.writeInt(z ? 1 : 0);
        zzc(1, zza);
    }
}
