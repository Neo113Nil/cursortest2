package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes11.dex */
public abstract class zzbp extends zzbm implements zzbq {
    public static zzbq zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzbq
    public abstract /* synthetic */ Bundle zze(Bundle bundle) throws RemoteException;
}
