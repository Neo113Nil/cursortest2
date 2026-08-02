package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zza;
import defpackage.xb91;

/* loaded from: classes11.dex */
public final class zzai extends zza implements zzaj {
    public zzai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IOnLocationChangeListener");
    }

    @Override // com.google.android.gms.maps.internal.zzaj
    public final void zzd(Location location) throws RemoteException {
        Parcel zza = zza();
        xb91.b(zza, location);
        zzc(2, zza);
    }
}
