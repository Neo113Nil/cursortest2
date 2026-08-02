package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: BaseSwipeStrategy.kt */
/* loaded from: classes17.dex */
public abstract class bp6 implements dmn0 {
    public final izs<MotionEvent, s3q0> a;
    public final izs<MotionEvent, s3q0> b;
    public final izs<View, s3q0> c;
    public final izs<View, s3q0> d;
    public final float e;
    public final float f;
    public final fr9 g;
    public final PointF h;
    public float i;
    public VelocityTracker j;
    public ViewConfiguration k;

    /* compiled from: BaseSwipeStrategy.kt */
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean c;
        public final /* synthetic */ View d;

        public a(boolean z, View view) {
            this.c = z;
            this.d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            bp6 bp6Var = bp6.this;
            boolean equals = wpr.c.equals((czi) bp6Var.g.b);
            View view = this.d;
            if (equals) {
                bp6Var.c.invoke(view);
                s3q0 s3q0Var = s3q0.a;
            }
            fr9.k(bp6Var.g, nvv.c);
            if (this.c) {
                bp6Var.d.invoke(view);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bp6(izs<? super MotionEvent, s3q0> izsVar, izs<? super MotionEvent, s3q0> izsVar2, izs<? super View, s3q0> izsVar3, izs<? super View, s3q0> izsVar4, float f, float f2) {
        this.a = izsVar;
        this.b = izsVar2;
        this.c = izsVar3;
        this.d = izsVar4;
        this.e = f;
        this.f = f2;
        fr9 fr9Var = new fr9();
        fr9Var.b = nvv.c;
        this.g = fr9Var;
        this.h = new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static /* synthetic */ void g(bp6 bp6Var, View view, float f, int i) {
        if ((i & 2) != 0) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        bp6Var.f(view, f, false);
    }

    public abstract long c();

    public abstract float d(View view);

    public abstract void e(View view, ValueAnimator valueAnimator);

    public final void f(final View view, float f, boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(d(view), f);
        ofFloat.setDuration(c());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.ap6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                bp6.this.e(view, valueAnimator);
            }
        });
        ofFloat.setInterpolator(new hlq());
        ofFloat.addListener(new a(z, view));
        ofFloat.start();
    }
}
