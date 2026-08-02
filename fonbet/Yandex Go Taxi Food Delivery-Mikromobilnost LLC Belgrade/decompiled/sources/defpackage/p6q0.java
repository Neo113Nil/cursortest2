package defpackage;

import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final class p6q0 implements bnr0 {
    public final Map a;

    public p6q0(Map map) {
        this.a = map;
    }

    @Override // defpackage.bnr0
    public final bnr0 a(bnr0 bnr0Var) {
        if (!(bnr0Var instanceof p6q0)) {
            return this;
        }
        return new p6q0(b.n(this.a, ((p6q0) bnr0Var).a));
    }
}
