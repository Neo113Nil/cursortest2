package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.payments.cards.ui.TransportCardWidgetView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.buttons.ButtonTrailView;

/* loaded from: classes13.dex */
public final class j111 implements zo31 {
    public final TransportCardWidgetView a;
    public final LinearLayout b;
    public final ImageView c;
    public final ButtonComponent d;
    public final ConstraintLayout e;
    public final GoFrameLayout f;
    public final ButtonComponent g;
    public final RobotoTextView h;
    public final RobotoTextView i;
    public final ButtonTrailView j;

    public j111(TransportCardWidgetView transportCardWidgetView, LinearLayout linearLayout, ImageView imageView, ButtonComponent buttonComponent, ConstraintLayout constraintLayout, GoFrameLayout goFrameLayout, ButtonComponent buttonComponent2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, ButtonTrailView buttonTrailView) {
        this.a = transportCardWidgetView;
        this.b = linearLayout;
        this.c = imageView;
        this.d = buttonComponent;
        this.e = constraintLayout;
        this.f = goFrameLayout;
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
