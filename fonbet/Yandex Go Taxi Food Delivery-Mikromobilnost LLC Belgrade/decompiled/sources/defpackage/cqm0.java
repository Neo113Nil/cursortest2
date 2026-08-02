package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.RoundedCornersImageView;

/* loaded from: classes13.dex */
public final class cqm0 implements zo31 {
    public final GoLinearLayout a;
    public final RobotoTextView b;
    public final GoImageView c;
    public final RoundedCornersImageView d;
    public final ButtonComponent e;
    public final ButtonComponent f;
    public final RobotoTextView g;
    public final RobotoTextView h;
    public final RobotoTextView i;

    public cqm0(GoLinearLayout goLinearLayout, RobotoTextView robotoTextView, GoImageView goImageView, RoundedCornersImageView roundedCornersImageView, ButtonComponent buttonComponent, ButtonComponent buttonComponent2, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4) {
        this.a = goLinearLayout;
        this.b = robotoTextView;
        this.c = goImageView;
        this.d = roundedCornersImageView;
        this.e = buttonComponent;
        this.f = buttonComponent2;
        this.g = robotoTextView2;
        this.h = robotoTextView3;
        this.i = robotoTextView4;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
