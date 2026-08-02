package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes11.dex */
public abstract class zzaa extends com.google.android.gms.internal.maps.zzb implements zzab {
    public zzaa() {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzb();
        } else {
            if (i != 2) {
                return false;
            }
            zzc(com.google.android.gms.internal.maps.zzq.zzb(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.maps.internal.zzab
    public abstract /* synthetic */ void zzb() throws RemoteException;

    @Override // com.google.android.gms.maps.internal.zzab
    public abstract /* synthetic */ void zzc(com.google.android.gms.internal.maps.zzr zzrVar) throws RemoteException;
}
