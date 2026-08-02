package xsna;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;

/* compiled from: AlphaViewAnimator.kt */
/* loaded from: classes2.dex */
public final class jv1 {
    public final View a;
    public final DecelerateInterpolator b;
    public final DecelerateInterpolator c;
    public final long d;
    public final long e;
    public ViewPropertyAnimator f;
    public ViewPropertyAnimator g;

    public jv1(View view) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        DecelerateInterpolator decelerateInterpolator2 = new DecelerateInterpolator();
        this.a = view;
        this.b = decelerateInterpolator;
        this.c = decelerateInterpolator2;
        this.d = 250L;
        this.e = 250L;
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
}
