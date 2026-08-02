package com.google.android.gms.internal.maps;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes11.dex */
public abstract class zzh extends zzb implements zzi {
    public static zzi zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        return queryLocalInterface instanceof zzi ? (zzi) queryLocalInterface : new zzg(iBinder);
    }

    @Override // com.google.android.gms.internal.maps.zzi
    public abstract /* synthetic */ IObjectWrapper zzd() throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzi
    public abstract /* synthetic */ IObjectWrapper zze(float f) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzi
    public abstract /* synthetic */ IObjectWrapper zzf(String str) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzi
    public abstract /* synthetic */ IObjectWrapper zzg(Bitmap bitmap) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzi
    public abstract /* synthetic */ IObjectWrapper zzh(String str) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzi
    public abstract /* synthetic */ IObjectWrapper zzi(String str) throws RemoteException;

    @Override // com.google.android.gms.internal.maps.zzi
    public abstract /* synthetic */ IObjectWrapper zzj(int i) throws RemoteException;
}
