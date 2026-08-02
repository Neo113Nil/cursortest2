package com.monetization.ads.core.identifiers.ad.huawei;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\nR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078fX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/monetization/ads/core/identifiers/ad/huawei/OpenDeviceIdentifierService;", "Landroid/os/IInterface;", CommonUrlParts.HUAWEI_OAID, "", "getOaid", "()Ljava/lang/String;", "oaidTrackLimited", "", "getOaidTrackLimited", "()Z", "Stub", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface OpenDeviceIdentifierService extends IInterface {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/monetization/ads/core/identifiers/ad/huawei/OpenDeviceIdentifierService$Stub;", "Landroid/os/Binder;", "Lcom/monetization/ads/core/identifiers/ad/huawei/OpenDeviceIdentifierService;", "<init>", "()V", "Landroid/os/IBinder;", "asBinder", "()Landroid/os/IBinder;", "Proxy", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Stub extends Binder implements OpenDeviceIdentifierService {
        public static final /* synthetic */ int a = 0;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/monetization/ads/core/identifiers/ad/huawei/OpenDeviceIdentifierService$Stub$Proxy;", "Lcom/monetization/ads/core/identifiers/ad/huawei/OpenDeviceIdentifierService;", "Landroid/os/IBinder;", "remote", "<init>", "(Landroid/os/IBinder;)V", "asBinder", "()Landroid/os/IBinder;", "", "getOaid", "()Ljava/lang/String;", CommonUrlParts.HUAWEI_OAID, "", "getOaidTrackLimited", "()Z", "oaidTrackLimited", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Proxy implements OpenDeviceIdentifierService {
            public final IBinder a;

            public Proxy(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService
            public String getOaid() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService
            public boolean getOaidTrackLimited() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService
        public abstract /* synthetic */ String getOaid() throws RemoteException;

        @Override // com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService
        public abstract /* synthetic */ boolean getOaidTrackLimited() throws RemoteException;

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                String oaid = getOaid();
                if (parcel2 != null) {
                    parcel2.writeNoException();
                }
                if (parcel2 != null) {
                    parcel2.writeString(oaid);
                }
            } else if (i == 2) {
                parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                boolean oaidTrackLimited = getOaidTrackLimited();
                if (parcel2 != null) {
                    parcel2.writeNoException();
                }
                if (parcel2 != null) {
                    parcel2.writeInt(oaidTrackLimited ? 1 : 0);
                }
            } else {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                if (parcel2 != null) {
                    parcel2.writeString("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                }
            }
            return true;
        }
    }

    String getOaid() throws RemoteException;

    boolean getOaidTrackLimited() throws RemoteException;
}
