package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes11.dex */
public abstract class zze extends zzb implements zzf {
    public static zzf zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof zzf ? (zzf) queryLocalInterface : new zzd(iBinder);
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public abstract /* synthetic */ String zzc() throws RemoteException;

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public abstract /* synthetic */ boolean zzd() throws RemoteException;

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public abstract /* synthetic */ boolean zze(boolean z) throws RemoteException;
}
