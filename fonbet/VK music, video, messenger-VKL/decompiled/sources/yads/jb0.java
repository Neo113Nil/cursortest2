package yads;

/* loaded from: classes10.dex */
public final class jb0 {
    public final t73 a;
    public s51 b = s51.g();
    public yn2 c = yn2.h;
    public zn1 d;
    public zn1 e;
    public zn1 f;

    public jb0(t73 t73Var) {
        this.a = t73Var;
    }

    public final void a(t51 t51Var, zn1 zn1Var, w73 w73Var) {
        if (zn1Var == null) {
            return;
        }
        if (w73Var.a(zn1Var.a) != -1) {
            t51Var.a(zn1Var, w73Var);
            return;
        }
        w73 w73Var2 = (w73) this.c.get(zn1Var);
        if (w73Var2 != null) {
            t51Var.a(zn1Var, w73Var2);
        }
    }

    public static zn1 a(pf2 pf2Var, s51 s51Var, zn1 zn1Var, t73 t73Var) {
        ao0 ao0Var = (ao0) pf2Var;
        w73 h = ao0Var.h();
        int f = ao0Var.f();
        Object a = h.c() ? null : h.a(f);
        int a2 = (ao0Var.l() || h.c()) ? -1 : h.a(f, t73Var).a(mc3.a(ao0Var.g()) - t73Var.a());
        for (int i = 0; i < s51Var.size(); i++) {
            zn1 zn1Var2 = (zn1) s51Var.get(i);
            if (a(zn1Var2, a, ao0Var.l(), ao0Var.c(), ao0Var.d(), a2)) {
                return zn1Var2;
            }
        }
        if (s51Var.isEmpty() && zn1Var != null && a(zn1Var, a, ao0Var.l(), ao0Var.c(), ao0Var.d(), a2)) {
            return zn1Var;
        }
        return null;
    }

    public static boolean a(zn1 zn1Var, Object obj, boolean z, int i, int i2, int i3) {
        if (!zn1Var.a.equals(obj)) {
            return false;
        }
        if (z && zn1Var.b == i && zn1Var.c == i2) {
            return true;
        }
        return !z && zn1Var.b == -1 && zn1Var.e == i3;
    }

    public final void a(w73 w73Var) {
        t51 a = v51.a();
        if (this.b.isEmpty()) {
            a(a, this.e, w73Var);
            if (!ma2.a(this.f, this.e)) {
                a(a, this.f, w73Var);
            }
            if (!ma2.a(this.d, this.e) && !ma2.a(this.d, this.f)) {
                a(a, this.d, w73Var);
            }
        } else {
            for (int i = 0; i < this.b.size(); i++) {
                a(a, (zn1) this.b.get(i), w73Var);
            }
            if (!this.b.contains(this.d)) {
                a(a, this.d, w73Var);
            }
        }
        this.c = a.a();
    }
}
