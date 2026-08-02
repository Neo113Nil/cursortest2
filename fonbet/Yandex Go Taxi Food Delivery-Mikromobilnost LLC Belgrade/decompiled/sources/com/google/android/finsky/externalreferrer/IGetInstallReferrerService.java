package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.a.a;
import com.google.android.a.b;
import defpackage.wo61;

/* loaded from: classes.dex */
public interface IGetInstallReferrerService extends IInterface {

    /* loaded from: classes10.dex */
    public static abstract class Stub extends b implements IGetInstallReferrerService {

        public static class Proxy extends a implements IGetInstallReferrerService {
            public Proxy(IBinder iBinder) {
                super(iBinder);
            }

            @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
            public final Bundle c(Bundle bundle) throws RemoteException {
                Parcel a = a();
                int i = wo61.a;
                a.writeInt(1);
                bundle.writeToParcel(a, 0);
                Parcel b = b(a);
                Bundle bundle2 = (Bundle) (b.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(b));
                b.recycle();
                return bundle2;
            }
        }

        public static IGetInstallReferrerService b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return queryLocalInterface instanceof IGetInstallReferrerService ? (IGetInstallReferrerService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.a.b
        public final boolean a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            int i2 = wo61.a;
            Bundle c = c((Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel)));
            parcel2.writeNoException();
            if (c == null) {
                parcel2.writeInt(0);
                return true;
            }
            parcel2.writeInt(1);
            c.writeToParcel(parcel2, 1);
            return true;
        }

        @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
        public abstract /* synthetic */ Bundle c(Bundle bundle) throws RemoteException;
    }

    Bundle c(Bundle bundle) throws RemoteException;
}
