package defpackage;

import android.content.Context;

/* loaded from: classes6.dex */
public abstract class e55 extends zyg {
    public final Context a;
    public final float b;
    public final float c;
    public int d;

    public e55(zuj0 zuj0Var, Context context) {
        this.a = context;
        avj0 avj0Var = (avj0) zuj0Var;
        this.b = avj0Var.e(yrg0.map_route_monochrome_width);
        this.c = avj0Var.e(yrg0.map_route_monochrome_outline_width);
        this.d = qje.t(xng0.bgMain, context);
    }

    @Override // defpackage.zyg
    public void b(w4e0 w4e0Var, int i) {
        Float e = e();
        w4e0Var.p(e != null ? e.floatValue() : this.b);
        w4e0Var.v(false);
        Integer c = c();
        w4e0Var.y(c != null ? c.intValue() : this.d);
        Float d = d();
        w4e0Var.z(d != null ? d.floatValue() : this.c);
    }

    public abstract Integer c();

    public abstract Float d();

    public abstract Float e();
}
