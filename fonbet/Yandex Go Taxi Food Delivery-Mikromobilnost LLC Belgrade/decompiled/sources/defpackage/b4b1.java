package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.zzgb;

/* loaded from: classes11.dex */
public final /* synthetic */ class b4b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j5b1 b;

    public /* synthetic */ b4b1(j5b1 j5b1Var, int i) {
        this.a = i;
        this.b = j5b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        j5b1 j5b1Var = this.b;
        switch (i) {
            case 0:
                j5b1Var.Mg();
                break;
            case 1:
                g gVar = (g) j5b1Var.b;
                zzgb zzgbVar = j5b1Var.x;
                if (zzgbVar == null) {
                    y1a1 y1a1Var = gVar.y;
                    g.g(y1a1Var);
                    y1a1Var.z.a("Failed to send Dma consent settings to service");
                    break;
                } else {
                    try {
                        zzgbVar.zzz(j5b1Var.Wg(false));
                        j5b1Var.Tg();
                        break;
                    } catch (RemoteException e) {
                        y1a1 y1a1Var2 = gVar.y;
                        g.g(y1a1Var2);
                        y1a1Var2.z.b(e, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
            default:
                g gVar2 = (g) j5b1Var.b;
                zzgb zzgbVar2 = j5b1Var.x;
                if (zzgbVar2 == null) {
                    y1a1 y1a1Var3 = gVar2.y;
                    g.g(y1a1Var3);
                    y1a1Var3.z.a("Failed to send storage consent settings to service");
                    break;
                } else {
                    try {
                        zzgbVar2.zzy(j5b1Var.Wg(false));
                        j5b1Var.Tg();
                        break;
                    } catch (RemoteException e2) {
                        y1a1 y1a1Var4 = gVar2.y;
                        g.g(y1a1Var4);
                        y1a1Var4.z.b(e2, "Failed to send storage consent settings to the service");
                    }
                }
        }
    }
}
