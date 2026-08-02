package defpackage;

import com.yandex.go.taxi.summary.drive.vertical_tariff_selector.VerticalTariffSelectorView;
import java.util.List;

/* loaded from: classes14.dex */
public final class bj31 implements wi31 {
    public final /* synthetic */ VerticalTariffSelectorView a;

    public bj31(VerticalTariffSelectorView verticalTariffSelectorView) {
        this.a = verticalTariffSelectorView;
    }

    @Override // defpackage.wi31
    public final void G5(yi31 yi31Var) {
        List list = yi31Var.a;
        VerticalTariffSelectorView verticalTariffSelectorView = this.a;
        verticalTariffSelectorView.renderVerticals(list);
        verticalTariffSelectorView.renderTariffs(yi31Var.b);
    }
}
