package defpackage;

import com.yandex.go.loyalty.impl.common.domain.a;
import com.yandex.go.payments.paymentlist.data.c;
import com.yandex.go.payments.paymentlist.domain.l;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public final class hda0 extends h55 {
    public final i6r D;
    public final ycq0 E;
    public final cda0 F;
    public final ryz G;
    public final yvf0 H;
    public final aca0 I;

    public hda0(i6r i6rVar, ycq0 ycq0Var, cda0 cda0Var, ryz ryzVar, yvf0 yvf0Var, aca0 aca0Var) {
        super(null);
        this.D = i6rVar;
        this.E = ycq0Var;
        this.F = cda0Var;
        this.G = ryzVar;
        this.H = yvf0Var;
        this.I = aca0Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ida0 ida0Var = (ida0) obj;
        ((c) this.F).p();
        jba0 jba0Var = ida0Var.d;
        if (jba0Var == null) {
            jba0Var = (jba0) this.H.get();
        }
        jba0 jba0Var2 = jba0Var;
        ffa0 ffa0Var = ida0Var.b;
        tpr tprVar = ida0Var.c;
        yuf0 yuf0Var = this.I.a;
        l lVar = new l(tprVar, (ycq0) ((xvf0) yuf0Var.a).get(), (ryz) ((xvf0) yuf0Var.b).get(), i5m.a((xvf0) yuf0Var.c), i5m.a((xvf0) yuf0Var.d), (a) ((xvf0) yuf0Var.e).get(), i5m.a((vve) yuf0Var.f));
        uba0 uba0Var = ida0Var.e;
        uba0 a = uba0.a(uba0Var, new kjz(20, uba0Var.c, this), null, null, 59);
        jba0Var2.getClass();
        ffa0Var.getClass();
        i6r i6rVar = this.D;
        i6rVar.getClass();
        A(new j5g(i6rVar, TariffOrderFlow.ORDER_FLOW_TAXI_KEY, jba0Var2, ffa0Var, lVar, a).a(), ida0Var.a, new lm10(this, 1));
    }
}
