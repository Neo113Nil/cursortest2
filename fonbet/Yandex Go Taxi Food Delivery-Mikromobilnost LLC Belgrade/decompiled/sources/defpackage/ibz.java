package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

/* loaded from: classes13.dex */
public final class ibz implements zo31 {
    public final ConstraintLayout a;
    public final RobotoTextView b;
    public final ButtonComponent c;
    public final ImageView d;
    public final RobotoTextView e;
    public final RobotoTextView f;
    public final ConstraintLayout g;
    public final FrameLayout h;
    public final AppCompatImageView i;
    public final NestedScrollViewAdvanced j;
    public final ImageView k;
    public final RobotoTextView l;
    public final Guideline m;

    public ibz(ConstraintLayout constraintLayout, RobotoTextView robotoTextView, ButtonComponent buttonComponent, ImageView imageView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, ConstraintLayout constraintLayout2, FrameLayout frameLayout, AppCompatImageView appCompatImageView, NestedScrollViewAdvanced nestedScrollViewAdvanced, ImageView imageView2, RobotoTextView robotoTextView4, Guideline guideline) {
        this.a = constraintLayout;
        this.b = robotoTextView;
        this.c = buttonComponent;
        this.d = imageView;
        this.e = robotoTextView2;
        this.f = robotoTextView3;
        this.g = constraintLayout2;
        this.h = frameLayout;
        this.i = appCompatImageView;
        this.j = nestedScrollViewAdvanced;
        this.k = imageView2;
        this.l = robotoTextView4;
        this.m = guideline;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
