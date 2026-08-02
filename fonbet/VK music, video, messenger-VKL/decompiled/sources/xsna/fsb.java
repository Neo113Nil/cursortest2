package xsna;

import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class fsb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fsb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ((ColorDrawable) this.c).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 1:
                ((View) this.c).setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((b3f0) this.c).b.setViewsAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
