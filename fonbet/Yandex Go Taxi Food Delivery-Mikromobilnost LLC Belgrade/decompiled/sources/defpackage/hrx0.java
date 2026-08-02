package defpackage;

import ru.yandex.taxi.cashback.analytics.CashbackCardContext;
import ru.yandex.taxi.tooltips.manager.TooltipPlacement;

/* loaded from: classes6.dex */
public final class hrx0 extends xb5 {
    public final k4c0 A = new k4c0();
    public final d49 x;
    public final t49 y;
    public final gvz0 z;

    public hrx0(d49 d49Var, t49 t49Var, gvz0 gvz0Var) {
        this.x = d49Var;
        this.y = t49Var;
        this.z = gvz0Var;
    }

    @Override // defpackage.xb5
    public final Runnable Hg() {
        return new lnv0(29, this);
    }

    @Override // defpackage.xb5
    public final long Ig() {
        return 5000L;
    }

    @Override // defpackage.xb5
    public final void Jg(int i) {
        if (this.z.a(this.A, TooltipPlacement.SUMMARY_TARIFF_SELECTOR)) {
            super.Jg(i);
        }
    }

    @Override // defpackage.xb5
    public final void Kg() {
        super.Kg();
        d49 d49Var = this.x;
        d49Var.getClass();
        d49.d(d49Var, CashbackCardContext.TARIFF_CARD);
    }
}
