package xsna;

import android.animation.ValueAnimator;
import com.vk.core.ui.CircularProgressView;

/* compiled from: CircularProgressView.java */
/* loaded from: classes17.dex */
public final class tdc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CircularProgressView b;

    public tdc(CircularProgressView circularProgressView) {
        this.b = circularProgressView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.b.k = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
