package xsna;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.vk.feed.design.view.newsfeed.overlay.VkOverlayCircleButton;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class az5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ az5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                bz5 bz5Var = (bz5) this.c;
                bz5Var.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bz5Var.invalidateSelf();
                break;
            default:
                VkOverlayCircleButton vkOverlayCircleButton = (VkOverlayCircleButton) this.c;
                ViewGroup.LayoutParams layoutParams = vkOverlayCircleButton.d.getLayoutParams();
                Object animatedValue = valueAnimator.getAnimatedValue();
                Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                layoutParams.width = num != null ? num.intValue() : 0;
                vkOverlayCircleButton.d.setLayoutParams(layoutParams);
                break;
        }
    }
}
