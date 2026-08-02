package yads;

import kotlin.collections.EmptyList;
import kotlin.coroutines.d;
import xsna.bdn;
import xsna.hua;
import xsna.ie00;
import xsna.ksr;
import xsna.myc0;
import xsna.nm8;
import xsna.qta;
import xsna.rsr;
import xsna.s3q0;
import xsna.ttk0;
import xsna.utk0;
import xsna.vhn0;
import xsna.vtk0;
import xsna.w0b;
import xsna.whn0;
import xsna.xh50;
import xsna.yvj;
import xsna.zvj;

/* loaded from: classes10.dex */
public final class nc1 {
    public final yvj a;
    public final jz0 b;
    public final f63 c;
    public final iz0 d;
    public final gz0 e;
    public final ez0 f;
    public final lz0 g;
    public final x70 h;
    public final qb i;
    public final nb j;
    public final kb k;
    public final ms1 l;
    public final xh50 m;
    public final ttk0 n;
    public final qta o;
    public final ksr p;

    public nc1(jz0 jz0Var, f63 f63Var, iz0 iz0Var, gz0 gz0Var, ez0 ez0Var, lz0 lz0Var, x70 x70Var, qb qbVar, nb nbVar, kb kbVar, ms1 ms1Var) {
        x10 x10Var = new x10();
        vhn0 a = whn0.a();
        bdn bdnVar = bdn.a;
        this.a = zvj.a(d.a.a(a, ie00.a.U()).plus(x10Var));
        this.b = jz0Var;
        this.c = f63Var;
        this.d = iz0Var;
        this.e = gz0Var;
        this.f = ez0Var;
        this.g = lz0Var;
        this.h = x70Var;
        this.i = qbVar;
        this.j = nbVar;
        this.k = kbVar;
        this.l = ms1Var;
        utk0 a2 = vtk0.a(new p90(null, q70.b, false, EmptyList.b));
        this.m = a2;
        this.n = rsr.f(a2);
        nm8 a3 = w0b.a(0, null, null, 7);
        this.o = a3;
        this.p = new hua(a3, false);
    }

    public final void a(g90 g90Var) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        if (g90Var instanceof y80) {
            myc0.h(this.a, null, null, new mc1(this, false, null), 3);
            return;
        }
        if (g90Var instanceof e90) {
            myc0.h(this.a, null, null, new kc1(this, null), 3);
            return;
        }
        if (g90Var instanceof c90) {
            f63 f63Var = this.c;
            boolean z = !f63Var.a.a.a().e.a;
            hx2 hx2Var = f63Var.a.a.e.a;
            hx2Var.getClass();
            synchronized (hx2.j) {
                hx2Var.d = z;
                hx2Var.e = z;
                hx2Var.f = z;
                s3q0 s3q0Var = s3q0.a;
            }
            myc0.h(this.a, null, null, new mc1(this, false, null), 3);
            return;
        }
        if (g90Var instanceof b90) {
            p90 p90Var = ((p90) this.m.getValue()).a;
            if (p90Var == null) {
                myc0.h(this.a, null, null, new jc1(this, h90.a, null), 3);
                return;
            }
            p90 a = p90.a(p90Var, null, null, false, null, 11);
            xh50 xh50Var = this.m;
            do {
                value4 = xh50Var.getValue();
            } while (!xh50Var.compareAndSet(value4, a));
            return;
        }
        if (g90Var instanceof a90) {
            p70 p70Var = p70.b;
            p90 p90Var2 = (p90) this.m.getValue();
            p90 a2 = p90.a(p90Var2, p90Var2, p70Var, false, null, 12);
            xh50 xh50Var2 = this.m;
            do {
                value3 = xh50Var2.getValue();
            } while (!xh50Var2.compareAndSet(value3, a2));
            myc0.h(this.a, null, null, new mc1(this, false, null), 3);
            return;
        }
        if (g90Var instanceof z80) {
            n70 n70Var = new n70(((z80) g90Var).a);
            p90 p90Var3 = (p90) this.m.getValue();
            p90 a3 = p90.a(p90Var3, p90Var3, n70Var, false, null, 12);
            xh50 xh50Var3 = this.m;
            do {
                value2 = xh50Var3.getValue();
            } while (!xh50Var3.compareAndSet(value2, a3));
            myc0.h(this.a, null, null, new mc1(this, false, null), 3);
            return;
        }
        if (!(g90Var instanceof d90)) {
            if (g90Var instanceof f90) {
                myc0.h(this.a, null, null, new lc1(this, ((f90) g90Var).a, null), 3);
                return;
            }
            return;
        }
        s70 s70Var = ((p90) this.m.getValue()).b;
        y90 y90Var = ((d90) g90Var).a;
        s70 o70Var = s70Var instanceof n70 ? new o70(y90Var) : new r70(y90Var.a);
        p90 p90Var4 = (p90) this.m.getValue();
        p90 a4 = p90.a(p90Var4, p90Var4, o70Var, false, null, 12);
        xh50 xh50Var4 = this.m;
        do {
            value = xh50Var4.getValue();
        } while (!xh50Var4.compareAndSet(value, a4));
        myc0.h(this.a, null, null, new mc1(this, false, null), 3);
    }
}
