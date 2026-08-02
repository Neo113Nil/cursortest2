package com.google.android.gms.location;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.identity.zza;

/* loaded from: classes11.dex */
public final class zzu extends zza implements zzw {
    public zzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    @Override // com.google.android.gms.location.zzw
    public final void zzd(LocationResult locationResult) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.location.zzw
    public final void zze(LocationAvailability locationAvailability) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.location.zzw
    public final void zzf() throws RemoteException {
        throw null;
    }
}
