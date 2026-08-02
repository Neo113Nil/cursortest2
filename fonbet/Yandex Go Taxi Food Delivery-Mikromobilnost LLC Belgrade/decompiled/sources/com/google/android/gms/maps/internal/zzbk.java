package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import defpackage.xb91;

/* loaded from: classes11.dex */
public abstract class zzbk extends com.google.android.gms.internal.maps.zzb implements zzbl {
    public zzbk() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzb((StreetViewPanoramaLocation) xb91.a(parcel, StreetViewPanoramaLocation.CREATOR));
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.maps.internal.zzbl
    public abstract /* synthetic */ void zzb(StreetViewPanoramaLocation streetViewPanoramaLocation) throws RemoteException;
}
