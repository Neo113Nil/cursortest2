package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzbm;
import defpackage.da91;

/* loaded from: classes11.dex */
public abstract class zzgg extends zzbm implements zzgh {
    public zzgg() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        zzoq zzoqVar = (zzoq) da91.b(parcel, zzoq.CREATOR);
        da91.f(parcel);
        zze(zzoqVar);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzgh
    public abstract /* synthetic */ void zze(zzoq zzoqVar) throws RemoteException;
}
