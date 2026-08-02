package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class zzz extends zzb implements zzaa {
    public static zzaa zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        return queryLocalInterface instanceof zzaa ? (zzaa) queryLocalInterface : new zzy(iBinder);
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ void zzA(float f) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ boolean zzB(zzaa zzaaVar) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ boolean zzC() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ boolean zzD() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ boolean zzE() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ float zzd() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ float zze() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ int zzf() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ int zzg() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ int zzh() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ int zzi() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ IObjectWrapper zzj() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ String zzk() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ List zzl() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ List zzm() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ List zzn() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ void zzo() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ void zzp(boolean z) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ void zzq(int i) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ void zzr(boolean z) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ void zzs(List list) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ void zzt(List list) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ void zzu(int i) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ void zzv(int i) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ void zzw(List list) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ void zzx(float f) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ void zzy(IObjectWrapper iObjectWrapper) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzaa
    public abstract /* synthetic */ void zzz(boolean z) throws RemoteException;
}
