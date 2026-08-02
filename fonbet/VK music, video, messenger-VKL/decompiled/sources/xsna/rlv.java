package xsna;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ru.rustore.sdk.appupdate.errors.RemoteProviderErrors;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xsna.rwx;

/* loaded from: classes9.dex */
public abstract class rlv extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("ru.vk.store.provider.appupdate.GetAppUpdateInfoCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("ru.vk.store.provider.appupdate.GetAppUpdateInfoCallback");
            return true;
        }
        if (i == 1) {
            Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
            rwx.a aVar = (rwx.a) this;
            rwx rwxVar = rwx.this;
            pzy0 pzy0Var = rwxVar.c;
            AppUpdateInfo.Factory factory = pzy0Var.a;
            long j = bundle.getLong("APPLICATION_ID", 0L);
            String string = bundle.getString("APP_NAME");
            if (string == null) {
                string = "";
            }
            String string2 = bundle.getString("ICON_URL");
            if (string2 == null) {
                string2 = "";
            }
            long j2 = bundle.getLong("FILE_SIZE", 0L);
            String string3 = bundle.getString("PACKAGE_NAME");
            if (string3 == null) {
                string3 = "";
            }
            String string4 = bundle.getString("AVAILABLE_VERSION_NAME");
            if (string4 == null) {
                string4 = "";
            }
            long j3 = bundle.getLong("AVAILABLE_VERSION_CODE_LONG", bundle.getInt("AVAILABLE_VERSION_CODE"));
            int i3 = bundle.getInt("INSTALL_STATUS", 0);
            int i4 = bundle.getInt("UPDATE_AVAILABILITY", 0);
            String str = string;
            int h = swe0.h(bundle.getInt("UPDATE_PRIORITY", 0), new k9x(0, 5, 1));
            String string5 = bundle.getString("UPDATED_AT", pzy0Var.b.a.getTime().toString());
            String string6 = bundle.getString("whatsNew");
            rwxVar.f.invoke(factory.create$sdk_public_appupdate_release(j, str, string2, j2, string3, string4, j3, i3, i4, h, string5, string6 == null ? "" : string6));
            inj.b(rwxVar.b, aVar.b);
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            rwx.a aVar2 = (rwx.a) this;
            rwx rwxVar2 = rwx.this;
            rwxVar2.g.invoke(RemoteProviderErrors.INSTANCE.toRuStoreException(readInt, readString));
            inj.b(rwxVar2.b, aVar2.b);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
