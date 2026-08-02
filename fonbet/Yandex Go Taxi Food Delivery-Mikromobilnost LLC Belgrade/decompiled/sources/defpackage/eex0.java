package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Flow;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

/* loaded from: classes14.dex */
public final class eex0 implements zo31 {
    public final GoFrameLayout a;
    public final LinearLayout b;
    public final RobotoTextView c;
    public final PlaceholderView d;
    public final PlaceholderView e;
    public final Flow f;
    public final RobotoTextView g;
    public final GoImageView h;
    public final GoImageView i;
    public final AppCompatImageView j;
    public final ShimmeringRobotoTextView k;
    public final ShimmeringRobotoTextView l;
    public final ShimmeringRobotoTextView m;
    public final RobotoTextView n;
    public final PlaceholderView o;
    public final GoConstraintLayout p;

    public eex0(GoFrameLayout goFrameLayout, LinearLayout linearLayout, RobotoTextView robotoTextView, PlaceholderView placeholderView, PlaceholderView placeholderView2, Flow flow, RobotoTextView robotoTextView2, GoImageView goImageView, GoImageView goImageView2, AppCompatImageView appCompatImageView, ShimmeringRobotoTextView shimmeringRobotoTextView, ShimmeringRobotoTextView shimmeringRobotoTextView2, ShimmeringRobotoTextView shimmeringRobotoTextView3, RobotoTextView robotoTextView3, PlaceholderView placeholderView3, GoConstraintLayout goConstraintLayout) {
        this.a = goFrameLayout;
        this.b = linearLayout;
        this.c = robotoTextView;
        this.d = placeholderView;
        this.e = placeholderView2;
        this.f = flow;
        this.g = robotoTextView2;
        this.h = goImageView;
        this.i = goImageView2;
        this.j = appCompatImageView;
        this.k = shimmeringRobotoTextView;
        this.l = shimmeringRobotoTextView2;
        this.m = shimmeringRobotoTextView3;
        this.n = robotoTextView3;
        this.o = placeholderView3;
        this.p = goConstraintLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
