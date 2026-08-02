package xsna;

import android.animation.ValueAnimator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.stories.design.view.text.StorySeekBar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class icm0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ icm0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                StorySeekBar storySeekBar = (StorySeekBar) obj;
                int i2 = StorySeekBar.p;
                storySeekBar.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                storySeekBar.invalidate();
                break;
            default:
                ckm0 ckm0Var = (ckm0) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ckm0Var.b.k = swe0.f(floatValue, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10.0f);
                ckm0Var.c.a();
                break;
        }
    }
}
