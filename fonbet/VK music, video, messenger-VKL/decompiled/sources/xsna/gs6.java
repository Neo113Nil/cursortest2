package xsna;

import android.animation.ValueAnimator;
import com.unity3d.services.UnityAdsConstants;
import xsna.lh6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class gs6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gs6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                com.vk.attachpicker.screen.a aVar = (com.vk.attachpicker.screen.a) this.c;
                Object animatedValue = valueAnimator.getAnimatedValue();
                Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                aVar.H(num != null ? num.intValue() : 0);
                break;
            case 1:
                utk0 utk0Var = ((yn40) this.c).s;
                utk0Var.i(null, lh6.a.a((lh6.a) utk0Var.getValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Float) valueAnimator.getAnimatedValue()).floatValue(), null, null, null, null, null, 251));
                break;
            default:
                ((q8u0) this.c).b.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
