package com.google.android.gms.internal.auth_blockstore;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;
import defpackage.xc91;

/* loaded from: classes11.dex */
public abstract class zzl extends zzb implements zzm {
    public zzl() {
        super("com.google.android.gms.auth.blockstore.internal.IRetrieveBytesCallback");
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzb
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Status status = (Status) xc91.a(parcel, Status.CREATOR);
            byte[] createByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            zza(status, createByteArray);
        } else {
            if (i != 2) {
                return false;
            }
            Status status2 = (Status) xc91.a(parcel, Status.CREATOR);
            RetrieveBytesResponse retrieveBytesResponse = (RetrieveBytesResponse) xc91.a(parcel, RetrieveBytesResponse.CREATOR);
            enforceNoDataAvail(parcel);
            zzb(status2, retrieveBytesResponse);
        }
        return true;
    }

    public abstract /* synthetic */ void zza(Status status, byte[] bArr) throws RemoteException;

    public abstract /* synthetic */ void zzb(Status status, RetrieveBytesResponse retrieveBytesResponse) throws RemoteException;
}
