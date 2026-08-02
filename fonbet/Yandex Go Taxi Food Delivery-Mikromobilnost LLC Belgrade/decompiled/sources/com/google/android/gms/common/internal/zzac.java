package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.zzr;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes11.dex */
public abstract class zzac extends com.google.android.gms.internal.common.zzb implements zzad {
    public static zzad zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof zzad ? (zzad) queryLocalInterface : new zzab(iBinder);
    }

    @Override // com.google.android.gms.common.internal.zzad
    public abstract /* synthetic */ boolean zze(com.google.android.gms.common.zzt zztVar, IObjectWrapper iObjectWrapper) throws RemoteException;

    @Override // com.google.android.gms.common.internal.zzad
    public abstract /* synthetic */ zzr zzf(com.google.android.gms.common.zzp zzpVar) throws RemoteException;

    @Override // com.google.android.gms.common.internal.zzad
    public abstract /* synthetic */ boolean zzg() throws RemoteException;

    @Override // com.google.android.gms.common.internal.zzad
    public abstract /* synthetic */ zzr zzh(com.google.android.gms.common.zzp zzpVar) throws RemoteException;

    @Override // com.google.android.gms.common.internal.zzad
    public abstract /* synthetic */ boolean zzi() throws RemoteException;
}
