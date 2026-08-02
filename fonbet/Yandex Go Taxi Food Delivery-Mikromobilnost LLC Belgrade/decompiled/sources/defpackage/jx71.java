package defpackage;

import android.content.Context;
import yads.f5;
import yads.n32;

/* loaded from: classes7.dex */
public final class jx71 implements Runnable {
    public final d881 a;
    public final qb71 b;
    public final ck61 c;
    public final fo71 w;
    public final z081 x;
    public final /* synthetic */ w381 y;

    public jx71(w381 w381Var, d881 d881Var, qb71 qb71Var, ck61 ck61Var, fo71 fo71Var) {
        yi61 yi61Var = new yi61();
        this.y = w381Var;
        this.a = d881Var;
        this.b = qb71Var;
        this.c = ck61Var;
        this.w = fo71Var;
        hn71 b = yi61Var.b(w381Var.b, d881Var);
        Context context = w381Var.e;
        v981 v981Var = w381Var.a;
        v981Var.getClass();
        this.x = new z081(wfa1.b(context, new m771(((n291) v981Var).a)), b);
    }

    @Override // java.lang.Runnable
    public final void run() {
        w381 w381Var = this.y;
        qb71 qb71Var = this.b;
        fo71 fo71Var = this.w;
        try {
            if (qb71Var == null) {
                fo71Var.b(so61.c);
                return;
            }
            if (qb71Var.a.isEmpty()) {
                fo71Var.b(so61.h);
                return;
            }
            tg81 tg81Var = new tg81(w381Var.b, this.a, qb71Var);
            e971 e971Var = w381Var.c;
            au71 au71Var = new au71(this, fo71Var, e971Var);
            e971Var.b(f5.n, null);
            rx71 rx71Var = w381Var.g;
            Context context = w381Var.e;
            fe81 fe81Var = w381Var.b;
            z081 z081Var = this.x;
            fo71 fo71Var2 = this.w;
            rx71Var.getClass();
            tje.N(rx71Var.a, new qx71(1, fo71Var2), null, new n32(context, fo71Var2, au71Var, rx71Var, fe81Var, tg81Var, z081Var, null), 2);
        } catch (Exception unused) {
            fo71Var.b(so61.c);
        }
    }
}
