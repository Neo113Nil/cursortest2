package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* compiled from: BaseStarsFeedbackView.kt */
/* loaded from: classes16.dex */
public final class yn6 extends AnimatorListenerAdapter {
    public final /* synthetic */ ImageView b;
    public final /* synthetic */ gzs<s3q0> c;

    /* compiled from: BaseStarsFeedbackView.kt */
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ gzs<s3q0> b;

        public a(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            gzs<s3q0> gzsVar = this.b;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    public yn6(ImageView imageView, gzs gzsVar) {
        this.b = imageView;
        this.c = gzsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ImageView imageView = this.b;
        imageView.setScaleY(1.0f);
        imageView.setScaleX(1.0f);
        gzs<s3q0> gzsVar = this.c;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.animate().setDuration(150L).scaleX(1.0f).scaleY(1.0f).setListener(new a(this.c)).start();
    }
}
