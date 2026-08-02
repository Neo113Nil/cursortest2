package xsna;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IGetIsInForegroundCallback.java */
/* loaded from: classes12.dex */
public final class xmv implements ymv {
    public IBinder a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // xsna.ymv
    public final void c(boolean z) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.health.platform.client.impl.sdkservice.IGetIsInForegroundCallback");
            obtain.writeInt(z ? 1 : 0);
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
