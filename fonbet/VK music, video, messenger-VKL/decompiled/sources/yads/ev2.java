package yads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import xsna.jgp;

/* loaded from: classes10.dex */
public final class ev2 extends po {
    public final Context w;
    public final zp2 x;
    public final Map y;

    public ev2(Context context, String str, fv2 fv2Var, Map map, gv2 gv2Var, gv2 gv2Var2) {
        super(context, 0, str, gv2Var2, gv2Var);
        this.w = context;
        this.x = fv2Var;
        this.y = map;
        l();
        m();
    }

    @Override // yads.po, yads.qp2
    public final mn3 a(mn3 mn3Var) {
        m4 m4Var;
        int i = h4.d;
        g92 g92Var = mn3Var.b;
        Integer valueOf = g92Var != null ? Integer.valueOf(g92Var.a) : null;
        if (valueOf == null) {
            m4Var = mn3Var instanceof ca2 ? m4.l : mn3Var instanceof z73 ? m4.m : mn3Var instanceof pl ? m4.n : mn3Var instanceof ov ? m4.o : mn3Var instanceof nc2 ? m4.p : m4.q;
        } else {
            int intValue = valueOf.intValue();
            m4Var = (500 > intValue || intValue > 599) ? m4.e : m4.f;
        }
        return new h4(m4Var, g92Var);
    }

    @Override // yads.qp2
    public final Map d() {
        HashMap hashMap = new HashMap();
        qu2 a = gx2.a().a(this.w);
        if (a != null && a.C) {
            w11 w11Var = w11.c;
            hashMap.put("encrypted-request", "1");
        }
        hashMap.putAll(this.y);
        return hashMap;
    }

    @Override // yads.qp2
    public final wq2 a(g92 g92Var) {
        m4 m4Var;
        if (200 == g92Var.a) {
            qu2 qu2Var = (qu2) this.x.a(g92Var);
            if (qu2Var != null) {
                Map map = g92Var.c;
                if (map == null) {
                    map = jgp.b;
                }
                String c = u01.c(map, w11.R);
                if (c != null) {
                    xy2 xy2Var = yy2.a;
                    Context context = this.s;
                    xy2Var.getClass();
                    ((uh1) ((zy2) xy2.a(context)).b).a("ServerSideClientIP", c);
                }
                return new wq2(qu2Var, x11.a(g92Var));
            }
            m4Var = m4.c;
        } else {
            m4Var = m4.e;
        }
        return new wq2(new h4(m4Var, g92Var));
    }
}
