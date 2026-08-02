package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.PointOfInterest;
import defpackage.xb91;

/* loaded from: classes11.dex */
public abstract class zzbc extends com.google.android.gms.internal.maps.zzb implements zzbd {
    public zzbc() {
        super("com.google.android.gms.maps.internal.IOnPoiClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzb((PointOfInterest) xb91.a(parcel, PointOfInterest.CREATOR));
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.maps.internal.zzbd
    public abstract /* synthetic */ void zzb(PointOfInterest pointOfInterest) throws RemoteException;
}
