package defpackage;

import java.util.List;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class iw10 {
    public final r0 a;
    public final gci0 b;
    public final r0 c;
    public final gci0 d;

    public iw10() {
        r0 c = bvf0.c(null);
        this.a = c;
        this.b = e.d(c);
        r0 c2 = bvf0.c(null);
        this.c = c2;
        this.d = e.d(c2);
    }

    public final void a(List list, List list2) {
        r0 r0Var = this.a;
        if (list != null) {
            r0Var.getClass();
            r0Var.m(null, list);
            return;
        }
        r0 r0Var2 = this.c;
        if (list2 != null) {
            r0Var2.getClass();
            r0Var2.m(null, list2);
        } else {
            r0Var.l(null);
            r0Var2.l(null);
        }
    }
}
