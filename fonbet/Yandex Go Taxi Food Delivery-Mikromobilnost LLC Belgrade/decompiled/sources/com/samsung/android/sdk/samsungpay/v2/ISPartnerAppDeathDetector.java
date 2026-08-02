package com.samsung.android.sdk.samsungpay.v2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes11.dex */
public interface ISPartnerAppDeathDetector extends IInterface {

    public static class Default implements ISPartnerAppDeathDetector {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements ISPartnerAppDeathDetector {
        private static final String DESCRIPTOR = "com.samsung.android.sdk.samsungpay.v2.ISPartnerAppDeathDetector";

        public static class Proxy implements ISPartnerAppDeathDetector {
            public static ISPartnerAppDeathDetector sDefaultImpl;
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
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ISPartnerAppDeathDetector asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ISPartnerAppDeathDetector)) ? new Proxy(iBinder) : (ISPartnerAppDeathDetector) queryLocalInterface;
        }

        public static ISPartnerAppDeathDetector getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(ISPartnerAppDeathDetector iSPartnerAppDeathDetector) {
            if (Proxy.sDefaultImpl != null || iSPartnerAppDeathDetector == null) {
                return false;
            }
            Proxy.sDefaultImpl = iSPartnerAppDeathDetector;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(DESCRIPTOR);
            return true;
        }
    }
}
