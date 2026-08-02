package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.wb91;

/* loaded from: classes11.dex */
public abstract class zzv extends com.google.android.gms.internal.identity.zzb implements zzw {
    public zzv() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static zzw zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof zzw ? (zzw) queryLocalInterface : new zzu(iBinder);
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            LocationResult locationResult = (LocationResult) wb91.a(parcel, LocationResult.CREATOR);
            wb91.d(parcel);
            zzd(locationResult);
        } else if (i == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) wb91.a(parcel, LocationAvailability.CREATOR);
            wb91.d(parcel);
            zze(locationAvailability);
        } else {
            if (i != 3) {
                return false;
            }
            zzf();
        }
        return true;
    }

    public abstract /* synthetic */ void zzd(LocationResult locationResult) throws RemoteException;

    public abstract /* synthetic */ void zze(LocationAvailability locationAvailability) throws RemoteException;

    public abstract /* synthetic */ void zzf() throws RemoteException;
}
