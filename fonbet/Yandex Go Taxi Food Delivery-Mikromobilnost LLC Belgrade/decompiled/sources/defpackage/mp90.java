package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.auth.passport.b;

/* loaded from: classes15.dex */
public final class mp90 implements x08, pp90 {
    public vwc A;
    public final /* synthetic */ w040 B;
    public final Handler a;
    public final Handler b;
    public final cn3 c;
    public final wl3 w;
    public kp90 x;
    public x08 y;
    public vwc z;

    public mp90(w040 w040Var, wl3 wl3Var, cn3 cn3Var, kp90 kp90Var) {
        this.B = w040Var;
        Handler handler = new Handler((Looper) w040Var.a);
        this.a = handler;
        this.b = new Handler();
        this.c = cn3Var;
        tje.e();
        this.w = wl3Var;
        this.x = kp90Var;
        handler.post(new lp90(this, 1));
    }

    public static void b(mp90 mp90Var, String str) {
        x08 ap90Var;
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
            qp90Var.b("refreshToken");
            ap90Var = wfz.z;
        } else {
            ap90Var = new ap90(bVar, qti0Var, qp90Var.c, new p370(18, str, wl3Var, mp90Var));
        }
        mp90Var.y = ap90Var;
    }

    @Override // defpackage.pp90
    public final void a(op90 op90Var, boolean z) {
        z83.g(null, this.a.getLooper(), Looper.myLooper());
        z83.d(this.y, null);
        z83.f(this.z, null);
        this.y = null;
        this.z = ((xwc) ((h3y) this.B.d).get()).a(new qo3(this, this.c.h(op90Var.a, this.w.a), op90Var, z));
    }

    @Override // defpackage.x08
    public final void cancel() {
        tje.e();
        this.x = null;
        this.a.post(new lp90(this, 0));
    }
}
