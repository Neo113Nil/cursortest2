package xsna;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.health.platform.client.error.ErrorStatus;
import androidx.health.platform.client.permission.Permission;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: IFilterGrantedPermissionsCallback.java */
/* loaded from: classes12.dex */
public abstract class vmv extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.health.platform.client.service.IFilterGrantedPermissionsCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.health.platform.client.service.IFilterGrantedPermissionsCallback");
            return true;
        }
        if (i != 1) {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            ((rcr) this).a.l(xwp.a(parcel.readInt() != 0 ? ErrorStatus.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(Permission.CREATOR);
        rcr rcrVar = (rcr) this;
        ArrayList arrayList = new ArrayList(c5g.u(createTypedArrayList, 10));
        Iterator it = createTypedArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(((Permission) it.next()).c);
        }
        rcrVar.a.k(j5g.S0(arrayList));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
