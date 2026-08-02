package com.samsung.android.sdk.samsungpay.v2.payment;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes11.dex */
public interface ISGetCardBrandListener extends IInterface {

    public static class Default implements ISGetCardBrandListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISGetCardBrandListener
        public void onFail(int i, Bundle bundle) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISGetCardBrandListener
        public void onProcess() throws RemoteException {
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISGetCardBrandListener
        public void onSuccess(List<CardInfo> list) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ISGetCardBrandListener {
        private static final String DESCRIPTOR = "com.samsung.android.sdk.samsungpay.v2.payment.ISGetCardBrandListener";
        static final int TRANSACTION_onFail = 2;
        static final int TRANSACTION_onProcess = 3;
        static final int TRANSACTION_onSuccess = 1;

        public static class Proxy implements ISGetCardBrandListener {
            public static ISGetCardBrandListener sDefaultImpl;
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

            @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISGetCardBrandListener
            public void onFail(int i, Bundle bundle) throws RemoteException {
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
                        Stub.getDefaultImpl().onFail(i, bundle);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISGetCardBrandListener
            public void onProcess() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onProcess();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISGetCardBrandListener
            public void onSuccess(List<CardInfo> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeTypedList(list);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().onSuccess(list);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ISGetCardBrandListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ISGetCardBrandListener)) ? new Proxy(iBinder) : (ISGetCardBrandListener) queryLocalInterface;
        }

        public static ISGetCardBrandListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ISGetCardBrandListener iSGetCardBrandListener) {
            if (Proxy.sDefaultImpl != null || iSGetCardBrandListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = iSGetCardBrandListener;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISGetCardBrandListener
        public abstract /* synthetic */ void onFail(int i, Bundle bundle) throws RemoteException;

        @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISGetCardBrandListener
        public abstract /* synthetic */ void onProcess() throws RemoteException;

        @Override // com.samsung.android.sdk.samsungpay.v2.payment.ISGetCardBrandListener
        public abstract /* synthetic */ void onSuccess(List list) throws RemoteException;

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onSuccess(parcel.createTypedArrayList(CardInfo.CREATOR));
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                onFail(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
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
            onProcess();
            parcel2.writeNoException();
            return true;
        }
    }

    void onFail(int i, Bundle bundle) throws RemoteException;

    void onProcess() throws RemoteException;

    void onSuccess(List<CardInfo> list) throws RemoteException;
}
