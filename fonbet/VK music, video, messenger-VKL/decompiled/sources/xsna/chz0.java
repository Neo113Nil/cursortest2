package xsna;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import xsna.nsy0;
import xsna.v8y0;

/* loaded from: classes9.dex */
public interface chz0 extends IInterface {

    public static abstract class a extends Binder implements chz0 {
        public static final /* synthetic */ int a = 0;

        /* renamed from: xsna.chz0$a$a, reason: collision with other inner class name */
        public static class C2665a implements chz0 {
            public final IBinder a;

            public C2665a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // xsna.chz0
            public final void h1(Bundle bundle, String str, v8y0.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.provider.review.ReviewProvider");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStrongInterface(aVar);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // xsna.chz0
            public final void m0(String str, nsy0.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.provider.review.ReviewProvider");
                    obtain.writeString(str);
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

    void h1(Bundle bundle, String str, v8y0.a aVar);

    void m0(String str, nsy0.a aVar);
}
