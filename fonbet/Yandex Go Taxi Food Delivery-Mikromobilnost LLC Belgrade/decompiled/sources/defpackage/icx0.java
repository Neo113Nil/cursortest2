package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

/* loaded from: classes14.dex */
public final class icx0 implements zo31 {
    public final GoFrameLayout a;
    public final LinearLayout b;
    public final RobotoTextView c;
    public final ConstraintLayout d;
    public final PlaceholderView e;
    public final PlaceholderView f;
    public final Flow g;
    public final RobotoTextView h;
    public final AppCompatImageView i;
    public final AppCompatImageView j;
    public final ShimmeringRobotoTextView k;
    public final ShimmeringRobotoTextView l;
    public final ShimmeringRobotoTextView m;
    public final RobotoTextView n;
    public final PlaceholderView o;

    public icx0(GoFrameLayout goFrameLayout, LinearLayout linearLayout, RobotoTextView robotoTextView, ConstraintLayout constraintLayout, PlaceholderView placeholderView, PlaceholderView placeholderView2, Flow flow, RobotoTextView robotoTextView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ShimmeringRobotoTextView shimmeringRobotoTextView, ShimmeringRobotoTextView shimmeringRobotoTextView2, ShimmeringRobotoTextView shimmeringRobotoTextView3, RobotoTextView robotoTextView3, PlaceholderView placeholderView3) {
        this.a = goFrameLayout;
        this.b = linearLayout;
        this.c = robotoTextView;
        this.d = constraintLayout;
        this.e = placeholderView;
        this.f = placeholderView2;
        this.g = flow;
        this.h = robotoTextView2;
        this.i = appCompatImageView;
        this.j = appCompatImageView2;
        this.k = shimmeringRobotoTextView;
        this.l = shimmeringRobotoTextView2;
        this.m = shimmeringRobotoTextView3;
        this.n = robotoTextView3;
        this.o = placeholderView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
