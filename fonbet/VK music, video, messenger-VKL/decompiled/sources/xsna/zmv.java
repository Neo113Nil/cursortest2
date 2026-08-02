package xsna;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IGetPermissionTokenCallback.java */
/* loaded from: classes12.dex */
public final class zmv implements anv {
    public IBinder a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // xsna.anv
    public final void onSuccess(String str) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.health.platform.client.impl.sdkservice.IGetPermissionTokenCallback");
            obtain.writeString(str);
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
