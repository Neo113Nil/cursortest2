package com.google.android.gms.internal.auth_blockstore;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;

/* loaded from: classes11.dex */
public interface zzm extends IInterface {
    void zza(Status status, byte[] bArr) throws RemoteException;

    void zzb(Status status, RetrieveBytesResponse retrieveBytesResponse) throws RemoteException;
}
