package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* compiled from: AnimatedUtils.kt */
/* loaded from: classes16.dex */
public final class em2 {

    /* compiled from: AnimExt.kt */
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ gzs b;
        public final /* synthetic */ uru c;

        public a(gzs gzsVar, uru uruVar) {
            this.b = gzsVar;
            this.c = uruVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.b.invoke();
            this.c.b = null;
        }
    }

    public static final void a(uru uruVar, boolean z, final gzs<s3q0> gzsVar, gzs<Integer> gzsVar2, final izs<? super Integer, s3q0> izsVar) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = uruVar.b;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = uruVar.b) != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(gzsVar2.invoke().intValue(), z ? 255 : 0);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration((Math.abs(r9 - r7) / 255) * 200);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.dm2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                izsVar.invoke((Integer) valueAnimator3.getAnimatedValue());
                gzsVar.invoke();
            }
        });
        ofInt.addListener(new a(gzsVar, uruVar));
        uruVar.b = ofInt;
        ofInt.start();
    }

    public static /* synthetic */ void b(uru uruVar, boolean z, gzs gzsVar, qg2 qg2Var, int i) {
        gzs gzsVar2 = qg2Var;
        if ((i & 8) != 0) {
            gzsVar2 = new ra0(uruVar, 3);
        }
        a(uruVar, z, gzsVar, gzsVar2, new fm0(uruVar, 1));
    }
}
