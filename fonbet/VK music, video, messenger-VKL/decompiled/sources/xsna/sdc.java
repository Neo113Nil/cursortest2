package xsna;

import android.animation.ValueAnimator;
import com.vk.core.ui.CircularProgressView;

/* compiled from: CircularProgressView.java */
/* loaded from: classes17.dex */
public final class sdc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CircularProgressView b;

    public sdc(CircularProgressView circularProgressView) {
        this.b = circularProgressView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        CircularProgressView circularProgressView = this.b;
        circularProgressView.j = floatValue;
        circularProgressView.invalidate();
    }
}
