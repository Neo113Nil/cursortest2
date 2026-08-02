package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes10.dex */
public interface IResultReceiver2 extends IInterface {
    public static final String DESCRIPTOR = "android$support$v4$os$IResultReceiver2".replace('$', '.');

    public static class Default implements IResultReceiver2 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.os.IResultReceiver2
        public void send(int i, Bundle bundle) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IResultReceiver2 {
        static final int TRANSACTION_send = 1;

        public static class Proxy implements IResultReceiver2 {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IResultReceiver2.DESCRIPTOR;
            }

            @Override // android.support.v4.os.IResultReceiver2
            public void send(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IResultReceiver2.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IResultReceiver2.DESCRIPTOR);
        }

        public static IResultReceiver2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IResultReceiver2.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IResultReceiver2)) ? new Proxy(iBinder) : (IResultReceiver2) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = IResultReceiver2.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            send(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            return true;
        }

        @Override // android.support.v4.os.IResultReceiver2
        public abstract /* synthetic */ void send(int i, Bundle bundle) throws RemoteException;
    }

    void send(int i, Bundle bundle) throws RemoteException;
}
