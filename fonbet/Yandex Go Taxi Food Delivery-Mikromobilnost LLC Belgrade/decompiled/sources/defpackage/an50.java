package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Fade;
import androidx.transition.R;
import androidx.transition.TransitionValues;
import defpackage.cfh0;

/* loaded from: classes9.dex */
public final class an50 extends Fade {
    public final int[] j0;

    public an50(int i, int[] iArr) {
        super(i);
        this.j0 = iArr;
    }

    @Override // androidx.transition.Visibility
    public final Animator c0(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        View view;
        Animator c0 = super.c0(viewGroup, transitionValues, i, transitionValues2, i2);
        Object tag = (transitionValues == null || (view = transitionValues.b) == null) ? null : view.getTag(R.id.save_overlay_view);
        final View view2 = tag instanceof View ? (View) tag : null;
        if (view2 != null && view2.getTag(cfh0.corrected_fadeout) == null) {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            int[] iArr2 = this.j0;
            view2.offsetLeftAndRight(i3 - iArr2[0]);
            view2.offsetTopAndBottom(iArr[1] - iArr2[1]);
            view2.setTag(cfh0.corrected_fadeout, Boolean.TRUE);
            View.generateViewId();
        }
        if (c0 != null) {
            c0.addListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.plaque.animation.transitions.NestedFadeTransition$onDisappear$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    View view3 = view2;
                    if (view3 != null) {
                        view3.setTag(cfh0.corrected_fadeout, null);
                    }
                }
            });
        }
        return c0;
    }
}
