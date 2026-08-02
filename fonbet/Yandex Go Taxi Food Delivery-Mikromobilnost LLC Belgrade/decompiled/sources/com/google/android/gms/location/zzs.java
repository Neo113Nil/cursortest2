package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.wb91;

/* loaded from: classes11.dex */
public abstract class zzs extends com.google.android.gms.internal.identity.zzb implements zzt {
    public zzs() {
        super("com.google.android.gms.location.IDeviceOrientationListener");
    }

    public static zzt zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return queryLocalInterface instanceof zzt ? (zzt) queryLocalInterface : new zzr(iBinder);
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        DeviceOrientation deviceOrientation = (DeviceOrientation) wb91.a(parcel, DeviceOrientation.CREATOR);
        wb91.d(parcel);
        zzd(deviceOrientation);
        return true;
    }

    public abstract /* synthetic */ void zzd(DeviceOrientation deviceOrientation) throws RemoteException;
}
