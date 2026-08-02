package xsna;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import ru.rustore.sdk.core.exception.RuStoreException;

/* compiled from: AnalyticsProviderCallback.java */
/* loaded from: classes9.dex */
public abstract class ey1 extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("ru.vk.store.provider.analytics.AnalyticsProviderCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("ru.vk.store.provider.analytics.AnalyticsProviderCallback");
            return true;
        }
        if (i == 1) {
            fy1.this.e.invoke();
            parcel2.writeNoException();
            return true;
        }
        if (i != 2) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.readInt();
        String readString = parcel.readString();
        wx1 wx1Var = fy1.this.f;
        if (readString == null) {
            readString = "";
        }
        wx1Var.invoke(new RuStoreException(readString));
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
