package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.ph;
import defpackage.wh;

/* loaded from: classes.dex */
public final class a extends AccessibilityDelegateCompat {
    public final /* synthetic */ AppBarLayout a;
    public final /* synthetic */ CoordinatorLayout b;
    public final /* synthetic */ AppBarLayout.BaseBehavior c;

    public a(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.c = baseBehavior;
        this.a = appBarLayout;
        this.b = coordinatorLayout;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.p(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.a;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.b;
        AppBarLayout.BaseBehavior baseBehavior = this.c;
        View D = AppBarLayout.BaseBehavior.D(baseBehavior, coordinatorLayout);
        if (D == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((AppBarLayout.LayoutParams) appBarLayout.getChildAt(i).getLayoutParams()).scrollFlags != 0) {
                if (baseBehavior.v() != (-appBarLayout.getTotalScrollRange())) {
                    whVar.b(ph.k);
                    whVar.B(true);
                }
                if (baseBehavior.v() != 0) {
                    if (!D.canScrollVertically(-1)) {
                        whVar.b(ph.l);
                        whVar.B(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            whVar.b(ph.l);
                            whVar.B(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        AppBarLayout appBarLayout = this.a;
        if (i == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.c;
        if (baseBehavior.v() != 0) {
            View D = AppBarLayout.BaseBehavior.D(baseBehavior, this.b);
            if (!D.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i2 = -appBarLayout.getDownNestedPreScrollRange();
            if (i2 != 0) {
                baseBehavior.G(this.b, this.a, D, i2, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
