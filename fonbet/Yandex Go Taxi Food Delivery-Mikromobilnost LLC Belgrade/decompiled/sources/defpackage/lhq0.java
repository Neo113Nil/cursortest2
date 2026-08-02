package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class lhq0 {
    public final u1v a;
    public final r0 b;
    public final gci0 c;

    public lhq0(u1v u1vVar) {
        this.a = u1vVar;
        r0 c = bvf0.c(null);
        this.b = c;
        this.c = e.d(c);
    }

    public final khq0 a() {
        return (khq0) this.b.getValue();
    }

    public final void b(khq0 khq0Var) {
        String str = khq0Var.a;
        this.a.a = str;
        r0 r0Var = this.b;
        khq0 khq0Var2 = (khq0) r0Var.getValue();
        jl40.l(str, khq0Var2 != null ? khq0Var2.a : null);
        r0Var.getClass();
        r0Var.m(null, khq0Var);
    }
}
