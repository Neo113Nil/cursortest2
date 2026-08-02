package xsna;

import android.view.animation.Animation;
import com.vk.core.view.components.tooltip.VkTooltip;

/* compiled from: VkTooltip.kt */
/* loaded from: classes17.dex */
public final class ftv0 implements Animation.AnimationListener {
    public final /* synthetic */ VkTooltip b;

    public ftv0(VkTooltip vkTooltip) {
        this.b = vkTooltip;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.b.setVisibility(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
