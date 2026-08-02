package xsna;

import android.animation.ValueAnimator;
import com.google.android.material.slider.Slider;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.component.video.seekbar.ClipSeekBarView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class rn2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rn2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                xn2 xn2Var = (xn2) this.c;
                float[] fArr = (float[]) valueAnimator.getAnimatedValue();
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = fArr[2];
                float f4 = fArr[3];
                float f5 = fArr[4];
                xn2Var.e.setTranslationY(f3);
                xn2Var.d.setTranslationY(f2);
                xn2Var.b.setTranslationY(f);
                f4m.y((int) f4, xn2Var.f);
                xn2Var.a.setAlpha(f5);
                break;
            case 1:
                Slider slider = ((ClipSeekBarView) this.c).f;
                Object animatedValue = valueAnimator.getAnimatedValue();
                Float f6 = animatedValue instanceof Float ? (Float) animatedValue : null;
                slider.setTranslationY(f6 != null ? f6.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            default:
                b3f0 b3f0Var = (b3f0) this.c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                b3f0Var.a.setPopupTranslationY(intValue);
                b3f0Var.b.setBackgroundTranslation(intValue);
                b3f0Var.a.invalidate();
                break;
        }
    }
}
