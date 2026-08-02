package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes11.dex */
public abstract class zzn extends zzb implements zzo {
    public static zzo zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        return queryLocalInterface instanceof zzo ? (zzo) queryLocalInterface : new zzm(iBinder);
    }

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ boolean zzA() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ boolean zzB() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ float zzd() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ float zze() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ float zzf() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ float zzg() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ float zzh() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ int zzi() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ IObjectWrapper zzj() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ LatLng zzk() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ LatLngBounds zzl() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ String zzm() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ void zzn() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ void zzo(float f) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ void zzp(boolean z) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ void zzq(float f) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ void zzr(float f, float f2) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ void zzs(IObjectWrapper iObjectWrapper) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ void zzt(LatLng latLng) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ void zzu(LatLngBounds latLngBounds) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ void zzv(IObjectWrapper iObjectWrapper) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ void zzw(float f) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ void zzx(boolean z) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ void zzy(float f) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzo
    public abstract /* synthetic */ boolean zzz(zzo zzoVar) throws RemoteException;
}
