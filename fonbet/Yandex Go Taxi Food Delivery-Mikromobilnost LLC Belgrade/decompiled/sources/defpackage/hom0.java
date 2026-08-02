package defpackage;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.state.o;
import com.yandex.go.taxi.order.titles.f;

/* loaded from: classes6.dex */
public final class hom0 extends o {
    public final bu1 R;
    public final a3y0 S;
    public final f T;

    public hom0(n0g n0gVar, ney neyVar, h980 h980Var, bu1 bu1Var) {
        super(n0gVar, gom0.class, neyVar);
        this.R = bu1Var;
        this.S = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "ScheduledStatePresenter");
        this.T = h980Var.a();
    }

    @Override // com.yandex.go.taxi.order.state.o, defpackage.l780, defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.T.d();
    }
}
