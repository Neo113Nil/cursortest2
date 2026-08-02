package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* loaded from: classes3.dex */
public final class f161 implements zo31 {
    public final CoordinatorLayout a;
    public final AppBarLayout b;
    public final CollapsingToolbarLayout c;
    public final FrameLayout d;
    public final FrameLayout e;

    public f161(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.a = coordinatorLayout;
        this.b = appBarLayout;
        this.c = collapsingToolbarLayout;
        this.d = frameLayout;
        this.e = frameLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
