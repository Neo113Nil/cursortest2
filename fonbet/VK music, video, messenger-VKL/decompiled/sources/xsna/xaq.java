package xsna;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* compiled from: Ext.kt */
/* loaded from: classes6.dex */
public final class xaq {
    public static final void a(final nov novVar, gzs<s3q0> gzsVar) {
        Animator bounceAnimator = novVar.getBounceAnimator();
        if (bounceAnimator != null) {
            bounceAnimator.cancel();
        }
        final float c = novVar.getCommons().c();
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.85f, 1.0f).setDuration(200L);
        duration.setInterpolator(new ilq());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.vaq
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * c;
                nov novVar2 = novVar;
                novVar2.a(floatValue / novVar2.getCommons().c(), novVar2.getCenterX(), novVar2.getCenterY());
                gzs<s3q0> invalidator = novVar2.getInvalidator();
                if (invalidator != null) {
                    invalidator.invoke();
                }
            }
        });
        duration.addListener(new a(novVar, c, gzsVar));
        duration.start();
        novVar.setBounceAnimator(duration);
    }

    /* compiled from: Ext.kt */
    public static final class a implements Animator.AnimatorListener {
        public final /* synthetic */ nov b;
        public final /* synthetic */ float c;
        public final /* synthetic */ gzs<s3q0> d;

        public a(nov novVar, float f, gzs<s3q0> gzsVar) {
            this.b = novVar;
            this.c = f;
            this.d = gzsVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            float f = this.c * 1.0f;
            nov novVar = this.b;
            novVar.a(f / novVar.getCommons().c(), novVar.getCenterX(), novVar.getCenterY());
            gzs<s3q0> invalidator = novVar.getInvalidator();
            if (invalidator != null) {
                invalidator.invoke();
            }
            gzs<s3q0> invalidator2 = novVar.getInvalidator();
            if (invalidator2 != null) {
                invalidator2.invoke();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.d.invoke();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
