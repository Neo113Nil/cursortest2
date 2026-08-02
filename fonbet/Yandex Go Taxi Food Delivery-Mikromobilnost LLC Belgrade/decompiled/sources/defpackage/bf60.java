package defpackage;

import android.content.Context;

/* loaded from: classes6.dex */
public final class bf60 extends e55 {
    public final Context e;
    public final pdc f;
    public final int g;
    public Integer h;
    public Float i;
    public Integer j;
    public Float k;

    public bf60(pdc pdcVar, zuj0 zuj0Var, Context context) {
        super(zuj0Var, context);
        this.e = context;
        this.f = pdcVar;
        this.g = ((avj0) zuj0Var).a(qqg0.route_monochrome_main);
    }

    @Override // defpackage.e55, defpackage.zyg
    public final void b(w4e0 w4e0Var, int i) {
        f(w4e0Var, i, e290.e);
        super.b(w4e0Var, i);
    }

    @Override // defpackage.e55
    public final Integer c() {
        return this.h;
    }

    @Override // defpackage.e55
    public final Float d() {
        return this.i;
    }

    @Override // defpackage.e55
    public final Float e() {
        return this.k;
    }

    public final void f(w4e0 w4e0Var, int i, e290 e290Var) {
        String str = e290Var.a;
        ufu ufuVar = (ufu) this.f;
        kdc b = ufuVar.b(str);
        Context context = this.e;
        if (b != null) {
            this.h = Integer.valueOf(s8o.m(b, context));
        } else {
            this.h = null;
        }
        this.i = e290Var.b;
        kdc b2 = ufuVar.b(e290Var.c);
        if (b2 != null) {
            this.j = Integer.valueOf(s8o.m(b2, context));
        } else {
            this.j = null;
        }
        this.k = e290Var.d;
        super.b(w4e0Var, i);
        Integer num = this.j;
        w4e0Var.B(i, num != null ? num.intValue() : this.g);
    }
}
