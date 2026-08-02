package com.google.android.play.core.splitinstall.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class zzbn extends zzl implements zzbo {
    public static zzbo zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return queryLocalInterface instanceof zzbo ? (zzbo) queryLocalInterface : new zzbm(iBinder);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public abstract /* synthetic */ void zzc(String str, int i, Bundle bundle, zzbq zzbqVar) throws RemoteException;

    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public abstract /* synthetic */ void zzd(String str, List list, Bundle bundle, zzbq zzbqVar) throws RemoteException;

    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public abstract /* synthetic */ void zze(String str, List list, Bundle bundle, zzbq zzbqVar) throws RemoteException;

    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public abstract /* synthetic */ void zzf(String str, List list, Bundle bundle, zzbq zzbqVar) throws RemoteException;

    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public abstract /* synthetic */ void zzg(String str, List list, Bundle bundle, zzbq zzbqVar) throws RemoteException;

    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public abstract /* synthetic */ void zzh(String str, int i, zzbq zzbqVar) throws RemoteException;

    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public abstract /* synthetic */ void zzi(String str, zzbq zzbqVar) throws RemoteException;

    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public abstract /* synthetic */ void zzj(String str, List list, Bundle bundle, zzbq zzbqVar) throws RemoteException;
}
