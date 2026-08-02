package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class i1 {
    public static final /* synthetic */ qcy[] m = {wb.a(i1.class, "activityInteractionEventListener", "getActivityInteractionEventListener()Lcom/monetization/ads/base/tracker/interaction/ActivityInteractionEventListener;", 0)};
    public final d4 a;
    public final v9 b;
    public final er0 c;
    public final n9 d;
    public final jp2 e;
    public final lr0 f;
    public final ir0 g;
    public final boolean h;
    public final mn2 i;
    public h1 j;
    public j32 k;
    public long l;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r11.i() == true) goto L11;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ i1(Context context, d4 d4Var, ov2 ov2Var, v9 v9Var, g1 g1Var, er0 er0Var) {
        this(d4Var, v9Var, g1Var, er0Var, r5, r6, r7, r8, r13);
        n9 n9Var = new n9();
        mv3 mv3Var = (mv3) ov2Var;
        mv3Var.d();
        tv3 tv3Var = tv3.a;
        bu1 a = cf.a(context, mv3Var.b());
        lr0 lr0Var = er0Var != null ? new lr0(context, d4Var, ov2Var, er0Var) : null;
        ir0 a2 = hr0.a(context);
        qu2 a3 = gx2.a().a(context);
        boolean z = a3 != null;
    }

    public final fp2 a(h1 h1Var, String str) {
        gp2 a = this.d.a(this.a.e);
        a.b(h1Var.b, "type");
        a.b(this.a.a.b, "ad_type");
        a.b(this.a.c.a, "ad_unit_id");
        a.b(str, "interval");
        j32 j32Var = this.k;
        if (j32Var != null) {
            a = hp2.a(a, j32Var.a());
        }
        dp2 dp2Var = dp2.c;
        Map map = a.a;
        v9 v9Var = this.b;
        return new fp2("returned_to_app", new LinkedHashMap(map), v9Var != null ? v9Var.i : null);
    }

    public final void b(h1 h1Var) {
        Objects.toString(h1Var);
        this.l = System.currentTimeMillis();
        this.j = h1Var;
        if (h1Var == h1.c && this.h) {
            Map b = a(h1Var, null).b();
            v9 v9Var = this.b;
            this.g.a(new fr0(this.a.a(), this.l, h1Var, this.c, b, v9Var != null ? v9Var.a() : null));
        }
    }

    public i1(d4 d4Var, v9 v9Var, g1 g1Var, er0 er0Var, n9 n9Var, jp2 jp2Var, lr0 lr0Var, ir0 ir0Var, boolean z) {
        this.a = d4Var;
        this.b = v9Var;
        this.c = er0Var;
        this.d = n9Var;
        this.e = jp2Var;
        this.f = lr0Var;
        this.g = ir0Var;
        this.h = z;
        this.i = nn2.a(g1Var);
    }

    public final void a(h1 h1Var) {
        Objects.toString(h1Var);
        if (this.l == 0 || this.j != h1Var) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.l;
        this.e.a(a(h1Var, ud1.a(currentTimeMillis)));
        mn2 mn2Var = this.i;
        qcy qcyVar = m[0];
        g1 g1Var = (g1) mn2Var.a.get();
        if (g1Var != null) {
            g1Var.onReturnedToApplication();
        }
        lr0 lr0Var = this.f;
        if (lr0Var != null) {
            lr0Var.a(currentTimeMillis);
            if (this.h) {
                this.g.a(this.l);
            }
        }
        this.l = 0L;
        this.j = null;
    }
}
