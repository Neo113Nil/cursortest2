package com.google.android.gms.internal.auth_blockstore;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import defpackage.xc91;

/* loaded from: classes11.dex */
public abstract class zzj extends zzb implements zzk {
    public zzj() {
        super("com.google.android.gms.auth.blockstore.internal.IIsEndToEndEncryptionAvailableCallback");
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzb
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Status status = (Status) xc91.a(parcel, Status.CREATOR);
        boolean z = parcel.readInt() != 0;
        enforceNoDataAvail(parcel);
        zza(status, z);
        return true;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzk
    public abstract /* synthetic */ void zza(Status status, boolean z) throws RemoteException;
}
