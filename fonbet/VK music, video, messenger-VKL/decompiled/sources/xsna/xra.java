package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import java.util.HashMap;
import xsna.vlp0;

/* compiled from: ChangeClipBounds.java */
/* loaded from: classes12.dex */
public final class xra extends vlp0 {
    public static final String[] b = {"android:clipBounds:clip"};
    public static final Rect c = new Rect();

    /* compiled from: ChangeClipBounds.java */
    public static class a extends AnimatorListenerAdapter implements vlp0.i {
        public final Rect b;
        public final Rect c;
        public final View d;

        public a(View view, Rect rect, Rect rect2) {
            this.d = view;
            this.b = rect;
            this.c = rect2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // xsna.vlp0.i
        public final void onTransitionPause(vlp0 vlp0Var) {
            View view = this.d;
            Rect clipBounds = view.getClipBounds();
            if (clipBounds == null) {
                clipBounds = xra.c;
            }
            view.setTag(R.id.transition_clip, clipBounds);
            view.setClipBounds(this.c);
        }

        @Override // xsna.vlp0.i
        public final void onTransitionResume(vlp0 vlp0Var) {
            View view = this.d;
            view.setClipBounds((Rect) view.getTag(R.id.transition_clip));
            view.setTag(R.id.transition_clip, null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            View view = this.d;
            if (z) {
                view.setClipBounds(this.b);
            } else {
                view.setClipBounds(this.c);
            }
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

    public static void a(gnp0 gnp0Var, boolean z) {
        View view = gnp0Var.b;
        HashMap hashMap = gnp0Var.a;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect rect = z ? (Rect) view.getTag(R.id.transition_clip) : null;
        if (rect == null) {
            rect = view.getClipBounds();
        }
        Rect rect2 = rect != c ? rect : null;
        hashMap.put("android:clipBounds:clip", rect2);
        if (rect2 == null) {
            hashMap.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // xsna.vlp0
    public final void captureEndValues(gnp0 gnp0Var) {
        a(gnp0Var, false);
    }

    @Override // xsna.vlp0
    public final void captureStartValues(gnp0 gnp0Var) {
        a(gnp0Var, true);
    }

    @Override // xsna.vlp0
    public final Animator createAnimator(ViewGroup viewGroup, gnp0 gnp0Var, gnp0 gnp0Var2) {
        if (gnp0Var == null) {
            return null;
        }
        HashMap hashMap = gnp0Var.a;
        if (gnp0Var2 == null) {
            return null;
        }
        View view = gnp0Var2.b;
        HashMap hashMap2 = gnp0Var2.a;
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
        view.setClipBounds(rect);
        Rect rect5 = new Rect();
        aif0 aif0Var = new aif0();
        aif0Var.a = rect5;
        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, y1u0.c, aif0Var, rect3, rect4);
        a aVar = new a(view, rect, rect2);
        ofObject.addListener(aVar);
        addListener(aVar);
        return ofObject;
    }

    @Override // xsna.vlp0
    public final String[] getTransitionProperties() {
        return b;
    }

    @Override // xsna.vlp0
    public final boolean isSeekingSupported() {
        return true;
    }
}
