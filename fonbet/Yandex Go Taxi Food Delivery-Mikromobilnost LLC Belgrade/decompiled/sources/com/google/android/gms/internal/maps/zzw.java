package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes11.dex */
public abstract class zzw extends zzb implements zzx {
    public static zzx zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return queryLocalInterface instanceof zzx ? (zzx) queryLocalInterface : new zzv(iBinder);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ void zzA(float f) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ void zzB() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ boolean zzC(zzx zzxVar) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ boolean zzD() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ boolean zzE() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ boolean zzF() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ boolean zzG() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ float zzd() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ float zze() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ float zzf() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ int zzg() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ IObjectWrapper zzh() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ LatLng zzi() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ String zzj() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ String zzk() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ String zzl() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ void zzm() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ void zzn() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ void zzo(float f) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ void zzp(float f, float f2) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ void zzq(boolean z) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ void zzr(boolean z) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ void zzs(IObjectWrapper iObjectWrapper) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ void zzt(float f, float f2) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ void zzu(LatLng latLng) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ void zzv(float f) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ void zzw(String str) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ void zzx(IObjectWrapper iObjectWrapper) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ void zzy(String str) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzx
    public abstract /* synthetic */ void zzz(boolean z) throws RemoteException;
}
