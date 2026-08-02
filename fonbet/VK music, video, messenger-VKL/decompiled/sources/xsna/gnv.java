package xsna;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.health.platform.client.request.AggregateDataRequest;
import androidx.health.platform.client.request.ReadDataRangeRequest;
import androidx.health.platform.client.request.RequestContext;
import java.util.List;

/* compiled from: IHealthDataService.java */
/* loaded from: classes12.dex */
public interface gnv extends IInterface {

    /* compiled from: IHealthDataService.java */
    public static abstract class a extends Binder implements gnv {
        public static final /* synthetic */ int a = 0;

        /* compiled from: IHealthDataService.java */
        /* renamed from: xsna.gnv$a$a, reason: collision with other inner class name */
        public static class C2951a implements gnv {
            public IBinder a;

            @Override // xsna.gnv
            public final void E(RequestContext requestContext, ReadDataRangeRequest readDataRangeRequest, d7f0 d7f0Var) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.a(obtain, requestContext);
                    b.a(obtain, readDataRangeRequest);
                    obtain.writeStrongInterface(d7f0Var);
                    this.a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // xsna.gnv
            public final int d() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // xsna.gnv
            public final void j0(RequestContext requestContext, AggregateDataRequest aggregateDataRequest, n71 n71Var) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.a(obtain, requestContext);
                    b.a(obtain, aggregateDataRequest);
                    obtain.writeStrongInterface(n71Var);
                    this.a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // xsna.gnv
            public final void s(RequestContext requestContext, List list, rcr rcrVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.health.platform.client.service.IHealthDataService");
                    b.a(obtain, requestContext);
                    if (list == null) {
                        obtain.writeInt(-1);
                    } else {
                        int size = list.size();
                        obtain.writeInt(size);
                        for (int i = 0; i < size; i++) {
                            b.a(obtain, (Parcelable) list.get(i));
                        }
                    }
                    obtain.writeStrongInterface(rcrVar);
                    this.a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    /* compiled from: IHealthDataService.java */
    public static class b {
        public static void a(Parcel parcel, Parcelable parcelable) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, 0);
            }
        }
    }

    void E(RequestContext requestContext, ReadDataRangeRequest readDataRangeRequest, d7f0 d7f0Var) throws RemoteException;

    int d() throws RemoteException;

    void j0(RequestContext requestContext, AggregateDataRequest aggregateDataRequest, n71 n71Var) throws RemoteException;

    void s(RequestContext requestContext, List list, rcr rcrVar) throws RemoteException;
}
