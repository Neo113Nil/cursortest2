package defpackage;

import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final class m631 implements bnr0 {
    public final Map a;

    public m631(Map map) {
        this.a = map;
    }

    @Override // defpackage.bnr0
    public final bnr0 a(bnr0 bnr0Var) {
        if (!(bnr0Var instanceof m631)) {
            return this;
        }
        return new m631(b.n(this.a, ((m631) bnr0Var).a));
    }
}
