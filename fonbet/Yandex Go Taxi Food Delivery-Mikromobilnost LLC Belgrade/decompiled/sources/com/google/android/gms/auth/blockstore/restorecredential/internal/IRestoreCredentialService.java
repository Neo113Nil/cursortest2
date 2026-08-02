package com.google.android.gms.auth.blockstore.restorecredential.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import com.google.android.gms.internal.auth_blockstore.zza;
import com.google.android.gms.internal.auth_blockstore.zzb;
import defpackage.xc91;

/* loaded from: classes11.dex */
public interface IRestoreCredentialService extends IInterface {

    public static abstract class Stub extends zzb implements IRestoreCredentialService {

        public static class Proxy extends zza implements IRestoreCredentialService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            }

            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService
            public void clearRestoreCredential(ClearRestoreCredentialRequest clearRestoreCredentialRequest, IClearRestoreCredentialCallback iClearRestoreCredentialCallback) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                xc91.b(obtainAndWriteInterfaceToken, clearRestoreCredentialRequest);
                xc91.c(obtainAndWriteInterfaceToken, iClearRestoreCredentialCallback);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService
            public void createRestoreCredential(CreateRestoreCredentialRequest createRestoreCredentialRequest, ICreateRestoreCredentialCallback iCreateRestoreCredentialCallback) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                xc91.b(obtainAndWriteInterfaceToken, createRestoreCredentialRequest);
                xc91.c(obtainAndWriteInterfaceToken, iCreateRestoreCredentialCallback);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService
            public void getRestoreCredential(GetRestoreCredentialRequest getRestoreCredentialRequest, IGetRestoreCredentialCallback iGetRestoreCredentialCallback) throws RemoteException {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                xc91.b(obtainAndWriteInterfaceToken, getRestoreCredentialRequest);
                xc91.c(obtainAndWriteInterfaceToken, iGetRestoreCredentialCallback);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public static IRestoreCredentialService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            return queryLocalInterface instanceof IRestoreCredentialService ? (IRestoreCredentialService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService
        public abstract /* synthetic */ void clearRestoreCredential(ClearRestoreCredentialRequest clearRestoreCredentialRequest, IClearRestoreCredentialCallback iClearRestoreCredentialCallback) throws RemoteException;

        @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService
        public abstract /* synthetic */ void createRestoreCredential(CreateRestoreCredentialRequest createRestoreCredentialRequest, ICreateRestoreCredentialCallback iCreateRestoreCredentialCallback) throws RemoteException;

        @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService
        public abstract /* synthetic */ void getRestoreCredential(GetRestoreCredentialRequest getRestoreCredentialRequest, IGetRestoreCredentialCallback iGetRestoreCredentialCallback) throws RemoteException;
    }

    void clearRestoreCredential(ClearRestoreCredentialRequest clearRestoreCredentialRequest, IClearRestoreCredentialCallback iClearRestoreCredentialCallback) throws RemoteException;

    void createRestoreCredential(CreateRestoreCredentialRequest createRestoreCredentialRequest, ICreateRestoreCredentialCallback iCreateRestoreCredentialCallback) throws RemoteException;

    void getRestoreCredential(GetRestoreCredentialRequest getRestoreCredentialRequest, IGetRestoreCredentialCallback iGetRestoreCredentialCallback) throws RemoteException;
}
