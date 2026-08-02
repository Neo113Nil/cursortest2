package yads;

import android.app.Activity;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import xsna.wq8;

/* loaded from: classes10.dex */
public final class es2 {
    public final xr2 a;
    public final wl2 b;
    public final si1 c;
    public final ni1 d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final c00 f;
    public final List g;

    public es2(xr2 xr2Var, wl2 wl2Var, si1 si1Var, ni1 ni1Var) {
        this.a = xr2Var;
        this.b = wl2Var;
        this.c = si1Var;
        this.d = ni1Var;
        this.f = xr2Var.d();
        this.g = xr2Var.e();
        xr2Var.a(wl2Var);
    }

    public final void a(Activity activity) {
        this.c.a();
        this.d.a(new wq8(11, this, activity));
    }

    public static final void a(es2 es2Var, Activity activity) {
        if (!es2Var.e.getAndSet(true)) {
            Throwable a = Result.a(es2Var.a.a(activity));
            if (a != null) {
                es2Var.b.a(new n7(String.valueOf(a.getMessage())));
                return;
            }
            return;
        }
        es2Var.b.a(o7.a);
    }
}
