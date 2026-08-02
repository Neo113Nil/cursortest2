package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.RemoteException;
import defpackage.wb91;

/* loaded from: classes11.dex */
public abstract class zzq extends zzb implements zzr {
    public zzq() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzl zzlVar = (zzl) wb91.a(parcel, zzl.CREATOR);
            wb91.d(parcel);
            zzd(zzlVar);
        } else {
            if (i != 2) {
                return false;
            }
            zze();
        }
        return true;
    }

    public abstract /* synthetic */ void zzd(zzl zzlVar) throws RemoteException;

    public abstract /* synthetic */ void zze() throws RemoteException;
}
