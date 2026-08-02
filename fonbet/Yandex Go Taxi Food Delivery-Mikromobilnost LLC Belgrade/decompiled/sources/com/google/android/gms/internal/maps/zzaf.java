package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes11.dex */
public abstract class zzaf extends zzb implements zzag {
    public static zzag zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
        return queryLocalInterface instanceof zzag ? (zzag) queryLocalInterface : new zzae(iBinder);
    }

    @Override // com.google.android.gms.internal.maps.zzag
    public abstract /* synthetic */ float zzd() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzag
    public abstract /* synthetic */ float zze() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzag
    public abstract /* synthetic */ int zzf() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzag
    public abstract /* synthetic */ String zzg() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzag
    public abstract /* synthetic */ void zzh() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzag
    public abstract /* synthetic */ void zzi() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzag
    public abstract /* synthetic */ void zzj(boolean z) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzag
    public abstract /* synthetic */ void zzk(float f) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzag
    public abstract /* synthetic */ void zzl(boolean z) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzag
    public abstract /* synthetic */ void zzm(float f) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzag
    public abstract /* synthetic */ boolean zzn(zzag zzagVar) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzag
    public abstract /* synthetic */ boolean zzo() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzag
    public abstract /* synthetic */ boolean zzp() throws RemoteException;
}
