package defpackage;

import com.yandex.go.taxi.order.details.v2.analytics.perf.a;
import com.yandex.go.taxi.order.details.v2.state.RideCardState$ProcessingStep;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.compact.RideCardCompactView;
import com.yandex.go.taxi.order.multi.tracking.j;

/* loaded from: classes14.dex */
public final class iek0 implements dek0 {
    public final /* synthetic */ RideCardCompactView a;

    public iek0(RideCardCompactView rideCardCompactView) {
        this.a = rideCardCompactView;
    }

    @Override // defpackage.dek0
    public final void Z3(fek0 fek0Var) {
        a aVar;
        bkk0 itemsAdapter;
        u6y0 u6y0Var;
        RideCardState$ProcessingStep rideCardState$ProcessingStep = fek0Var.b.b;
        RideCardCompactView rideCardCompactView = this.a;
        aVar = rideCardCompactView.perfAnalyticsTracer;
        qnk0 qnk0Var = fek0Var.b;
        aVar.f(rideCardState$ProcessingStep, qnk0Var.a.size());
        itemsAdapter = rideCardCompactView.getItemsAdapter();
        itemsAdapter.submitList(qnk0Var.a, new hek0(this, fek0Var, rideCardCompactView, rideCardState$ProcessingStep, 0));
        u6y0Var = rideCardCompactView.taxiOrderTrackingCompactViewDelegate;
        if (u6y0Var != null) {
            ((j) u6y0Var).a.renderTopDecoration(fek0Var.c);
        }
    }

    @Override // defpackage.dek0
    public final void setCollapseRate(float f) {
        float f2;
        int i;
        int i2;
        int calculateCollapseHeight;
        RideCardCompactView rideCardCompactView = this.a;
        f2 = rideCardCompactView.rate;
        if (f2 == f) {
            return;
        }
        rideCardCompactView.rate = f;
        i = rideCardCompactView.maxHeight;
        if (i != 0) {
            i2 = rideCardCompactView.maxHeight;
            calculateCollapseHeight = rideCardCompactView.calculateCollapseHeight(i2, f);
            if (calculateCollapseHeight != rideCardCompactView.getHeight()) {
                rideCardCompactView.requestLayout();
            }
        }
    }

    @Override // defpackage.dek0
    public final void setMinHeight(int i) {
        if (i <= 0) {
            return;
        }
        this.a.minHeight = i;
    }
}
