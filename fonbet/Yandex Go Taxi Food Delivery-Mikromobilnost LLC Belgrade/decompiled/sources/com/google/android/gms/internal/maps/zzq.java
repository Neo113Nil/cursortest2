package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class zzq extends zzb implements zzr {
    public static zzr zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
        return queryLocalInterface instanceof zzr ? (zzr) queryLocalInterface : new zzp(iBinder);
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public abstract /* synthetic */ int zzd() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzr
    public abstract /* synthetic */ int zze() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzr
    public abstract /* synthetic */ int zzf() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzr
    public abstract /* synthetic */ List zzg() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzr
    public abstract /* synthetic */ boolean zzh(zzr zzrVar) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzr
    public abstract /* synthetic */ boolean zzi() throws RemoteException;
}
