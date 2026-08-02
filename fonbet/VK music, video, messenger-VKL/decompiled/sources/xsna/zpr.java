package xsna;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: FloatAnimationDelegate.kt */
/* loaded from: classes2.dex */
public final class zpr implements p7f0<Object, Float>, View.OnAttachStateChangeListener {
    public final ptl0 b;
    public float c = 0.75f;
    public final ValueAnimator d;

    public zpr(ptl0 ptl0Var) {
        this.b = ptl0Var;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(150L);
        this.d = valueAnimator;
        valueAnimator.addUpdateListener(new of0(this, 2));
    }

    @Override // xsna.i7f0
    public final Object getValue(Object obj, qcy qcyVar) {
        Object animatedValue = this.d.getAnimatedValue();
        return Float.valueOf(animatedValue != null ? ((Float) animatedValue).floatValue() : 0.75f);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.d.cancel();
    }

    @Override // xsna.p7f0
    public final void setValue(Object obj, qcy qcyVar, Float f) {
        float floatValue = f.floatValue();
        if (this.c == floatValue) {
            return;
        }
        this.c = floatValue;
        ValueAnimator valueAnimator = this.d;
        valueAnimator.cancel();
        Object animatedValue = valueAnimator.getAnimatedValue();
        valueAnimator.setFloatValues(animatedValue != null ? ((Float) animatedValue).floatValue() : 0.75f, floatValue);
        valueAnimator.start();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
