package defpackage;

import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView;

/* loaded from: classes6.dex */
public final class asx0 implements vsx0 {
    public final /* synthetic */ TariffsRibbonView a;

    public asx0(TariffsRibbonView tariffsRibbonView) {
        this.a = tariffsRibbonView;
    }

    @Override // defpackage.vsx0
    public final void a(int i) {
        this.a.onTariffsSetAndPositioned(i);
    }

    @Override // defpackage.vsx0
    public final void b() {
        xrx0 xrx0Var;
        xrx0Var = this.a.presenter;
        fva0.b(xrx0Var.C, "TariffSelector.Change", PerformanceAnalytics$Type.Animation, null, 4);
    }
}
