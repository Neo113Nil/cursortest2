package defpackage;

import java.util.List;
import ru.yandex.taxi.preorder.summary.selector.ui.ribbon.TariffsRibbonView;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes6.dex */
public final class dsx0 implements ufr0 {
    public final /* synthetic */ TariffsRibbonView a;

    public dsx0(TariffsRibbonView tariffsRibbonView) {
        this.a = tariffsRibbonView;
    }

    @Override // defpackage.ufr0
    public final void B9(List list, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState) {
        this.a.invalidateTariffs(list, priceUpdate$PriceLoadingState);
    }
}
