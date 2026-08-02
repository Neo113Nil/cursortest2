package xsna;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import xsna.fy1;

/* compiled from: AnalyticsProvider.java */
/* loaded from: classes9.dex */
public interface dy1 extends IInterface {

    /* compiled from: AnalyticsProvider.java */
    public static abstract class a extends Binder implements dy1 {
        public static final /* synthetic */ int a = 0;

        /* compiled from: AnalyticsProvider.java */
        /* renamed from: xsna.dy1$a$a, reason: collision with other inner class name */
        public static class C2769a implements dy1 {
            public IBinder a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // xsna.dy1
            public final void d1(String str, String str2, Bundle bundle, fy1.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.provider.analytics.AnalyticsProvider");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
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

    void d1(String str, String str2, Bundle bundle, fy1.a aVar) throws RemoteException;
}
