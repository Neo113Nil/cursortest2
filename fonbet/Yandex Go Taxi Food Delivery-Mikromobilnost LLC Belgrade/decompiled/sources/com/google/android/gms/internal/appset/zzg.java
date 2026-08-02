package com.google.android.gms.internal.appset;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.uc91;

/* loaded from: classes11.dex */
public final class zzg extends zza implements IInterface {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(com.google.android.gms.appset.zza zzaVar, zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        int i = uc91.a;
        zza.writeInt(1);
        zzaVar.writeToParcel(zza, 0);
        zza.writeStrongBinder(zzfVar);
        zzb(1, zza);
    }
}
