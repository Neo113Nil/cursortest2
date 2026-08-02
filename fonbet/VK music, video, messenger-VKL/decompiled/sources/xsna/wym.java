package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: DimAnimator.kt */
/* loaded from: classes2.dex */
public final class wym {
    public static final j8z d = new j8z();
    public static final hlq e = new hlq();
    public final View a;
    public ViewPropertyAnimator b;
    public ViewPropertyAnimator c;

    /* compiled from: DimAnimator.kt */
    public final class a extends AnimatorListenerAdapter {
        public final int b;

        public a(int i) {
            this.b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            wym wymVar = wym.this;
            wymVar.b = null;
            wymVar.c = null;
            wymVar.a.setVisibility(this.b);
        }
    }

    public wym(View view) {
        this.a = view;
    }

    public final void a() {
        ViewPropertyAnimator viewPropertyAnimator = this.b;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.b = null;
        ViewPropertyAnimator viewPropertyAnimator2 = this.c;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        this.c = null;
    }

    public final boolean b() {
        if (this.b != null) {
            return true;
        }
        return bwt0.K(this.a) && this.c == null;
    }
}
