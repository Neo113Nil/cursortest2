package xsna;

import xsna.qy50;

/* compiled from: NavigationEventInput.kt */
/* loaded from: classes.dex */
public abstract class oy50 {
    public jy50 a;
    public boolean b;

    public void a() {
        b();
    }

    public final void b() {
        jy50 jy50Var = this.a;
        if (jy50Var == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.b) {
            jy50Var.d(this, null);
        }
        py50 py50Var = jy50Var.b;
        d45 d45Var = jy50Var.a;
        if (equals(py50Var.h) && -1 == py50Var.g) {
            ly50<?> ly50Var = py50Var.f;
            if (ly50Var == null) {
                ly50Var = py50Var.c(-1);
            }
            py50Var.f = null;
            py50Var.g = 0;
            py50Var.h = null;
            if (ly50Var == null) {
                Runnable runnable = ((p180) d45Var.b).a;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                qy50.a aVar = qy50.a.a;
                ly50Var.b();
            }
            py50Var.a.setValue(qy50.a.a);
        }
        this.b = false;
    }

    public void c(boolean z) {
    }
}
