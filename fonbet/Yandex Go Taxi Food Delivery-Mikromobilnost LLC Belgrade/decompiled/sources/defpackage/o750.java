package defpackage;

import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public abstract class o750 {
    public j750 a;
    public boolean b;

    public final void a() {
        Runnable runnable;
        j750 j750Var = this.a;
        if (j750Var == null) {
            ny61.r("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            j750Var.d(this, null);
        }
        if (j750Var.b) {
            p750 p750Var = j750Var.c;
            s59 s59Var = j750Var.a;
            if (equals(p750Var.h) && -1 == p750Var.g) {
                l750 l750Var = p750Var.f;
                if (l750Var == null) {
                    l750Var = p750Var.c(-1);
                }
                p750Var.f = null;
                p750Var.g = 0;
                p750Var.h = null;
                if (l750Var != null) {
                    l750Var.c();
                } else if (s59Var != null && (runnable = ((qx60) s59Var.a).a) != null) {
                    runnable.run();
                }
                r0 r0Var = p750Var.a;
                q750 q750Var = q750.f;
                r0Var.getClass();
                r0Var.m(null, q750Var);
            }
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
