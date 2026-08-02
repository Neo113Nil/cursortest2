package com.google.android.material.appbar;

import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import defpackage.g8e;
import defpackage.hbc;
import defpackage.ip2;
import defpackage.n751;
import defpackage.sb2;
import defpackage.ts31;

/* loaded from: classes.dex */
public final class b implements ip2 {
    public final /* synthetic */ CollapsingToolbarLayout a;

    public b(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.a = collapsingToolbarLayout;
    }

    @Override // defpackage.gp2
    public final void a(AppBarLayout appBarLayout, int i) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.a;
        collapsingToolbarLayout.currentOffset = i;
        n751 n751Var = collapsingToolbarLayout.lastInsets;
        int d = n751Var != null ? n751Var.d() : 0;
        int childCount = collapsingToolbarLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = collapsingToolbarLayout.getChildAt(i2);
            CollapsingToolbarLayout.LayoutParams layoutParams = (CollapsingToolbarLayout.LayoutParams) childAt.getLayoutParams();
            ts31 viewOffsetHelper = CollapsingToolbarLayout.getViewOffsetHelper(childAt);
            int i3 = layoutParams.collapseMode;
            if (i3 == 1) {
                viewOffsetHelper.b(sb2.k(-i, 0, collapsingToolbarLayout.getMaxOffsetForPinChild(childAt)));
            } else if (i3 == 2) {
                viewOffsetHelper.b(Math.round((-i) * layoutParams.parallaxMult));
            }
        }
        collapsingToolbarLayout.updateScrimVisibility();
        if (collapsingToolbarLayout.statusBarScrim != null && d > 0) {
            collapsingToolbarLayout.postInvalidateOnAnimation();
        }
        int height = collapsingToolbarLayout.getHeight();
        int minimumHeight = (height - collapsingToolbarLayout.getMinimumHeight()) - d;
        int scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
        int i4 = collapsingToolbarLayout.currentOffset + minimumHeight;
        float f = minimumHeight;
        float abs = Math.abs(i) / f;
        hbc hbcVar = collapsingToolbarLayout.collapsingTitleHelper;
        float f2 = scrimVisibleHeightTrigger / f;
        float min = Math.min(1.0f, f2);
        hbcVar.d = min;
        hbcVar.e = g8e.b(1.0f, min, 0.5f, min);
        hbc hbcVar2 = collapsingToolbarLayout.collapsingTitleHelper;
        hbcVar2.f = i4;
        hbcVar2.A(abs);
        hbc hbcVar3 = collapsingToolbarLayout.collapsingSubtitleHelper;
        float min2 = Math.min(1.0f, f2);
        hbcVar3.d = min2;
        hbcVar3.e = g8e.b(1.0f, min2, 0.5f, min2);
        hbc hbcVar4 = collapsingToolbarLayout.collapsingSubtitleHelper;
        hbcVar4.f = i4;
        hbcVar4.A(abs);
    }
}
