package xsna;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: HorizontalSwipeStrategy.kt */
/* loaded from: classes17.dex */
public final class wfv extends bp6 {
    @Override // xsna.dmn0
    public final void a(View view, MotionEvent motionEvent) {
        int measuredWidth = view.getMeasuredWidth();
        VelocityTracker velocityTracker = this.j;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000);
            float abs = Math.abs(velocityTracker.getXVelocity());
            fr9 fr9Var = this.g;
            if (abs <= 700.0f || !fr9.k(fr9Var, wpr.c)) {
                m9g0 m9g0Var = m9g0.c;
                if (((czi) fr9Var.b).j().contains(m9g0Var)) {
                    fr9Var.b = m9g0Var;
                    bp6.g(this, view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                    s3q0 s3q0Var = s3q0.a;
                }
            } else {
                int measuredWidth2 = view.getMeasuredWidth();
                float translationX = view.getTranslationX();
                f(view, (Math.signum(translationX) * measuredWidth2) + translationX, true);
            }
            velocityTracker.recycle();
        }
        float f = measuredWidth * this.e;
        float translationX2 = view.getTranslationX();
        float f2 = -f;
        izs<MotionEvent, s3q0> izsVar = this.b;
        if (translationX2 < f2 || f < view.getTranslationX()) {
            int measuredWidth3 = view.getMeasuredWidth();
            float translationX3 = view.getTranslationX();
            f(view, (Math.signum(translationX3) * measuredWidth3) + translationX3, true);
            izsVar.invoke(motionEvent);
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        izsVar.invoke(motionEvent);
    }

    @Override // xsna.dmn0
    public final void b(View view, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        PointF pointF = this.h;
        float f = x - pointF.x;
        float y = motionEvent.getY() - pointF.y;
        if (this.k == null) {
            this.k = ViewConfiguration.get(view.getContext());
        }
        float scaledTouchSlop = this.k.getScaledTouchSlop() * this.f;
        if ((y * y) + (f * f) > scaledTouchSlop * scaledTouchSlop) {
            jho jhoVar = jho.c;
            fr9 fr9Var = this.g;
            if (((czi) fr9Var.b).j().contains(jhoVar)) {
                fr9Var.b = jhoVar;
                view.setTranslationX(view.getTranslationX() + f);
                s3q0 s3q0Var = s3q0.a;
            }
            VelocityTracker velocityTracker = this.j;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
    }

    @Override // xsna.bp6
    public final long c() {
        return 250L;
    }

    @Override // xsna.bp6
    public final float d(View view) {
        return view.getTranslationX();
    }

    @Override // xsna.bp6
    public final void e(View view, ValueAnimator valueAnimator) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
