package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.libvideo.ui.VideoAuthorView;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: VideoAuthorView.kt */
/* loaded from: classes3.dex */
public final class e3s0 extends AnimatorListenerAdapter {
    public final /* synthetic */ Ref$BooleanRef b;
    public final /* synthetic */ VideoAuthorView c;
    public final /* synthetic */ AnimatorSet d;

    public e3s0(Ref$BooleanRef ref$BooleanRef, VideoAuthorView videoAuthorView, AnimatorSet animatorSet) {
        this.b = ref$BooleanRef;
        this.c = videoAuthorView;
        this.d = animatorSet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.element = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        VideoAuthorView videoAuthorView = this.c;
        tkg0 tkg0Var = videoAuthorView.c;
        if (this.b.element) {
            return;
        }
        AnimatorSet animatorSet = videoAuthorView.h;
        AnimatorSet animatorSet2 = this.d;
        if (epx.f(animatorSet, animatorSet2)) {
            if (videoAuthorView.f && videoAuthorView.g && tkg0Var.c.isShown()) {
                animatorSet2.start();
                return;
            }
            videoAuthorView.h = null;
            VkSimpleButton vkSimpleButton = tkg0Var.c;
            vkSimpleButton.setScaleX(1.0f);
            vkSimpleButton.setScaleY(1.0f);
            vkSimpleButton.setLayerType(0, null);
            vkSimpleButton.setHasTransientState(false);
        }
    }
}
