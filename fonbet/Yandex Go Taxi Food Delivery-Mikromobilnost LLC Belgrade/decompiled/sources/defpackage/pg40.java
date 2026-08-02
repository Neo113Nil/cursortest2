package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class pg40 implements yt11 {
    public final r0 a;
    public final gci0 b;

    public pg40() {
        r0 c = bvf0.c(rb01.a);
        this.a = c;
        this.b = e.d(c);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.b;
    }

    public final void b(tb01 tb01Var) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.a;
            value = r0Var.getValue();
        } while (!r0Var.k(value, tb01Var));
    }
}
