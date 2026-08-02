package defpackage;

import ru.yandex.taxi.order.state.TaxiOnTheWayStateView;

/* loaded from: classes14.dex */
public final class oxx0 implements kqu {
    public final /* synthetic */ TaxiOnTheWayStateView a;

    public oxx0(TaxiOnTheWayStateView taxiOnTheWayStateView) {
        this.a = taxiOnTheWayStateView;
    }

    @Override // defpackage.kqu
    public final void Ub(boolean z) {
        ((m1t) this.a.getHorizontalButtonsViewPresenter().C).a().e3(z);
    }

    @Override // defpackage.kqu
    public final void gf() {
        ((m1t) this.a.getHorizontalButtonsViewPresenter().C).a().M4();
    }

    @Override // defpackage.kqu
    public final void m3(ibk0 ibk0Var) {
        this.a.getPresenter().M.f(ibk0Var);
    }
}
