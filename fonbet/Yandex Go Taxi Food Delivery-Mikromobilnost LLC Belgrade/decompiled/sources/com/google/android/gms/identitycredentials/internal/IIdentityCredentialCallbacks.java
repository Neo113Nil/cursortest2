package com.google.android.gms.identitycredentials.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.ClearRegistryResponse;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.identitycredentials.PendingImportCredentialsHandle;
import com.google.android.gms.identitycredentials.RegisterExportResponse;
import com.google.android.gms.identitycredentials.RegistrationResponse;
import com.google.android.gms.internal.identity_credentials.zzb;
import defpackage.vb91;

/* loaded from: classes11.dex */
public interface IIdentityCredentialCallbacks extends IInterface {

    public static abstract class Stub extends zzb implements IIdentityCredentialCallbacks {
        public Stub() {
            super("com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
        }

        @Override // com.google.android.gms.internal.identity_credentials.zzb
        public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                Status status = (Status) vb91.a(parcel, Status.CREATOR);
                PendingGetCredentialHandle pendingGetCredentialHandle = (PendingGetCredentialHandle) vb91.a(parcel, PendingGetCredentialHandle.CREATOR);
                enforceNoDataAvail(parcel);
                onGetCredential(status, pendingGetCredentialHandle);
            } else if (i == 2) {
                Status status2 = (Status) vb91.a(parcel, Status.CREATOR);
                RegistrationResponse registrationResponse = (RegistrationResponse) vb91.a(parcel, RegistrationResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onRegisterCredentials(status2, registrationResponse);
            } else if (i == 3) {
                Status status3 = (Status) vb91.a(parcel, Status.CREATOR);
                ClearRegistryResponse clearRegistryResponse = (ClearRegistryResponse) vb91.a(parcel, ClearRegistryResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onClearRegistry(status3, clearRegistryResponse);
            } else if (i == 4) {
                Status status4 = (Status) vb91.a(parcel, Status.CREATOR);
                PendingImportCredentialsHandle pendingImportCredentialsHandle = (PendingImportCredentialsHandle) vb91.a(parcel, PendingImportCredentialsHandle.CREATOR);
                enforceNoDataAvail(parcel);
                onImportCredentials(status4, pendingImportCredentialsHandle);
            } else {
                if (i != 5) {
                    return false;
                }
                Status status5 = (Status) vb91.a(parcel, Status.CREATOR);
                RegisterExportResponse registerExportResponse = (RegisterExportResponse) vb91.a(parcel, RegisterExportResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onRegisterExport(status5, registerExportResponse);
            }
            return true;
        }

        @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
        public abstract /* synthetic */ void onClearRegistry(Status status, ClearRegistryResponse clearRegistryResponse) throws RemoteException;

        @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
        public abstract /* synthetic */ void onGetCredential(Status status, PendingGetCredentialHandle pendingGetCredentialHandle) throws RemoteException;

        @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
        public abstract /* synthetic */ void onImportCredentials(Status status, PendingImportCredentialsHandle pendingImportCredentialsHandle) throws RemoteException;

        @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
        public abstract /* synthetic */ void onRegisterCredentials(Status status, RegistrationResponse registrationResponse) throws RemoteException;

        @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
        public abstract /* synthetic */ void onRegisterExport(Status status, RegisterExportResponse registerExportResponse) throws RemoteException;
    }

    void onClearRegistry(Status status, ClearRegistryResponse clearRegistryResponse) throws RemoteException;

    void onGetCredential(Status status, PendingGetCredentialHandle pendingGetCredentialHandle) throws RemoteException;

    void onImportCredentials(Status status, PendingImportCredentialsHandle pendingImportCredentialsHandle) throws RemoteException;

    void onRegisterCredentials(Status status, RegistrationResponse registrationResponse) throws RemoteException;

    void onRegisterExport(Status status, RegisterExportResponse registerExportResponse) throws RemoteException;
}
