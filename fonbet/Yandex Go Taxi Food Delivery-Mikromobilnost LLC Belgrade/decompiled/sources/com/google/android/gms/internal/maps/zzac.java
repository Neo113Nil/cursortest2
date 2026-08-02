package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.Cap;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class zzac extends zzb implements zzad {
    public static zzad zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        return queryLocalInterface instanceof zzad ? (zzad) queryLocalInterface : new zzab(iBinder);
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ void zzA(float f) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ boolean zzB(zzad zzadVar) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ boolean zzC() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ boolean zzD() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ boolean zzE() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ float zzd() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ float zze() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ int zzf() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ int zzg() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ int zzh() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ IObjectWrapper zzi() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ Cap zzj() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ Cap zzk() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ String zzl() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ List zzm() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ List zzn() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ void zzo() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ void zzp(boolean z) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ void zzq(int i) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ void zzr(Cap cap) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ void zzs(boolean z) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ void zzt(int i) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ void zzu(List list) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ void zzv(List list) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ void zzw(Cap cap) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ void zzx(IObjectWrapper iObjectWrapper) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ void zzy(boolean z) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzad
    public abstract /* synthetic */ void zzz(float f) throws RemoteException;
}
