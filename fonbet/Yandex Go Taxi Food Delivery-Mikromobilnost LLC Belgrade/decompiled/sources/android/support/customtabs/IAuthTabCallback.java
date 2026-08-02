package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes10.dex */
public interface IAuthTabCallback extends IInterface {
    public static final String DESCRIPTOR = "android$support$customtabs$IAuthTabCallback".replace('$', '.');

    public static class Default implements IAuthTabCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public void onExtraCallback(String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public Bundle onExtraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public void onNavigationEvent(int i, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public void onWarmupCompleted(Bundle bundle) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IAuthTabCallback {
        static final int TRANSACTION_onExtraCallback = 3;
        static final int TRANSACTION_onExtraCallbackWithResult = 4;
        static final int TRANSACTION_onNavigationEvent = 2;
        static final int TRANSACTION_onWarmupCompleted = 5;

        public static class Proxy implements IAuthTabCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IAuthTabCallback.DESCRIPTOR;
            }

            @Override // android.support.customtabs.IAuthTabCallback
            public void onExtraCallback(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAuthTabCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    a.b(obtain, bundle, 0);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.IAuthTabCallback
            public Bundle onExtraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAuthTabCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    a.b(obtain, bundle, 0);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    return (Bundle) a.a(obtain2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.IAuthTabCallback
            public void onNavigationEvent(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAuthTabCallback.DESCRIPTOR);
                    obtain.writeInt(i);
                    a.b(obtain, bundle, 0);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.IAuthTabCallback
            public void onWarmupCompleted(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAuthTabCallback.DESCRIPTOR);
                    a.b(obtain, bundle, 0);
                    this.mRemote.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IAuthTabCallback.DESCRIPTOR);
        }

        public static IAuthTabCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAuthTabCallback.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IAuthTabCallback)) ? new Proxy(iBinder) : (IAuthTabCallback) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public abstract /* synthetic */ void onExtraCallback(String str, Bundle bundle) throws RemoteException;

        @Override // android.support.customtabs.IAuthTabCallback
        public abstract /* synthetic */ Bundle onExtraCallbackWithResult(String str, Bundle bundle) throws RemoteException;

        @Override // android.support.customtabs.IAuthTabCallback
        public abstract /* synthetic */ void onNavigationEvent(int i, Bundle bundle) throws RemoteException;

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = IAuthTabCallback.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 2) {
                int readInt = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                onNavigationEvent(readInt, (Bundle) a.a(parcel));
                return true;
            }
            if (i == 3) {
                String readString = parcel.readString();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                onExtraCallback(readString, (Bundle) a.a(parcel));
                return true;
            }
            if (i != 4) {
                if (i != 5) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                Parcelable.Creator creator3 = Bundle.CREATOR;
                onWarmupCompleted((Bundle) a.a(parcel));
                return true;
            }
            String readString2 = parcel.readString();
            Parcelable.Creator creator4 = Bundle.CREATOR;
            Bundle onExtraCallbackWithResult = onExtraCallbackWithResult(readString2, (Bundle) a.a(parcel));
            parcel2.writeNoException();
            a.b(parcel2, onExtraCallbackWithResult, 1);
            return true;
        }

        @Override // android.support.customtabs.IAuthTabCallback
        public abstract /* synthetic */ void onWarmupCompleted(Bundle bundle) throws RemoteException;
    }

    public static class a {
        public static Object a(Parcel parcel) {
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void b(Parcel parcel, Bundle bundle, int i) {
            if (bundle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                bundle.writeToParcel(parcel, i);
            }
        }
    }

    void onExtraCallback(String str, Bundle bundle) throws RemoteException;

    Bundle onExtraCallbackWithResult(String str, Bundle bundle) throws RemoteException;

    void onNavigationEvent(int i, Bundle bundle) throws RemoteException;

    void onWarmupCompleted(Bundle bundle) throws RemoteException;
}
