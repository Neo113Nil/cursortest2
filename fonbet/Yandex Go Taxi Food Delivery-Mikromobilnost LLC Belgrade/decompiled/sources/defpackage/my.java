package defpackage;

import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes4.dex */
public final class my implements bnr0 {
    public static final my b = new my(b.f());
    public final Map a;

    public my(Map map) {
        this.a = map;
    }

    @Override // defpackage.bnr0
    public final bnr0 a(bnr0 bnr0Var) {
        if (!(bnr0Var instanceof my)) {
            return this;
        }
        return new my(b.n(this.a, ((my) bnr0Var).a));
    }
}
