package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.xb91;

/* loaded from: classes11.dex */
public abstract class zzba extends com.google.android.gms.internal.maps.zzb implements zzbb {
    public zzba() {
        super("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzb((Location) xb91.a(parcel, Location.CREATOR));
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.maps.internal.zzbb
    public abstract /* synthetic */ void zzb(Location location) throws RemoteException;
}
