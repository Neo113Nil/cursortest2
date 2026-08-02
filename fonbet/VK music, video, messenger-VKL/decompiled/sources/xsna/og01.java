package xsna;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class og01 implements Runnable {
    public final /* synthetic */ com.google.android.gms.measurement.internal.zzq b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ yh01 d;

    public og01(yh01 yh01Var, com.google.android.gms.measurement.internal.zzq zzqVar, Bundle bundle) {
        this.d = yh01Var;
        this.b = zzqVar;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzq zzqVar = this.b;
        yh01 yh01Var = this.d;
        v701 v701Var = yh01Var.g;
        mb01 mb01Var = (mb01) yh01Var.b;
        if (v701Var == null) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.i.a("Failed to send default event parameters to service");
        } else {
            try {
                v701Var.x(this.c, zzqVar);
            } catch (RemoteException e) {
                k901 k901Var2 = mb01Var.j;
                mb01.k(k901Var2);
                k901Var2.i.b(e, "Failed to send default event parameters to service");
            }
        }
    }
}
