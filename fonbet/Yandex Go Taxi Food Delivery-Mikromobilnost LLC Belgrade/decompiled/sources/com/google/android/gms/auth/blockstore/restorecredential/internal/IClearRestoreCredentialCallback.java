package com.google.android.gms.auth.blockstore.restorecredential.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth_blockstore.zzb;
import defpackage.xc91;

/* loaded from: classes11.dex */
public interface IClearRestoreCredentialCallback extends IInterface {

    public static abstract class Stub extends zzb implements IClearRestoreCredentialCallback {
        public Stub() {
            super("com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback");
        }

        @Override // com.google.android.gms.internal.auth_blockstore.zzb
        public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            Status status = (Status) xc91.a(parcel, Status.CREATOR);
            boolean z = parcel.readInt() != 0;
            enforceNoDataAvail(parcel);
            onClearRestoreCredential(status, z);
            return true;
        }

        @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback
        public abstract /* synthetic */ void onClearRestoreCredential(Status status, boolean z) throws RemoteException;
    }

    void onClearRestoreCredential(Status status, boolean z) throws RemoteException;
}
