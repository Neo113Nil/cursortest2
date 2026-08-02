package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.google.android.material.appbar.AppBarLayout;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardCollapsedAnimation$CollapsedState;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.view.DashboardTokenizationWidget;
import defpackage.jig;

/* loaded from: classes3.dex */
public final class lig {
    public static final int i = kp50.r(12);
    public final RecyclerView a;
    public final DashboardTokenizationWidget b;
    public final View c;
    public final View d;
    public final View e;
    public final bmg f;
    public DashboardCollapsedAnimation$CollapsedState g = DashboardCollapsedAnimation$CollapsedState.EXPANDED;
    public final int h = kp50.r(56);

    public lig(final AppBarLayout appBarLayout, RecyclerView recyclerView, DashboardTokenizationWidget dashboardTokenizationWidget, View view, View view2, View view3, bmg bmgVar) {
        this.a = recyclerView;
        this.b = dashboardTokenizationWidget;
        this.c = view;
        this.d = view2;
        this.e = view3;
        this.f = bmgVar;
        kig kigVar = new kig(this);
        iig iigVar = new iig(0, this);
        b.t(recyclerView, kigVar);
        b.s(appBarLayout, iigVar);
        if (!appBarLayout.isLaidOut() || appBarLayout.isLayoutRequested()) {
            appBarLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardCollapsedAnimation$special$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view4, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view4.removeOnLayoutChangeListener(this);
                    ((AppBarLayout.Behavior) ((CoordinatorLayout.LayoutParams) AppBarLayout.this.getLayoutParams()).getBehavior()).H = new jig();
                }
            });
        } else {
            ((AppBarLayout.Behavior) ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior()).H = new jig();
        }
        view.setVisibility(0);
        view2.setVisibility(0);
        view3.setVisibility(0);
    }

    public final int a() {
        int i2 = (-this.h) - 1;
        RecyclerView recyclerView = this.a;
        x0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(0);
        return findViewHolderForAdapterPosition != null ? (int) uh6.v(recyclerView, findViewHolderForAdapterPosition.E()).getY() : i2;
    }

    public final void b() {
        int a = a();
        int i2 = this.h;
        int i3 = -i2;
        View view = this.e;
        View view2 = this.d;
        View view3 = this.c;
        bmg bmgVar = this.f;
        if (a < i3) {
            bmgVar.invoke(Boolean.FALSE);
            view3.setAlpha(1.0f);
            view2.setAlpha(1.0f);
            view.setAlpha(1.0f);
            view3.setTranslationY(0.0f);
            view2.setTranslationY(0.0f);
            view.setTranslationY(0.0f);
            return;
        }
        float f = 1.0f - ((a + i2) / i2);
        bmgVar.invoke(Boolean.valueOf(f == 0.0f));
        view3.setAlpha(f);
        view2.setAlpha(f);
        view.setAlpha(f);
        float f2 = i;
        float f3 = f2 - (f * f2);
        view3.setTranslationY(f3);
        view2.setTranslationY(f3);
        view.setTranslationY(f3);
    }
}
