package xsna;

import android.animation.Animator;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.dto.hints.Hint;
import xsna.m8v0;

/* compiled from: StoryTemplateButtonController.kt */
/* loaded from: classes6.dex */
public final class yim0 implements Animator.AnimatorListener {
    public final /* synthetic */ zim0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ wvw d;
    public final /* synthetic */ Hint e;

    public yim0(zim0 zim0Var, String str, wvw wvwVar, Hint hint) {
        this.b = zim0Var;
        this.c = str;
        this.d = wvwVar;
        this.e = hint;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zim0 zim0Var = this.b;
        w4u0 w4u0Var = zim0Var.n;
        if (w4u0Var.c() >= w4u0Var.c) {
            int i = m8v0.M;
            m8v0.a.a(zim0Var.l, this.c, null, VkTooltip$MarkerStyle.Style6, VkTooltip$MarkerSize.Size96, null, VkTooltip$BalloonPosition.Top, null, new n9m0(zim0Var, 4), new qjg0(zim0Var, 8), null, null, new p37(zim0Var, this.d, this.e, 5), new ggb0(zim0Var, 16), null, 0, false, null, null, false, null, false, 16239780);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
