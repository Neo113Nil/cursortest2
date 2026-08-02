package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.drive.vertical.ui.tariff_card.collapsed.DriveTariffCardCollapsedView;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.design.button.OrderButtonComponent;

/* loaded from: classes12.dex */
public final class fgm implements zo31 {
    public final DriveTariffCardCollapsedView a;
    public final SourceDestinationComponent b;
    public final GoLinearLayout c;
    public final OrderButtonComponent d;
    public final ImageView e;
    public final GoLinearLayout f;

    public fgm(DriveTariffCardCollapsedView driveTariffCardCollapsedView, SourceDestinationComponent sourceDestinationComponent, GoLinearLayout goLinearLayout, OrderButtonComponent orderButtonComponent, ImageView imageView, GoLinearLayout goLinearLayout2) {
        this.a = driveTariffCardCollapsedView;
        this.b = sourceDestinationComponent;
        this.c = goLinearLayout;
        this.d = orderButtonComponent;
        this.e = imageView;
        this.f = goLinearLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
