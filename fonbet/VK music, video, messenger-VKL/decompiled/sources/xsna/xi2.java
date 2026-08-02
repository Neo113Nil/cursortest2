package xsna;

import android.animation.ValueAnimator;
import com.vk.im.ui.views.counter.AnimatedCounterView;
import com.vk.photo.editor.views.DashedSeekBar;
import com.vk.writebar.WriteBar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class xi2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xi2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AnimatedCounterView animatedCounterView = (AnimatedCounterView) obj;
                qcy<Object>[] qcyVarArr = AnimatedCounterView.w;
                animatedCounterView.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                animatedCounterView.invalidate();
                break;
            case 1:
                DashedSeekBar dashedSeekBar = (DashedSeekBar) obj;
                int i2 = DashedSeekBar.M;
                dashedSeekBar.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dashedSeekBar.invalidate();
                break;
            case 2:
                kdx0 kdx0Var = (kdx0) obj;
                kdx0Var.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kdx0Var.g = -((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            default:
                WriteBar writeBar = (WriteBar) obj;
                int i3 = WriteBar.h0;
                Object animatedValue = valueAnimator.getAnimatedValue();
                Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                if (num != null) {
                    bwt0.c0(num.intValue(), writeBar);
                    writeBar.requestLayout();
                    break;
                }
                break;
        }
    }
}
