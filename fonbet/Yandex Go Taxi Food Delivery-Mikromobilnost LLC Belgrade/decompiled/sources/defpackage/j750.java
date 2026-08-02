package defpackage;

import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class j750 {
    public final s59 a;
    public final boolean b;
    public final p750 c;
    public final LinkedHashSet d;
    public final LinkedHashSet e;

    public j750(s59 s59Var) {
        this.a = s59Var;
        this.b = true;
        this.c = new p750();
        new LinkedHashSet();
        this.d = new LinkedHashSet();
        this.e = new LinkedHashSet();
    }

    public static void a(j750 j750Var, l750 l750Var) {
        j750Var.getClass();
        if (j750Var.d.add(l750Var)) {
            p750 p750Var = j750Var.c;
            p750Var.getClass();
            if (l750Var.c != null) {
                yci0.x("Handler '", l750Var, "' is already registered with a dispatcher");
                return;
            }
            p750Var.e.addFirst(l750Var);
            l750Var.c = j750Var;
            p750Var.b();
        }
    }

    public final void b(o750 o750Var) {
        if (this.e.add(o750Var)) {
            this.c.a(this, o750Var, -1);
        }
    }

    public final void c(jx60 jx60Var, int i) {
        if (i != 1 && i != 0) {
            w511.f(oyr.i(i, "Unsupported priority value: "));
        } else if (this.e.add(jx60Var)) {
            this.c.a(this, jx60Var, i);
        }
    }

    public final void d(o750 o750Var, i750 i750Var) {
        if (this.b) {
            p750 p750Var = this.c;
            if (p750Var.g != 0) {
                return;
            }
            l750 c = p750Var.c(-1);
            p750Var.f = c;
            p750Var.g = -1;
            p750Var.h = o750Var;
            if (i750Var != null) {
                if (c != null) {
                    c.e(i750Var);
                }
                r0 r0Var = p750Var.a;
                r750 r750Var = new r750(i750Var);
                r0Var.getClass();
                r0Var.m(null, r750Var);
            }
        }
    }

    public j750() {
        this(null);
    }
}
