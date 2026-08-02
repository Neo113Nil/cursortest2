package xsna;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import androidx.annotation.Nullable;
import com.airbnb.lottie.AsyncUpdates;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;

/* compiled from: LottieValueAnimator.java */
/* loaded from: classes12.dex */
public final class z800 extends pg6 implements Choreographer.FrameCallback {
    public float e;
    public boolean f;
    public long g;
    public float h;
    public float i;
    public int j;
    public float k;
    public float l;

    @Nullable
    public i700 m;
    public boolean n;
    public boolean o;

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(l());
        m(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z = false;
        if (this.n) {
            m(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        i700 i700Var = this.m;
        if (i700Var == null || !this.n) {
            return;
        }
        AsyncUpdates asyncUpdates = tky.a;
        float abs = (this.g != 0 ? j - r2 : 0L) / ((1.0E9f / i700Var.n) / Math.abs(this.e));
        float f = this.h;
        if (l()) {
            abs = -abs;
        }
        float f2 = f + abs;
        float k = k();
        float j2 = j();
        PointF pointF = ls20.a;
        if (f2 >= k && f2 <= j2) {
            z = true;
        }
        float f3 = this.h;
        float b = ls20.b(f2, k(), j());
        this.h = b;
        if (this.o) {
            b = (float) Math.floor(b);
        }
        this.i = b;
        this.g = j;
        if (z) {
            if (!this.o || this.h != f3) {
                e();
            }
        } else if (getRepeatCount() == -1 || this.j < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f = !this.f;
                this.e = -this.e;
            } else {
                float j3 = l() ? j() : k();
                this.h = j3;
                this.i = j3;
            }
            this.g = j;
            if (!this.o || this.h != f3) {
                e();
            }
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.j++;
        } else {
            float k2 = this.e < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? k() : j();
            this.h = k2;
            this.i = k2;
            m(true);
            if (!this.o || this.h != f3) {
                e();
            }
            a(l());
        }
        if (this.m != null) {
            float f4 = this.i;
            if (f4 < this.k || f4 > this.l) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.k), Float.valueOf(this.l), Float.valueOf(this.i)));
            }
        }
        AsyncUpdates asyncUpdates2 = tky.a;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float k;
        float j;
        float k2;
        if (this.m == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (l()) {
            k = j() - this.i;
            j = j();
            k2 = k();
        } else {
            k = this.i - k();
            j = j();
            k2 = k();
        }
        return k / (j - k2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(i());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        i700 i700Var = this.m;
        if (i700Var == null) {
            return 0L;
        }
        return (long) i700Var.b();
    }

    public final float i() {
        i700 i700Var = this.m;
        if (i700Var == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = this.i;
        float f2 = i700Var.l;
        return (f - f2) / (i700Var.m - f2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.n;
    }

    public final float j() {
        i700 i700Var = this.m;
        if (i700Var == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = this.l;
        return f == 2.1474836E9f ? i700Var.m : f;
    }

    public final float k() {
        i700 i700Var = this.m;
        if (i700Var == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = this.k;
        return f == -2.1474836E9f ? i700Var.l : f;
    }

    public final boolean l() {
        return this.e < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void m(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.n = false;
        }
    }

    public final void n(float f) {
        if (this.h == f) {
            return;
        }
        float b = ls20.b(f, k(), j());
        this.h = b;
        if (this.o) {
            b = (float) Math.floor(b);
        }
        this.i = b;
        this.g = 0L;
        e();
    }

    public final void o(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException("minFrame (" + f + ") must be <= maxFrame (" + f2 + ")");
        }
        i700 i700Var = this.m;
        float f3 = i700Var == null ? -3.4028235E38f : i700Var.l;
        float f4 = i700Var == null ? Float.MAX_VALUE : i700Var.m;
        float b = ls20.b(f, f3, f4);
        float b2 = ls20.b(f2, f3, f4);
        if (b == this.k && b2 == this.l) {
            return;
        }
        this.k = b;
        this.l = b2;
        n((int) ls20.b(this.i, b, b2));
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f) {
            return;
        }
        this.f = false;
        this.e = -this.e;
    }
}
