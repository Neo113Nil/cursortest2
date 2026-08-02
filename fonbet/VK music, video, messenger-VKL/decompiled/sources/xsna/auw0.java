package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ytw0;

/* compiled from: VoipParticipantSettingsReducer.kt */
/* loaded from: classes7.dex */
public final class auw0 extends dm50<duw0, ytw0, buw0> {
    public auw0() {
        super(new buw0(0));
    }

    @Override // xsna.dm50
    public final buw0 c(buw0 buw0Var, ytw0 ytw0Var) {
        buw0 buw0Var2 = buw0Var;
        ytw0 ytw0Var2 = ytw0Var;
        if (ytw0Var2 instanceof ytw0.c) {
            return buw0.a(buw0Var2, ((ytw0.c) ytw0Var2).b, null, 62);
        }
        if (ytw0Var2 instanceof ytw0.b) {
            return buw0.a(buw0Var2, false, ((ytw0.b) ytw0Var2).b, 61);
        }
        if (ytw0Var2 instanceof ytw0.a) {
            return buw0.a(buw0Var2, false, null, 61);
        }
        if (!(ytw0Var2 instanceof ytw0.d)) {
            throw new NoWhenBranchMatchedException();
        }
        buw0 buw0Var3 = ((ytw0.d) ytw0Var2).b;
        return new buw0(buw0Var3.b, buw0Var3.c, buw0Var3.d, buw0Var3.e, buw0Var3.f, buw0Var3.g);
    }

    @Override // xsna.dm50
    public final duw0 d() {
        return new duw0(e(new mrw0(this, 1)));
    }

    @Override // xsna.dm50
    public final void h(buw0 buw0Var, duw0 duw0Var) {
        f(duw0Var.a, buw0Var);
    }
}
