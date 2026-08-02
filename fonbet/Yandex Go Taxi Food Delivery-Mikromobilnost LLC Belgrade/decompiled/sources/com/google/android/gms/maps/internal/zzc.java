package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes11.dex */
public abstract class zzc extends com.google.android.gms.internal.maps.zzb implements zzd {
    public zzc() {
        super("com.google.android.gms.maps.internal.ICancelableCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzc();
        } else {
            if (i != 2) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.maps.internal.zzd
    public abstract /* synthetic */ void zzb() throws RemoteException;

    @Override // com.google.android.gms.maps.internal.zzd
    public abstract /* synthetic */ void zzc() throws RemoteException;
}
