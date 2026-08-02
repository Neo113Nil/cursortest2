package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class cx31 extends w9s {
    public final ykn0 c;

    public cx31(qp7 qp7Var, ykn0 ykn0Var) {
        super(qp7Var);
        this.c = ykn0Var;
    }

    @Override // defpackage.w9s, defpackage.qp7
    public final euy g(int i, int i2, ArrayList arrayList) {
        d6z.m("Only support one capture config.", arrayList.size() == 1);
        euy q = this.b.q(i);
        return ni91.b(Collections.singletonList(ni91.n(ni91.n(ni91.n(jqs.a(q), new qqs(q, 2), geb1.b()), new r3k0(27, this, arrayList), geb1.b()), new qqs(q, 3), geb1.b())));
    }
}
