package com.google.android.gms.identitycredentials.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.identitycredentials.ClearRegistryRequest;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.RegistrationRequest;
import com.google.android.gms.internal.identity_credentials.zza;
import com.google.android.gms.internal.identity_credentials.zzb;
import defpackage.vb91;

/* loaded from: classes11.dex */
public interface IIdentityCredentialService extends IInterface {

    public static abstract class Stub extends zzb implements IIdentityCredentialService {

        public static class Proxy extends zza implements IIdentityCredentialService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void clearRegistry(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, ClearRegistryRequest clearRegistryRequest) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = vb91.a;
                obtainAndWriteInterfaceToken.writeStrongBinder(iIdentityCredentialCallbacks.asBinder());
                if (clearRegistryRequest == null) {
                    obtainAndWriteInterfaceToken.writeInt(0);
                } else {
                    obtainAndWriteInterfaceToken.writeInt(1);
                    clearRegistryRequest.writeToParcel(obtainAndWriteInterfaceToken, 0);
                }
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void getCredential(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, GetCredentialRequest getCredentialRequest) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = vb91.a;
                obtainAndWriteInterfaceToken.writeStrongBinder(iIdentityCredentialCallbacks.asBinder());
                if (getCredentialRequest == null) {
                    obtainAndWriteInterfaceToken.writeInt(0);
                } else {
                    obtainAndWriteInterfaceToken.writeInt(1);
                    getCredentialRequest.writeToParcel(obtainAndWriteInterfaceToken, 0);
                }
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
            public void registerCredentials(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, RegistrationRequest registrationRequest) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = vb91.a;
                obtainAndWriteInterfaceToken.writeStrongBinder(iIdentityCredentialCallbacks.asBinder());
                if (registrationRequest == null) {
                    obtainAndWriteInterfaceToken.writeInt(0);
                } else {
                    obtainAndWriteInterfaceToken.writeInt(1);
                    registrationRequest.writeToParcel(obtainAndWriteInterfaceToken, 0);
                }
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public static IIdentityCredentialService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
            return queryLocalInterface instanceof IIdentityCredentialService ? (IIdentityCredentialService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
        public abstract /* synthetic */ void clearRegistry(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, ClearRegistryRequest clearRegistryRequest) throws RemoteException;

        @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
        public abstract /* synthetic */ void getCredential(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, GetCredentialRequest getCredentialRequest) throws RemoteException;

        @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialService
        public abstract /* synthetic */ void registerCredentials(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, RegistrationRequest registrationRequest) throws RemoteException;
    }

    void clearRegistry(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, ClearRegistryRequest clearRegistryRequest) throws RemoteException;

    void getCredential(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, GetCredentialRequest getCredentialRequest) throws RemoteException;

    void registerCredentials(IIdentityCredentialCallbacks iIdentityCredentialCallbacks, RegistrationRequest registrationRequest) throws RemoteException;
}
