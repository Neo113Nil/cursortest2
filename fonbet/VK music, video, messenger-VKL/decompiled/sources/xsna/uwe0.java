package xsna;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import xsna.nsg0;

/* compiled from: RapidTokenProvider.java */
/* loaded from: classes9.dex */
public interface uwe0 extends IInterface {

    /* compiled from: RapidTokenProvider.java */
    public static abstract class a extends Binder implements uwe0 {
        public static final /* synthetic */ int a = 0;

        /* compiled from: RapidTokenProvider.java */
        /* renamed from: xsna.uwe0$a$a, reason: collision with other inner class name */
        public static class C3840a implements uwe0 {
            public IBinder a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // xsna.uwe0
            public final void c0(nsg0.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.provider.install.rapid.RapidTokenProvider");
                    obtain.writeString("ru.oneme.app");
                    obtain.writeStrongInterface(aVar);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    void c0(nsg0.a aVar) throws RemoteException;
}
