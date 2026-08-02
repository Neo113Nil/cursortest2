package xsna;

import android.animation.Animator;
import com.vk.catalog2.common.ui.mvp.holder.header.ExpandableVkSearchView;

/* compiled from: Animator.kt */
/* loaded from: classes16.dex */
public final class f9q implements Animator.AnimatorListener {
    public final /* synthetic */ ExpandableVkSearchView b;
    public final /* synthetic */ ExpandableVkSearchView.ExpandState c;

    public f9q(ExpandableVkSearchView expandableVkSearchView, ExpandableVkSearchView.ExpandState expandState) {
        this.b = expandableVkSearchView;
        this.c = expandState;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ExpandableVkSearchView expandableVkSearchView = this.b;
        expandableVkSearchView.k0 = null;
        expandableVkSearchView.T = this.c;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
