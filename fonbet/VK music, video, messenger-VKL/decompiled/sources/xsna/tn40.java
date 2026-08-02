package xsna;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: MusicMixAnimationGLView.kt */
/* loaded from: classes3.dex */
public final class tn40 implements ValueAnimator.AnimatorUpdateListener {
    public long b = SystemClock.uptimeMillis();
    public final /* synthetic */ yn40 c;

    public tn40(yn40 yn40Var) {
        this.c = yn40Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        yn40 yn40Var = this.c;
        utk0 utk0Var = yn40Var.r;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.b < 50) {
            return;
        }
        this.b = SystemClock.uptimeMillis();
        utk0 utk0Var2 = yn40Var.o;
        Float valueOf = Float.valueOf((float) ((SystemClock.uptimeMillis() / 1000.0d) - yn40Var.n));
        utk0Var2.getClass();
        utk0Var2.i(null, valueOf);
        if (yn40Var.x) {
            return;
        }
        float f = ((oo40) utk0Var.getValue()).g;
        float f2 = uptimeMillis - yn40Var.z;
        if (f2 < f) {
            utk0 utk0Var3 = yn40Var.p;
            Float valueOf2 = Float.valueOf(swe0.f(f2 / f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
            utk0Var3.getClass();
            utk0Var3.i(null, valueOf2);
            return;
        }
        if (yn40Var.x) {
            return;
        }
        yn40Var.x = true;
        ((oo40) utk0Var.getValue()).i.invoke();
    }
}
