package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class mo40 {
    public final lo40 a;
    public final n0 b;

    public mo40(yyq0 yyq0Var) {
        Object a = yyq0Var.a("MulticlassButtonRepository", new ko40());
        if (!(a instanceof lo40)) {
            xby.t(jst.e, "SESSION_STORAGE:FEATURE_DATA_TYPE_INCONSISTENCY", null, "Feature storage with id=MulticlassButtonRepository is expected to has type " + qoi0.e(lo40.class) + " but get " + (a != null ? a.getClass() : null), 6);
            a = new lo40();
        }
        this.a = (lo40) a;
        this.b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    }

    public final void a(op40 op40Var) {
        boolean z = op40Var != null ? op40Var.a : false;
        lo40 lo40Var = this.a;
        lo40Var.a = z;
        lo40Var.c = op40Var != null ? op40Var.b : null;
        lo40Var.b = op40Var != null ? op40Var.c : null;
        this.b.g(zy11.a);
    }
}
