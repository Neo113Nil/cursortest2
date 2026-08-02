package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.music.Thumb;
import com.vk.feed.design.view.newsfeed.overlay.VkOverlayCircleButton;
import com.vk.feed.tool.view.newsfeed.music.OnMediaTitleWrapperView;
import com.vk.feed.tool.view.newsfeed.music.RunningLineTextView;
import com.vk.newsfeed.common.delegates.OnMediaAudioComponentProvider;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.ikv0;

/* compiled from: OnMediaAudioViewDelegate.kt */
/* loaded from: classes4.dex */
public final class y780 {
    public final Context a;
    public final OnMediaAudioComponentProvider b;
    public final int c = cn70.b(72);
    public final int d = cn70.b(18);
    public final View e;
    public final RunningLineTextView f;
    public final RunningLineTextView g;
    public final View h;
    public final OnMediaTitleWrapperView i;
    public final View j;
    public final VkImage k;
    public final VkImageSimple l;
    public final VkImageSimple m;
    public final VkOverlayCircleButton n;
    public final boolean o;
    public final Handler p;

    public y780(wuu0 wuu0Var, Context context, OnMediaAudioComponentProvider onMediaAudioComponentProvider) {
        this.a = context;
        this.b = onMediaAudioComponentProvider;
        this.e = wuu0Var.getRootContainer();
        this.f = wuu0Var.getTitleView();
        this.g = wuu0Var.getSubtitleView();
        this.h = wuu0Var.getBadgeBangView();
        this.i = wuu0Var.getTextWrapperView();
        this.j = wuu0Var.getBadgeView();
        VkImage iconView = wuu0Var.getIconView();
        this.k = iconView;
        this.l = wuu0Var.getAddButton();
        this.m = wuu0Var.getExplicitLabel();
        this.n = wuu0Var.getCircleButton();
        boolean z = onMediaAudioComponentProvider.e;
        this.o = z;
        this.p = onMediaAudioComponentProvider.o;
        iconView.setCornerRadius(cn70.a() * (z ? 8.0f : 6.0f));
        Drawable a = m33.a(R.drawable.bg_rounded_6, context);
        e3m.a aVar = e3m.a;
        iconView.setBackground(new baf0(a, context.getColor(R.color.vk_gray_850)));
        iconView.F0(new baf0(m33.a(z ? R.drawable.vk_icon_playlist_24 : R.drawable.vk_icon_music_12, context), dhr0.t.c(R.attr.vk_ui_icon_secondary)), ImageView.ScaleType.CENTER);
        if (!onMediaAudioComponentProvider.a()) {
            e(false);
        } else {
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            m(false, com.vk.libvideo.autoplay.e.c());
        }
    }

    public final void a() {
        this.f.setAlpha(1.0f);
        VkImageSimple vkImageSimple = this.l;
        if (vkImageSimple.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            vkImageSimple.setAlpha(1.0f);
        }
        VkImageSimple vkImageSimple2 = this.m;
        if (vkImageSimple2.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            vkImageSimple2.setAlpha(1.0f);
        }
        this.k.setAlpha(1.0f);
        VkOverlayCircleButton.a(this.n, null, null, null, Boolean.FALSE, 15);
        RunningLineTextView runningLineTextView = this.g;
        if (runningLineTextView != null) {
            runningLineTextView.setAlpha(1.0f);
        }
    }

    public final void b(boolean z) {
        Handler handler = this.p;
        if (z) {
            handler.postDelayed(new hod(this, 7), 1500L);
        } else {
            handler.removeCallbacksAndMessages(null);
            c(false);
        }
    }

    public final void c(boolean z) {
        this.n.setLoading(z);
    }

