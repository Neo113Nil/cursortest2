package xsna;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import xsna.esu;
import xsna.rwx;
import xsna.tey0;
import xsna.v5y0;

/* loaded from: classes9.dex */
public interface brk extends IInterface {

    public static abstract class a extends Binder implements brk {

        /* renamed from: xsna.brk$a$a, reason: collision with other inner class name */
        public static class C2620a implements brk {
            public final IBinder a;

            public C2620a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // xsna.brk
            public final void e0(String str, tey0.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.provider.appupdate.AppUpdateProvider");
                    obtain.writeString(str);
                    obtain.writeStrongInterface(aVar);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // xsna.brk
            public final void g0(String str, Bundle bundle, rwx.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.provider.appupdate.AppUpdateProvider");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongInterface(aVar);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // xsna.brk
            public final void k1(String str, esu.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.provider.appupdate.AppUpdateProvider");
                    obtain.writeString(str);
                    obtain.writeStrongInterface(aVar);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // xsna.brk
            public final void n0(String str, v5y0.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.provider.appupdate.AppUpdateProvider");
                    obtain.writeString(str);
                    obtain.writeStrongInterface(aVar);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static brk f(IBinder iBinder) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.appupdate.AppUpdateProvider");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof brk)) ? new C2620a(iBinder) : (brk) queryLocalInterface;
        }
    }

    void e0(String str, tey0.a aVar);

    void g0(String str, Bundle bundle, rwx.a aVar);

    void k1(String str, esu.a aVar);

    void n0(String str, v5y0.a aVar);
}
