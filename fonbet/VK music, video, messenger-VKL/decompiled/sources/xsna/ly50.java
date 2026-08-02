package xsna;

import kotlin.collections.EmptyList;
import xsna.ny50;
import xsna.qy50;

/* compiled from: NavigationEventHandler.kt */
/* loaded from: classes.dex */
public abstract class ly50<T extends ny50> {
    public final T a;
    public final EmptyList b;
    public final EmptyList c;
    public boolean d;
    public jy50 e;

    public ly50() {
        throw null;
    }

    public ly50(T t, boolean z) {
        this.a = t;
        EmptyList emptyList = EmptyList.b;
        this.b = emptyList;
        this.c = emptyList;
        qy50.a aVar = qy50.a.a;
        this.d = z;
    }

    public void b() {
        throw new UnsupportedOperationException("A handler that receives a 'backCompleted' event must override 'onBackCompleted()' to handle the callback.");
    }

    public final void e() {
        jy50 jy50Var = this.e;
        if (jy50Var == null || !jy50Var.c.remove(this)) {
            return;
        }
        py50 py50Var = jy50Var.b;
        if (equals(py50Var.f)) {
            int i = py50Var.g;
            if (i == -1) {
                qy50.a aVar = qy50.a.a;
                a();
            } else if (i == 1) {
                qy50.a aVar2 = qy50.a.a;
            }
            py50Var.f = null;
            py50Var.g = 0;
            py50Var.h = null;
        }
        py50Var.d.remove(this);
        py50Var.e.remove(this);
        this.e = null;
        py50Var.b();
    }

    public final void f(boolean z) {
        py50 py50Var;
        if (this.d == z) {
            return;
        }
        this.d = z;
        jy50 jy50Var = this.e;
        if (jy50Var == null || (py50Var = jy50Var.b) == null) {
            return;
        }
        py50Var.b();
    }

    public void a() {
    }

    public void c(hy50 hy50Var) {
    }

    public void d(hy50 hy50Var) {
    }
}
