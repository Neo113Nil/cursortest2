package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView;

/* loaded from: classes6.dex */
public final class fsx0 extends RecyclerView.g {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ TariffsRibbonView b;

    public fsx0(Runnable runnable, TariffsRibbonView tariffsRibbonView) {
        this.a = runnable;
        this.b = tariffsRibbonView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        sjp0 sjp0Var;
        if (i == 0) {
            this.a.run();
            TariffsRibbonView tariffsRibbonView = this.b;
            tariffsRibbonView.getTariffsRibbon().removeOnScrollListener(this);
            RecyclerView tariffsRibbon = tariffsRibbonView.getTariffsRibbon();
            sjp0Var = tariffsRibbonView.scrollWithoutSelectListener;
            tariffsRibbon.addOnScrollListener(sjp0Var);
        }
    }
}
