package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.e43;

/* loaded from: classes10.dex */
public final class yp1 {
    public static final List g = e43.l(dp2.m, dp2.n);
    public static final List h = e43.l(dp2.o, dp2.p, dp2.D, dp2.E);
    public final d4 a;
    public final ov2 b;
    public final v9 c;
    public final xp1 d;
    public final ks1 e;
    public final ur2 f;

    public /* synthetic */ yp1(d4 d4Var, ov2 ov2Var, v9 v9Var) {
        this(d4Var, ov2Var, v9Var, new xp1(), new ks1(), new ur2());
    }

    public final void a(Context context, rr1 rr1Var, Map map) {
        a(context, dp2.f, rr1Var, null, map);
    }

    public final void a(Context context, dp2 dp2Var, rr1 rr1Var, String str, Map map) {
        gp2 a;
        xp1 xp1Var = this.d;
        v9 v9Var = this.c;
        d4 d4Var = this.a;
        xp1Var.getClass();
        if ((v9Var != null ? v9Var.m : null) == sz.b) {
            Object obj = v9Var.t;
            a = xp1Var.b.a(v9Var, d4Var, obj instanceof e22 ? (e22) obj : null);
        } else {
            a = xp1Var.a.a(v9Var, d4Var);
        }
        this.e.getClass();
        gp2 a2 = hp2.a(a, ks1.a(rr1Var));
        a2.a.putAll(map);
        Map map2 = a2.a;
        c cVar = a2.b;
        String str2 = dp2Var.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        fp2 fp2Var = new fp2(str2, linkedHashMap, cVar);
        ((mv3) this.b).getClass();
        tv3 tv3Var = tv3.a;
        cf.a(context, new gr3(((mv3) this.b).a)).a(fp2Var);
        new we(context).a(dp2Var, linkedHashMap, str, rr1Var.g);
    }

    public yp1(d4 d4Var, ov2 ov2Var, v9 v9Var, xp1 xp1Var, ks1 ks1Var, ur2 ur2Var) {
        this.a = d4Var;
        this.b = ov2Var;
        this.c = v9Var;
        this.d = xp1Var;
        this.e = ks1Var;
        this.f = ur2Var;
    }
}
