package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import defpackage.xb91;

/* loaded from: classes11.dex */
public abstract class zzbm extends com.google.android.gms.internal.maps.zzb implements zzbn {
    public zzbm() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzb((StreetViewPanoramaOrientation) xb91.a(parcel, StreetViewPanoramaOrientation.CREATOR));
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.maps.internal.zzbn
    public abstract /* synthetic */ void zzb(StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws RemoteException;
}
