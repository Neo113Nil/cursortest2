package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import defpackage.eot0;
import defpackage.hzk;
import defpackage.iot0;
import defpackage.je4;
import defpackage.okh;
import defpackage.pkh;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class d extends eot0 {
    public final c c;
    public AnimatorSet d;

    public d(c cVar) {
        this.c = cVar;
    }

    @Override // defpackage.eot0
    public final void c(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.d;
        c cVar = this.c;
        if (animatorSet == null) {
            cVar.a.c(this);
            return;
        }
        iot0 iot0Var = cVar.a;
        if (iot0Var.g) {
            pkh.a.a(animatorSet);
        } else {
            animatorSet.end();
        }
        if (FragmentManager.O(2)) {
            iot0Var.toString();
        }
    }

    @Override // defpackage.eot0
    public final void d(ViewGroup viewGroup) {
        iot0 iot0Var = this.c.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            iot0Var.c(this);
            return;
        }
        animatorSet.start();
        if (FragmentManager.O(2)) {
            Objects.toString(iot0Var);
        }
    }

    @Override // defpackage.eot0
    public final void e(je4 je4Var) {
        iot0 iot0Var = this.c.a;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            iot0Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !iot0Var.c.mTransitioning) {
            return;
        }
        if (FragmentManager.O(2)) {
            iot0Var.toString();
        }
        long a = okh.a.a(animatorSet);
        long j = (long) (je4Var.c * a);
        if (j == 0) {
            j = 1;
        }
        if (j == a) {
            j = a - 1;
        }
        if (FragmentManager.O(2)) {
            animatorSet.toString();
            iot0Var.toString();
        }
        pkh.a.b(animatorSet, j);
    }

    @Override // defpackage.eot0
    public final void f(final ViewGroup viewGroup) {
        final d dVar;
        c cVar = this.c;
        if (cVar.a()) {
            return;
        }
        hzk b = cVar.b(viewGroup.getContext());
        this.d = b != null ? (AnimatorSet) b.b : null;
        final iot0 iot0Var = cVar.a;
        Fragment fragment = iot0Var.c;
        final boolean z = iot0Var.a == SpecialEffectsController$Operation$State.GONE;
        final View view = fragment.mView;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            dVar = this;
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect$onStart$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator anim) {
                    viewGroup.endViewTransition(view);
                    if (z || iot0Var.a == SpecialEffectsController$Operation$State.GONE) {
                        iot0Var.a.a(view, viewGroup);
                    }
                    d dVar2 = dVar;
                    dVar2.c.a.c(dVar2);
                    if (FragmentManager.O(2)) {
                        Objects.toString(iot0Var);
                    }
                }
            });
        } else {
            dVar = this;
        }
        AnimatorSet animatorSet2 = dVar.d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
