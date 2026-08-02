package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.k430;
import xsna.q430;
import xsna.u430;

/* compiled from: ModerationConfirmAdultFeature.kt */
/* loaded from: classes18.dex */
public final class m430 extends wk50<y430, t430, k430, q430> {
    public final f4z f;
    public final o430 g;

    public m430(r430 r430Var, b25 b25Var) {
        super(k430.c.b, r430Var);
        this.f = new f4z();
        this.g = new o430(b25Var);
    }

    @Override // xsna.wk50
    public final void N(t430 t430Var, k430 k430Var) {
        k430 k430Var2 = k430Var;
        if (k430Var2 instanceof k430.c) {
            T(q430.c.b);
            return;
        }
        if (k430Var2 instanceof k430.b) {
            T(q430.a.b);
            a7f0.a.f(this, this.g.a(), new gmj(this, 25), new hxl(this, 20), 1);
        } else {
            if (!(k430Var2 instanceof k430.a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f.b(new u430.a(true));
        }
    }
}
