package xsna;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class nh01 implements Runnable {
    public final /* synthetic */ com.google.android.gms.measurement.internal.zzq b;
    public final /* synthetic */ yh01 c;

    public nh01(yh01 yh01Var, com.google.android.gms.measurement.internal.zzq zzqVar) {
        this.c = yh01Var;
        this.b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzq zzqVar = this.b;
        yh01 yh01Var = this.c;
        mb01 mb01Var = (mb01) yh01Var.b;
        v701 v701Var = yh01Var.g;
        if (v701Var == null) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.i.a("Failed to send consent settings to service");
            return;
        }
        try {
            v701Var.G0(zzqVar);
            yh01Var.v();
        } catch (RemoteException e) {
            k901 k901Var2 = mb01Var.j;
            mb01.k(k901Var2);
            k901Var2.i.b(e, "Failed to send consent settings to the service");
        }
    }
}