    public final void d(View.OnClickListener onClickListener) {
        this.l.setOnClickListener(onClickListener);
        this.n.setOnClickListener(onClickListener);
        this.j.setOnClickListener(onClickListener);
        OnMediaTitleWrapperView onMediaTitleWrapperView = this.i;
        if (onMediaTitleWrapperView != null) {
            onMediaTitleWrapperView.setOnClickListener(onClickListener);
        }
        this.k.setOnClickListener(onClickListener);
    }

    public final void e(boolean z) {
        VkOverlayCircleButton.a(this.n, new gko(z ? R.drawable.vk_icon_pause_16 : R.drawable.vk_icon_play_16), tq.h(tlo0.Companion, z ? R.string.music_talkback_pause : R.string.music_talkback_play), null, null, 26);
    }

    public final void f() {
        this.f.setAlpha(0.5f);
        this.l.setAlpha(0.5f);
        this.k.setAlpha(0.5f);
        VkOverlayCircleButton.a(this.n, null, null, null, Boolean.TRUE, 15);
        RunningLineTextView runningLineTextView = this.g;
        if (runningLineTextView != null) {
            runningLineTextView.setAlpha(0.5f);
        }
        this.m.setAlpha(0.5f);
    }

    public final void g(String str, String str2) {
        boolean z = this.o;
        RunningLineTextView runningLineTextView = this.f;
        if (!z) {
            runningLineTextView.setDisabled(false);
            return;
        }
        if (this.g != null) {
            if (runningLineTextView.getPaint().measureText(str) <= r0.getPaint().measureText(str2) * 0.6d) {
                runningLineTextView.setDisabled(true);
            } else {
                runningLineTextView.setDisabled(false);
            }
        }
    }

    public final void h() {
        int i = this.o ? R.drawable.vk_icon_add_alt_20 : R.drawable.vk_icon_add_16;
        VkImageSimple vkImageSimple = this.l;
        vkImageSimple.setImageResource(i);
        vkImageSimple.setContentDescription(this.a.getString(R.string.music_add_to_my_music));
        bwt0.p0(vkImageSimple, true);
    }

    public final void i() {
        int i = this.o ? R.drawable.vk_icon_check_alt_20 : R.drawable.vk_icon_done_16;
        VkImageSimple vkImageSimple = this.l;
        vkImageSimple.setImageResource(i);
        vkImageSimple.setContentDescription(this.a.getString(R.string.music_remove_from_my_music));
        bwt0.p0(vkImageSimple, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        Context context = this.a;
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
        aVar.u = new ikv0.d(context.getString(R.string.vkim_error_no_network), (String) (0 == true ? 1 : 0), (ikv0.d.a) (0 == true ? 1 : 0), 6);
        aVar.n();
    }

    public final void k(Thumb thumb) {
        VkImage vkImage = this.k;
        bwt0.p0(vkImage, true);
        Uri uri = null;
        if (this.o) {
            if (thumb != null) {
                Serializer.c<Thumb> cVar = Thumb.CREATOR;
                uri = thumb.Cb(this.c, false);
            }
            vkImage.m0(uri, new Size(cn70.b(120), cn70.b(120)));
            return;
        }
        if (thumb != null) {
            Serializer.c<Thumb> cVar2 = Thumb.CREATOR;
            uri = thumb.Cb(this.d, false);
        }
        vkImage.m0(uri, new Size(cn70.b(20), cn70.b(20)));
    }

    public final void l(v780 v780Var, boolean z) {
        m(v780Var.B(), z);
    }

    public final void m(boolean z, boolean z2) {
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = this.b;
        onMediaAudioComponentProvider.d().i = !z && z2;
        VkOverlayCircleButton.a(this.n, new gko(onMediaAudioComponentProvider.d().i ? R.drawable.vk_icon_mute_cross_16 : R.drawable.vk_icon_volume_16), tq.h(tlo0.Companion, onMediaAudioComponentProvider.d().i ? R.string.accessibility_audio_autoplay_turn_on_sound : R.string.accessibility_audio_autoplay_turn_off_sound), null, null, 26);
    }
}
