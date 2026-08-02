package xsna;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class ng01 implements Runnable {
    public final /* synthetic */ dg01 b;
    public final /* synthetic */ yh01 c;

    public ng01(yh01 yh01Var, dg01 dg01Var) {
        this.c = yh01Var;
        this.b = dg01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yh01 yh01Var = this.c;
        v701 v701Var = yh01Var.g;
        mb01 mb01Var = (mb01) yh01Var.b;
        if (v701Var == null) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.i.a("Failed to send current screen to service");
            return;
        }
        try {
            dg01 dg01Var = this.b;
            if (dg01Var == null) {
                v701Var.e1(0L, null, null, mb01Var.b.getPackageName());
            } else {
                v701Var.e1(dg01Var.c, dg01Var.a, dg01Var.b, mb01Var.b.getPackageName());
            }
            yh01Var.v();
        } catch (RemoteException e) {
            k901 k901Var2 = ((mb01) yh01Var.b).j;
            mb01.k(k901Var2);
            k901Var2.i.b(e, "Failed to send current screen to the service");
        }
    }
}
