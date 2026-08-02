package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.error.VkPlayerException;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PodcastAttachment;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import xsna.f5h0;

/* compiled from: PodcastHolder.kt */
/* loaded from: classes4.dex */
public final class nhb0 extends m34<PodcastAttachment> implements View.OnAttachStateChangeListener, com.vk.music.player.e, yqq {
    public final lm4 R;
    public final VkText S;
    public final VkImage T;

    public nhb0(ViewGroup viewGroup, cr4 cr4Var, h170 h170Var) {
        super(viewGroup);
        this.R = new lm4(cr4Var.a(), cr4Var.c(), null, 12);
        VkText vkText = new VkText(this.itemView.getContext(), null, 6, 0);
        vkText.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        vkText.setMaxLines(1);
        vkText.setGravity(17);
        float f = 16;
        vkText.setMinHeight(iah0.a(f));
        vkText.setTextAppearance(R.style.VkUiTypography_Footnote);
        vkText.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, vkText.getContext()));
        this.S = vkText;
        VkImage vkImage = new VkImage(this.itemView.getContext(), null, 6, 0);
        vkImage.setLayoutParams(new ViewGroup.LayoutParams(iah0.a(f), iah0.a(f)));
        bwt0.f0(vkImage, iah0.a(4.0f), iah0.a(0.5f), 0, 0, 12);
        vkImage.setImageResource(R.drawable.vk_icon_error_circle_fill_gray_12);
        bwt0.p0(vkImage, false);
        this.T = vkImage;
        this.D.setBackgroundColorAttr(R.attr.vk_ui_background_contrast_inverse);
        VkText vkText2 = this.J;
        abg0 abg0Var = dhr0.t;
        vkText2.setTextColor(abg0Var.c(R.attr.vk_ui_text_contrast));
        VkButton vkButton = this.M;
        vkButton.setMode(VkButton.Mode.Primary);
        vkButton.setAppearance(VkButton.Appearance.Overlay);
        this.itemView.addOnAttachStateChangeListener(this);
        this.H.addView(vkText);
        this.H.addView(vkImage);
        this.F.Q0(new baf0(abg0Var.a(R.drawable.vk_icon_podcasts_outline_36), abg0Var.c(R.attr.vk_ui_icon_tertiary)), f5h0.e.a);
    }

    @Override // com.vk.music.player.e
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        PodcastAttachment podcastAttachment = (PodcastAttachment) this.C;
        if (podcastAttachment == null) {
            return;
        }
        MusicTrack musicTrack = podcastAttachment.f;
        if (podcastAttachment.Eb()) {
            Episode episode = musicTrack.w;
            Y6(podcastAttachment, episode != null ? episode.j : null);
            return;
        }
        if ((fVar != null ? fVar.f() : null) == null || !epx.f(musicTrack, fVar.f())) {
            c7(false);
        } else {
            c7(playState == PlayState.PLAYING);
        }
    }

    @Override // xsna.m56
    public final void T6(Attachment attachment) {
        Image image;
        ImageSize Cb;
        PodcastAttachment podcastAttachment = (PodcastAttachment) attachment;
        MusicTrack musicTrack = podcastAttachment.f;
        Episode episode = musicTrack.w;
        boolean z = false;
        this.F.o0((episode == null || (image = episode.f) == null || (Cb = image.Cb(this.itemView.getResources().getDimensionPixelSize(R.dimen.podcast_cover_sise), false, false)) == null) ? null : Cb.d.d, null);
        this.J.setText(musicTrack.d);
        boolean Eb = podcastAttachment.Eb();
        ViewGroup viewGroup = this.H;
        VkText vkText = this.I;
        if (Eb) {
            Episode episode2 = musicTrack.w;
            vkText.setText(episode2 != null ? episode2.h : null);
            bwt0.p0(vkText, true);
            bwt0.p0(viewGroup, false);
            Episode episode3 = musicTrack.w;
            Y6(podcastAttachment, episode3 != null ? episode3.j : null);
        } else {
            this.K.setText(musicTrack.h);
            int i = musicTrack.f;
            this.S.setText(" · ".concat(i > 3600 ? String.format(Locale.getDefault(), "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 3600), Integer.valueOf((i % 3600) / 60), Integer.valueOf(i % 60)}, 3)) : String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2))));
            this.T.setVisibility(musicTrack.s ? 0 : 8);
            VkButton vkButton = this.M;
            vkButton.setText(R.string.podcast_play);
            vkButton.setContentDescription(v6(R.string.podcast_play));
            bwt0.p0(vkText, false);
            bwt0.p0(viewGroup, true);
            lm4 lm4Var = this.R;
            N3(lm4Var.a.m0(), lm4Var.a.H());
        }
        Episode episode4 = podcastAttachment.f.w;
        if (episode4 != null && episode4.c) {
            z = true;
        }
        b7(z);
    }

    public final void c7(boolean z) {
        int i = z ? R.string.music_talkback_pause : R.string.music_talkback_play;
        Integer valueOf = Integer.valueOf(z ? R.drawable.vk_icon_pause_16 : R.drawable.vk_icon_play_16);
        int[] iArr = VkButton.W;
        VkButton vkButton = this.M;
        vkButton.a5(true, valueOf);
        vkButton.setContentDescription(v6(i));
    }

    @Override // xsna.yqq
    public final void ie(int i, UserId userId, boolean z) {
        PodcastAttachment podcastAttachment = (PodcastAttachment) this.C;
        if (podcastAttachment == null) {
            return;
        }
        MusicTrack musicTrack = podcastAttachment.f;
        if (epx.f(musicTrack.c, userId) && musicTrack.b == i) {
            Episode episode = musicTrack.w;
            if (episode != null) {
                episode.c = z;
            }
            R6(podcastAttachment);
        }
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        PodcastAttachment podcastAttachment = (PodcastAttachment) this.C;
        if (podcastAttachment == null) {
            return;
        }
        MusicTrack musicTrack = podcastAttachment.f;
        if (view.equals(this.itemView)) {
            W6(view);
            return;
        }
        if (view.equals(this.L)) {
            gd60.X0(hd60.a(), this.itemView.getContext(), podcastAttachment, new pqq(musicTrack.r, this.u, null, null, 12), new qw6(this, 12), new u6(25, podcastAttachment, this), 32);
            return;
        }
        VkButton vkButton = this.M;
        if (view.equals(vkButton)) {
            if (podcastAttachment.Eb()) {
                W6(vkButton);
                return;
            }
            this.R.k(podcastAttachment, t6(), this.u, this.w);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.R.e(this);
        xqq xqqVar = xqq.b;
        xqq.c.add(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.R.f(this);
        xqq xqqVar = xqq.b;
        xqq.c.remove(this);
    }

    @Override // com.vk.music.player.e
    public final boolean t3(VkPlayerException vkPlayerException) {
        return false;
    }

    @Override // com.vk.music.player.e
    public final void B1() {
    }

    @Override // com.vk.music.player.e
    public final void K1() {
    }

    @Override // com.vk.music.player.e
    public final void n3() {
    }

    @Override // com.vk.music.player.e
    public final void x0() {
    }

    @Override // com.vk.music.player.e
    public final void z3() {
    }

    @Override // com.vk.music.player.e
    public final void W3(com.vk.music.player.f fVar) {
    }

    @Override // com.vk.music.player.e
    public final void o2(com.vk.music.player.f fVar) {
    }

    @Override // com.vk.music.player.e
    public final void onError(String str) {
    }

    @Override // com.vk.music.player.e
    public final void y4(List<PlayerTrack> list) {
    }
}
