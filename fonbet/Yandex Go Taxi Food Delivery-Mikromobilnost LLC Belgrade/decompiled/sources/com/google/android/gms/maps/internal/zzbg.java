package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes11.dex */
public abstract class zzbg extends com.google.android.gms.internal.maps.zzb implements zzbh {
    public zzbg() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzb(com.google.android.gms.internal.maps.zzac.zzb(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.maps.internal.zzbh
    public abstract /* synthetic */ void zzb(com.google.android.gms.internal.maps.zzad zzadVar) throws RemoteException;
}
