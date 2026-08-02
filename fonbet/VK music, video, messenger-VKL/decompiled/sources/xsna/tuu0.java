package xsna;

import android.view.View;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.feed.design.view.newsfeed.overlay.VkOverlayCircleButton;
import com.vk.feed.tool.view.newsfeed.music.OnMediaTitleWrapperView;
import com.vk.feed.tool.view.newsfeed.music.RunningLineTextView;
import com.vkontakte.android.R;

/* compiled from: VkFeedOnMediaAudioDelegate.kt */
/* loaded from: classes18.dex */
public final class tuu0 implements suu0 {
    public final wuu0 b;
    public final RunningLineTextView c;
    public final RunningLineTextView d;
    public final View e;
    public final OnMediaTitleWrapperView f;
    public final View g;
    public final VkImage h;
    public final VkImageSimple i;
    public final VkImageSimple j;
    public final VkOverlayCircleButton k;
    public final VkBlurView l;

    public tuu0(wuu0 wuu0Var) {
        this.b = wuu0Var;
        this.c = (RunningLineTextView) wuu0Var.findViewById(R.id.pds_on_media_audio_song_name);
        this.d = (RunningLineTextView) wuu0Var.findViewById(R.id.pds_on_media_audio_song_subtitle);
        this.e = wuu0Var.findViewById(R.id.pds_on_media_audio_badge_container_bang);
        this.f = (OnMediaTitleWrapperView) wuu0Var.findViewById(R.id.pds_on_media_audio_wrapper);
        this.g = wuu0Var.findViewById(R.id.pds_on_media_audio_song_badge_container);
        this.h = (VkImage) wuu0Var.findViewById(R.id.pds_on_media_audio_song_icon);
        this.i = (VkImageSimple) wuu0Var.findViewById(R.id.pds_on_media_audio_explicit_label);
        this.j = (VkImageSimple) wuu0Var.findViewById(R.id.pds_on_media_audio_button_add);
        this.k = (VkOverlayCircleButton) wuu0Var.findViewById(R.id.pds_on_media_audio_circle_button);
        this.l = (VkBlurView) wuu0Var.findViewById(R.id.pds_on_media_audio_blur_background);
    }

    @Override // xsna.suu0
    public final VkImageSimple getAddButton() {
        return this.j;
    }

    @Override // xsna.suu0
    public final View getBadgeBangView() {
        return this.e;
    }

    @Override // xsna.suu0
    public final VkBlurView getBadgeBlurView() {
        return this.l;
    }

    @Override // xsna.suu0
    public final View getBadgeView() {
        return this.g;
    }

    @Override // xsna.suu0
    public final VkOverlayCircleButton getCircleButton() {
        return this.k;
    }

    @Override // xsna.suu0
    public final VkImageSimple getExplicitLabel() {
        return this.i;
    }

    @Override // xsna.suu0
    public final VkImage getIconView() {
        return this.h;
    }

    @Override // xsna.suu0
    public final View getRootContainer() {
        return this.b;
    }

    @Override // xsna.suu0
    public final RunningLineTextView getSubtitleView() {
        return this.d;
    }

    @Override // xsna.suu0
    public final OnMediaTitleWrapperView getTextWrapperView() {
        return this.f;
    }

    @Override // xsna.suu0
    public final RunningLineTextView getTitleView() {
        return this.c;
    }
}
