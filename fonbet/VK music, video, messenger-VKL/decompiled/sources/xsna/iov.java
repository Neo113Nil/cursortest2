package xsna;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: ISetPermissionTokenCallback.java */
/* loaded from: classes12.dex */
public final class iov implements jov {
    public IBinder a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // xsna.jov
    public final void onSuccess() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.health.platform.client.impl.sdkservice.ISetPermissionTokenCallback");
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
