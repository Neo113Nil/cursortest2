package xsna;

import android.animation.ValueAnimator;
import com.vk.core.ui.CircularProgressView;

/* compiled from: CircularProgressView.java */
/* loaded from: classes17.dex */
public final class udc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ CircularProgressView d;

    public udc(CircularProgressView circularProgressView, float f, float f2) {
        this.d = circularProgressView;
        this.b = f;
        this.c = f2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        CircularProgressView circularProgressView = this.d;
        circularProgressView.s = floatValue;
        circularProgressView.j = (this.b - circularProgressView.s) + this.c;
        circularProgressView.invalidate();
    }
}
