package defpackage;

import java.util.Map;
import yads.lv1;
import yads.wy1;

/* loaded from: classes7.dex */
public final class c081 implements dg61 {
    public final lv1 a;
    public final nn61 b;
    public final dv81 c;
    public final a441 d;
    public final bw81 e;
    public final ut81 f;
    public final gg81 g;
    public ng81 h;
    public boolean i;

    public c081(lv1 lv1Var, nn61 nn61Var) {
        a081 a081Var;
        dv81 dv81Var = new dv81();
        a441 a441Var = new a441(lv1Var);
        bw81 bw81Var = new bw81();
        ut81 ut81Var = new ut81();
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a = a081Var2.a(lv1Var.b);
        this.a = lv1Var;
        this.b = nn61Var;
        this.c = dv81Var;
        this.d = a441Var;
        this.e = bw81Var;
        this.f = ut81Var;
        this.g = a;
    }

    @Override // defpackage.dg61
    public final void a(String str) {
        gg81 gg81Var = this.g;
        if (gg81Var == null || !gg81Var.E0 || this.i) {
            ng81 ng81Var = this.h;
            if (ng81Var != null) {
                an81 an81Var = (an81) ng81Var;
                fj71 fj71Var = an81Var.a;
                fj71 fj71Var2 = new fj71(fj71Var.a, fj71Var.b, fj71Var.c, str, fj71Var.e);
                jq81 jq81Var = an81Var.b;
                o081 o081Var = jq81Var.c;
                mt81 mt81Var = o081Var.a;
                uy71 uy71Var = jq81Var.a;
                b181 b181Var = jq81Var.b;
                iz71 iz71Var = jq81Var.d;
                bl61 bl61Var = jq81Var.e;
                mt81Var.getClass();
                new wy1(uy71Var, b181Var, o081Var, iz71Var, fj71Var2, bl61Var).onClick(this.a);
            }
            this.i = false;
        }
    }

    @Override // defpackage.dg61
    public final void a(lv1 lv1Var, Map map) {
    }

    @Override // defpackage.dg61
    public final void a(boolean z) {
    }

    @Override // defpackage.dg61
    public final void a() {
        this.i = true;
    }
}
