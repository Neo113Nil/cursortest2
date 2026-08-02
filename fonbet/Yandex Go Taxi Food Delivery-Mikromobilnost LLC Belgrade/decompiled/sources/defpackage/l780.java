package defpackage;

import com.yandex.go.safety.center.b;
import com.yandex.go.taxi.order.state.OrderStateViewPresenter$attachView$$inlined$safeCollectIn$1;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public abstract class l780 extends qc5 {
    public final o2y0 A;
    public final p4j B;
    public final spl0 C;
    public final hbp0 D;

    public l780(Class cls, ney neyVar, o2y0 o2y0Var, p4j p4jVar, spl0 spl0Var) {
        super(cls, neyVar);
        this.A = o2y0Var;
        this.B = p4jVar;
        this.C = spl0Var;
        this.D = new hbp0(new czo0(14), "", null);
    }

    @Override // defpackage.qc5, defpackage.ad5, defpackage.zc5
    public void Cg() {
        super.Cg();
        this.D.b();
    }

    public final void Mg(k780 k780Var) {
        Bg(k780Var);
        hbp0 hbp0Var = this.D;
        hbp0Var.a();
        tje.N(hbp0Var, null, null, new OrderStateViewPresenter$attachView$$inlined$safeCollectIn$1(e.t(((b) this.C).b(this.A)), null, this), 3);
    }
}
