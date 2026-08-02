package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ViewAlphaAnimatorHelper.kt */
/* loaded from: classes2.dex */
public final class vtt0 {
    public final View a;
    public final Interpolator b;
    public final Interpolator c;
    public final long d;
    public final int e;
    public ViewPropertyAnimator f;
    public ViewPropertyAnimator g;
    public final Handler h;
    public final bpn0 i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;

    /* compiled from: ViewAlphaAnimatorHelper.kt */
    public final class a extends AnimatorListenerAdapter {
        public final int b;

        public a(int i) {
            this.b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            vtt0 vtt0Var = vtt0.this;
            vtt0Var.f = null;
            vtt0Var.g = null;
            vtt0Var.a.setVisibility(this.b);
        }
    }

    public vtt0(View view, LinearInterpolator linearInterpolator, LinearInterpolator linearInterpolator2, long j, int i) {
        linearInterpolator = (i & 2) != 0 ? new LinearInterpolator() : linearInterpolator;
        linearInterpolator2 = (i & 4) != 0 ? new LinearInterpolator() : linearInterpolator2;
        j = (i & 8) != 0 ? 250L : j;
        int i2 = (i & 16) != 0 ? 8 : 4;
        this.a = view;
        this.b = linearInterpolator;
        this.c = linearInterpolator2;
        this.d = j;
        this.e = i2;
        this.h = new Handler(Looper.getMainLooper());
        this.i = new bpn0(new i8n0(this, 13));
        this.j = new bpn0(new prq0(this, 19));
        this.k = new bpn0(new wmd0(this, 24));
        this.l = new bpn0(new j8n0(this, 21));
    }

    public static void g(vtt0 vtt0Var, boolean z) {
        Handler handler = vtt0Var.h;
        if (vtt0Var.f()) {
            vtt0Var.b();
        } else {
            vtt0Var.b();
            vtt0Var.h(z);
        }
    }

    public final void a() {
        ViewPropertyAnimator viewPropertyAnimator = this.f;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.f = null;
        ViewPropertyAnimator viewPropertyAnimator2 = this.g;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        this.g = null;
    }

    public final void b() {
        Runnable runnable = (Runnable) this.i.getValue();
        Handler handler = this.h;
        handler.removeCallbacks(runnable);
        handler.removeCallbacks((Runnable) this.j.getValue());
        handler.removeCallbacks((Runnable) this.k.getValue());
        handler.removeCallbacks((Runnable) this.l.getValue());
    }

    public final void c(long j, boolean z) {
        if (!f()) {
            b();
            return;
        }
        b();
        if (j <= 0) {
            e(z);
            return;
        }
        Handler handler = this.h;
        if (z) {
            handler.postDelayed((Runnable) this.l.getValue(), j);
        } else {
            handler.postDelayed((Runnable) this.k.getValue(), j);
        }
    }

    public final void d(boolean z) {
        c(0L, z);
    }

    public final void e(boolean z) {
        int i = this.e;
        View view = this.a;
        if (z) {
            a();
            view.setVisibility(0);
            this.g = view.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setInterpolator(this.c).setDuration(this.d).setListener(new a(i));
        } else {
            a();
            view.setVisibility(i);
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public final boolean f() {
        if (this.f != null) {
            return true;
        }
        return bwt0.K(this.a) && this.g == null;
    }

    public final void h(boolean z) {
        View view = this.a;
        if (!z) {
            a();
            view.setVisibility(0);
            view.setAlpha(1.0f);
        } else {
            a();
            view.setAlpha(view.getVisibility() != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : view.getAlpha());
            view.setVisibility(0);
            this.f = view.animate().alpha(1.0f).setInterpolator(this.b).setDuration(this.d).setListener(new a(0));
        }
    }
}
