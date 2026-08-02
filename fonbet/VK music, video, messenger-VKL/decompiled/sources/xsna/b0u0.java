package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat.java */
/* loaded from: classes11.dex */
public final class b0u0 {
    public final WeakReference<View> a;

    public b0u0(View view) {
        this.a = new WeakReference<>(view);
    }

    public final void a(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(e0u0 e0u0Var) {
        View view = this.a.get();
        if (view != null) {
            if (e0u0Var != null) {
                view.animate().setListener(new a0u0(e0u0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(final g0u0 g0u0Var) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().setUpdateListener(g0u0Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.zzt0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    g0u0.this.a();
                }
            } : null);
        }
    }

    public final void f(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
