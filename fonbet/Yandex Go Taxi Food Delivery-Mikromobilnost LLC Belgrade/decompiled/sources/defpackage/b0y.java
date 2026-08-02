package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.title.RideCardDriverSectionBadgesView;
import com.yandex.go.taxi.order.details.v2.ui.view.item.driver.title.RideCardDriverSectionTitleView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class b0y implements zo31 {
    public final RideCardDriverSectionTitleView a;
    public final RideCardDriverSectionBadgesView b;
    public final GoView c;
    public final RobotoTextView d;
    public final RobotoTextView e;

    public b0y(RideCardDriverSectionTitleView rideCardDriverSectionTitleView, RideCardDriverSectionBadgesView rideCardDriverSectionBadgesView, GoView goView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.a = rideCardDriverSectionTitleView;
        this.b = rideCardDriverSectionBadgesView;
        this.c = goView;
        this.d = robotoTextView;
        this.e = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
