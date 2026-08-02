package xsna;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.TelemetryData;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class xoz0 extends com.google.android.gms.internal.base.zaa {
    public xoz0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void f(TelemetryData telemetryData) throws RemoteException {
        Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zab(zaa, telemetryData);
        zad(1, zaa);
    }
}
