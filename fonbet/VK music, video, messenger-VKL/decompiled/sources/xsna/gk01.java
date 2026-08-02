package xsna;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.SplitInstallException;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public class gk01 extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        d401 d401Var = (d401) this;
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) xk01.a(parcel);
                xk01.b(parcel);
                d401Var.Z(readInt, bundle);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                xk01.b(parcel);
                t201 t201Var = (t201) d401Var;
                t201Var.b.b.c(t201Var.a);
                x201.c.d("onCompleteInstall(%d)", Integer.valueOf(readInt2));
                return true;
            case 4:
                int readInt3 = parcel.readInt();
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) xk01.a(parcel);
                xk01.b(parcel);
                d401Var.B(readInt3, bundle2);
                return true;
            case 5:
                int readInt4 = parcel.readInt();
                Parcelable.Creator creator4 = Bundle.CREATOR;
                xk01.b(parcel);
                t201 t201Var2 = (t201) d401Var;
                t201Var2.b.b.c(t201Var2.a);
                x201.c.d("onGetSession(%d)", Integer.valueOf(readInt4));
                return true;
            case 6:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) xk01.a(parcel);
                xk01.b(parcel);
                t201 t201Var3 = (t201) d401Var;
                uvz0 uvz0Var = t201Var3.b.b;
                TaskCompletionSource taskCompletionSource = t201Var3.a;
                uvz0Var.c(taskCompletionSource);
                int i3 = bundle3.getInt("error_code");
                x201.c.b("onError(%d)", Integer.valueOf(i3));
                taskCompletionSource.trySetException(new SplitInstallException(i3));
                return true;
            case 7:
                parcel.createTypedArrayList(Bundle.CREATOR);
                xk01.b(parcel);
                t201 t201Var4 = (t201) d401Var;
                t201Var4.b.b.c(t201Var4.a);
                x201.c.d("onGetSessionStates", new Object[0]);
                return true;
            case 8:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                xk01.b(parcel);
                t201 t201Var5 = (t201) d401Var;
                t201Var5.b.b.c(t201Var5.a);
                x201.c.d("onDeferredUninstall", new Object[0]);
                return true;
            case 9:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                xk01.b(parcel);
                t201 t201Var6 = (t201) d401Var;
                t201Var6.b.b.c(t201Var6.a);
                x201.c.d("onDeferredInstall", new Object[0]);
                return true;
            case 10:
                Parcelable.Creator creator8 = Bundle.CREATOR;
                xk01.b(parcel);
                t201 t201Var7 = (t201) d401Var;
                t201Var7.b.b.c(t201Var7.a);
                x201.c.d("onGetSplitsForAppUpdate", new Object[0]);
                return true;
            case 11:
                Parcelable.Creator creator9 = Bundle.CREATOR;
                xk01.b(parcel);
                t201 t201Var8 = (t201) d401Var;
                t201Var8.b.b.c(t201Var8.a);
                x201.c.d("onCompleteInstallForAppUpdate", new Object[0]);
                return true;
            case 12:
                Parcelable.Creator creator10 = Bundle.CREATOR;
                xk01.b(parcel);
                t201 t201Var9 = (t201) d401Var;
                t201Var9.b.b.c(t201Var9.a);
                x201.c.d("onDeferredLanguageInstall", new Object[0]);
                return true;
            case 13:
                Parcelable.Creator creator11 = Bundle.CREATOR;
                xk01.b(parcel);
                t201 t201Var10 = (t201) d401Var;
                t201Var10.b.b.c(t201Var10.a);
                x201.c.d("onDeferredLanguageUninstall", new Object[0]);
                return true;
            default:
                return false;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
