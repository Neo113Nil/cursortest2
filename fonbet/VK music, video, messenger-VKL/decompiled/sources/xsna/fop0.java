package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import com.vkontakte.android.R;
import xsna.vlp0;

/* compiled from: TranslationAnimationCreator.java */
/* loaded from: classes12.dex */
public final class fop0 {
    public static ObjectAnimator a(View view, gnp0 gnp0Var, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, p4u0 p4u0Var) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) gnp0Var.b.getTag(R.id.transition_position)) != null) {
            f = (r2[0] - i) + translationX;
            f2 = (r2[1] - i2) + translationY;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f4));
        a aVar = new a(view, gnp0Var.b, translationX, translationY);
        p4u0Var.addListener(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    /* compiled from: TranslationAnimationCreator.java */
    public static class a extends AnimatorListenerAdapter implements vlp0.i {
        public final View b;
        public final View c;
        public int[] d;
        public float e;
        public float f;
        public final float g;
        public final float h;
        public boolean i;

        public a(View view, View view2, float f, float f2) {
            this.c = view;
            this.b = view2;
            this.g = f;
            this.h = f2;
            int[] iArr = (int[]) view2.getTag(R.id.transition_position);
            this.d = iArr;
            if (iArr != null) {
                view2.setTag(R.id.transition_position, null);
            }
        }

        @Override // xsna.vlp0.i
        public final void a(vlp0 vlp0Var) {
            if (this.i) {
                return;
            }
            this.b.setTag(R.id.transition_position, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.i = true;
            float f = this.g;
            View view = this.c;
            view.setTranslationX(f);
            view.setTranslationY(this.h);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            float f = this.g;
            View view = this.c;
            view.setTranslationX(f);
            view.setTranslationY(this.h);
        }

        @Override // xsna.vlp0.i
        public final void onTransitionCancel(vlp0 vlp0Var) {
            this.i = true;
            float f = this.g;
            View view = this.c;
            view.setTranslationX(f);
            view.setTranslationY(this.h);
        }

        @Override // xsna.vlp0.i
        public final void onTransitionEnd(vlp0 vlp0Var) {
            a(vlp0Var);
        }

        @Override // xsna.vlp0.i
        public final void onTransitionPause(vlp0 vlp0Var) {
            if (this.d == null) {
                this.d = new int[2];
            }
            int[] iArr = this.d;
            View view = this.c;
            view.getLocationOnScreen(iArr);
            this.b.setTag(R.id.transition_position, this.d);
            this.e = view.getTranslationX();
            this.f = view.getTranslationY();
            view.setTranslationX(this.g);
            view.setTranslationY(this.h);
        }

        @Override // xsna.vlp0.i
        public final void onTransitionResume(vlp0 vlp0Var) {
            float f = this.e;
            View view = this.c;
            view.setTranslationX(f);
            view.setTranslationY(this.f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // xsna.vlp0.i
        public final void onTransitionStart(vlp0 vlp0Var) {
        }
    }
}
