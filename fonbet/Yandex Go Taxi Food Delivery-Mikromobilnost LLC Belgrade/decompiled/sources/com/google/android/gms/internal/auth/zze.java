package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* loaded from: classes11.dex */
public abstract class zze extends zzb implements zzf {
    public static zzf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        return queryLocalInterface instanceof zzf ? (zzf) queryLocalInterface : new zzd(iBinder);
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public abstract /* synthetic */ Bundle zzd(String str, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.internal.auth.zzf
    public abstract /* synthetic */ Bundle zze(Account account, String str, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.internal.auth.zzf
    public abstract /* synthetic */ Bundle zzf(Account account) throws RemoteException;

    @Override // com.google.android.gms.internal.auth.zzf
    public abstract /* synthetic */ Bundle zzg(String str) throws RemoteException;

    @Override // com.google.android.gms.internal.auth.zzf
    public abstract /* synthetic */ AccountChangeEventsResponse zzh(AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException;
}
