package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.qlx0;
import xsna.slx0;

/* compiled from: WhiteboardReducer.kt */
/* loaded from: classes7.dex */
public final class xlx0 extends dm50<com.vk.voip.ui.whiteboard.presentation.main.ui.b, slx0, qlx0> {
    public xlx0() {
        super(new qlx0(0));
    }

    @Override // xsna.dm50
    public final qlx0 c(qlx0 qlx0Var, slx0 slx0Var) {
        qlx0 qlx0Var2 = qlx0Var;
        slx0 slx0Var2 = slx0Var;
        if (slx0Var2 instanceof slx0.b) {
            return qlx0.a(qlx0Var2, null, ((slx0.b) slx0Var2).b, false, null, 13);
        }
        if (slx0Var2 instanceof slx0.c) {
            return qlx0.a(qlx0Var2, null, false, ((slx0.c) slx0Var2).b, null, 11);
        }
        if (slx0Var2 instanceof slx0.a) {
            return qlx0.a(qlx0Var2, ((slx0.a) slx0Var2).b, false, false, null, 14);
        }
        if (slx0Var2 instanceof slx0.e) {
            return qlx0.a(qlx0Var2, null, false, false, new qlx0.a.c(((slx0.e) slx0Var2).b), 7);
        }
        if (slx0Var2 instanceof slx0.d) {
            return qlx0.a(qlx0Var2, null, false, false, new qlx0.a.b(((slx0.d) slx0Var2).b), 7);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final com.vk.voip.ui.whiteboard.presentation.main.ui.b d() {
        return new com.vk.voip.ui.whiteboard.presentation.main.ui.b(e(new gqq0(this, 15)));
    }

    @Override // xsna.dm50
    public final void h(qlx0 qlx0Var, com.vk.voip.ui.whiteboard.presentation.main.ui.b bVar) {
        f(bVar.a, qlx0Var);
    }
}
