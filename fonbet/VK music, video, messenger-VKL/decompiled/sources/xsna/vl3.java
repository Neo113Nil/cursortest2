package xsna;

import android.animation.ValueAnimator;
import xsna.xl3;

/* compiled from: ArrowProgressDrawable.java */
/* loaded from: classes17.dex */
public final class vl3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ xl3.a b;
    public final /* synthetic */ xl3 c;

    public vl3(xl3 xl3Var, xl3.a aVar) {
        this.c = xl3Var;
        this.b = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        xl3.a aVar = this.b;
        xl3.k(floatValue, aVar);
        xl3 xl3Var = this.c;
        xl3Var.i(floatValue, aVar, false);
        xl3Var.invalidateSelf();
    }
}
