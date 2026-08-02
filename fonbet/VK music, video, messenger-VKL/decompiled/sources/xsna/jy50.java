package xsna;

import java.util.LinkedHashSet;
import xsna.qy50;

/* compiled from: NavigationEventDispatcher.kt */
/* loaded from: classes.dex */
public final class jy50 {
    public final d45 a;
    public final py50 b = new py50();
    public final LinkedHashSet c;
    public final LinkedHashSet d;

    public jy50(d45 d45Var) {
        this.a = d45Var;
        new LinkedHashSet();
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
    }

    public static void a(jy50 jy50Var, ly50 ly50Var) {
        jy50Var.getClass();
        if (jy50Var.c.add(ly50Var)) {
            py50 py50Var = jy50Var.b;
            py50Var.getClass();
            if (ly50Var.e == null) {
                py50Var.e.addFirst(ly50Var);
                ly50Var.e = jy50Var;
                py50Var.b();
            } else {
                throw new IllegalArgumentException(("Handler '" + ly50Var + "' is already registered with a dispatcher").toString());
            }
        }
    }

    public final void b(oy50 oy50Var) {
        if (this.d.add(oy50Var)) {
            this.b.a(this, oy50Var, -1);
        }
    }

    public final void c(k180 k180Var, int i) {
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException(lhg.a(i, "Unsupported priority value: ").toString());
        }
        if (this.d.add(k180Var)) {
            this.b.a(this, k180Var, i);
        }
    }

    public final void d(oy50 oy50Var, hy50 hy50Var) {
        py50 py50Var = this.b;
        if (py50Var.g != 0) {
            return;
        }
        ly50<?> c = py50Var.c(-1);
        py50Var.f = c;
        py50Var.g = -1;
        py50Var.h = oy50Var;
        if (hy50Var != null) {
            if (c != null) {
                new qy50.b(hy50Var, -1);
                c.d(hy50Var);
            }
            utk0 utk0Var = py50Var.a;
            qy50.b bVar = new qy50.b(hy50Var, -1);
            utk0Var.getClass();
            utk0Var.i(null, bVar);
        }
    }
}
