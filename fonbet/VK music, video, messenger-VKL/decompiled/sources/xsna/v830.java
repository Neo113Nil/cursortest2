package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: MoreLessFeedbackView.kt */
/* loaded from: classes17.dex */
public final class v830 extends AnimatorListenerAdapter {
    public final /* synthetic */ View b;
    public final /* synthetic */ gzs<s3q0> c;

    /* compiled from: MoreLessFeedbackView.kt */
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

    public v830(View view, gzs<s3q0> gzsVar) {
        this.b = view;
        this.c = gzsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.b;
        view.setScaleY(1.0f);
        view.setScaleX(1.0f);
        this.c.invoke();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.animate().setDuration(150L).scaleX(1.0f).scaleY(1.0f).setListener(new a(this.c)).start();
    }
}
