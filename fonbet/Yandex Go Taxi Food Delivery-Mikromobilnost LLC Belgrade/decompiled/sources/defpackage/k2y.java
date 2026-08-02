package defpackage;

import android.view.View;
import android.widget.Space;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.taxi.order.details.v2.ui.view.item.RideCardStatusProgressItemView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.progress_bar.ProgressBarView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

/* loaded from: classes14.dex */
public final class k2y implements zo31 {
    public final RideCardStatusProgressItemView a;
    public final ProgressBarView b;
    public final ShimmeringFrameLayout c;
    public final Space d;
    public final GoFrameLayout e;
    public final RobotoTextView f;
    public final RobotoTextView g;

    public k2y(RideCardStatusProgressItemView rideCardStatusProgressItemView, ProgressBarView progressBarView, ShimmeringFrameLayout shimmeringFrameLayout, Space space, GoFrameLayout goFrameLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = rideCardStatusProgressItemView;
        this.b = progressBarView;
        this.c = shimmeringFrameLayout;
        this.d = space;
        this.e = goFrameLayout;
        this.f = robotoTextView;
        this.g = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
