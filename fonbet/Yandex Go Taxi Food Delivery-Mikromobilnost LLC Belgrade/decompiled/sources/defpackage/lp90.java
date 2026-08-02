package defpackage;

import android.os.Looper;
import com.yandex.messaging.auth.passport.b;

/* loaded from: classes15.dex */
public final /* synthetic */ class lp90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp90 b;

    public /* synthetic */ lp90(mp90 mp90Var, int i) {
        this.a = i;
        this.b = mp90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x08 ap90Var;
        int i = this.a;
        mp90 mp90Var = this.b;
        switch (i) {
            case 0:
                z83.g(null, mp90Var.a.getLooper(), Looper.myLooper());
                x08 x08Var = mp90Var.y;
                if (x08Var != null) {
                    x08Var.cancel();
                    mp90Var.y = null;
                }
                vwc vwcVar = mp90Var.z;
                if (vwcVar != null) {
                    vwcVar.cancel();
                    mp90Var.z = null;
                }
                vwc vwcVar2 = mp90Var.A;
                if (vwcVar2 != null) {
                    vwcVar2.cancel();
                    mp90Var.A = null;
                    break;
                }
                break;
            default:
                z83.g(null, mp90Var.a.getLooper(), Looper.myLooper());
                z83.f(mp90Var.y, null);
                z83.f(mp90Var.z, null);
                z83.f(mp90Var.A, null);
                w040 w040Var = mp90Var.B;
                qp90 qp90Var = (qp90) w040Var.b;
                wl3 wl3Var = mp90Var.w;
                qti0 qti0Var = (qti0) ((h3y) w040Var.c).get();
                b bVar = qp90Var.b;
                if (bVar == null) {
                    qp90Var.b("getToken");
                    ap90Var = wfz.z;
                } else {
                    ap90Var = new ap90(bVar, qti0Var, qp90Var.c, new at20(wl3Var, mp90Var));
                }
                mp90Var.y = ap90Var;
                break;
        }
    }
}
