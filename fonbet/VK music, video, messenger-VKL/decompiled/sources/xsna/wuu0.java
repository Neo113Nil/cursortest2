package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.feed.design.view.newsfeed.overlay.VkOverlayCircleButton;
import com.vk.feed.tool.view.newsfeed.music.OnMediaTitleWrapperView;
import com.vk.feed.tool.view.newsfeed.music.RunningLineTextView;

/* compiled from: VkFeedOnMediaAudioView.kt */
/* loaded from: classes18.dex */
public abstract class wuu0 extends FrameLayout implements suu0 {
    public final bpn0 b;

    public wuu0(Context context) {
        super(context, null, 0);
        this.b = new bpn0(new qqt0(context, 3));
    }

    private final int getOverlaySecondaryColor() {
        return ((Number) this.b.getValue()).intValue();
    }

    @Override // xsna.suu0
    public VkImageSimple getAddButton() {
        return getDelegate().getAddButton();
    }

    @Override // xsna.suu0
    public View getBadgeBangView() {
        return getDelegate().getBadgeBangView();
    }

    @Override // xsna.suu0
    public VkBlurView getBadgeBlurView() {
        return getDelegate().getBadgeBlurView();
    }

    @Override // xsna.suu0
    public View getBadgeView() {
        return getDelegate().getBadgeView();
    }

    @Override // xsna.suu0
    public VkOverlayCircleButton getCircleButton() {
        return getDelegate().getCircleButton();
    }

    public abstract suu0 getDelegate();

    @Override // xsna.suu0
    public VkImageSimple getExplicitLabel() {
        return getDelegate().getExplicitLabel();
    }

    @Override // xsna.suu0
    public VkImage getIconView() {
        return getDelegate().getIconView();
    }

    @Override // xsna.suu0
    public View getRootContainer() {
        return getDelegate().getRootContainer();
    }

    @Override // xsna.suu0
    public RunningLineTextView getSubtitleView() {
        return getDelegate().getSubtitleView();
    }

    @Override // xsna.suu0
    public OnMediaTitleWrapperView getTextWrapperView() {
        return getDelegate().getTextWrapperView();
    }

    @Override // xsna.suu0
    public RunningLineTextView getTitleView() {
        return getDelegate().getTitleView();
    }

    public void setupBlurContent(VkBlurContentView vkBlurContentView) {
    }
}
