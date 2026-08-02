package defpackage;

import android.net.Uri;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.state.o;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.order.BottomCircleButtonsView;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.order.state.TaxiOnTheWayStateView;

/* loaded from: classes14.dex */
public final class nxx0 implements BottomCircleButtonsView.a {
    public final /* synthetic */ TaxiOnTheWayStateView a;

    public nxx0(TaxiOnTheWayStateView taxiOnTheWayStateView) {
        this.a = taxiOnTheWayStateView;
    }

    @Override // ru.yandex.taxi.order.BottomCircleButtonsView.a
    public final void A4() {
        o presenter = this.a.getPresenter();
        x980 x980Var = presenter.F;
        o2y0 o2y0Var = presenter.A;
        f fVar = (f) x980Var;
        fVar.getClass();
        OrderStatusInfo.TransportInfo transportInfo = o2y0Var.b().V().t0;
        if (transportInfo != null) {
            ((n3h) fVar.r0.get()).a(Uri.parse(transportInfo.a), DeeplinkSource.TOTW_COMMUNICATIONS);
        }
    }

    @Override // ru.yandex.taxi.order.BottomCircleButtonsView.a
    public final void af() {
        TaxiOnTheWayStateView taxiOnTheWayStateView = this.a;
        taxiOnTheWayStateView.getMakeAnotherOrderButtonPresenter().Kg();
        taxiOnTheWayStateView.getPresenter().B.c("AddTaxi");
    }

    @Override // ru.yandex.taxi.order.BottomCircleButtonsView.a
    public final void onCancelClick() {
        o presenter = this.a.getPresenter();
        ((f) presenter.F).s0(presenter.A);
        presenter.B.c("Cancel");
    }

    @Override // ru.yandex.taxi.order.BottomCircleButtonsView.a
    public final void se() {
        o presenter = this.a.getPresenter();
        ((f) presenter.F).u0(presenter.A.b().a);
        presenter.B.c("SafetyCenter");
    }
}
