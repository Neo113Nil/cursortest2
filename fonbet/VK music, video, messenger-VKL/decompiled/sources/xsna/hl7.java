package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.vas.design.view.sticker.BonusProgressView;
import xsna.rrn;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class hl7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hl7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                BonusProgressView bonusProgressView = (BonusProgressView) obj;
                int i2 = BonusProgressView.i;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bonusProgressView.h = floatValue;
                bonusProgressView.e.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, floatValue * bonusProgressView.getMeasuredWidth(), bonusProgressView.getMeasuredHeight());
                bonusProgressView.invalidate();
                break;
            case 1:
                rrn rrnVar = (rrn) obj;
                float translationX = rrnVar.b.getTranslationX();
                bpn0 bpn0Var = rrn.i;
                rrnVar.d.invoke(Float.valueOf((translationX + rrn.a.a()) / rrnVar.h), Boolean.FALSE);
                break;
            case 2:
                ((com.vk.attachpicker.a) obj).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                View view = (View) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                view.setScaleX(floatValue2);
                view.setScaleY(floatValue2);
                view.setTranslationY(y5f0.h);
                break;
        }
    }
}
