package defpackage;

import android.content.Context;

/* loaded from: classes11.dex */
public final class dsb1 implements qqb1 {
    public final j3y a;
    public final j3y b;
    public final wqb1 c;

    public dsb1(Context context, wqb1 wqb1Var) {
        this.c = wqb1Var;
        d87 d87Var = d87.e;
        z811.b(context);
        j211 c = z811.a().c(d87Var);
        if (d87.d.contains(new pzn("json"))) {
            this.a = new j3y(new j0b1(c, 6));
        }
        this.b = new j3y(new j0b1(c, 7));
    }

    @Override // defpackage.qqb1
    public final void a(o3 o3Var) {
        wqb1 wqb1Var = this.c;
        if (wqb1Var.a() != 0) {
            z211 z211Var = (z211) this.b.get();
            int a = wqb1Var.a();
            z211Var.b(o3Var.b != 0 ? jeo.f(o3Var.L(a)) : jeo.g(o3Var.L(a)));
        } else {
            j3y j3yVar = this.a;
            if (j3yVar != null) {
                z211 z211Var2 = (z211) j3yVar.get();
                int a2 = wqb1Var.a();
                z211Var2.b(o3Var.b != 0 ? jeo.f(o3Var.L(a2)) : jeo.g(o3Var.L(a2)));
            }
        }
    }
}
