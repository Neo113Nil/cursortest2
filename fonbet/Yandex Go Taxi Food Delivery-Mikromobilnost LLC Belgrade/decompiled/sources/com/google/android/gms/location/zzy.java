package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.wb91;

/* loaded from: classes11.dex */
public abstract class zzy extends com.google.android.gms.internal.identity.zzb implements zzz {
    public zzy() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static zzz zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof zzz ? (zzz) queryLocalInterface : new zzx(iBinder);
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Location location = (Location) wb91.a(parcel, Location.CREATOR);
            wb91.d(parcel);
            zzd(location);
        } else {
            if (i != 2) {
                return false;
            }
            zze();
        }
        return true;
    }

    public abstract /* synthetic */ void zzd(Location location) throws RemoteException;

    public abstract /* synthetic */ void zze() throws RemoteException;
}
