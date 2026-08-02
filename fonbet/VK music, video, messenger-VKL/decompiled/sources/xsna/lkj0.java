package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import com.vk.content.design.view.camera.ShutterButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class lkj0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lkj0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ShutterButton shutterButton = (ShutterButton) obj;
                float f = ShutterButton.L;
                shutterButton.z = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                shutterButton.invalidate();
                break;
            case 1:
                ((View) obj).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((hoh) obj).invoke((Float) valueAnimator.getAnimatedValue());
                break;
        }
    }
}
