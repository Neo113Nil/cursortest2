package defpackage;

import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class kqv0 {
    public final h3y a;
    public final lqv0 b;
    public final zuj0 c;

    public kqv0(h3y h3yVar, lqv0 lqv0Var, zuj0 zuj0Var) {
        this.a = h3yVar;
        this.b = lqv0Var;
        this.c = zuj0Var;
    }

    public final void a() {
        String h;
        boolean a = ((mxg) this.a.get()).a();
        zuj0 zuj0Var = this.c;
        if (a) {
            h = ((avj0) zuj0Var).h(kyh0.suggests_ask_driver);
        } else {
            h = ((avj0) zuj0Var).h(kyh0.summary_destination_prompt);
        }
        us11 us11Var = new us11(h);
        r0 r0Var = this.b.a;
        r0Var.getClass();
        r0Var.m(null, us11Var);
    }
}
