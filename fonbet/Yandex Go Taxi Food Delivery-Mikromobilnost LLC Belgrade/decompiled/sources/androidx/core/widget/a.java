package androidx.core.widget;

import android.view.View;
import android.view.animation.AnimationUtils;
import defpackage.kbs;
import defpackage.qt3;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class a implements Runnable {
    public final /* synthetic */ AutoScrollHelper a;

    public a(AutoScrollHelper autoScrollHelper) {
        this.a = autoScrollHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AutoScrollHelper autoScrollHelper = this.a;
        if (autoScrollHelper.mAnimating) {
            if (autoScrollHelper.mNeedsReset) {
                autoScrollHelper.mNeedsReset = false;
                qt3 qt3Var = autoScrollHelper.mScroller;
                qt3Var.getClass();
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                qt3Var.e = currentAnimationTimeMillis;
                qt3Var.g = -1L;
                qt3Var.f = currentAnimationTimeMillis;
                qt3Var.h = 0.5f;
            }
            qt3 qt3Var2 = autoScrollHelper.mScroller;
            if ((qt3Var2.g > 0 && AnimationUtils.currentAnimationTimeMillis() > qt3Var2.g + qt3Var2.i) || !autoScrollHelper.shouldAnimate()) {
                autoScrollHelper.mAnimating = false;
                return;
            }
            if (autoScrollHelper.mNeedsCancel) {
                autoScrollHelper.mNeedsCancel = false;
                autoScrollHelper.cancelTargetTouch();
            }
            if (qt3Var2.f == 0) {
                kbs.g("Cannot compute scroll delta before calling start()");
                return;
            }
            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
            float a = qt3Var2.a(currentAnimationTimeMillis2);
            long j = currentAnimationTimeMillis2 - qt3Var2.f;
            qt3Var2.f = currentAnimationTimeMillis2;
            float f = j * ((a * 4.0f) + ((-4.0f) * a * a));
            autoScrollHelper.scrollTargetBy((int) (qt3Var2.c * f), (int) (f * qt3Var2.d));
            View view = autoScrollHelper.mTarget;
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            view.postOnAnimation(this);
        }
    }
}
