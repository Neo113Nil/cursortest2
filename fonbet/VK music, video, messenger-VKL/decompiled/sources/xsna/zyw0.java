package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.azw0;
import xsna.yyw0;

/* compiled from: VoipScreenShareReducer.kt */
/* loaded from: classes7.dex */
public final class zyw0 extends dm50<e2x0, yyw0, azw0> {
    public final bzw0 d;

    public zyw0() {
        super(azw0.b.b);
        this.d = new bzw0();
    }

    @Override // xsna.dm50
    public final azw0 c(azw0 azw0Var, yyw0 yyw0Var) {
        azw0 azw0Var2 = azw0Var;
        yyw0 yyw0Var2 = yyw0Var;
        if (yyw0Var2 instanceof yyw0.b) {
            ((yyw0.b) yyw0Var2).getClass();
            return new azw0.a(false);
        }
        if (yyw0Var2 instanceof yyw0.a) {
            return !(azw0Var2 instanceof azw0.a) ? azw0Var2 : new azw0.a(((yyw0.a) yyw0Var2).b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final e2x0 d() {
        return new e2x0(e(new gyo0(this, 24)));
    }

    @Override // xsna.dm50
    public final void h(azw0 azw0Var, e2x0 e2x0Var) {
        f(e2x0Var.a, azw0Var);
    }
}
