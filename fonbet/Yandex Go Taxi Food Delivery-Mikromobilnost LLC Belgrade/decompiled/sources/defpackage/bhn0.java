package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.ScootersOrderSelectorView;
import ru.yandex.taxi.scooters.presentation.route_navigation.route_summary.ScootersRouteSummaryView;
import ru.yandex.taxi.scooters.utils.ScootersGeoButtonIconComponent;
import ru.yandex.taxi.widget.ArrowsView;

/* loaded from: classes6.dex */
public final class bhn0 implements zo31 {
    public final GoConstraintLayout a;
    public final ArrowsView b;
    public final BackButtonIconComponent c;
    public final ScootersGeoButtonIconComponent d;
    public final ScootersOrderSelectorView e;
    public final ScootersRouteSummaryView f;

    public bhn0(GoConstraintLayout goConstraintLayout, ArrowsView arrowsView, BackButtonIconComponent backButtonIconComponent, ScootersGeoButtonIconComponent scootersGeoButtonIconComponent, GoFrameLayout goFrameLayout, ScootersOrderSelectorView scootersOrderSelectorView, ScootersRouteSummaryView scootersRouteSummaryView) {
        this.a = goConstraintLayout;
        this.b = arrowsView;
        this.c = backButtonIconComponent;
        this.d = scootersGeoButtonIconComponent;
        this.e = scootersOrderSelectorView;
        this.f = scootersRouteSummaryView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
