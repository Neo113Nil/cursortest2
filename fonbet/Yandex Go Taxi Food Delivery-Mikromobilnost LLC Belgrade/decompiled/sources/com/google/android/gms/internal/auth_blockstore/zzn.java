package com.google.android.gms.internal.auth_blockstore;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import defpackage.xc91;

/* loaded from: classes11.dex */
public abstract class zzn extends zzb implements zzo {
    public zzn() {
        super("com.google.android.gms.auth.blockstore.internal.IStoreBytesCallback");
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzb
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Status status = (Status) xc91.a(parcel, Status.CREATOR);
        int readInt = parcel.readInt();
        enforceNoDataAvail(parcel);
        zza(status, readInt);
        return true;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzo
    public abstract /* synthetic */ void zza(Status status, int i) throws RemoteException;
}
