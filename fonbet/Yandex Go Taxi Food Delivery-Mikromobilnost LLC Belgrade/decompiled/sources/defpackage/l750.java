package defpackage;

/* loaded from: classes.dex */
public abstract class l750 {
    public final n750 a;
    public boolean b;
    public j750 c;

    public l750(n750 n750Var, boolean z) {
        this.a = n750Var;
        this.b = z;
    }

    public final boolean a() {
        j750 j750Var = this.c;
        if (j750Var == null || j750Var.b) {
            return this.b;
        }
        return false;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d(i750 i750Var);

    public abstract void e(i750 i750Var);

    public final void f() {
        j750 j750Var = this.c;
        if (j750Var == null || !j750Var.d.remove(this)) {
            return;
        }
        p750 p750Var = j750Var.c;
        if (equals(p750Var.f)) {
            if (p750Var.g == -1) {
                b();
            }
            p750Var.f = null;
            p750Var.g = 0;
            p750Var.h = null;
        }
        p750Var.d.remove(this);
        p750Var.e.remove(this);
        this.c = null;
        p750Var.b();
    }

    public final void g(boolean z) {
        p750 p750Var;
        if (this.b == z) {
            return;
        }
        this.b = z;
        j750 j750Var = this.c;
        if (j750Var == null || (p750Var = j750Var.c) == null) {
            return;
        }
        p750Var.b();
    }
}
