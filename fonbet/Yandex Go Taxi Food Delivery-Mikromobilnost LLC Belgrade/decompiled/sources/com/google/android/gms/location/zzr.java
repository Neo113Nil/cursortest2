package com.google.android.gms.location;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.identity.zza;

/* loaded from: classes11.dex */
public final class zzr extends zza implements zzt {
    public zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.IDeviceOrientationListener");
    }

    @Override // com.google.android.gms.location.zzt
    public final void zzd(DeviceOrientation deviceOrientation) throws RemoteException {
        throw null;
    }
}
