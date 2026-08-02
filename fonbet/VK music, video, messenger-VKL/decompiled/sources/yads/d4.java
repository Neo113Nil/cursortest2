package yads;

import xsna.drm0;

/* loaded from: classes10.dex */
public final class d4 {
    public final e00 a;
    public final qx b;
    public final hb c;
    public final f13 d;
    public g9 e;
    public w52 f;
    public ub3 g;
    public String h;
    public String i;
    public Integer j;
    public rr1 k;
    public String l;
    public boolean m;
    public int n;
    public final int o;

    public /* synthetic */ d4(e00 e00Var) {
        this(e00Var, new qx(), new hb(), new f13());
    }

    public final e00 a() {
        return this.a;
    }

    public final rd b() {
        return this.b.b;
    }

    public final km0 c() {
        return this.b.a;
    }

    public final e13 d() {
        return this.d.a;
    }

    public final void e() {
        this.f = w52.c;
    }

    public final void a(g9 g9Var) {
        this.e = g9Var;
    }

    public final void a(String str) {
        hb hbVar = this.c;
        hbVar.getClass();
        if (str != null && !drm0.N(str)) {
            String str2 = hbVar.a;
            if (str2 != null && !str2.equals(str)) {
                oc1.c("Ad Unit Id can't be set twice.", new Object[0]);
                return;
            } else {
                hbVar.a = str;
                return;
            }
        }
        oc1.c("Ad Unit Id can't be null or empty.", new Object[0]);
    }

    public d4(e00 e00Var, qx qxVar, hb hbVar, f13 f13Var) {
        this.a = e00Var;
        this.b = qxVar;
        this.c = hbVar;
        this.d = f13Var;
        this.m = true;
        this.o = z11.b;
    }
}
