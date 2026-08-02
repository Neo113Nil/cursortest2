package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import defpackage.xb91;

/* loaded from: classes11.dex */
public abstract class zzao extends com.google.android.gms.internal.maps.zzb implements zzap {
    public zzao() {
        super("com.google.android.gms.maps.internal.IOnMapLongClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzb((LatLng) xb91.a(parcel, LatLng.CREATOR));
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.maps.internal.zzap
    public abstract /* synthetic */ void zzb(LatLng latLng) throws RemoteException;
}
