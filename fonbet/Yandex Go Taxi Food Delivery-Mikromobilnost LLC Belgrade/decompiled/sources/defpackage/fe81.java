package defpackage;

import yads.s83;
import yads.t32;
import yads.xz;
import yads.zp1;

/* loaded from: classes7.dex */
public final class fe81 {
    public final xz a;
    public final mj31 b;
    public final hh61 c;
    public final h571 d;
    public nl61 e;
    public t32 f;
    public s83 g;
    public String h;
    public String i;
    public Integer j;
    public zp1 k;
    public String l;
    public boolean m;
    public int n;
    public final int o;

    public fe81(xz xzVar) {
        mj31 mj31Var = new mj31(new p671(), new c171());
        hh61 hh61Var = new hh61();
        h571 h571Var = new h571();
        this.a = xzVar;
        this.b = mj31Var;
        this.c = hh61Var;
        this.d = h571Var;
        this.m = true;
        this.o = gl71.b;
    }

    public final void a(String str) {
        hh61 hh61Var = this.c;
        hh61Var.getClass();
        if (str == null || evu0.J(str)) {
            qc71.c("Ad Unit Id can't be null or empty.", new Object[0]);
            return;
        }
        String str2 = hh61Var.a;
        if (str2 == null || str2.equals(str)) {
            hh61Var.a = str;
        } else {
            qc71.c("Ad Unit Id can't be set twice.", new Object[0]);
        }
    }
}
