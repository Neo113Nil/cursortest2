package defpackage;

import com.yandex.go.taxi.order.rate.RateView;
import ru.yandex.taxi.order.state.complete.CompleteStateView;

/* loaded from: classes14.dex */
public final class pzc extends jey {
    public final /* synthetic */ CompleteStateView a;

    public pzc(CompleteStateView completeStateView) {
        this.a = completeStateView;
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onPause() {
        RateView rateView;
        rateView = this.a.rateView;
        rateView.pause();
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onResume() {
        RateView rateView;
        CompleteStateView completeStateView = this.a;
        rateView = completeStateView.rateView;
        rateView.resume(completeStateView.getUiDelegate());
    }
}
