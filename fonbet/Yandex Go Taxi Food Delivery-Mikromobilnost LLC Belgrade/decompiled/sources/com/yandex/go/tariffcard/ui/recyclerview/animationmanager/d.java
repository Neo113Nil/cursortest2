package com.yandex.go.tariffcard.ui.recyclerview.animationmanager;

import android.view.View;
import com.yandex.go.tariffcard.ui.recyclerview.animationmanager.RecyclerViewItemAnimationManager;
import defpackage.dki0;
import defpackage.uji0;
import defpackage.w511;

/* loaded from: classes14.dex */
public final class d implements uji0 {
    public final /* synthetic */ RecyclerViewItemAnimationManager a;

    public d(RecyclerViewItemAnimationManager recyclerViewItemAnimationManager) {
        this.a = recyclerViewItemAnimationManager;
    }

    @Override // defpackage.uji0
    public final void a(View view) {
        RecyclerViewItemAnimationManager recyclerViewItemAnimationManager = this.a;
        int i = c.a[recyclerViewItemAnimationManager.f.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            recyclerViewItemAnimationManager.i(view, true);
        } else {
            if (i == 4 || i == 5) {
                return;
            }
            w511.b();
        }
    }

    @Override // defpackage.uji0
    public final void b(View view) {
        CombinedValueAnimator combinedValueAnimator;
        RecyclerViewItemAnimationManager recyclerViewItemAnimationManager = this.a;
        RecyclerViewItemAnimationManager.AnimationPhase animationPhase = recyclerViewItemAnimationManager.f;
        int i = c.a[animationPhase.ordinal()];
        if (i == 1 || i == 2) {
            dki0 d = recyclerViewItemAnimationManager.d(view);
            if (d == null || (combinedValueAnimator = recyclerViewItemAnimationManager.i) == null) {
                return;
            }
            recyclerViewItemAnimationManager.e(d, animationPhase, combinedValueAnimator);
            return;
        }
        if (i == 3 || i == 4 || i == 5) {
            return;
        }
        w511.b();
    }
}
