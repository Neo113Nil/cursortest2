package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.vlp0;

/* compiled from: Fade.java */
/* loaded from: classes.dex */
public final class biq extends p4u0 {

    /* compiled from: Fade.java */
    /* loaded from: classes12.dex */
    public static class a extends AnimatorListenerAdapter implements vlp0.i {
        public final View b;
        public boolean c = false;

        public a(View view) {
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            y1u0.d(this.b, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            View view = this.b;
            if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.c = true;
                view.setLayerType(2, null);
            }
        }

        @Override // xsna.vlp0.i
        public final void onTransitionPause(vlp0 vlp0Var) {
            View view = this.b;
            view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? y1u0.a.h(view) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }

        @Override // xsna.vlp0.i
        public final void onTransitionResume(vlp0 vlp0Var) {
            this.b.setTag(R.id.transition_pause_alpha, null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            boolean z2 = this.c;
            View view = this.b;
            if (z2) {
                view.setLayerType(0, null);
            }
            if (z) {
                return;
            }
            y1u0.d(view, 1.0f);
            y1u0.a.getClass();
        }

        @Override // xsna.vlp0.i
        public final void g(vlp0 vlp0Var) {
        }

        @Override // xsna.vlp0.i
        public final void onTransitionCancel(vlp0 vlp0Var) {
        }

        @Override // xsna.vlp0.i
        public final void onTransitionEnd(vlp0 vlp0Var) {
        }

        @Override // xsna.vlp0.i
        public final void onTransitionStart(vlp0 vlp0Var) {
        }
    }

    public biq(int i) {
        setMode(i);
    }

    public static float b(gnp0 gnp0Var, float f) {
        Float f2;
        return (gnp0Var == null || (f2 = (Float) gnp0Var.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    public final ObjectAnimator a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        y1u0.d(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, y1u0.b, f2);
        a aVar = new a(view);
        ofFloat.addListener(aVar);
        getRootTransition().addListener(aVar);
        return ofFloat;
    }

    @Override // xsna.p4u0, xsna.vlp0
    public final void captureStartValues(gnp0 gnp0Var) {
        super.captureStartValues(gnp0Var);
        View view = gnp0Var.b;
        Float f = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            f = view.getVisibility() == 0 ? Float.valueOf(y1u0.a(view)) : Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        gnp0Var.a.put("android:fade:transitionAlpha", f);
    }

    @Override // xsna.vlp0
    public final boolean isSeekingSupported() {
        return true;
    }

    @Override // xsna.p4u0
    public final Animator onAppear(ViewGroup viewGroup, View view, gnp0 gnp0Var, gnp0 gnp0Var2) {
        y1u0.b();
        return a(view, b(gnp0Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 1.0f);
    }

    @Override // xsna.p4u0
    public final Animator onDisappear(ViewGroup viewGroup, View view, gnp0 gnp0Var, gnp0 gnp0Var2) {
        y1u0.b();
        ObjectAnimator a2 = a(view, b(gnp0Var, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (a2 == null) {
            y1u0.d(view, b(gnp0Var2, 1.0f));
        }
        return a2;
    }
}
