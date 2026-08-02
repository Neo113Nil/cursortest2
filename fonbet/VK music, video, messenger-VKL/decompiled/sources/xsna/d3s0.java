package xsna;

import android.animation.AnimatorSet;
import android.view.View;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.libvideo.ui.VideoAuthorView;

/* compiled from: VideoAuthorView.kt */
/* loaded from: classes3.dex */
public final class d3s0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ VideoAuthorView b;

    public d3s0(VideoAuthorView videoAuthorView) {
        this.b = videoAuthorView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = VideoAuthorView.l;
        this.b.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = VideoAuthorView.l;
        VideoAuthorView videoAuthorView = this.b;
        if (videoAuthorView.f) {
            AnimatorSet animatorSet = videoAuthorView.h;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            videoAuthorView.h = null;
            VkSimpleButton vkSimpleButton = videoAuthorView.c.c;
            vkSimpleButton.setScaleX(1.0f);
            vkSimpleButton.setScaleY(1.0f);
            vkSimpleButton.setLayerType(0, null);
            vkSimpleButton.setHasTransientState(false);
        }
    }
}
