package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes11.dex */
public abstract class zzau extends com.google.android.gms.internal.maps.zzb implements zzav {
    public zzau() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzd(com.google.android.gms.internal.maps.zzw.zzb(parcel.readStrongBinder()));
        } else if (i == 2) {
            zzb(com.google.android.gms.internal.maps.zzw.zzb(parcel.readStrongBinder()));
        } else {
            if (i != 3) {
                return false;
            }
            zzc(com.google.android.gms.internal.maps.zzw.zzb(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.maps.internal.zzav
    public abstract /* synthetic */ void zzb(com.google.android.gms.internal.maps.zzx zzxVar) throws RemoteException;

    @Override // com.google.android.gms.maps.internal.zzav
    public abstract /* synthetic */ void zzc(com.google.android.gms.internal.maps.zzx zzxVar) throws RemoteException;

    @Override // com.google.android.gms.maps.internal.zzav
    public abstract /* synthetic */ void zzd(com.google.android.gms.internal.maps.zzx zzxVar) throws RemoteException;
}
