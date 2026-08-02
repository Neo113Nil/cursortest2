package xsna;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: IGetInstallReferrerService.java */
/* loaded from: classes12.dex */
public interface wmv extends IInterface {

    /* compiled from: IGetInstallReferrerService.java */
    public static abstract class a extends tfy0 implements wmv {
        public static final /* synthetic */ int a = 0;

        /* compiled from: IGetInstallReferrerService.java */
        /* renamed from: xsna.wmv$a$a, reason: collision with other inner class name */
        public static class C3944a extends d9y0 implements wmv {
            @Override // xsna.wmv
            public final Bundle A0(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                int i = xiy0.a;
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
                obtain = Parcel.obtain();
                try {
                    this.a.transact(1, obtain, obtain, 0);
                    obtain.readException();
                    obtain.recycle();
                    return (Bundle) (obtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(obtain));
                } catch (RuntimeException e) {
                    throw e;
                } finally {
                    obtain.recycle();
                }
            }
        }
    }

    Bundle A0(Bundle bundle) throws RemoteException;
}
