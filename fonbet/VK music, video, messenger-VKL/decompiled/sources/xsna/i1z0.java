package xsna;

import android.os.RemoteException;
import java.util.concurrent.Callable;

/* loaded from: classes13.dex */
public final class i1z0 implements Runnable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public i1z0(g5o0 g5o0Var, Callable callable) {
        this.c = g5o0Var;
        this.d = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                g5o0 g5o0Var = (g5o0) this.c;
                try {
                    g5o0Var.b(((Callable) this.d).call());
                    break;
                } catch (Exception e) {
                    g5o0Var.a(e);
                    return;
                }
            default:
                com.google.android.gms.measurement.internal.zzq zzqVar = (com.google.android.gms.measurement.internal.zzq) this.c;
                yh01 yh01Var = (yh01) this.d;
                mb01 mb01Var = (mb01) yh01Var.b;
                v701 v701Var = yh01Var.g;
                if (v701Var == null) {
                    k901 k901Var = mb01Var.j;
                    mb01.k(k901Var);
                    k901Var.i.a("Failed to send measurementEnabled to service");
                    break;
                } else {
                    try {
                        v701Var.M0(zzqVar);
                        yh01Var.v();
                        break;
                    } catch (RemoteException e2) {
                        k901 k901Var2 = mb01Var.j;
                        mb01.k(k901Var2);
                        k901Var2.i.b(e2, "Failed to send measurementEnabled to the service");
                    }
                }
        }
    }

    public i1z0(yh01 yh01Var, com.google.android.gms.measurement.internal.zzq zzqVar) {
        this.d = yh01Var;
        this.c = zzqVar;
    }
}
