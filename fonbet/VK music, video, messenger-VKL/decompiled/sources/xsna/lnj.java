package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: ContextMenuAnimator.kt */
/* loaded from: classes17.dex */
public final class lnj {
    public static final j8z h = new j8z();
    public static final hlq i = new hlq();
    public final View a;
    public final View b;
    public final View c;
    public boolean d;
    public AnimatorSet e;
    public AnimatorSet f;
    public v6 g;

    /* compiled from: ContextMenuAnimator.kt */
    public final class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            lnj lnjVar = lnj.this;
            if (lnjVar.d) {
                lnjVar.c.setBottom(intValue);
            } else {
                lnjVar.c.setTop(intValue);
            }
        }
    }

    /* compiled from: ContextMenuAnimator.kt */
    public final class b extends AnimatorListenerAdapter {
        public final gzs<s3q0> b;

        public b(v6 v6Var) {
            this.b = v6Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            lnj lnjVar = lnj.this;
            lnjVar.e = null;
            lnjVar.f = null;
            gzs<s3q0> gzsVar = this.b;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    /* compiled from: ContextMenuAnimator.kt */
    public final class c extends AnimatorListenerAdapter {
        public final int b;

        public c(int i) {
            this.b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            lnj lnjVar = lnj.this;
            lnjVar.e = null;
            lnjVar.f = null;
            View view = lnjVar.b;
            int i = this.b;
            view.setVisibility(i);
            lnjVar.c.setVisibility(i);
        }
    }

    public lnj(View view, View view2, View view3) {
        this.a = view;
        this.b = view2;
        this.c = view3;
    }

    public final void a() {
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.e = null;
        AnimatorSet animatorSet2 = this.f;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f = null;
    }

    public final void b(boolean z) {
        if (c()) {
            View view = this.c;
            if (z) {
                a();
                myt0.a(view, new rt0(this, 10));
                return;
            }
            a();
            this.b.setVisibility(4);
            view.setVisibility(4);
            v6 v6Var = this.g;
            if (v6Var != null) {
                v6Var.invoke();
            }
        }
    }

    public final boolean c() {
        if (this.e != null) {
            return true;
        }
        return f4m.h(this.c) && this.f == null;
    }
}
