package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes10.dex */
public interface ITrustedWebActivityService extends IInterface {
    public static final String DESCRIPTOR = "android$support$customtabs$trusted$ITrustedWebActivityService".replace('$', '.');

    public static class Default implements ITrustedWebActivityService {
        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle areNotificationsEnabled(Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public void cancelNotification(Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle getActiveNotifications() throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle getSmallIconBitmap() throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public int getSmallIconId() throws RemoteException {
            return 0;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public Bundle notifyNotificationWithChannel(Bundle bundle) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements ITrustedWebActivityService {
        static final int TRANSACTION_areNotificationsEnabled = 6;
        static final int TRANSACTION_cancelNotification = 3;
        static final int TRANSACTION_extraCommand = 9;
        static final int TRANSACTION_getActiveNotifications = 5;
        static final int TRANSACTION_getSmallIconBitmap = 7;
        static final int TRANSACTION_getSmallIconId = 4;
        static final int TRANSACTION_notifyNotificationWithChannel = 2;

        public static class Proxy implements ITrustedWebActivityService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public Bundle areNotificationsEnabled(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ITrustedWebActivityService.DESCRIPTOR);
                    a.b(obtain, bundle, 0);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    return (Bundle) a.a(obtain2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public void cancelNotification(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ITrustedWebActivityService.DESCRIPTOR);
                    a.b(obtain, bundle, 0);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ITrustedWebActivityService.DESCRIPTOR);
                    obtain.writeString(str);
                    a.b(obtain, bundle, 0);
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    return (Bundle) a.a(obtain2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public Bundle getActiveNotifications() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ITrustedWebActivityService.DESCRIPTOR);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    return (Bundle) a.a(obtain2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ITrustedWebActivityService.DESCRIPTOR;
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public Bundle getSmallIconBitmap() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ITrustedWebActivityService.DESCRIPTOR);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    return (Bundle) a.a(obtain2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public int getSmallIconId() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ITrustedWebActivityService.DESCRIPTOR);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public Bundle notifyNotificationWithChannel(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ITrustedWebActivityService.DESCRIPTOR);
                    a.b(obtain, bundle, 0);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    return (Bundle) a.a(obtain2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ITrustedWebActivityService.DESCRIPTOR);
        }

        public static ITrustedWebActivityService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ITrustedWebActivityService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ITrustedWebActivityService)) ? new Proxy(iBinder) : (ITrustedWebActivityService) queryLocalInterface;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public abstract /* synthetic */ Bundle areNotificationsEnabled(Bundle bundle) throws RemoteException;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public abstract /* synthetic */ void cancelNotification(Bundle bundle) throws RemoteException;

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public abstract /* synthetic */ Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) throws RemoteException;

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public abstract /* synthetic */ Bundle getActiveNotifications() throws RemoteException;

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public abstract /* synthetic */ Bundle getSmallIconBitmap() throws RemoteException;

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public abstract /* synthetic */ int getSmallIconId() throws RemoteException;

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public abstract /* synthetic */ Bundle notifyNotificationWithChannel(Bundle bundle) throws RemoteException;

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = ITrustedWebActivityService.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    Parcelable.Creator creator = Bundle.CREATOR;
                    Bundle notifyNotificationWithChannel = notifyNotificationWithChannel((Bundle) a.a(parcel));
                    parcel2.writeNoException();
                    a.b(parcel2, notifyNotificationWithChannel, 1);
                    return true;
                case 3:
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    cancelNotification((Bundle) a.a(parcel));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int smallIconId = getSmallIconId();
                    parcel2.writeNoException();
                    parcel2.writeInt(smallIconId);
                    return true;
                case 5:
                    Bundle activeNotifications = getActiveNotifications();
                    parcel2.writeNoException();
                    a.b(parcel2, activeNotifications, 1);
                    return true;
                case 6:
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    Bundle areNotificationsEnabled = areNotificationsEnabled((Bundle) a.a(parcel));
                    parcel2.writeNoException();
                    a.b(parcel2, areNotificationsEnabled, 1);
                    return true;
                case 7:
                    Bundle smallIconBitmap = getSmallIconBitmap();
                    parcel2.writeNoException();
                    a.b(parcel2, smallIconBitmap, 1);
                    return true;
                case 8:
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
                case 9:
                    String readString = parcel.readString();
                    Parcelable.Creator creator4 = Bundle.CREATOR;
                    Bundle extraCommand = extraCommand(readString, (Bundle) a.a(parcel), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    a.b(parcel2, extraCommand, 1);
                    return true;
            }
        }
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

    Bundle areNotificationsEnabled(Bundle bundle) throws RemoteException;

    void cancelNotification(Bundle bundle) throws RemoteException;

    Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) throws RemoteException;

    Bundle getActiveNotifications() throws RemoteException;

    Bundle getSmallIconBitmap() throws RemoteException;

    int getSmallIconId() throws RemoteException;

    Bundle notifyNotificationWithChannel(Bundle bundle) throws RemoteException;
}
