package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.DividerAwareComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.RoundedCornersImageView;

/* loaded from: classes6.dex */
public final class g9e0 implements zo31 {
    public final ConstraintLayout a;
    public final RoundedCornersImageView b;
    public final AppCompatImageView c;
    public final RobotoTextView d;
    public final RobotoTextView e;
    public final DividerAwareComponent f;
    public final AppCompatImageView g;
    public final FrameLayout h;
    public final AppCompatImageView i;

    public g9e0(ConstraintLayout constraintLayout, RoundedCornersImageView roundedCornersImageView, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, DividerAwareComponent dividerAwareComponent, AppCompatImageView appCompatImageView2, FrameLayout frameLayout, AppCompatImageView appCompatImageView3) {
        this.a = constraintLayout;
        this.b = roundedCornersImageView;
        this.c = appCompatImageView;
        this.d = robotoTextView;
        this.e = robotoTextView2;
        this.f = dividerAwareComponent;
        this.g = appCompatImageView2;
        this.h = frameLayout;
        this.i = appCompatImageView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
