package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ad80;
import xsna.me80;

/* compiled from: OnboardingFeature.kt */
/* loaded from: classes3.dex */
public final class kd80 extends wk50<gi80, xh80, ad80, me80> {
    public final td80 f;
    public final f4z g;
    public final io.reactivex.rxjava3.disposables.g h;
    public boolean i;

    public kd80(jh80 jh80Var, td80 td80Var) {
        super(ad80.b.b, jh80Var);
        this.f = td80Var;
        this.g = new f4z();
        this.h = new io.reactivex.rxjava3.disposables.g();
    }

    @Override // xsna.wk50
    public final void N(xh80 xh80Var, ad80 ad80Var) {
        xh80 xh80Var2 = xh80Var;
        ad80 ad80Var2 = ad80Var;
        if (ad80Var2 instanceof ad80.b) {
            T(new me80.a(xh80Var2.b));
            return;
        }
        boolean z = ad80Var2 instanceof ad80.c;
        td80 td80Var = this.f;
        if (z) {
            this.i = true;
            this.h.b(hg1.g(R(S(td80Var.a(((ad80.c) ad80Var2).b))), new dy0(21, new lb6(21, this, ad80Var2), this)));
            return;
        }
        if (!(ad80Var2 instanceof ad80.a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.i) {
            return;
        }
        this.h.b(hg1.g(R(S(td80Var.a(((ad80.a) ad80Var2).b))), new dy0(21, new cy0(21, ad80Var2, this), this)));
    }
}
