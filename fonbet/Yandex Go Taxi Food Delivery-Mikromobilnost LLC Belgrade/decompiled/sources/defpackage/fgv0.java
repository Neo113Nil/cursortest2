package defpackage;

import java.util.HashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class fgv0 {
    public final kgl0 a;
    public final vfv0 b;
    public volatile boolean c;
    public final r0 d;
    public final r0 e;

    public fgv0(kgl0 kgl0Var, vfv0 vfv0Var) {
        this.a = kgl0Var;
        this.b = vfv0Var;
        r0 c = bvf0.c(bgv0.a);
        this.d = c;
        this.e = c;
    }

    public final void a() {
        boolean isEnabled = this.b.a.isEnabled();
        bgv0 bgv0Var = bgv0.a;
        r0 r0Var = this.d;
        if (!isEnabled || jl40.l(r0Var.getValue(), zfv0.a)) {
            r0Var.k(cgv0.a, bgv0Var);
        } else {
            r0Var.getClass();
            r0Var.m(null, bgv0Var);
        }
    }

    public final void b() {
        vfv0 vfv0Var = this.b;
        if (vfv0Var.a.isEnabled()) {
            kgl0 kgl0Var = this.a;
            kgl0Var.getClass();
            kgl0Var.a.a("Routes.FocusPointB.Shown", new HashMap(), 1, new HashMap());
            agv0 agv0Var = new agv0(d6z.Y(vfv0Var.b(), vfv0Var.b().e), ((m7x0) vfv0Var.b).a(vfv0Var.b().g));
            r0 r0Var = this.d;
            r0Var.getClass();
            r0Var.m(null, agv0Var);
        }
    }

    public final void c() {
        vfv0 vfv0Var = this.b;
        if (vfv0Var.a.isEnabled()) {
            kgl0 kgl0Var = this.a;
            kgl0Var.getClass();
            kgl0Var.a.a("Routes.FocusPointA.Shown", new HashMap(), 1, new HashMap());
            dgv0 dgv0Var = new dgv0(d6z.Y(vfv0Var.b(), vfv0Var.b().d), ((m7x0) vfv0Var.b).a(vfv0Var.b().f));
            r0 r0Var = this.d;
            r0Var.getClass();
            r0Var.m(null, dgv0Var);
        }
    }
}
