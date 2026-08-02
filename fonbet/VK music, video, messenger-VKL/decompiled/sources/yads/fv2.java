package yads;

import android.content.Context;
import xsna.epx;

/* loaded from: classes10.dex */
public final class fv2 implements zp2 {
    public final hx2 a;
    public final fr2 b;
    public final dv2 c;
    public final Context d;

    public /* synthetic */ fv2(Context context, bu1 bu1Var) {
        this(context, gx2.a(), new iv2(bu1Var), new dv2());
    }

    @Override // yads.zp2
    public final Object a(g92 g92Var) {
        return (qu2) this.b.a(g92Var);
    }

    @Override // yads.zp2
    public final boolean a() {
        qu2 a = this.a.a(this.d);
        if (a == null) {
            return true;
        }
        dv2 dv2Var = this.c;
        dv2Var.a.a.getClass();
        if (System.currentTimeMillis() >= a.e) {
            return true;
        }
        dv2Var.b.getClass();
        if (!"7.18.6".equals(a.U)) {
            return true;
        }
        dv2Var.c.getClass();
        if (!epx.f(gx2.a().d(), a.O)) {
            return true;
        }
        dv2Var.c.getClass();
        if (gx2.a().a() != a.x) {
            return true;
        }
        dv2Var.c.getClass();
        return !epx.f(gx2.a().b(), a.P);
    }

    public fv2(Context context, hx2 hx2Var, fr2 fr2Var, dv2 dv2Var) {
        this.a = hx2Var;
        this.b = fr2Var;
        this.c = dv2Var;
        this.d = context.getApplicationContext();
    }
}
