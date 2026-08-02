package defpackage;

import com.yandex.go.taxi.order.feed.ui.TaxiOrderFlexView;
import com.yandex.go.taxi.order.multi.feed.ui.TaxiOrderFeedView;
import java.util.List;

/* loaded from: classes14.dex */
public final class m1y0 implements i3m {
    public final /* synthetic */ TaxiOrderFlexView a;

    public m1y0(TaxiOrderFlexView taxiOrderFlexView) {
        this.a = taxiOrderFlexView;
    }

    @Override // defpackage.i3m
    public final void dispose() {
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingFailed(l1o l1oVar, u1m u1mVar, Throwable th, List list) {
        this.a.renderErrorState(true);
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingFinished(l1o l1oVar, u1m u1mVar, xzl xzlVar, List list) {
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingStarted(l1o l1oVar, u1m u1mVar, List list) {
    }

    @Override // defpackage.i3m
    public final void onDocumentPause(l1o l1oVar, u1m u1mVar, List list) {
    }

    @Override // defpackage.i3m
    public final void onDocumentResume(l1o l1oVar, u1m u1mVar, List list) {
    }

    @Override // defpackage.i3m
    public final void onRenderingFinished(l1o l1oVar, u1m u1mVar, xzl xzlVar, long j, List list) {
        q1y0 q1y0Var;
        m7y0 m7y0Var;
        q1y0Var = this.a.flexViewCallback;
        m7y0Var = ((TaxiOrderFeedView) ((l7s0) ((gym) q1y0Var).a).a).delegate;
        ((k7y0) m7y0Var).a.updateNestedScrollingChild(false);
    }

    @Override // defpackage.i3m
    public final void onRenderingStarted(l1o l1oVar, u1m u1mVar, xzl xzlVar, List list) {
        q1y0 q1y0Var;
        m7y0 m7y0Var;
        q1y0Var = this.a.flexViewCallback;
        m7y0Var = ((TaxiOrderFeedView) ((l7s0) ((gym) q1y0Var).a).a).delegate;
        ((k7y0) m7y0Var).a.updateNestedScrollingChild(false);
    }
}
