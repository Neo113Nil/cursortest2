package defpackage;

import yads.t92;

/* loaded from: classes7.dex */
public final class mh71 extends nr41 {
    public final tj61 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh71(t92 t92Var, dg61 dg61Var, dv81 dv81Var, s291 s291Var, mj61 mj61Var, bl81 bl81Var) {
        super(t92Var);
        a081 a081Var;
        lm71 lm71Var = new lm71(dg61Var);
        i971 i971Var = new i971(11, t92Var);
        new ne71();
        new vs71();
        new vo61();
        mm81 mm81Var = new mm81();
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
        tj61 tj61Var = new tj61(t92Var, i971Var, mm81Var, a081Var2.a(t92Var.b));
        this.c = tj61Var;
        tj61Var.h = lm71Var;
        tj61Var.l = dv81Var;
        tj61Var.j = s291Var;
        tj61Var.i = mj61Var;
        tj61Var.k = bl81Var;
    }

    @Override // defpackage.nr41
    public final void g(String str) {
        tj61 tj61Var = this.c;
        ne71.a(tj61Var.a.getContext(), tj61Var.g, new sj61(tj61Var, str, 1));
    }
}
