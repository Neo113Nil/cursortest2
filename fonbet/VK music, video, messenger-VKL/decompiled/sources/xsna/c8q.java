package xsna;

import android.animation.Animator;
import com.vkontakte.android.ui.layout.ExpandableBarLayout;

/* compiled from: ExpandableBarLayout.java */
/* loaded from: classes7.dex */
public final class c8q implements Animator.AnimatorListener {
    public final /* synthetic */ ExpandableBarLayout b;

    public c8q(ExpandableBarLayout expandableBarLayout) {
        this.b = expandableBarLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ExpandableBarLayout expandableBarLayout = this.b;
        expandableBarLayout.j = true;
        expandableBarLayout.c.setVisibility(0);
        izs<Boolean, s3q0> izsVar = expandableBarLayout.h;
        if (izsVar != null) {
            izsVar.invoke(Boolean.valueOf(expandableBarLayout.j));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
