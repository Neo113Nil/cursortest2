package defpackage;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes9.dex */
public final class hf4 implements vw60 {
    public final Lifecycle a;
    public final yvf0 b;
    public final kf4 c;
    public g18 d = g18.u1;

    public hf4(Lifecycle lifecycle, yvf0 yvf0Var, kf4 kf4Var) {
        this.a = lifecycle;
        this.b = yvf0Var;
        this.c = kf4Var;
    }

    @Override // defpackage.vw60
    public final void c() {
        this.d = this.c.a.a(new gf4(this));
        cey.b(this.a, Lifecycle.Event.ON_DESTROY, new b7(10, this));
    }

    @Override // defpackage.s150
    public final String getName() {
        return "BackToActiveOrderActivityListener";
    }
}
