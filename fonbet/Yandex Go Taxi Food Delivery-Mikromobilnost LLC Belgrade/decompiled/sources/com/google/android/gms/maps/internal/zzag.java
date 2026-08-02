package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes11.dex */
public abstract class zzag extends com.google.android.gms.internal.maps.zzb implements zzah {
    public zzag() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzb(com.google.android.gms.internal.maps.zzw.zzb(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.maps.internal.zzah
    public abstract /* synthetic */ void zzb(com.google.android.gms.internal.maps.zzx zzxVar) throws RemoteException;
}
