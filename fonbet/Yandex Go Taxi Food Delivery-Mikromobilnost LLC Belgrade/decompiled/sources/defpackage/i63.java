package defpackage;

import androidx.constraintlayout.core.SolverVariable$Type;
import java.util.ArrayList;
import ru.CryptoPro.JCP.ProviderParameters;

/* loaded from: classes.dex */
public class i63 {
    public final o53 d;
    public z7t0 a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public i63(ua7 ua7Var) {
        this.d = new o53(this, ua7Var);
    }

    public final void a(ijy ijyVar, int i) {
        z7t0 j = ijyVar.j(i);
        o53 o53Var = this.d;
        o53Var.g(j, 1.0f);
        o53Var.g(ijyVar.j(i), -1.0f);
    }

    public final void b(z7t0 z7t0Var, z7t0 z7t0Var2, z7t0 z7t0Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        o53 o53Var = this.d;
        if (z) {
            o53Var.g(z7t0Var, 1.0f);
            o53Var.g(z7t0Var2, -1.0f);
            o53Var.g(z7t0Var3, -1.0f);
        } else {
            o53Var.g(z7t0Var, -1.0f);
            o53Var.g(z7t0Var2, 1.0f);
            o53Var.g(z7t0Var3, 1.0f);
        }
    }

    public final void c(z7t0 z7t0Var, z7t0 z7t0Var2, z7t0 z7t0Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        o53 o53Var = this.d;
        if (z) {
            o53Var.g(z7t0Var, 1.0f);
            o53Var.g(z7t0Var2, -1.0f);
            o53Var.g(z7t0Var3, 1.0f);
        } else {
            o53Var.g(z7t0Var, -1.0f);
            o53Var.g(z7t0Var2, 1.0f);
            o53Var.g(z7t0Var3, -1.0f);
        }
    }

    public z7t0 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final z7t0 f(boolean[] zArr, z7t0 z7t0Var) {
        SolverVariable$Type solverVariable$Type;
        o53 o53Var = this.d;
        int d = o53Var.d();
        z7t0 z7t0Var2 = null;
        float f = 0.0f;
        for (int i = 0; i < d; i++) {
            float f2 = o53Var.f(i);
            if (f2 < 0.0f) {
                z7t0 e = o53Var.e(i);
                if ((zArr == null || !zArr[e.b]) && e != z7t0Var && (((solverVariable$Type = e.B) == SolverVariable$Type.SLACK || solverVariable$Type == SolverVariable$Type.ERROR) && f2 < f)) {
                    f = f2;
                    z7t0Var2 = e;
                }
            }
        }
        return z7t0Var2;
    }

    public final void g(z7t0 z7t0Var) {
        z7t0 z7t0Var2 = this.a;
        o53 o53Var = this.d;
        if (z7t0Var2 != null) {
            o53Var.g(z7t0Var2, -1.0f);
            this.a.c = -1;
            this.a = null;
        }
        float h = o53Var.h(z7t0Var, true) * (-1.0f);
        this.a = z7t0Var;
        if (h == 1.0f) {
            return;
        }
        this.b /= h;
        int i = o53Var.h;
        for (int i2 = 0; i != -1 && i2 < o53Var.a; i2++) {
            float[] fArr = o53Var.g;
            fArr[i] = fArr[i] / h;
            i = o53Var.f[i];
        }
    }

    public final void h(ijy ijyVar, z7t0 z7t0Var, boolean z) {
        if (z7t0Var.y) {
            o53 o53Var = this.d;
            float c = o53Var.c(z7t0Var);
            this.b = (z7t0Var.x * c) + this.b;
            o53Var.h(z7t0Var, z);
            if (z) {
                z7t0Var.b(this);
            }
            if (o53Var.d() == 0) {
                this.e = true;
                ijyVar.b = true;
            }
        }
    }

    public void i(ijy ijyVar, i63 i63Var, boolean z) {
        o53 o53Var = this.d;
        o53Var.getClass();
        float c = o53Var.c(i63Var.a);
        o53Var.h(i63Var.a, z);
        o53 o53Var2 = i63Var.d;
        int d = o53Var2.d();
        for (int i = 0; i < d; i++) {
            z7t0 e = o53Var2.e(i);
            o53Var.a(e, o53Var2.c(e) * c, z);
        }
        this.b = (i63Var.b * c) + this.b;
        if (z) {
            i63Var.a.b(this);
        }
        if (this.a == null || o53Var.d() != 0) {
            return;
        }
        this.e = true;
        ijyVar.b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z;
        String concat = (this.a == null ? "0" : "" + this.a).concat(" = ");
        if (this.b != 0.0f) {
            StringBuilder t = qv10.t(concat);
            t.append(this.b);
            concat = t.toString();
            z = true;
        } else {
            z = false;
        }
        o53 o53Var = this.d;
        int d = o53Var.d();
        for (int i = 0; i < d; i++) {
            z7t0 e = o53Var.e(i);
            if (e != null) {
                float f = o53Var.f(i);
                if (f != 0.0f) {
                    String z7t0Var = e.toString();
                    if (!z) {
                        if (f < 0.0f) {
                            concat = concat.concat("- ");
                            f *= -1.0f;
                        }
                        concat = f == 1.0f ? concat.concat(z7t0Var) : concat + f + " " + z7t0Var;
                        z = true;
                    } else if (f > 0.0f) {
                        concat = concat.concat(" + ");
                        if (f == 1.0f) {
                        }
                        z = true;
                    } else {
                        concat = concat.concat(" - ");
                        f *= -1.0f;
                        if (f == 1.0f) {
                        }
                        z = true;
                    }
                }
            }
        }
        return !z ? concat.concat(ProviderParameters.DEFAULT_PRODUCT_VER) : concat;
    }

    public i63() {
    }
}
