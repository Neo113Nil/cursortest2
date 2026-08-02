package com.google.android.gms.auth.blockstore.restorecredential.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth_blockstore.zzb;
import defpackage.xc91;

/* loaded from: classes11.dex */
public interface IGetRestoreCredentialCallback extends IInterface {

    public static abstract class Stub extends zzb implements IGetRestoreCredentialCallback {
        public Stub() {
            super("com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback");
        }

        @Override // com.google.android.gms.internal.auth_blockstore.zzb
        public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            Status status = (Status) xc91.a(parcel, Status.CREATOR);
            GetRestoreCredentialResponse getRestoreCredentialResponse = (GetRestoreCredentialResponse) xc91.a(parcel, GetRestoreCredentialResponse.CREATOR);
            enforceNoDataAvail(parcel);
            onGetRestoreCredential(status, getRestoreCredentialResponse);
            return true;
        }

        @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IGetRestoreCredentialCallback
        public abstract /* synthetic */ void onGetRestoreCredential(Status status, GetRestoreCredentialResponse getRestoreCredentialResponse) throws RemoteException;
    }

    void onGetRestoreCredential(Status status, GetRestoreCredentialResponse getRestoreCredentialResponse) throws RemoteException;
}
