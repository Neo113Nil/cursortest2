package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import com.vk.music.playlist.ModernPlaylistModel;
import com.vk.music.view.ThumbsImageView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import kotlin.LazyThreadSafetyMode;
import xsna.iog0;
import xsna.r5b0;

/* compiled from: PrimaryAudioPlaylistHolder.kt */
/* loaded from: classes4.dex */
public final class g7d0 extends m56<AudioPlaylistAttachment> implements blc0, View.OnAttachStateChangeListener, View.OnClickListener {
    public final cr4 D;
    public final iog0 E;
    public final ThumbsImageView F;
    public final View G;
    public final ImageView H;
    public final TextView I;
    public final View J;
    public final TextView K;
    public final TextView L;
    public final View M;
    public final ImageView N;
    public final View O;
    public final View P;
    public Playlist Q;
    public boolean R;
    public e6o S;
    public final Object T;
    public final a U;

    /* compiled from: PrimaryAudioPlaylistHolder.kt */
    public final class a extends e.a {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            g7d0 g7d0Var = g7d0.this;
            AudioPlaylistAttachment audioPlaylistAttachment = (AudioPlaylistAttachment) g7d0Var.C;
            Playlist playlist = audioPlaylistAttachment != null ? audioPlaylistAttachment.f : null;
            if (playlist == null) {
                g7d0Var.X6(false, false);
            } else if (playlist.Fb() || playlist.v == 0 || !((lm4) g7d0Var.T.getValue()).d(playlist)) {
                g7d0Var.X6(false, false);
            } else {
                g7d0Var.X6(playState == PlayState.PLAYING, playState != PlayState.STOPPED);
            }
        }
    }

    public g7d0(ViewGroup viewGroup, cr4 cr4Var) {
        super(R.layout.attach_primary_audio_playlist, viewGroup);
        this.D = cr4Var;
        this.F = (ThumbsImageView) this.itemView.findViewById(R.id.audio_attachment_album_cover);
        View findViewById = this.itemView.findViewById(R.id.audio_playlist_attachment_cover_shadow);
        this.G = findViewById;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.audio_attachment_playing_indicator);
        this.H = imageView;
        TextView textView = (TextView) this.itemView.findViewById(R.id.audio_playlist_attachment_title);
        this.I = textView;
        this.J = this.itemView.findViewById(R.id.audio_playlist_attachment_explicit);
        this.K = (TextView) this.itemView.findViewById(R.id.audio_playlist_attachment_tracks);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.audio_playlist_attachment_play);
        this.L = textView2;
        this.M = this.itemView.findViewById(R.id.shadow_view);
        ImageView imageView2 = (ImageView) this.itemView.findViewById(R.id.audio_attachment_add_btn);
        this.N = imageView2;
        this.O = this.itemView.findViewById(R.id.shadow_add_view);
        this.P = this.itemView.findViewById(R.id.remove_button);
        this.T = msy.a(LazyThreadSafetyMode.NONE, new fr20(this, 23));
        this.U = new a();
        this.itemView.addOnAttachStateChangeListener(this);
        View.OnClickListener onClickListener = this.S;
        onClickListener = onClickListener == null ? this : onClickListener;
        textView2.setOnClickListener(onClickListener);
        imageView2.setOnClickListener(onClickListener);
        this.itemView.setOnClickListener(onClickListener);
        r5b0.b bVar = new r5b0.b(viewGroup.getContext());
        bVar.c(R.color.vk_white);
        bVar.a(R.integer.audio_attachment_playing_drawable_count);
        bVar.g(R.dimen.audio_attachment_playing_drawable_width);
        bVar.e(R.dimen.audio_attachment_playing_drawable_height);
        bVar.f(R.dimen.audio_attachment_playing_drawable_min_height);
        bVar.d(R.dimen.audio_attachment_playing_drawable_corner_radius);
        bVar.b(R.dimen.audio_attachment_playing_drawable_gap);
        bVar.j = new float[]{cn70.a() * 31.0f, cn70.a() * 43.0f, cn70.a() * 56.0f};
        imageView.setImageDrawable(new r5b0(bVar));
        iog0.b bVar2 = new iog0.b(new hog0(cn70.b(166), cn70.b(166)), cn70.a() * 16.0f, cn70.a() * 4.0f, cn70.b(12));
        Context context = this.itemView.getContext();
        asu0.a.getClass();
        iog0 iog0Var = new iog0(context, bVar2, asu0.n());
        this.E = iog0Var;
        findViewById.setBackground(iog0Var);
        com.vk.typography.b.k(textView, FontFamily.DISPLAY_DEMIBOLD, Float.valueOf(21.0f), 4);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        this.R = z;
        bwt0.p0(this.P, z);
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        e6o a2 = s6oVar.a(this, s6oVar.e);
        this.S = a2;
        this.L.setOnClickListener(a2);
        this.N.setOnClickListener(a2);
        this.itemView.setOnClickListener(a2);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.m56
    public final void T6(AudioPlaylistAttachment audioPlaylistAttachment) {
        Playlist playlist = audioPlaylistAttachment.f;
        this.Q = playlist;
        Thumb thumb = playlist.m;
        ThumbsImageView thumbsImageView = this.F;
        if (thumb != null) {
            thumbsImageView.setThumb(thumb);
        } else {
            thumbsImageView.setThumbs(playlist.p);
        }
        Playlist playlist2 = this.Q;
        if (playlist2 != null) {
            int i = playlist2.Eb() ? R.plurals.audio_album_quantity : R.plurals.audio_playlist_quantity;
            int i2 = playlist2.v;
            this.K.setText(s6(i, i2, Integer.valueOf(i2)));
            String str = playlist2.h;
            if (str == null) {
                str = "";
            }
            this.I.setText(str);
            bwt0.p0(this.J, playlist2.k);
        }
        boolean z = false;
        X6(false, false);
        cr4 cr4Var = this.D;
        this.U.N3(cr4Var.a().m0(), cr4Var.a().H());
        if (!playlist.Fb() && playlist.v != 0) {
            z = true;
        }
        bwt0.p0(this.L, z);
        bwt0.p0(this.M, z);
        AudioPlaylistAttachment audioPlaylistAttachment2 = (AudioPlaylistAttachment) this.C;
        if (audioPlaylistAttachment2 == null) {
            return;
        }
        Playlist playlist3 = audioPlaylistAttachment2.f;
        boolean e = xx1.e(playlist3);
        View view = this.O;
        ImageView imageView = this.N;
        if (e) {
            imageView.setImageResource(R.drawable.vk_icon_pen_outline_24);
            imageView.setContentDescription(v6(R.string.accessibility_edit));
            bwt0.p0(imageView, true);
            bwt0.p0(view, true);
            return;
        }
        ((feb0) cr4Var.d.getValue()).b.getClass();
        if (ModernPlaylistModel.E(playlist3)) {
            imageView.setImageResource(R.drawable.vk_icon_done_24);
            imageView.setContentDescription(v6(R.string.music_remove_from_my_music));
            bwt0.p0(imageView, true);
            bwt0.p0(view, true);
            return;
        }
        imageView.setImageResource(R.drawable.vk_icon_add_24);
        imageView.setContentDescription(v6(R.string.music_add_to_my_music));
        bwt0.p0(imageView, true);
        bwt0.p0(view, true);
    }

    public final void X6(boolean z, boolean z2) {
        if (z2) {
            d3m.c(this.H, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            d3m.e(this.H, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
        this.H.setActivated(z);
        int i = z ? R.drawable.vk_icon_pause_24 : R.drawable.vk_icon_play_24;
        String v6 = v6(z ? R.string.audio_attachment_pause : R.string.audio_attachment_play);
        Drawable o6 = o6(i);
        TextView textView = this.L;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(o6, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setText(v6);
        textView.setContentDescription(v6);
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        this.P.setOnClickListener(onClickListener);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        AudioPlaylistAttachment audioPlaylistAttachment;
        if (jjc.b() || (audioPlaylistAttachment = (AudioPlaylistAttachment) this.C) == null) {
            return;
        }
        boolean f = epx.f(view, this.L);
        cr4 cr4Var = this.D;
        if (f) {
            if (this.R) {
                cvk.u(R.string.music_playlist_interation_forbidden, false);
                return;
            } else {
                if (lm4.j((lm4) this.T.getValue(), audioPlaylistAttachment, (u750) cr4Var.g.getValue(), (feb0) cr4Var.d.getValue())) {
                    hd60.a().u0(t6());
                    return;
                }
                return;
            }
        }
        if (!epx.f(view, this.N)) {
            if (epx.f(view, this.itemView)) {
                W6(view);
                return;
            }
            return;
        }
        Playlist playlist = audioPlaylistAttachment.f;
        if (xx1.e(playlist)) {
            hd60.a().p1(this.itemView.getContext(), playlist);
            return;
        }
        feb0 feb0Var = (feb0) cr4Var.d.getValue();
        MusicPlaybackLaunchContext Fb = MusicPlaybackLaunchContext.Fb(audioPlaylistAttachment.g);
        feb0Var.b.getClass();
        if (ModernPlaylistModel.E(playlist)) {
            je50.b(this.itemView.getContext(), playlist, new svd(feb0Var, audioPlaylistAttachment, Fb, 10));
        } else {
            feb0Var.d(playlist, Fb);
            hd60.a().u0(t6());
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ((lm4) this.T.getValue()).e(this.U);
        this.E.i.f();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ((lm4) this.T.getValue()).f(this.U);
        this.E.i.g();
        d3m.b(this.H, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
    }
}
