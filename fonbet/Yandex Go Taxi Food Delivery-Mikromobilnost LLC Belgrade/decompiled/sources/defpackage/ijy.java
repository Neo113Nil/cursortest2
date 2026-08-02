package defpackage;

import androidx.constraintlayout.core.SolverVariable$Type;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class ijy {
    public static boolean q;
    public static oc20 r;
    public final h3f0 d;
    public final ua7 m;
    public i63 p;
    public int a = 1000;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public z7t0[] n = new z7t0[1000];
    public int o = 0;
    public i63[] g = new i63[32];

    public ijy() {
        s();
        ua7 ua7Var = new ua7();
        this.m = ua7Var;
        h3f0 h3f0Var = new h3f0(ua7Var);
        h3f0Var.f = new z7t0[128];
        h3f0Var.g = 0;
        h3f0Var.h = new kjz(h3f0Var);
        this.d = h3f0Var;
        this.p = new i63(ua7Var);
    }

    public static int n(Object obj) {
        z7t0 z7t0Var = ((b7e) obj).i;
        if (z7t0Var != null) {
            return (int) (z7t0Var.x + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final z7t0 a(SolverVariable$Type solverVariable$Type) {
        m6e0 m6e0Var = this.m.b;
        int i = m6e0Var.b;
        z7t0 z7t0Var = null;
        if (i > 0) {
            int i2 = i - 1;
            ?? r3 = m6e0Var.a;
            ?? r4 = r3[i2];
            r3[i2] = 0;
            m6e0Var.b = i2;
            z7t0Var = r4;
        }
        z7t0 z7t0Var2 = z7t0Var;
        if (z7t0Var2 == null) {
            z7t0Var2 = new z7t0(solverVariable$Type);
            z7t0Var2.B = solverVariable$Type;
        } else {
            z7t0Var2.c();
            z7t0Var2.B = solverVariable$Type;
        }
        int i3 = this.o;
        int i4 = this.a;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.a = i5;
            this.n = (z7t0[]) Arrays.copyOf(this.n, i5);
        }
        z7t0[] z7t0VarArr = this.n;
        int i6 = this.o;
        this.o = i6 + 1;
        z7t0VarArr[i6] = z7t0Var2;
        return z7t0Var2;
    }

    public final void b(z7t0 z7t0Var, z7t0 z7t0Var2, int i, float f, z7t0 z7t0Var3, z7t0 z7t0Var4, int i2, int i3) {
        i63 l = l();
        if (z7t0Var2 == z7t0Var3) {
            l.d.g(z7t0Var, 1.0f);
            l.d.g(z7t0Var4, 1.0f);
            l.d.g(z7t0Var2, -2.0f);
        } else {
            o53 o53Var = l.d;
            if (f == 0.5f) {
                o53Var.g(z7t0Var, 1.0f);
                l.d.g(z7t0Var2, -1.0f);
                l.d.g(z7t0Var3, -1.0f);
                l.d.g(z7t0Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    l.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                o53Var.g(z7t0Var, -1.0f);
                l.d.g(z7t0Var2, 1.0f);
                l.b = i;
            } else if (f >= 1.0f) {
                o53Var.g(z7t0Var4, -1.0f);
                l.d.g(z7t0Var3, 1.0f);
                l.b = -i2;
            } else {
                float f2 = 1.0f - f;
                o53Var.g(z7t0Var, f2 * 1.0f);
                l.d.g(z7t0Var2, f2 * (-1.0f));
                l.d.g(z7t0Var3, (-1.0f) * f);
                l.d.g(z7t0Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    l.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            l.a(this, i3);
        }
        c(l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d2, code lost:
    
        if (r4.E <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d5, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00df, code lost:
    
        if (r4.E <= 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f4, code lost:
    
        if (r4.E <= 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f7, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0101, code lost:
    
        if (r4.E <= 1) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(i63 i63Var) {
        boolean z;
        boolean z2;
        z7t0 z7t0Var;
        z7t0 f;
        boolean z3 = true;
        if (this.k + 1 >= this.l || this.j + 1 >= this.f) {
            o();
        }
        if (i63Var.e) {
            z = false;
        } else {
            ArrayList arrayList = i63Var.c;
            if (this.g.length != 0) {
                boolean z4 = false;
                while (!z4) {
                    int d = i63Var.d.d();
                    for (int i = 0; i < d; i++) {
                        z7t0 e = i63Var.d.e(i);
                        if (e.c != -1 || e.y) {
                            arrayList.add(e);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            z7t0 z7t0Var2 = (z7t0) arrayList.get(i2);
                            if (z7t0Var2.y) {
                                i63Var.h(this, z7t0Var2, true);
                            } else {
                                i63Var.i(this, this.g[z7t0Var2.c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z4 = true;
                    }
                }
                if (i63Var.a != null && i63Var.d.d() == 0) {
                    i63Var.e = true;
                    this.b = true;
                }
            }
            if (i63Var.e()) {
                return;
            }
            float f2 = i63Var.b;
            float f3 = 0.0f;
            if (f2 < 0.0f) {
                i63Var.b = f2 * (-1.0f);
                o53 o53Var = i63Var.d;
                int i3 = o53Var.h;
                for (int i4 = 0; i3 != -1 && i4 < o53Var.a; i4++) {
                    float[] fArr = o53Var.g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = o53Var.f[i3];
                }
            }
            int d2 = i63Var.d.d();
            float f4 = 0.0f;
            float f5 = 0.0f;
            z7t0 z7t0Var3 = null;
            z7t0 z7t0Var4 = null;
            int i5 = 0;
            boolean z5 = false;
            boolean z6 = false;
            while (i5 < d2) {
                float f6 = i63Var.d.f(i5);
                z7t0 e2 = i63Var.d.e(i5);
                float f7 = f3;
                if (e2.B == SolverVariable$Type.UNRESTRICTED) {
                    if (z7t0Var3 != null) {
                        if (f4 <= f6) {
                            if (!z5) {
                                if (e2.E > 1) {
                                }
                            }
                        }
                        z5 = true;
                    }
                    z7t0Var3 = e2;
                    f4 = f6;
                } else if (z7t0Var3 == null && f6 < f7) {
                    if (z7t0Var4 != null) {
                        if (f5 <= f6) {
                            if (!z6) {
                                if (e2.E > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    z7t0Var4 = e2;
                    f5 = f6;
                }
                i5++;
                f3 = f7;
            }
            float f8 = f3;
            if (z7t0Var3 == null) {
                z7t0Var3 = z7t0Var4;
            }
            if (z7t0Var3 == null) {
                z2 = true;
            } else {
                i63Var.g(z7t0Var3);
                z2 = false;
            }
            if (i63Var.d.d() == 0) {
                i63Var.e = true;
            }
            if (z2) {
                if (this.j + 1 >= this.f) {
                    o();
                }
                z7t0 a = a(SolverVariable$Type.SLACK);
                int i6 = this.c + 1;
                this.c = i6;
                this.j++;
                a.b = i6;
                ua7 ua7Var = this.m;
                ua7Var.c[i6] = a;
                i63Var.a = a;
                int i7 = this.k;
                h(i63Var);
                if (this.k == i7 + 1) {
                    i63 i63Var2 = this.p;
                    i63Var2.a = null;
                    i63Var2.d.b();
                    for (int i8 = 0; i8 < i63Var.d.d(); i8++) {
                        i63Var2.d.a(i63Var.d.e(i8), i63Var.d.f(i8), true);
                    }
                    r(this.p);
                    if (a.c == -1) {
                        if (i63Var.a == a && (f = i63Var.f(null, a)) != null) {
                            i63Var.g(f);
                        }
                        if (!i63Var.e) {
                            i63Var.a.e(this, i63Var);
                        }
                        ua7Var.a.b(i63Var);
                        this.k--;
                    }
                    z7t0Var = i63Var.a;
                    if (z7t0Var != null) {
                        return;
                    }
                    if (z7t0Var.B != SolverVariable$Type.UNRESTRICTED && i63Var.b < f8) {
                        return;
                    } else {
                        z = z3;
                    }
                }
            }
            z3 = false;
            z7t0Var = i63Var.a;
            if (z7t0Var != null) {
            }
        }
        if (z) {
            return;
        }
        h(i63Var);
    }

    public final void d(z7t0 z7t0Var, int i) {
        int i2 = z7t0Var.c;
        if (i2 == -1) {
            z7t0Var.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                z7t0 z7t0Var2 = this.m.c[i3];
            }
            return;
        }
        if (i2 == -1) {
            i63 l = l();
            l.a = z7t0Var;
            float f = i;
            z7t0Var.x = f;
            l.b = f;
            l.e = true;
            c(l);
            return;
        }
        i63 i63Var = this.g[i2];
        if (i63Var.e) {
            i63Var.b = i;
            return;
        }
        if (i63Var.d.d() == 0) {
            i63Var.e = true;
            i63Var.b = i;
            return;
        }
        i63 l2 = l();
        if (i < 0) {
            l2.b = i * (-1);
            l2.d.g(z7t0Var, 1.0f);
        } else {
            l2.b = i;
            l2.d.g(z7t0Var, -1.0f);
        }
        c(l2);
    }

    public final void e(z7t0 z7t0Var, z7t0 z7t0Var2, int i, int i2) {
        if (i2 == 8 && z7t0Var2.y && z7t0Var.c == -1) {
            z7t0Var.d(this, z7t0Var2.x + i);
            return;
        }
        i63 l = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            l.b = i;
        }
        o53 o53Var = l.d;
        if (z) {
            o53Var.g(z7t0Var, 1.0f);
            l.d.g(z7t0Var2, -1.0f);
        } else {
            o53Var.g(z7t0Var, -1.0f);
            l.d.g(z7t0Var2, 1.0f);
        }
        if (i2 != 8) {
            l.a(this, i2);
        }
        c(l);
    }

    public final void f(z7t0 z7t0Var, z7t0 z7t0Var2, int i, int i2) {
        i63 l = l();
        z7t0 m = m();
        m.w = 0;
        l.b(z7t0Var, z7t0Var2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void g(z7t0 z7t0Var, z7t0 z7t0Var2, int i, int i2) {
        i63 l = l();
        z7t0 m = m();
        m.w = 0;
        l.c(z7t0Var, z7t0Var2, m, i);
        if (i2 != 8) {
            l.d.g(j(i2), (int) (l.d.c(m) * (-1.0f)));
        }
        c(l);
    }

    public final void h(i63 i63Var) {
        int i;
        if (i63Var.e) {
            i63Var.a.d(this, i63Var.b);
        } else {
            i63[] i63VarArr = this.g;
            int i2 = this.k;
            i63VarArr[i2] = i63Var;
            z7t0 z7t0Var = i63Var.a;
            z7t0Var.c = i2;
            this.k = i2 + 1;
            z7t0Var.e(this, i63Var);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.getClass();
                }
                i63 i63Var2 = this.g[i3];
                if (i63Var2 != null && i63Var2.e) {
                    i63Var2.a.d(this, i63Var2.b);
                    this.m.a.b(i63Var2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        i63[] i63VarArr2 = this.g;
                        int i6 = i4 - 1;
                        i63 i63Var3 = i63VarArr2[i4];
                        i63VarArr2[i6] = i63Var3;
                        z7t0 z7t0Var2 = i63Var3.a;
                        if (z7t0Var2.c == i4) {
                            z7t0Var2.c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            i63 i63Var = this.g[i];
            i63Var.a.x = i63Var.b;
        }
    }

    public final z7t0 j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        z7t0 a = a(SolverVariable$Type.ERROR);
        float[] fArr = a.A;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        a.b = i2;
        a.w = i;
        this.m.c[i2] = a;
        h3f0 h3f0Var = this.d;
        h3f0Var.h.b = a;
        Arrays.fill(fArr, 0.0f);
        fArr[a.w] = 1.0f;
        h3f0Var.j(a);
        return a;
    }

    public final z7t0 k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof b7e)) {
            return null;
        }
        b7e b7eVar = (b7e) obj;
        z7t0 z7t0Var = b7eVar.i;
        if (z7t0Var == null) {
            b7eVar.k();
            z7t0Var = b7eVar.i;
        }
        int i = z7t0Var.b;
        ua7 ua7Var = this.m;
        if (i != -1 && i <= this.c && ua7Var.c[i] != null) {
            return z7t0Var;
        }
        if (i != -1) {
            z7t0Var.c();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        z7t0Var.b = i2;
        z7t0Var.B = SolverVariable$Type.UNRESTRICTED;
        ua7Var.c[i2] = z7t0Var;
        return z7t0Var;
    }

    public final i63 l() {
        Object obj;
        ua7 ua7Var = this.m;
        m6e0 m6e0Var = ua7Var.a;
        int i = m6e0Var.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = m6e0Var.a;
            obj = objArr[i2];
            objArr[i2] = null;
            m6e0Var.b = i2;
        } else {
            obj = null;
        }
        i63 i63Var = (i63) obj;
        if (i63Var == null) {
            return new i63(ua7Var);
        }
        i63Var.a = null;
        i63Var.d.b();
        i63Var.b = 0.0f;
        i63Var.e = false;
        return i63Var;
    }

    public final z7t0 m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        z7t0 a = a(SolverVariable$Type.SLACK);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        a.b = i;
        this.m.c[i] = a;
        return a;
    }

    public final void o() {
        int i = this.e * 2;
        this.e = i;
        this.g = (i63[]) Arrays.copyOf(this.g, i);
        ua7 ua7Var = this.m;
        ua7Var.c = (z7t0[]) Arrays.copyOf(ua7Var.c, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
        oc20 oc20Var = r;
        if (oc20Var != null) {
            oc20Var.b = Math.max(oc20Var.b, i2);
            long j = r.b;
        }
    }

    public final void p() {
        h3f0 h3f0Var = this.d;
        if (h3f0Var.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(h3f0Var);
            return;
        }
        oc20 oc20Var = r;
        if (oc20Var != null) {
            oc20Var.c++;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(h3f0Var);
                return;
            }
        }
        i();
    }

    public final void q(h3f0 h3f0Var) {
        oc20 oc20Var = r;
        if (oc20Var != null) {
            oc20Var.f = Math.max(oc20Var.f, this.j);
            oc20 oc20Var2 = r;
            oc20Var2.g = Math.max(oc20Var2.g, this.k);
        }
        int i = 0;
        while (true) {
            if (i >= this.k) {
                break;
            }
            i63 i63Var = this.g[i];
            if (i63Var.a.B != SolverVariable$Type.UNRESTRICTED) {
                float f = 0.0f;
                if (i63Var.b < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.k) {
                            i63 i63Var2 = this.g[i5];
                            if (i63Var2.a.B != SolverVariable$Type.UNRESTRICTED && !i63Var2.e && i63Var2.b < f) {
                                int d = i63Var2.d.d();
                                int i7 = 0;
                                while (i7 < d) {
                                    z7t0 e = i63Var2.d.e(i7);
                                    float c = i63Var2.d.c(e);
                                    if (c > f) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f3 = e.z[i8] / c;
                                            if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i4 = e.b;
                                                i3 = i5;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i7++;
                                    f = 0.0f;
                                }
                            }
                            i5++;
                            f = 0.0f;
                        }
                        if (i3 != -1) {
                            i63 i63Var3 = this.g[i3];
                            i63Var3.a.c = -1;
                            i63Var3.g(this.m.c[i4]);
                            z7t0 z7t0Var = i63Var3.a;
                            z7t0Var.c = i3;
                            z7t0Var.e(this, i63Var3);
                        } else {
                            z = true;
                        }
                        if (i2 > this.j / 2) {
                            z = true;
                        }
                        f = 0.0f;
                    }
                }
            }
            i++;
        }
        r(h3f0Var);
        i();
    }

    public final void r(i63 i63Var) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.j; i2++) {
            this.i[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.j * 2) {
                return;
            }
            z7t0 z7t0Var = i63Var.a;
            if (z7t0Var != null) {
                this.i[z7t0Var.b] = true;
            }
            z7t0 d = i63Var.d(this.i);
            if (d != null) {
                boolean[] zArr = this.i;
                int i4 = d.b;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (d != null) {
                float f = Float.MAX_VALUE;
                int i5 = i;
                int i6 = -1;
                while (i5 < this.k) {
                    i63 i63Var2 = this.g[i5];
                    if (i63Var2.a.B != SolverVariable$Type.UNRESTRICTED && !i63Var2.e) {
                        o53 o53Var = i63Var2.d;
                        int i7 = o53Var.h;
                        if (i7 != -1) {
                            for (int i8 = i; i7 != -1 && i8 < o53Var.a; i8++) {
                                if (o53Var.e[i7] == d.b) {
                                    z = true;
                                    break;
                                }
                                i7 = o53Var.f[i7];
                            }
                        }
                        z = false;
                        if (z) {
                            float c = i63Var2.d.c(d);
                            if (c < 0.0f) {
                                float f2 = (-i63Var2.b) / c;
                                if (f2 < f) {
                                    i6 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    i5++;
                    i = 0;
                }
                if (i6 > -1) {
                    i63 i63Var3 = this.g[i6];
                    i63Var3.a.c = -1;
                    i63Var3.g(d);
                    z7t0 z7t0Var2 = i63Var3.a;
                    z7t0Var2.c = i6;
                    z7t0Var2.e(this, i63Var3);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            i63 i63Var = this.g[i];
            if (i63Var != null) {
                this.m.a.b(i63Var);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        ua7 ua7Var;
        int i = 0;
        while (true) {
            ua7Var = this.m;
            z7t0[] z7t0VarArr = ua7Var.c;
            if (i >= z7t0VarArr.length) {
                break;
            }
            z7t0 z7t0Var = z7t0VarArr[i];
            if (z7t0Var != null) {
                z7t0Var.c();
            }
            i++;
        }
        m6e0 m6e0Var = ua7Var.b;
        z7t0[] z7t0VarArr2 = this.n;
        int i2 = this.o;
        m6e0Var.getClass();
        if (i2 > z7t0VarArr2.length) {
            i2 = z7t0VarArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            z7t0 z7t0Var2 = z7t0VarArr2[i3];
            int i4 = m6e0Var.b;
            Object[] objArr = m6e0Var.a;
            if (i4 < objArr.length) {
                objArr[i4] = z7t0Var2;
                m6e0Var.b = i4 + 1;
            }
        }
        this.o = 0;
        Arrays.fill(ua7Var.c, (Object) null);
        this.c = 0;
        h3f0 h3f0Var = this.d;
        h3f0Var.g = 0;
        h3f0Var.b = 0.0f;
        this.j = 1;
        for (int i5 = 0; i5 < this.k; i5++) {
            i63 i63Var = this.g[i5];
        }
        s();
        this.k = 0;
        this.p = new i63(ua7Var);
    }
}
