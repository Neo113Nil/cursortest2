package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes10.dex */
public final class e3g0 {
    public final xk60 a;
    public final y4g0 b;
    public final q3g0 c;

    public e3g0(xk60 xk60Var, y4g0 y4g0Var, q3g0 q3g0Var) {
        this.a = xk60Var;
        this.b = y4g0Var;
        this.c = q3g0Var;
    }

    public final c4g0 a() {
        Set set;
        Set set2;
        if (this.c.a().b) {
            y4g0 y4g0Var = this.b;
            set = y4g0Var.b();
            set2 = y4g0Var.a.a.a();
        } else {
            set = EmptySet.a;
            set2 = set;
        }
        return new c4g0(set, set2, this.a.b());
    }
}
