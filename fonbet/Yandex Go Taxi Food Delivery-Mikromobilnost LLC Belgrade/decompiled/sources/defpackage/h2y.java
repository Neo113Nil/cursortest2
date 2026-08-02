package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.flex.common.scaffolds.appbarscaffold.shadow.AppBarShadowView;
import com.yandex.passport.internal.widget.NotTouchableToolbar;

/* loaded from: classes.dex */
public final class h2y implements zo31 {
    public final CoordinatorLayout a;
    public final AppBarLayout b;
    public final AppBarShadowView c;
    public final CollapsingToolbarLayout d;
    public final GoFrameLayout e;
    public final GoFrameLayout f;

    public h2y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, AppBarShadowView appBarShadowView, GoFrameLayout goFrameLayout, CollapsingToolbarLayout collapsingToolbarLayout, GoFrameLayout goFrameLayout2, GoFrameLayout goFrameLayout3, NotTouchableToolbar notTouchableToolbar, GoFrameLayout goFrameLayout4) {
        this.a = coordinatorLayout;
        this.b = appBarLayout;
        this.c = appBarShadowView;
        this.d = collapsingToolbarLayout;
        this.e = goFrameLayout2;
        this.f = goFrameLayout4;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
