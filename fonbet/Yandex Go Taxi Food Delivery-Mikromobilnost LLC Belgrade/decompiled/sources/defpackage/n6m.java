package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.preorder.summary.selector.ui.verticals.DoubleTariffRibbonView;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes6.dex */
public final class n6m implements r6m {
    public final /* synthetic */ DoubleTariffRibbonView a;

    public n6m(DoubleTariffRibbonView doubleTariffRibbonView) {
        this.a = doubleTariffRibbonView;
    }

    @Override // defpackage.r6m
    public final void v5(ArrayList arrayList, List list, int i, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, boolean z) {
        this.a.renderUiContent(arrayList, list, i, priceUpdate$PriceLoadingState, z);
    }
}
