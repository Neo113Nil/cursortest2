package defpackage;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes4.dex */
public final class b161 implements zo31 {
    public final CoordinatorLayout a;
    public final AppBarLayout b;
    public final CollapsingToolbarLayout c;
    public final YbButtonView d;
    public final Toolbar e;
    public final RecyclerView f;

    public b161(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, YbButtonView ybButtonView, Toolbar toolbar, RecyclerView recyclerView) {
        this.a = coordinatorLayout;
        this.b = appBarLayout;
        this.c = collapsingToolbarLayout;
        this.d = ybButtonView;
        this.e = toolbar;
        this.f = recyclerView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
