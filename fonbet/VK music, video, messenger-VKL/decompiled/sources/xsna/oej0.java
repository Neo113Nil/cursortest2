package xsna;

import android.animation.ValueAnimator;
import android.graphics.RuntimeShader;
import one.video.ad.ux.ShoppableAdView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class oej0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oej0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = ShoppableAdView.i;
                ((izs) obj).invoke((Float) valueAnimator.getAnimatedValue());
                break;
            default:
                amk0 amk0Var = (amk0) obj;
                RuntimeShader a = efa.a(amk0Var.d.getValue());
                if (a != null) {
                    a.setFloatUniform("u_Time", ((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                amk0Var.c.invoke();
                break;
        }
    }
}
