package yads;

import xsna.s3q0;

/* loaded from: classes10.dex */
public final class ox1 implements hx1 {
    public final tx1 a;
    public final pk1 b;
    public final px1 c;

    public ox1(tx1 tx1Var, pk1 pk1Var, px1 px1Var) {
        this.a = tx1Var;
        this.b = pk1Var;
        this.c = px1Var;
    }

    @Override // yads.hx1
    public final void a() {
        tx1 tx1Var = this.a;
        px1 px1Var = this.c;
        if (px1Var.a && px1Var.b.isActive()) {
            px1Var.b.resumeWith(s3q0.a);
        }
    }

    @Override // yads.hx1
    public final void b() {
        px1 px1Var = this.c;
        if (px1Var.a && px1Var.b.isActive()) {
            px1Var.b.resumeWith(s3q0.a);
        }
    }
}
