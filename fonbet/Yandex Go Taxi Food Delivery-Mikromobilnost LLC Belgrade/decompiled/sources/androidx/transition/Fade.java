package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;

/* loaded from: classes.dex */
public class Fade extends Visibility {
    public Fade(int i) {
        d0(i);
    }

    public static float f0(TransitionValues transitionValues, float f) {
        Float f2;
        return (transitionValues == null || (f2 = (Float) transitionValues.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // androidx.transition.Transition
    public final boolean D() {
        return true;
    }

    @Override // androidx.transition.Visibility
    public final Animator Z(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Property property = ViewUtils.a;
        return e0(f0(transitionValues, 0.0f), 1.0f, view);
    }

    @Override // androidx.transition.Visibility
    public final Animator b0(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Property property = ViewUtils.a;
        ObjectAnimator e0 = e0(f0(transitionValues, 1.0f), 0.0f, view);
        if (e0 == null) {
            view.setTransitionAlpha(f0(transitionValues2, 1.0f));
        }
        return e0;
    }

    public final ObjectAnimator e0(float f, float f2, View view) {
        if (f == f2) {
            return null;
        }
        Property property = ViewUtils.a;
        view.setTransitionAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) ViewUtils.a, f2);
        FadeAnimatorListener fadeAnimatorListener = new FadeAnimatorListener(view);
        ofFloat.addListener(fadeAnimatorListener);
        y().a(fadeAnimatorListener);
        return ofFloat;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void i(TransitionValues transitionValues) {
        Visibility.X(transitionValues);
        Float f = (Float) transitionValues.b.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            if (transitionValues.b.getVisibility() == 0) {
                View view = transitionValues.b;
                Property property = ViewUtils.a;
                f = Float.valueOf(view.getTransitionAlpha());
            } else {
                f = Float.valueOf(0.0f);
            }
        }
        transitionValues.a.put("android:fade:transitionAlpha", f);
    }

    public static class FadeAnimatorListener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private boolean mLayerTypeChanged = false;
        private final View mView;

        public FadeAnimatorListener(View view) {
            this.mView = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            View view = this.mView;
            Property property = ViewUtils.a;
            view.setTransitionAlpha(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (this.mLayerTypeChanged) {
                this.mView.setLayerType(0, null);
            }
            if (z) {
                return;
            }
            View view = this.mView;
            Property property = ViewUtils.a;
            view.setTransitionAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.mView.hasOverlappingRendering() && this.mView.getLayerType() == 0) {
                this.mLayerTypeChanged = true;
                this.mView.setLayerType(2, null);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition, boolean z) {
            onTransitionEnd(transition);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            float f;
            if (this.mView.getVisibility() == 0) {
                View view = this.mView;
                Property property = ViewUtils.a;
                f = view.getTransitionAlpha();
            } else {
                f = 0.0f;
            }
            this.mView.setTag(R.id.transition_pause_alpha, Float.valueOf(f));
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            this.mView.setTag(R.id.transition_pause_alpha, null);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition, boolean z) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }
    }

    public Fade() {
    }
}
