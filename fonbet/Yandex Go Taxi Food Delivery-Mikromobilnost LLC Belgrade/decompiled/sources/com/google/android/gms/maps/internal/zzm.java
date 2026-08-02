package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import defpackage.xb91;

/* loaded from: classes11.dex */
public abstract class zzm extends com.google.android.gms.internal.maps.zzb implements zzn {
    public zzm() {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzb((CameraPosition) xb91.a(parcel, CameraPosition.CREATOR));
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.maps.internal.zzn
    public abstract /* synthetic */ void zzb(CameraPosition cameraPosition) throws RemoteException;
}
