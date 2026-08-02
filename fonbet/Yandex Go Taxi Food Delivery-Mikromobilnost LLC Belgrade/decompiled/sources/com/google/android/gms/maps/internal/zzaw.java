package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import defpackage.xb91;

/* loaded from: classes11.dex */
public abstract class zzaw extends com.google.android.gms.internal.maps.zzb implements zzax {
    public zzaw() {
        super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean zzb = zzb();
        parcel2.writeNoException();
        ClassLoader classLoader = xb91.a;
        parcel2.writeInt(zzb ? 1 : 0);
        return true;
    }

    @Override // com.google.android.gms.maps.internal.zzax
    public abstract /* synthetic */ boolean zzb() throws RemoteException;
}
