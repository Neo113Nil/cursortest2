package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.xb91;

/* loaded from: classes11.dex */
public abstract class zzbt extends com.google.android.gms.internal.maps.zzb implements zzbu {
    public zzbt() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzb((Bitmap) xb91.a(parcel, Bitmap.CREATOR));
        } else {
            if (i != 2) {
                return false;
            }
            zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.maps.internal.zzbu
    public abstract /* synthetic */ void zzb(Bitmap bitmap) throws RemoteException;

    @Override // com.google.android.gms.maps.internal.zzbu
    public abstract /* synthetic */ void zzc(IObjectWrapper iObjectWrapper) throws RemoteException;
}
