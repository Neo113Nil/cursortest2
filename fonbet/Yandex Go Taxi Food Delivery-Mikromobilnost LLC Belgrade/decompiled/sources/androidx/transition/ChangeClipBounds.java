package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.HashMap;

/* loaded from: classes10.dex */
public class ChangeClipBounds extends Transition {
    public static final String[] h0 = {"android:clipBounds:clip"};
    public static final Rect i0 = new Rect();

    public static void X(TransitionValues transitionValues, boolean z) {
        View view = transitionValues.b;
        HashMap hashMap = transitionValues.a;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect rect = z ? (Rect) view.getTag(R.id.transition_clip) : null;
        if (rect == null) {
            rect = view.getClipBounds();
        }
        Rect rect2 = rect != i0 ? rect : null;
        hashMap.put("android:clipBounds:clip", rect2);
        if (rect2 == null) {
            hashMap.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    public final String[] A() {
        return h0;
    }

    @Override // androidx.transition.Transition
    public final boolean D() {
        return true;
    }

    @Override // androidx.transition.Transition
    public final void f(TransitionValues transitionValues) {
        X(transitionValues, false);
    }

    @Override // androidx.transition.Transition
    public final void i(TransitionValues transitionValues) {
        X(transitionValues, true);
    }

    @Override // androidx.transition.Transition
    public final Animator o(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        HashMap hashMap = transitionValues.a;
        if (transitionValues2 == null) {
            return null;
        }
        HashMap hashMap2 = transitionValues2.a;
        if (!hashMap.containsKey("android:clipBounds:clip") || !hashMap2.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) hashMap.get("android:clipBounds:clip");
        Rect rect2 = (Rect) hashMap2.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) hashMap.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) hashMap2.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        transitionValues2.b.setClipBounds(rect);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(transitionValues2.b, (Property<View, V>) ViewUtils.b, new RectEvaluator(new Rect()), rect3, rect4);
        Listener listener = new Listener(transitionValues2.b, rect, rect2);
        ofObject.addListener(listener);
        a(listener);
        return ofObject;
    }

    /* loaded from: classes.dex */
    public static class Listener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private final Rect mEnd;
        private final Rect mStart;
        private final View mView;

        public Listener(View view, Rect rect, Rect rect2) {
            this.mView = view;
            this.mStart = rect;
            this.mEnd = rect2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            View view = this.mView;
            if (z) {
                view.setClipBounds(this.mStart);
            } else {
                view.setClipBounds(this.mEnd);
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
            Rect clipBounds = this.mView.getClipBounds();
            if (clipBounds == null) {
                clipBounds = ChangeClipBounds.i0;
            }
            this.mView.setTag(R.id.transition_clip, clipBounds);
            this.mView.setClipBounds(this.mEnd);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            this.mView.setClipBounds((Rect) this.mView.getTag(R.id.transition_clip));
            this.mView.setTag(R.id.transition_clip, null);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition, boolean z) {
            onTransitionStart(transition);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }
    }
}
