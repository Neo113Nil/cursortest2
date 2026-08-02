package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.identity.zza;

/* loaded from: classes11.dex */
public final class zzx extends zza implements zzz {
    public zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    @Override // com.google.android.gms.location.zzz
    public final void zzd(Location location) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.location.zzz
    public final void zze() throws RemoteException {
        throw null;
    }
}
