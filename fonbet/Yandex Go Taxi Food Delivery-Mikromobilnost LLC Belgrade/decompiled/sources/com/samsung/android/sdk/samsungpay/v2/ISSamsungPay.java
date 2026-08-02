package com.samsung.android.sdk.samsungpay.v2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.samsung.android.sdk.samsungpay.v2.ISStatusListener;
import java.util.List;

/* loaded from: classes11.dex */
public interface ISSamsungPay extends IInterface {

    public static class Default implements ISSamsungPay {
        @Override // com.samsung.android.sdk.samsungpay.v2.ISSamsungPay
        public void activateSamsungPay() throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.ISSamsungPay
        public Status getSamsungPayStatus(PartnerInfo partnerInfo) throws RemoteException {
            return null;
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.ISSamsungPay
        public void getSamsungPayTransitStatus(PartnerInfo partnerInfo, ISStatusListener iSStatusListener) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.ISSamsungPay
        public void getWalletInfo(PartnerInfo partnerInfo, List<String> list, ISStatusListener iSStatusListener) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ISSamsungPay {
        private static final String DESCRIPTOR = "com.samsung.android.sdk.samsungpay.v2.ISSamsungPay";
        static final int TRANSACTION_activateSamsungPay = 2;
        static final int TRANSACTION_getSamsungPayStatus = 1;
        static final int TRANSACTION_getSamsungPayTransitStatus = 4;
        static final int TRANSACTION_getWalletInfo = 3;

        public static class Proxy implements ISSamsungPay {
            public static ISSamsungPay sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.ISSamsungPay
            public void activateSamsungPay() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().activateSamsungPay();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.ISSamsungPay
            public Status getSamsungPayStatus(PartnerInfo partnerInfo) throws RemoteException {
                Status createFromParcel;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (partnerInfo != null) {
                        obtain.writeInt(1);
                        partnerInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        createFromParcel = obtain2.readInt() != 0 ? Status.CREATOR.createFromParcel(obtain2) : null;
                    } else {
                        createFromParcel = Stub.getDefaultImpl().getSamsungPayStatus(partnerInfo);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return createFromParcel;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.ISSamsungPay
            public void getSamsungPayTransitStatus(PartnerInfo partnerInfo, ISStatusListener iSStatusListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (partnerInfo != null) {
                        obtain.writeInt(1);
                        partnerInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iSStatusListener != null ? iSStatusListener.asBinder() : null);
                    if (this.mRemote.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().getSamsungPayTransitStatus(partnerInfo, iSStatusListener);
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.samsung.android.sdk.samsungpay.v2.ISSamsungPay
            public void getWalletInfo(PartnerInfo partnerInfo, List<String> list, ISStatusListener iSStatusListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (partnerInfo != null) {
                        obtain.writeInt(1);
                        partnerInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringList(list);
                    obtain.writeStrongBinder(iSStatusListener != null ? iSStatusListener.asBinder() : null);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().getWalletInfo(partnerInfo, list, iSStatusListener);
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

        public static ISSamsungPay asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ISSamsungPay)) ? new Proxy(iBinder) : (ISSamsungPay) queryLocalInterface;
        }

        public static ISSamsungPay getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ISSamsungPay iSSamsungPay) {
            if (Proxy.sDefaultImpl != null || iSSamsungPay == null) {
                return false;
            }
            Proxy.sDefaultImpl = iSSamsungPay;
            return true;
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.ISSamsungPay
        public abstract /* synthetic */ void activateSamsungPay() throws RemoteException;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // com.samsung.android.sdk.samsungpay.v2.ISSamsungPay
        public abstract /* synthetic */ Status getSamsungPayStatus(PartnerInfo partnerInfo) throws RemoteException;

        @Override // com.samsung.android.sdk.samsungpay.v2.ISSamsungPay
        public abstract /* synthetic */ void getSamsungPayTransitStatus(PartnerInfo partnerInfo, ISStatusListener iSStatusListener) throws RemoteException;

        @Override // com.samsung.android.sdk.samsungpay.v2.ISSamsungPay
        public abstract /* synthetic */ void getWalletInfo(PartnerInfo partnerInfo, List list, ISStatusListener iSStatusListener) throws RemoteException;

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                Status samsungPayStatus = getSamsungPayStatus(parcel.readInt() != 0 ? PartnerInfo.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (samsungPayStatus != null) {
                    parcel2.writeInt(1);
                    samsungPayStatus.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                activateSamsungPay();
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                getWalletInfo(parcel.readInt() != 0 ? PartnerInfo.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), ISStatusListener.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            }
            if (i != 4) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            getSamsungPayTransitStatus(parcel.readInt() != 0 ? PartnerInfo.CREATOR.createFromParcel(parcel) : null, ISStatusListener.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
    }

    void activateSamsungPay() throws RemoteException;

    Status getSamsungPayStatus(PartnerInfo partnerInfo) throws RemoteException;

    void getSamsungPayTransitStatus(PartnerInfo partnerInfo, ISStatusListener iSStatusListener) throws RemoteException;

    void getWalletInfo(PartnerInfo partnerInfo, List<String> list, ISStatusListener iSStatusListener) throws RemoteException;
}
