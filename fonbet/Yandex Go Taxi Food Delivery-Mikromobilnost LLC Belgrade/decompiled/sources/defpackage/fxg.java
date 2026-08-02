package defpackage;

/* loaded from: classes10.dex */
public final class fxg implements vg2 {
    public final j531 a;
    public final gl11 b;
    public final Object c;
    public final sj2 d;
    public final sj2 e;
    public final sj2 f;
    public final Object g;
    public final long h;

    public fxg(gxg gxgVar, gl11 gl11Var, Object obj, sj2 sj2Var) {
        sj2 sj2Var2;
        gor gorVar;
        j531 j531Var = new j531(((hxg) gxgVar).a);
        this.a = j531Var;
        this.b = gl11Var;
        this.c = obj;
        sj2 sj2Var3 = (sj2) gl11Var.a.invoke(obj);
        this.d = sj2Var3;
        this.e = ooc.i(sj2Var);
        tls tlsVar = gl11Var.b;
        if (j531Var.d == null) {
            j531Var.d = sj2Var3.c();
        }
        sj2 sj2Var4 = j531Var.d;
        int b = (sj2Var4 == null ? null : sj2Var4).b();
        int i = 0;
        while (true) {
            sj2Var2 = j531Var.d;
            gorVar = j531Var.a;
            if (i >= b) {
                break;
            }
            if (sj2Var2 == null) {
                sj2Var2 = null;
            }
            sj2Var2.e(gorVar.j(sj2Var3.a(i), sj2Var.a(i)), i);
            i++;
        }
        this.g = tlsVar.invoke(sj2Var2 == null ? null : sj2Var2);
        if (j531Var.c == null) {
            j531Var.c = sj2Var3.c();
        }
        sj2 sj2Var5 = j531Var.c;
        int b2 = (sj2Var5 != null ? sj2Var5 : null).b();
        long j = 0;
        for (int i2 = 0; i2 < b2; i2++) {
            sj2Var3.getClass();
            j = Math.max(j, gorVar.i(sj2Var.a(i2)));
        }
        this.h = j;
        sj2 i3 = ooc.i(this.a.a(j, this.d, sj2Var));
        this.f = i3;
        int b3 = i3.b();
        for (int i4 = 0; i4 < b3; i4++) {
            sj2 sj2Var6 = this.f;
            float a = sj2Var6.a(i4);
            float f = this.a.e;
            sj2Var6.e(y6i0.c(a, -f, f), i4);
        }
    }

    @Override // defpackage.vg2
    public final boolean b() {
        return false;
    }

    @Override // defpackage.vg2
    public final long d() {
        return this.h;
    }

    @Override // defpackage.vg2
    public final gl11 e() {
        return this.b;
    }

    @Override // defpackage.vg2
    public final Object f(long j) {
        sj2 sj2Var;
        if (c(j)) {
            return this.g;
        }
        tls tlsVar = this.b.b;
        j531 j531Var = this.a;
        sj2 sj2Var2 = j531Var.b;
        sj2 sj2Var3 = this.d;
        if (sj2Var2 == null) {
            j531Var.b = sj2Var3.c();
        }
        sj2 sj2Var4 = j531Var.b;
        if (sj2Var4 == null) {
            sj2Var4 = null;
        }
        int b = sj2Var4.b();
        int i = 0;
        while (true) {
            sj2Var = j531Var.b;
            if (i >= b) {
                break;
            }
            if (sj2Var == null) {
                sj2Var = null;
            }
            sj2Var.e(j531Var.a.l(sj2Var3.a(i), this.e.a(i), j), i);
            i++;
        }
        return tlsVar.invoke(sj2Var != null ? sj2Var : null);
    }

    @Override // defpackage.vg2
    public final Object g() {
        return this.g;
    }

    @Override // defpackage.vg2
    public final sj2 h(long j) {
        if (c(j)) {
            return this.f;
        }
        return this.a.a(j, this.d, this.e);
    }
}
