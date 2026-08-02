package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.xb91;

/* loaded from: classes11.dex */
public abstract class zzh extends com.google.android.gms.internal.maps.zzb implements zzi {
    public zzh() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper zzc = zzc(com.google.android.gms.internal.maps.zzw.zzb(parcel.readStrongBinder()));
            parcel2.writeNoException();
            xb91.c(parcel2, zzc);
        } else {
            if (i != 2) {
                return false;
            }
            IObjectWrapper zzb = zzb(com.google.android.gms.internal.maps.zzw.zzb(parcel.readStrongBinder()));
            parcel2.writeNoException();
            xb91.c(parcel2, zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.maps.internal.zzi
    public abstract /* synthetic */ IObjectWrapper zzb(com.google.android.gms.internal.maps.zzx zzxVar) throws RemoteException;

    @Override // com.google.android.gms.maps.internal.zzi
    public abstract /* synthetic */ IObjectWrapper zzc(com.google.android.gms.internal.maps.zzx zzxVar) throws RemoteException;
}
