package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.ShuffleMode;
import com.vk.music.playlist.ModernPlaylistModel;
import com.vk.music.view.ThumbsImageView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import xsna.gd60;

/* compiled from: AudioPlaylistHolderSmall.kt */
/* loaded from: classes4.dex */
public final class ot4 extends m56<AudioPlaylistAttachment> implements View.OnClickListener, blc0 {
    public final u750 D;
    public final ThumbsImageView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final VkButton I;
    public final View J;
    public final ImageView K;
    public boolean L;
    public final feb0 M;

    public ot4(ViewGroup viewGroup, u2b0 u2b0Var, u750 u750Var, ModernPlaylistModel modernPlaylistModel) {
        super(R.layout.attach_audio_playlist_small, viewGroup);
        this.D = u750Var;
        ViewGroup viewGroup2 = (ViewGroup) this.itemView.findViewById(R.id.video_single_info);
        ThumbsImageView thumbsImageView = (ThumbsImageView) this.itemView.findViewById(R.id.snippet_image);
        this.E = thumbsImageView;
        TextView textView = (TextView) this.itemView.findViewById(R.id.attach_title);
        this.F = textView;
        this.G = (TextView) this.itemView.findViewById(R.id.attach_subtitle);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.attach_subsubtitle);
        this.H = textView2;
        VkButton vkButton = (VkButton) this.itemView.findViewById(R.id.attach_button);
        this.I = vkButton;
        this.J = this.itemView.findViewById(R.id.attach_audio_playlist_remove_button);
        this.K = (ImageView) this.itemView.findViewById(R.id.playlist_explicit);
        this.M = new feb0(u2b0Var, modernPlaylistModel);
        float a = gbg0.a(this.itemView.getResources(), 6.0f);
        thumbsImageView.g(a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.itemView.setOnClickListener(this);
        vkButton.setOnClickListener(this);
        f4m.t(0, viewGroup2);
        com.vk.typography.b.k(textView, FontFamily.MEDIUM, Float.valueOf(14.0f), 4);
        f4m.t(iah0.a(10), textView);
        f4m.w(iah0.a(12), textView);
        f4m.t(0, textView2);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        this.L = z;
        bwt0.p0(this.J, z);
    }

    @Override // xsna.m56
    public final void T6(AudioPlaylistAttachment audioPlaylistAttachment) {
        Playlist playlist = audioPlaylistAttachment.f;
        boolean u = xx1.u(playlist);
        String str = playlist.i;
        CharSequence charSequence = playlist.h;
        int i = playlist.v;
        if (!u) {
            charSequence = s490.d(this.itemView.getContext(), charSequence, str, R.attr.vk_ui_text_secondary);
        }
        this.F.setText(charSequence);
        bwt0.p0(this.K, playlist.k);
        if (!xx1.u(playlist)) {
            str = c9b0.g(this.itemView.getContext(), playlist);
        }
        TextView textView = this.G;
        ey2.i(textView, str);
        textView.setOnClickListener(this);
        boolean Fb = playlist.Fb();
        TextView textView2 = this.H;
        if (Fb && playlist.Eb()) {
            at.d(this.itemView, R.string.music_album_not_available, textView2);
        } else if (i == 0) {
            at.d(this.itemView, R.string.audio_playlist_no_tracks, textView2);
        } else {
            textView2.setText(enj.f(R.plurals.music_songs, i, this.itemView.getContext()));
        }
        float f = (playlist.Fb() || i == 0) ? 0.4f : 1.0f;
        VkButton vkButton = this.I;
        vkButton.setAlpha(f);
        vkButton.setText(this.itemView.getContext().getString(R.string.music_artist_listen_all_btn));
        vkButton.Z4(enj.e(R.drawable.vk_icon_play_16, R.attr.vk_ui_text_contrast_themed, this.itemView.getContext()), true);
        vkButton.setIconSize(Integer.valueOf(iah0.a(16)));
        Thumb thumb = playlist.m;
        ThumbsImageView thumbsImageView = this.E;
        if (thumb != null) {
            thumbsImageView.setThumb(thumb);
        } else {
            thumbsImageView.setThumbs(playlist.p);
        }
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        this.J.setOnClickListener(onClickListener);
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.L) {
            cvk.u(R.string.music_playlist_interation_forbidden, false);
            return;
        }
        AudioPlaylistAttachment audioPlaylistAttachment = (AudioPlaylistAttachment) this.C;
        if (audioPlaylistAttachment == null) {
            return;
        }
        Playlist playlist = audioPlaylistAttachment.f;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.attach_button) {
            if (playlist.Fb() || playlist.v == 0) {
                return;
            }
            this.D.f0("all");
            this.M.b(playlist, MusicPlaybackLaunchContext.Fb(audioPlaylistAttachment.g), 0, null, ShuffleMode.SHUFFLE_AUTO);
            return;
        }
        gd60 a = hd60.a();
        Context context = this.itemView.getContext();
        MusicPlaybackLaunchContext Fb = MusicPlaybackLaunchContext.Fb(audioPlaylistAttachment.g);
        gd60.a aVar = gd60.a;
        a.d1(context, playlist, null, Fb);
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
    }
}
