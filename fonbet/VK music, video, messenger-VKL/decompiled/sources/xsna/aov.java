package xsna;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.health.platform.client.error.ErrorStatus;
import androidx.health.platform.client.response.ReadDataRangeResponse;

/* compiled from: IReadDataRangeCallback.java */
/* loaded from: classes12.dex */
public abstract class aov extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.health.platform.client.service.IReadDataRangeCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.health.platform.client.service.IReadDataRangeCallback");
            return true;
        }
        if (i == 1) {
            ((d7f0) this).a.k(((ReadDataRangeResponse) (parcel.readInt() != 0 ? ReadDataRangeResponse.CREATOR.createFromParcel(parcel) : null)).c);
            return true;
        }
        if (i != 2) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        ((d7f0) this).a.l(xwp.a((ErrorStatus) (parcel.readInt() != 0 ? ErrorStatus.CREATOR.createFromParcel(parcel) : null)));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
