package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import defpackage.xb91;

/* loaded from: classes11.dex */
public abstract class zzas extends com.google.android.gms.internal.maps.zzb implements zzat {
    public zzas() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean zzb = zzb(com.google.android.gms.internal.maps.zzw.zzb(parcel.readStrongBinder()));
        parcel2.writeNoException();
        ClassLoader classLoader = xb91.a;
        parcel2.writeInt(zzb ? 1 : 0);
        return true;
    }

    @Override // com.google.android.gms.maps.internal.zzat
    public abstract /* synthetic */ boolean zzb(com.google.android.gms.internal.maps.zzx zzxVar) throws RemoteException;
}
