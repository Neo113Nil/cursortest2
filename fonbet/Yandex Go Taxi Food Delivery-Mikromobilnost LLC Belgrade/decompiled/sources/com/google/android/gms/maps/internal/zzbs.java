package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import defpackage.uw51;
import defpackage.xb91;

/* loaded from: classes11.dex */
public final class zzbs extends zza implements IProjectionDelegate {
    public zzbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final LatLng fromScreenLocation(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        xb91.c(zza, iObjectWrapper);
        Parcel zzH = zzH(1, zza);
        LatLng latLng = (LatLng) xb91.a(zzH, LatLng.CREATOR);
        zzH.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final VisibleRegion getVisibleRegion() throws RemoteException {
        Parcel zzH = zzH(3, zza());
        VisibleRegion visibleRegion = (VisibleRegion) xb91.a(zzH, VisibleRegion.CREATOR);
        zzH.recycle();
        return visibleRegion;
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final IObjectWrapper toScreenLocation(LatLng latLng) throws RemoteException {
        Parcel zza = zza();
        xb91.b(zza, latLng);
        return uw51.f(zzH(2, zza));
    }
}
