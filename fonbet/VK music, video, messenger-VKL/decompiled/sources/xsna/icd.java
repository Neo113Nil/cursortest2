package xsna;

import android.animation.ValueAnimator;
import com.google.android.material.slider.Slider;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.component.video.seekbar.ClipSeekBarView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class icd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ icd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ClipSeekBarView clipSeekBarView = (ClipSeekBarView) this.c;
                if (!clipSeekBarView.p) {
                    Slider slider = clipSeekBarView.f;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
                    slider.setValue(f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                }
                break;
            default:
                b3f0 b3f0Var = (b3f0) this.c;
                b3f0Var.a.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                b3f0Var.a.invalidate();
                break;
        }
    }
}
