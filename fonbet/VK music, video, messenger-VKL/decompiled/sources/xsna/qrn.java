package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import xsna.rrn;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qrn implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qrn(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                rrn rrnVar = (rrn) obj;
                float translationX = rrnVar.b.getTranslationX();
                bpn0 bpn0Var = rrn.i;
                rrnVar.d.invoke(Float.valueOf((translationX + rrn.a.a()) / rrnVar.h), Boolean.FALSE);
                break;
            case 1:
                ((l880) obj).b7(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                View view = (View) obj;
                view.setAlpha(valueAnimator.getAnimatedFraction());
                view.setScaleX(valueAnimator.getAnimatedFraction());
                view.setScaleY(valueAnimator.getAnimatedFraction());
                break;
        }
    }
}
