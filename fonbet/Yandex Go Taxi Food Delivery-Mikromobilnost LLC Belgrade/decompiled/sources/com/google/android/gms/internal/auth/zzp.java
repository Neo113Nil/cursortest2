package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.vc91;

/* loaded from: classes11.dex */
public final class zzp extends zza implements IInterface {
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void zzd(IStatusCallback iStatusCallback, zzbw zzbwVar) throws RemoteException {
        Parcel zza = zza();
        vc91.d(zza, iStatusCallback);
        vc91.c(zza, zzbwVar);
        zzc(2, zza);
    }

    public final void zze(zzm zzmVar, AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException {
        Parcel zza = zza();
        vc91.d(zza, zzmVar);
        vc91.c(zza, accountChangeEventsRequest);
        zzc(4, zza);
    }

    public final void zzf(zzo zzoVar, Account account, String str, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        vc91.d(zza, zzoVar);
        vc91.c(zza, account);
        zza.writeString(str);
        vc91.c(zza, bundle);
        zzc(1, zza);
    }

    public final void zzg(zzk zzkVar, Account account) throws RemoteException {
        Parcel zza = zza();
        vc91.d(zza, zzkVar);
        vc91.c(zza, account);
        zzc(6, zza);
    }

    public final void zzh(zzk zzkVar, String str) throws RemoteException {
        Parcel zza = zza();
        vc91.d(zza, zzkVar);
        zza.writeString(str);
        zzc(3, zza);
    }
}
