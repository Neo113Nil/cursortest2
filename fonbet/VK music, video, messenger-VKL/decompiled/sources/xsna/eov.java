package xsna;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: ISearchActionVerificationService.java */
/* loaded from: classes13.dex */
public interface eov extends IInterface {

    /* compiled from: ISearchActionVerificationService.java */
    public static abstract class a extends so6 implements eov {
        public static final /* synthetic */ int a = 0;

        /* compiled from: ISearchActionVerificationService.java */
        /* renamed from: xsna.eov$a$a, reason: collision with other inner class name */
        public static class C2829a extends ul6 implements eov {
            @Override // xsna.eov
            public final boolean G(Intent intent, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
                int i = vzf.a;
                if (intent == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(1);
                    intent.writeToParcel(obtain, 0);
                }
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
                Parcel f = f(1, obtain);
                boolean z = f.readInt() != 0;
                f.recycle();
                return z;
            }

            @Override // xsna.eov
            public final int getVersion() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.search.verification.api.ISearchActionVerificationService");
                Parcel f = f(2, obtain);
                int readInt = f.readInt();
                f.recycle();
                return readInt;
            }
        }
    }

    boolean G(Intent intent, Bundle bundle) throws RemoteException;

    int getVersion() throws RemoteException;
}
