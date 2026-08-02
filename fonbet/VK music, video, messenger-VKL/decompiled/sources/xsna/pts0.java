package xsna;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VideoMessagesCameraView.kt */
/* loaded from: classes7.dex */
public final class pts0 implements View.OnTouchListener, ScaleGestureDetector.OnScaleGestureListener {
    public final ScaleGestureDetector b;
    public final /* synthetic */ nts0 c;

    public pts0(nts0 nts0Var) {
        this.c = nts0Var;
        this.b = new ScaleGestureDetector(nts0Var.getContext(), this);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        Float b;
        nts0 nts0Var = this.c;
        kew kewVar = nts0Var.b;
        if (kewVar == null || (b = kewVar.b()) == null) {
            return false;
        }
        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(1.0f, (scaleGestureDetector.getScaleFactor() - 1) + b.floatValue()));
        kew kewVar2 = nts0Var.b;
        if (kewVar2 != null) {
            kewVar2.f(max);
        }
        if (!nts0Var.x) {
            nts0Var.x = true;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        Float b;
        nts0 nts0Var = this.c;
        kew kewVar = nts0Var.b;
        if (kewVar == null || (b = kewVar.b()) == null) {
            return;
        }
        float floatValue = b.floatValue();
        ValueAnimator valueAnimator = nts0Var.C;
        valueAnimator.cancel();
        valueAnimator.setFloatValues(floatValue, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        valueAnimator.start();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return true;
        }
        this.b.onTouchEvent(motionEvent);
        return true;
    }
}
