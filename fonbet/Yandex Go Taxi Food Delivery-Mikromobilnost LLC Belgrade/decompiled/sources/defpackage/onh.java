package defpackage;

import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class onh implements rl {
    public final r0 a;
    public final mth b;

    public onh() {
        r0 c = bvf0.c(null);
        this.a = c;
        this.b = new mth(c, 6);
    }

    @Override // defpackage.rl
    public final void e() {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
        } while (!r0Var.k(value, sn3.a));
    }

    @Override // defpackage.rl
    public final void h(jl jlVar) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new rn3(jlVar.a())));
    }
}
