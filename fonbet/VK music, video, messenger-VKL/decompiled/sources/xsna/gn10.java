package xsna;

import android.animation.ValueAnimator;
import com.vk.content.design.view.camera.ShutterButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class gn10 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gn10(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                in10 in10Var = (in10) obj;
                in10Var.e.setValues((float[]) valueAnimator.getAnimatedValue());
                in10Var.a.a.setImageMatrix(in10Var.e);
                break;
            case 1:
                ShutterButton shutterButton = (ShutterButton) obj;
                float f = ShutterButton.L;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                shutterButton.A = floatValue;
                shutterButton.B = floatValue + shutterButton.C;
                shutterButton.invalidate();
                break;
            default:
                ((com.vk.core.tips.c) obj).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
