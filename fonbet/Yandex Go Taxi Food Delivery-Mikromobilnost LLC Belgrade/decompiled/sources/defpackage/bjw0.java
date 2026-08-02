package defpackage;

import android.content.Context;
import com.yandex.go.taxi.order.support.ui.details.SupportDetailsModalView;

/* loaded from: classes14.dex */
public final class bjw0 extends m230 {
    public final w030 E;
    public final ziw0 F;
    public final fjw0 G;
    public final boolean H;

    public bjw0(w030 w030Var, ziw0 ziw0Var, fjw0 fjw0Var) {
        super(null);
        this.E = w030Var;
        this.F = ziw0Var;
        this.G = fjw0Var;
        this.H = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.H;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        ejw0 ejw0Var = new ejw0(new wor0(this), (akw0) obj, (piw0) this.G.a.a.get());
        cjw0 cjw0Var = this.F.a;
        return new SupportDetailsModalView((Context) ((qag) cjw0Var.a).get(), ejw0Var, (pav) ((qag) cjw0Var.b).get(), (ip11) ((qag) cjw0Var.c).get());
    }
}
