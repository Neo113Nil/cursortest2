package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import defpackage.vc91;

/* loaded from: classes11.dex */
public final class zzd extends zza implements zzf {
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzd(String str, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        vc91.c(zza, bundle);
        Parcel zzb = zzb(2, zza);
        Bundle bundle2 = (Bundle) vc91.a(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zze(Account account, String str, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        vc91.c(zza, account);
        zza.writeString(str);
        vc91.c(zza, bundle);
        Parcel zzb = zzb(5, zza);
        Bundle bundle2 = (Bundle) vc91.a(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzf(Account account) throws RemoteException {
        Parcel zza = zza();
        vc91.c(zza, account);
        Parcel zzb = zzb(7, zza);
        Bundle bundle = (Bundle) vc91.a(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzg(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzb = zzb(8, zza);
        Bundle bundle = (Bundle) vc91.a(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final AccountChangeEventsResponse zzh(AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException {
        Parcel zza = zza();
        vc91.c(zza, accountChangeEventsRequest);
        Parcel zzb = zzb(3, zza);
        AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) vc91.a(zzb, AccountChangeEventsResponse.CREATOR);
        zzb.recycle();
        return accountChangeEventsResponse;
    }
}
