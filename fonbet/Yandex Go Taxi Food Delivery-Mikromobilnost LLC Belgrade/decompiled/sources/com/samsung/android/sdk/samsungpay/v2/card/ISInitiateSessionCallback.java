package com.samsung.android.sdk.samsungpay.v2.card;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes11.dex */
public interface ISInitiateSessionCallback extends IInterface {

    public static class Default implements ISInitiateSessionCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.card.ISInitiateSessionCallback
        public void onAuthenticationApproved(int i, Bundle bundle) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.card.ISInitiateSessionCallback
        public void onSessionCompleted(Bundle bundle) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.card.ISInitiateSessionCallback
        public void onSessionFailed(int i, Bundle bundle) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ISInitiateSessionCallback {
        private static final String DESCRIPTOR = "com.samsung.android.sdk.samsungpay.v2.card.ISInitiateSessionCallback";
        static final int TRANSACTION_onAuthenticationApproved = 3;
        static final int TRANSACTION_onSessionCompleted = 1;
        static final int TRANSACTION_onSessionFailed = 2;

        public static class Proxy implements ISInitiateSessionCallback {
            public static ISInitiateSessionCallback sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.card.ISInitiateSessionCallback
            public void onAuthenticationApproved(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onAuthenticationApproved(i, bundle);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.card.ISInitiateSessionCallback
            public void onSessionCompleted(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onSessionCompleted(bundle);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.card.ISInitiateSessionCallback
            public void onSessionFailed(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onSessionFailed(i, bundle);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ISInitiateSessionCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ISInitiateSessionCallback)) ? new Proxy(iBinder) : (ISInitiateSessionCallback) queryLocalInterface;
        }

        public static ISInitiateSessionCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ISInitiateSessionCallback iSInitiateSessionCallback) {
            if (Proxy.sDefaultImpl != null || iSInitiateSessionCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iSInitiateSessionCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public abstract /* synthetic */ void onAuthenticationApproved(int i, Bundle bundle) throws RemoteException;

        public abstract /* synthetic */ void onSessionCompleted(Bundle bundle) throws RemoteException;

        public abstract /* synthetic */ void onSessionFailed(int i, Bundle bundle) throws RemoteException;

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onSessionCompleted(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onSessionFailed(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            onAuthenticationApproved(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void onAuthenticationApproved(int i, Bundle bundle) throws RemoteException;

    void onSessionCompleted(Bundle bundle) throws RemoteException;

    void onSessionFailed(int i, Bundle bundle) throws RemoteException;
}
