package xsna;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VerticalBottomSwipeStrategy.kt */
/* loaded from: classes17.dex */
public final class mor0 extends dpr0 {
    @Override // xsna.dmn0
    public final void a(View view, MotionEvent motionEvent) {
        int measuredHeight = view.getMeasuredHeight();
        VelocityTracker velocityTracker = this.j;
        izs<MotionEvent, s3q0> izsVar = this.b;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000);
            float f = measuredHeight;
            float f2 = this.e * f;
            float yVelocity = velocityTracker.getYVelocity();
            fr9 fr9Var = this.g;
            if (yVelocity <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && velocityTracker.getYVelocity() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && Math.abs(velocityTracker.getYVelocity()) > 500.0f && fr9.k(fr9Var, wpr.c)) {
                f(view, Math.abs(f * 2.5f) + this.i, true);
            } else if (view.getTranslationY() - this.i <= f2 || !fr9.k(fr9Var, wpr.c)) {
                m9g0 m9g0Var = m9g0.c;
                if (((czi) fr9Var.b).j().contains(m9g0Var)) {
                    fr9Var.b = m9g0Var;
                    bp6.g(this, view, this.i, 4);
                    s3q0 s3q0Var = s3q0.a;
                }
            } else {
                f(view, Math.abs(f * 2.5f) + this.i, true);
                izsVar.invoke(motionEvent);
            }
            velocityTracker.recycle();
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
        VelocityTracker velocityTracker = this.j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (y < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float translationY = view.getTranslationY();
            float f2 = this.i;
            if (translationY - f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                view.setTranslationY(f2);
                return;
            }
        }
        if (this.k == null) {
            this.k = ViewConfiguration.get(view.getContext());
        }
        float scaledTouchSlop = this.k.getScaledTouchSlop() * this.f;
        if ((y * y) + (f * f) > scaledTouchSlop * scaledTouchSlop) {
            jho jhoVar = jho.c;
            fr9 fr9Var = this.g;
            if (((czi) fr9Var.b).j().contains(jhoVar)) {
                fr9Var.b = jhoVar;
                float translationY2 = view.getTranslationY();
                float f3 = this.i;
                if ((translationY2 - f3) + y >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f3 = view.getTranslationY() + y;
                }
                view.setTranslationY(f3);
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }
}
