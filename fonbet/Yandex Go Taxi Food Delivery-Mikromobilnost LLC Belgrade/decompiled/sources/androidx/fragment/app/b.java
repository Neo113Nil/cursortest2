package androidx.fragment.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import defpackage.eot0;
import defpackage.hzk;
import defpackage.iot0;
import defpackage.ny61;

/* loaded from: classes10.dex */
public final class b extends eot0 {
    public final c c;

    public b(c cVar) {
        this.c = cVar;
    }

    @Override // defpackage.eot0
    public final void c(ViewGroup viewGroup) {
        c cVar = this.c;
        iot0 iot0Var = cVar.a;
        View view = iot0Var.c.mView;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        cVar.a.c(this);
        if (FragmentManager.O(2)) {
            iot0Var.toString();
        }
    }

    @Override // defpackage.eot0
    public final void d(ViewGroup viewGroup) {
        c cVar = this.c;
        if (cVar.a()) {
            cVar.a.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        iot0 iot0Var = cVar.a;
        View view = iot0Var.c.mView;
        hzk b = cVar.b(context);
        if (b == null) {
            ny61.r("Required value was null.");
            return;
        }
        Animation animation = (Animation) b.a;
        if (animation == null) {
            ny61.r("Required value was null.");
            return;
        }
        if (iot0Var.a != SpecialEffectsController$Operation$State.REMOVED) {
            view.startAnimation(animation);
            cVar.a.c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        FragmentAnim$EndViewTransitionAnimation fragmentAnim$EndViewTransitionAnimation = new FragmentAnim$EndViewTransitionAnimation(animation, viewGroup, view);
        fragmentAnim$EndViewTransitionAnimation.setAnimationListener(new DefaultSpecialEffectsController$AnimationEffect$onCommit$1(iot0Var, viewGroup, view, this));
        view.startAnimation(fragmentAnim$EndViewTransitionAnimation);
        if (FragmentManager.O(2)) {
            iot0Var.toString();
        }
    }
}
