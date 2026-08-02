package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

/* loaded from: classes12.dex */
public final class gl5 implements zo31 {
    public final GoConstraintLayout a;
    public final GoLinearLayout b;
    public final View c;
    public final View d;
    public final RobotoTextView e;
    public final NestedScrollViewAdvanced f;
    public final ButtonComponent g;
    public final GoImageView h;
    public final GoFrameLayout i;
    public final GoImageView j;
    public final GoFrameLayout k;
    public final RobotoTextView l;
    public final RobotoTextView m;
    public final RobotoTextView n;

    public gl5(GoConstraintLayout goConstraintLayout, GoLinearLayout goLinearLayout, View view, View view2, RobotoTextView robotoTextView, NestedScrollViewAdvanced nestedScrollViewAdvanced, ButtonComponent buttonComponent, GoImageView goImageView, GoFrameLayout goFrameLayout, GoImageView goImageView2, GoFrameLayout goFrameLayout2, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4) {
        this.a = goConstraintLayout;
        this.b = goLinearLayout;
        this.c = view;
        this.d = view2;
        this.e = robotoTextView;
        this.f = nestedScrollViewAdvanced;
        this.g = buttonComponent;
        this.h = goImageView;
        this.i = goFrameLayout;
        this.j = goImageView2;
        this.k = goFrameLayout2;
        this.l = robotoTextView2;
        this.m = robotoTextView3;
        this.n = robotoTextView4;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
