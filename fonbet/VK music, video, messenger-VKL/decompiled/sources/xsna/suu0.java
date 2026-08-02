package xsna;

import android.view.View;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.feed.design.view.newsfeed.overlay.VkOverlayCircleButton;
import com.vk.feed.tool.view.newsfeed.music.OnMediaTitleWrapperView;
import com.vk.feed.tool.view.newsfeed.music.RunningLineTextView;

/* compiled from: VkFeedOnMediaAudioContract.kt */
/* loaded from: classes18.dex */
public interface suu0 {
    VkImageSimple getAddButton();

    View getBadgeBangView();

    VkBlurView getBadgeBlurView();

    View getBadgeView();

    VkOverlayCircleButton getCircleButton();

    VkImageSimple getExplicitLabel();

    VkImage getIconView();

    View getRootContainer();

    RunningLineTextView getSubtitleView();

    OnMediaTitleWrapperView getTextWrapperView();

    RunningLineTextView getTitleView();
}
