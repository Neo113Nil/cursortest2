package defpackage;

import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final class m6x implements bnr0 {
    public final Map a;

    public m6x(Map map) {
        this.a = map;
    }

    @Override // defpackage.bnr0
    public final bnr0 a(bnr0 bnr0Var) {
        if (!(bnr0Var instanceof m6x)) {
            return this;
        }
        return new m6x(b.n(this.a, ((m6x) bnr0Var).a));
    }
}
