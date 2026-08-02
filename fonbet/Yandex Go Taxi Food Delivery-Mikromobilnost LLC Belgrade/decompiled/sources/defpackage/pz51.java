package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.payments.cards.ui.YbWidgetView;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.buttons.ButtonTrailView;

/* loaded from: classes8.dex */
public final class pz51 implements zo31 {
    public final YbWidgetView a;
    public final LinearLayout b;
    public final BadgeView c;
    public final ImageView d;
    public final ButtonComponent e;
    public final ConstraintLayout f;
    public final ButtonComponent g;
    public final RobotoTextView h;
    public final RobotoTextView i;
    public final ButtonTrailView j;

    public pz51(YbWidgetView ybWidgetView, LinearLayout linearLayout, BadgeView badgeView, ImageView imageView, ButtonComponent buttonComponent, ConstraintLayout constraintLayout, ButtonComponent buttonComponent2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, ButtonTrailView buttonTrailView) {
        this.a = ybWidgetView;
        this.b = linearLayout;
        this.c = badgeView;
        this.d = imageView;
        this.e = buttonComponent;
        this.f = constraintLayout;
        this.g = buttonComponent2;
        this.h = robotoTextView;
        this.i = robotoTextView2;
        this.j = buttonTrailView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
