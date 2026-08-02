package defpackage;

import com.yandex.plus.log.api.LogPriority;
import kotlinx.coroutines.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class b0u {
    public final rkd0 a;
    public final r0 b;
    public final s8x c;

    public b0u(qo2 qo2Var, omy0 omy0Var, uog uogVar, xyj xyjVar, ike ikeVar, rkd0 rkd0Var) {
        this.a = rkd0Var;
        new wdz(uogVar);
        new xap();
        this.b = bvf0.c(null);
        this.c = a.a();
    }

    public final void a() {
        r0 r0Var;
        Object value;
        LogPriority logPriority = LogPriority.DEBUG;
        rkd0 rkd0Var = this.a;
        if (rkd0Var.e(logPriority)) {
            rkd0Var.b(logPriority, "GraphQLUserRepository", "clearCache()", null);
        }
        do {
            r0Var = this.b;
            value = r0Var.getValue();
            a.h(this.c);
        } while (!r0Var.k(value, null));
    }
}
