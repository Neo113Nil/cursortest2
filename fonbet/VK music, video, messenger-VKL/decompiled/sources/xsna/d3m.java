package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: DesignAnimationExt.kt */
/* loaded from: classes17.dex */
public final class d3m {

    /* compiled from: DesignAnimationExt.kt */
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ Animator b;
        public final /* synthetic */ gzs<s3q0> c;

        public a(Animator animator, gzs<s3q0> gzsVar) {
            this.b = animator;
            this.c = gzsVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.b.removeListener(this);
            this.c.invoke();
        }
    }

    public static final void a(View view, float f, float f2) {
        if (view == null) {
            return;
        }
        view.clearAnimation();
        view.setAlpha(f);
        view.setTranslationY(f2);
        view.animate().setListener(null).setUpdateListener(null).cancel();
    }

    public static /* synthetic */ void b(View view, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        a(view, f, f2);
    }

    public static final ViewPropertyAnimator c(View view, long j, long j2, Runnable runnable, Interpolator interpolator, float f) {
        if (view == null) {
            return null;
        }
        a(view, f4m.h(view) ? view.getAlpha() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view.getTranslationY());
        view.setVisibility(0);
        ViewPropertyAnimator duration = view.animate().withEndAction(new f2l(1, view, runnable)).alpha(f).setDuration(j);
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        return duration.setStartDelay(j2);
    }

    public static final ViewPropertyAnimator e(final View view, long j, long j2, final Runnable runnable, Interpolator interpolator, final boolean z) {
        if (view == null) {
            return null;
        }
        if (!f4m.h(view)) {
            b(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view.getTranslationY(), 1);
            view.post(new b3m(runnable, 0));
            return null;
        }
        a(view, view.getAlpha(), view.getTranslationY());
        view.setVisibility(0);
        ViewPropertyAnimator duration = view.animate().withEndAction(new Runnable() { // from class: xsna.c3m
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
                int i = z ? 8 : 4;
                View view2 = view;
                view2.setVisibility(i);
                d3m.b(view2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view2.getTranslationY(), 1);
            }
        }).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j);
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        return duration.setStartDelay(j2);
    }

    public static final void g(Animator animator, gzs<s3q0> gzsVar) {
        animator.addListener(new a(animator, gzsVar));
    }

    public static final void h(Animation animation, gzs<s3q0> gzsVar) {
        animation.setAnimationListener(new b(gzsVar));
    }

    /* compiled from: DesignAnimationExt.kt */
    public static final class b implements Animation.AnimationListener {
        public final /* synthetic */ gzs<s3q0> b;

        public b(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            this.b.invoke();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }
}
