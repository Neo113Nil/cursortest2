package xsna;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.VKSnippetImageView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.fave.entities.FaveEntry;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.error.VkPlayerException;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PodcastAttachment;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PodcastHolderOld.kt */
/* loaded from: classes4.dex */
public final class ohb0 extends m56<PodcastAttachment> implements View.OnClickListener, View.OnAttachStateChangeListener, com.vk.music.player.e, yqq, blc0 {
    public final VKSnippetImageView D;
    public final TextView E;
    public final TextView F;
    public final View G;
    public final TextView H;
    public final TextView I;
    public final View J;
    public final View K;
    public final TextView L;
    public final ViewGroup M;
    public final ColorStateList N;
    public final lm4 O;
    public View.OnClickListener P;
    public e6o Q;
    public e6o R;

    public ohb0(ViewGroup viewGroup, cr4 cr4Var) {
        super(R.layout.attach_podcast, viewGroup);
        VKSnippetImageView vKSnippetImageView = (VKSnippetImageView) this.itemView.findViewById(R.id.image);
        vKSnippetImageView.setType(6);
        this.D = vKSnippetImageView;
        this.E = (TextView) this.itemView.findViewById(R.id.title);
        TextView textView = (TextView) this.itemView.findViewById(R.id.description);
        this.F = textView;
        this.G = hvt0.b(this.itemView, R.id.favorite, this);
        TextView textView2 = (TextView) hvt0.b(this.itemView, R.id.play_pause, this);
        this.H = textView2;
        this.I = (TextView) this.itemView.findViewById(R.id.time_text);
        this.J = this.itemView.findViewById(R.id.explicit);
        this.K = this.itemView.findViewById(R.id.attach_podcast_remove_button);
        this.L = (TextView) this.itemView.findViewById(R.id.media_restriction_view);
        this.M = (ViewGroup) this.itemView.findViewById(R.id.description_container);
        this.N = ColorStateList.valueOf(this.itemView.getContext().getColor(R.color.vk_white));
        this.itemView.addOnAttachStateChangeListener(this);
        X6();
        textView2.setMinHeight(cn70.b(26));
        vKSnippetImageView.z0(cn70.b(8), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.b(8));
        vKSnippetImageView.setDrawBorder(false);
        vKSnippetImageView.setBackground(null);
        textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_secondary));
        textView2.setAllCaps(false);
        f4m.n(cn70.b(26), textView2);
        f4m.B(0, 0, textView2);
        this.O = new lm4(cr4Var.a(), cr4Var.c(), null, 12);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        bwt0.p0(this.K, z);
        bwt0.p0(this.G, !z);
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
            b7(podcastAttachment, episode != null ? episode.j : null);
            return;
        }
        if ((fVar != null ? fVar.f() : null) == null || !epx.f(musicTrack, fVar.f())) {
            c7(false);
        } else {
            c7(playState == PlayState.PLAYING);
        }
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        ba baVar = s6oVar.e;
        this.Q = s6oVar.a(this, baVar);
        View.OnClickListener onClickListener = this.P;
        if (onClickListener != null) {
            this.R = s6oVar.a(onClickListener, baVar);
        }
        X6();
    }

    @Override // xsna.m56
    public final void T6(PodcastAttachment podcastAttachment) {
        Image image;
        ImageSize Cb;
        PodcastAttachment podcastAttachment2 = podcastAttachment;
        MusicTrack musicTrack = podcastAttachment2.f;
        Episode episode = musicTrack.w;
        boolean z = false;
        this.D.o0((episode == null || (image = episode.f) == null || (Cb = image.Cb(this.itemView.getResources().getDimensionPixelSize(R.dimen.podcast_cover_sise), false, false)) == null) ? null : Cb.d.d, null);
        this.E.setText(musicTrack.d);
        boolean Eb = podcastAttachment2.Eb();
        ViewGroup viewGroup = this.M;
        TextView textView = this.L;
        if (Eb) {
            Episode episode2 = musicTrack.w;
            textView.setText(episode2 != null ? episode2.h : null);
            bwt0.p0(textView, true);
            bwt0.p0(viewGroup, false);
            Episode episode3 = musicTrack.w;
            b7(podcastAttachment2, episode3 != null ? episode3.j : null);
        } else {
            this.F.setText(musicTrack.h);
            int i = musicTrack.f;
            this.I.setText(i > 3600 ? String.format(Locale.getDefault(), "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 3600), Integer.valueOf((i % 3600) / 60), Integer.valueOf(i % 60)}, 3)) : String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2)));
            this.J.setVisibility(musicTrack.s ? 0 : 8);
            TextView textView2 = this.H;
            textView2.setText(R.string.podcast_play);
            textView2.setContentDescription(v6(R.string.podcast_play));
            bwt0.p0(textView, false);
            bwt0.p0(viewGroup, true);
            lm4 lm4Var = this.O;
            N3(lm4Var.a.m0(), lm4Var.a.H());
        }
        Episode episode4 = podcastAttachment2.f.w;
        if (episode4 != null && episode4.c) {
            z = true;
        }
        Y6(z);
    }

    public final void X6() {
        View view = this.itemView;
        View.OnClickListener onClickListener = this.Q;
        if (onClickListener == null) {
            onClickListener = this;
        }
        view.setOnClickListener(onClickListener);
        View.OnClickListener onClickListener2 = this.P;
        if (onClickListener2 != null) {
            e6o e6oVar = this.R;
            if (e6oVar != null) {
                onClickListener2 = e6oVar;
            }
            this.K.setOnClickListener(onClickListener2);
        }
    }

    public final void Y6(boolean z) {
        boolean z2 = !(q6() instanceof FaveEntry);
        View view = this.G;
        bwt0.p0(view, z2);
        int i = z ? R.drawable.vk_icon_bookmark_24 : R.drawable.vk_icon_bookmark_outline_24;
        ColorStateList r = dhr0.r(R.attr.vk_ui_icon_secondary);
        view.setBackground(dhr0.t.a(i));
        if (z) {
            r = this.N;
        }
        view.setBackgroundTintList(r);
        view.setAlpha(1.0f);
    }

    public final void b7(PodcastAttachment podcastAttachment, LinkButton linkButton) {
        int i = podcastAttachment.Db() ? R.drawable.vk_icon_donut_color_12 : 0;
        TextView textView = this.H;
        his0.v(textView, i, 0);
        textView.setText(linkButton != null ? linkButton.b : null);
        textView.setContentDescription(linkButton != null ? linkButton.b : null);
    }

    public final void c7(boolean z) {
        int i = z ? R.string.music_talkback_pause : R.string.music_talkback_play;
        int i2 = z ? R.drawable.vk_icon_pause_16 : R.drawable.vk_icon_play_16;
        TextView textView = this.H;
        his0.v(textView, i2, 0);
        textView.setContentDescription(v6(i));
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

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        this.P = onClickListener;
        s6o s6oVar = this.q;
        this.R = s6oVar != null ? s6oVar.a(onClickListener, s6oVar.e) : null;
        X6();
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
        if (view.equals(this.G)) {
            gd60.X0(hd60.a(), this.itemView.getContext(), podcastAttachment, new pqq(musicTrack.r, this.u, null, null, 12), new f9h(this, 9), new kp5(19, podcastAttachment, this), 32);
            return;
        }
        TextView textView = this.H;
        if (view.equals(textView)) {
            if (podcastAttachment.Eb()) {
                W6(textView);
                return;
            }
            this.O.k(podcastAttachment, t6(), this.u, this.w);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.O.e(this);
        xqq xqqVar = xqq.b;
        xqq.c.add(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.O.f(this);
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

    @Override // xsna.blc0
    public final void p5() {
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

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
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
