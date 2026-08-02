package defpackage;

import com.yandex.go.drive.vertical.ui.tariff_card.collapsed.DriveTariffCardCollapsedView;
import com.yandex.go.summary.analytics.SummaryAnalytics$AddressPlacement;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryAction;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryExpandingState;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class ngm implements SourceDestinationComponent.a {
    public final /* synthetic */ DriveTariffCardCollapsedView a;

    public ngm(DriveTariffCardCollapsedView driveTariffCardCollapsedView) {
        this.a = driveTariffCardCollapsedView;
    }

    @Override // ru.yandex.taxi.address.design.SourceDestinationComponent.a
    public final void Y() {
        lgm lgmVar;
        lgmVar = this.a.presenter;
        rrj.T((rrj) lgmVar.x.a, PointType.SOURCE);
        lgmVar.A.e(SummaryAnalytics$SummaryExpandingState.Collapsed, SummaryAnalytics$AddressPlacement.AddressHeader);
    }

    @Override // ru.yandex.taxi.address.design.SourceDestinationComponent.a
    public final void x0() {
        lgm lgmVar;
        lgmVar = this.a.presenter;
        rrj.T((rrj) lgmVar.x.a, PointType.DESTINATION);
        lgmVar.A.c(SummaryAnalytics$SummaryExpandingState.Collapsed, SummaryAnalytics$AddressPlacement.AddressHeader, SummaryAnalytics$SummaryAction.AddressSuggest);
    }
}
