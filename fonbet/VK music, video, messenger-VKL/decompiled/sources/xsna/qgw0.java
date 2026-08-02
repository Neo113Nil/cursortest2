package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.pgw0;
import xsna.rgw0;

/* compiled from: VoipCallByPhoneReducer.kt */
/* loaded from: classes7.dex */
public final class qgw0 extends dm50<tgw0, pgw0, rgw0> {
    public final ugw0 d;

    public qgw0() {
        super(rgw0.g.b);
        this.d = new ugw0();
    }

    @Override // xsna.dm50
    public final rgw0 c(rgw0 rgw0Var, pgw0 pgw0Var) {
        pgw0 pgw0Var2 = pgw0Var;
        if (pgw0Var2 instanceof pgw0.f) {
            return new rgw0.d("", false, false, true);
        }
        if (pgw0Var2 instanceof pgw0.h) {
            pgw0.h hVar = (pgw0.h) pgw0Var2;
            return new rgw0.d(hVar.b, hVar.c, hVar.d, false);
        }
        if (pgw0Var2 instanceof pgw0.e) {
            return rgw0.f.b;
        }
        if (pgw0Var2 instanceof pgw0.g) {
            return rgw0.h.b;
        }
        if (pgw0Var2 instanceof pgw0.d) {
            return new rgw0.c(((pgw0.d) pgw0Var2).b);
        }
        if (pgw0Var2 instanceof pgw0.i) {
            return new rgw0.i(((pgw0.i) pgw0Var2).b);
        }
        if (pgw0Var2 instanceof pgw0.a) {
            return rgw0.a.b;
        }
        if (pgw0Var2 instanceof pgw0.b) {
            return new rgw0.b(((pgw0.b) pgw0Var2).b);
        }
        if (pgw0Var2 instanceof pgw0.c) {
            return new rgw0.e(((pgw0.c) pgw0Var2).b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final tgw0 d() {
        return new tgw0(e(new n9m0(this, 24)));
    }

    @Override // xsna.dm50
    public final void h(rgw0 rgw0Var, tgw0 tgw0Var) {
        f(tgw0Var.a, rgw0Var);
    }
}
