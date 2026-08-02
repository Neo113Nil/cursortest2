package defpackage;

import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes.dex */
public final class k900 implements i3m {
    public final qc20 a;
    public final jse b;

    public k900(tt2 tt2Var, qc20 qc20Var) {
        this.a = qc20Var;
        tt2Var.getClass();
        this.b = uyj.a.P(1);
    }

    @Override // defpackage.i3m
    public final void dispose() {
    }

    @Override // defpackage.i3m
    public final void onDocumentApplied(l1o l1oVar, xzl xzlVar, List list) {
        co11 co11Var = (co11) xzlVar.a.c.b(qoi0.a(co11.class));
        if (co11Var == null || co11Var.a == null) {
            return;
        }
        this.b.o(EmptyCoroutineContext.a, new iy2(20, this, co11Var));
    }
}
