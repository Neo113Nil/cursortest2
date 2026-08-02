package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: AnimationExt.kt */
/* loaded from: classes17.dex */
public final class xo2 {

    /* compiled from: AnimationExt.kt */
    public static final class a implements io.reactivex.rxjava3.disposables.c {
        public boolean b;
        public final /* synthetic */ ViewPropertyAnimator c;

        public a(ViewPropertyAnimator viewPropertyAnimator) {
            this.c = viewPropertyAnimator;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.c.cancel();
            this.b = true;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.b;
        }
    }

    /* compiled from: AnimationExt.kt */
    public static final class b extends AnimatorListenerAdapter {
        public final /* synthetic */ gzs<s3q0> b;
        public final /* synthetic */ View c;

        public b(View view, gzs gzsVar) {
            this.b = gzsVar;
            this.c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            gzs<s3q0> gzsVar = this.b;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            d3m.b(this.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        }
    }

    public static final void a(final View view, float f) {
        view.setClipToOutline(true);
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        final wo2 wo2Var = new wo2(view, ref$FloatRef);
        view.setOutlineProvider(wo2Var);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
        ofFloat.setDuration(0L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.so2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Ref$FloatRef.this.element = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view.setOutlineProvider(wo2Var);
            }
        });
        ofFloat.start();
    }

    public static final void b(ViewPropertyAnimator viewPropertyAnimator, io.reactivex.rxjava3.disposables.b bVar) {
        bVar.b(new a(viewPropertyAnimator));
    }

    public static final Animator c(View view, int i, int i2, float f, float f2, long j, gzs<s3q0> gzsVar) {
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f2);
        createCircularReveal.setInterpolator(new ilq());
        Animator duration = createCircularReveal.setDuration(j);
        duration.addListener(new b(view, gzsVar));
        duration.start();
        return duration;
    }

    public static ViewPropertyAnimator d(int i, long j, View view) {
        ViewPropertyAnimator c;
        ViewPropertyAnimator scaleX;
        if ((i & 2) != 0) {
            j = 300;
        }
        long j2 = j;
        long j3 = (i & 4) != 0 ? 0L : 50L;
        if (view != null && view.isAttachedToWindow() && f4m.g(view)) {
            c = d3m.c(view, (r15 & 1) != 0 ? 300L : j2, (r15 & 2) != 0 ? 0L : j3, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (c != null && (scaleX = c.scaleX(1.0f)) != null) {
                return scaleX.scaleY(1.0f);
            }
        } else {
            if (view != null) {
                view.setVisibility(0);
            }
            if (view != null) {
                view.setAlpha(1.0f);
            }
            if (view != null) {
                view.setScaleX(1.0f);
            }
            if (view != null) {
                view.setScaleY(1.0f);
            }
        }
        return null;
    }

    public static ViewPropertyAnimator e(View view, long j, Runnable runnable, int i) {
        ViewPropertyAnimator e;
        ViewPropertyAnimator scaleX;
        if ((i & 2) != 0) {
            j = 300;
        }
        long j2 = j;
        long j3 = (i & 4) != 0 ? 0L : 50L;
        Runnable runnable2 = (i & 8) != 0 ? null : runnable;
        if (view != null && view.isAttachedToWindow() && f4m.h(view)) {
            e = d3m.e(view, (r15 & 1) != 0 ? 300L : j2, (r15 & 2) != 0 ? 0L : j3, (r15 & 4) != 0 ? null : runnable2, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            if (e != null && (scaleX = e.scaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) != null) {
                return scaleX.scaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        } else {
            if (view != null) {
                view.setVisibility(8);
            }
            if (view != null) {
                view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (view != null) {
                view.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (view != null) {
                view.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        return null;
    }

    public static final void f(View view, boolean z, boolean z2, long j) {
        if (view == null) {
            return;
        }
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z2) {
            if (f4m.h(view)) {
                f = view.getAlpha();
            }
            d3m.a(view, f, view.getTranslationY());
            if (z) {
                d(29, j, view);
                return;
            } else {
                e(view, j, null, 13);
                return;
            }
        }
        view.clearAnimation();
        if (z) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setVisibility(0);
        } else {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setVisibility(8);
        }
        s3q0 s3q0Var = s3q0.a;
    }

    public static final void h(ValueAnimator valueAnimator, gzs gzsVar) {
        valueAnimator.addListener(new ap2(valueAnimator, gzsVar));
    }

    public static final void i(ValueAnimator valueAnimator, gzs gzsVar) {
        valueAnimator.addListener(new bp2(gzsVar));
    }
}
