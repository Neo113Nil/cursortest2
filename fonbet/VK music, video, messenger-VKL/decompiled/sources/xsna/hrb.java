package xsna;

import android.animation.ValueAnimator;
import xsna.irb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class hrb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hrb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ((irb.b) this.c).c.setAlpha((int) (valueAnimator.getAnimatedFraction() * 178.5f));
                break;
            default:
                ((q880) this.c).b7(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
