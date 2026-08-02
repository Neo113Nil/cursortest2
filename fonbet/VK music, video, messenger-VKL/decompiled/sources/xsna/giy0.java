package xsna;

import java.util.Objects;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class giy0 {
    public static final giy0 d = new giy0(udz0.j, g9y0.g);
    public final udz0 a;
    public final g9y0 b;
    public boolean c = false;

    public giy0(udz0 udz0Var, g9y0 g9y0Var) {
        this.a = udz0Var;
        this.b = g9y0Var;
    }

    public final udz0 a() {
        return this.a;
    }

    public final void b(int i, int i2, int i3, String str, String str2) {
        this.a.f.c(this, i, i2, i3, str, str2);
    }

    public final void c(int i, int i2, String str) {
        b(i, 0, i2, str, null);
    }

    public final void d(int i, int i2) {
        b(i, 3, i2, null, null);
    }

    public final void e(int i, int i2, String str) {
        b(i, 3, i2, str, null);
    }

    public final boolean equals(Object obj) {
        if (obj != null && giy0.class == obj.getClass()) {
            giy0 giy0Var = (giy0) obj;
            if (Objects.equals(this.a, giy0Var.a) && Objects.equals(this.b, giy0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i, String str) {
        b(2, 3, i, null, str);
    }

    public final void g(int i, int i2, String str) {
        b(i, 1, i2, str, null);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
