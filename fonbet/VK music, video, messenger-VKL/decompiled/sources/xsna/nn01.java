package xsna;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
/* loaded from: classes13.dex */
public final class nn01 implements hd01 {
    public final zzci a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public nn01(AppMeasurementDynamiteService appMeasurementDynamiteService, zzci zzciVar) {
        this.b = appMeasurementDynamiteService;
        this.a = zzciVar;
    }

    @Override // xsna.hd01
    public final void a(String str, String str2, Bundle bundle, long j) {
        try {
            this.a.zze(str, str2, bundle, j);
        } catch (RemoteException e) {
            mb01 mb01Var = this.b.a;
            if (mb01Var != null) {
                k901 k901Var = mb01Var.j;
                mb01.k(k901Var);
                k901Var.l.b(e, "Event listener threw exception");
            }
        }
    }
}
