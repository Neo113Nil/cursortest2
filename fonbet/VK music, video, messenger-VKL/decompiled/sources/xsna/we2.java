package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: AnimExt.kt */
/* loaded from: classes4.dex */
public final class we2 {

    /* compiled from: AnimExt.kt */
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ gzs<s3q0> b;

        public a(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.b.invoke();
        }
    }

    public static final void a(Animator animator, gzs<s3q0> gzsVar) {
        animator.addListener(new a(gzsVar));
    }
}
