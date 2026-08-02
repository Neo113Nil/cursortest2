package xsna;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.error.VkPlayerException;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.view.ThumbsImageView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioAttachment;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.r5b0;

/* compiled from: PrimaryAudioHolder.kt */
/* loaded from: classes4.dex */
public final class d7d0 extends m56<AudioAttachment> implements View.OnClickListener, com.vk.music.player.e, View.OnAttachStateChangeListener {
    public final cr4 D;
    public final z6d0 E;
    public final ColorDrawable F;
    public final ccr0 G;
    public final View H;
    public final ThumbsImageView I;
    public final TextView J;
    public final TextView K;
    public final View L;
    public final TextView M;
    public final ImageView N;
    public final View O;
    public final Object P;
    public final ImageView Q;
    public MusicTrack R;
    public Thumb S;
    public String T;
    public boolean U;
    public e6o V;

    public d7d0(ViewGroup viewGroup, cr4 cr4Var) {
        super(R.layout.attach_audio_track, viewGroup);
        this.D = cr4Var;
        z6d0 z6d0Var = new z6d0();
        this.E = z6d0Var;
        this.F = new ColorDrawable();
        ccr0 ccr0Var = new ccr0(viewGroup.getContext());
        this.G = ccr0Var;
        View findViewById = this.itemView.findViewById(R.id.container);
        this.H = findViewById;
        this.I = (ThumbsImageView) this.itemView.findViewById(R.id.audio_attachment_album_cover);
        TextView textView = (TextView) this.itemView.findViewById(R.id.audio_attachment_title);
        this.J = textView;
        this.K = (TextView) this.itemView.findViewById(R.id.audio_attachment_artist);
        this.L = this.itemView.findViewById(R.id.audio_attachment_explicit);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.audio_attachment_play_btn);
        this.M = textView2;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.audio_attachment_add_btn);
        this.N = imageView;
        this.O = this.itemView.findViewById(R.id.shadow_add_view);
        this.P = msy.a(LazyThreadSafetyMode.NONE, new p1d0(this, 1));
        ImageView imageView2 = (ImageView) this.itemView.findViewById(R.id.audio_attachment_playing_indicator);
        this.Q = imageView2;
        this.itemView.addOnAttachStateChangeListener(this);
        View.OnClickListener onClickListener = this.V;
        onClickListener = onClickListener == null ? this : onClickListener;
        findViewById.setOnClickListener(onClickListener);
        textView2.setOnClickListener(onClickListener);
        imageView.setOnClickListener(onClickListener);
        ccr0Var.g.u(RoundingParams.b(cn70.a() * 10.0f));
        ccr0Var.a(cn70.a() * 0.5f, dhr0.t.c(R.attr.vk_ui_image_border_alpha));
        ccr0Var.i = z6d0Var;
        ccr0Var.k = new a();
        r5b0.b bVar = new r5b0.b(viewGroup.getContext());
        bVar.c(R.color.vk_white);
        bVar.a(R.integer.audio_attachment_playing_drawable_count);
        bVar.g(R.dimen.audio_attachment_playing_drawable_width);
        bVar.e(R.dimen.audio_attachment_playing_drawable_height);
        bVar.f(R.dimen.audio_attachment_playing_drawable_min_height);
        bVar.d(R.dimen.audio_attachment_playing_drawable_corner_radius);
        bVar.b(R.dimen.audio_attachment_playing_drawable_gap);
        bVar.j = new float[]{cn70.a() * 31.0f, cn70.a() * 43.0f, cn70.a() * 56.0f};
        imageView2.setImageDrawable(new r5b0(bVar));
        findViewById.setBackground(ccr0Var);
        com.vk.typography.b.k(textView, FontFamily.DISPLAY_DEMIBOLD, Float.valueOf(21.0f), 4);
    }

    @Override // com.vk.music.player.e
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        AudioAttachment audioAttachment = (AudioAttachment) this.C;
        MusicTrack musicTrack = audioAttachment != null ? audioAttachment.f : null;
        MusicTrack f = fVar != null ? fVar.f() : null;
        if (f == null || musicTrack == null || !f.equals(musicTrack)) {
            Y6(false, false);
        } else {
            Y6(playState == PlayState.PLAYING, playState != PlayState.STOPPED);
        }
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        e6o a2 = s6oVar.a(this, s6oVar.e);
        this.V = a2;
        this.H.setOnClickListener(a2);
        this.M.setOnClickListener(a2);
        this.N.setOnClickListener(a2);
    }

    @Override // xsna.m56
    public final void T6(AudioAttachment audioAttachment) {
        MusicTrack musicTrack = audioAttachment.f;
        this.R = musicTrack;
        AlbumLink albumLink = musicTrack.q;
        String str = null;
        Thumb thumb = albumLink != null ? albumLink.f : null;
        this.S = thumb;
        if (thumb != null) {
            Serializer.c<Thumb> cVar = Thumb.CREATOR;
            str = thumb.Ab(172, false);
        }
        this.T = str;
        Integer num = z6d0.i.get(str);
        int intValue = num != null ? num.intValue() : dhr0.t.c(R.attr.vk_ui_background_tertiary);
        ColorDrawable colorDrawable = this.F;
        colorDrawable.setColor(intValue);
        ccr0 ccr0Var = this.G;
        ccr0Var.u(colorDrawable);
        String str2 = this.T;
        this.E.f = str2;
        ccr0Var.r(str2);
        this.I.setThumb(this.S);
        b7(num != null);
        Y6(false, false);
        cr4 cr4Var = this.D;
        N3(cr4Var.a().m0(), cr4Var.a().H());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final lm4 X6() {
        return (lm4) this.P.getValue();
    }

    public final void Y6(boolean z, boolean z2) {
        if (z2) {
            d3m.c(this.Q, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            d3m.e(this.Q, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
        this.Q.setActivated(z);
        if (this.U == z) {
            return;
        }
        this.U = z;
        int i = z ? R.drawable.vk_icon_pause_24 : R.drawable.vk_icon_play_24;
        String v6 = v6(z ? R.string.audio_attachment_pause : R.string.audio_attachment_play);
        Drawable o6 = o6(i);
        TextView textView = this.M;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(o6, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setText(v6);
        textView.setContentDescription(v6);
    }

    public final void b7(boolean z) {
        Integer num;
        MusicTrack musicTrack;
        MusicTrack musicTrack2 = this.R;
        if (musicTrack2 == null) {
            return;
        }
        float f = musicTrack2.B() ? 0.4f : 1.0f;
        int[] iArr = z6d0.g;
        Double d = z6d0.j.get(this.T);
        if (d != null) {
            num = Integer.valueOf(d.doubleValue() < 1.600000023841858d ? this.itemView.getContext().getColor(R.color.vk_black) : this.itemView.getContext().getColor(R.color.vk_white));
        } else {
            num = null;
        }
        String f2 = ob50.f(musicTrack2);
        TextView textView = this.J;
        textView.setText(f2);
        textView.setTextColor(z ? num != null ? num.intValue() : this.itemView.getContext().getColor(R.color.vk_white) : e3m.f(R.attr.vk_ui_text_primary, this.itemView.getContext()));
        textView.setAlpha(f);
        String a2 = ob50.a(musicTrack2);
        TextView textView2 = this.K;
        textView2.setText(a2);
        textView2.setTextColor(z ? num != null ? num.intValue() : this.itemView.getContext().getColor(R.color.vk_white) : e3m.f(R.attr.vk_ui_text_secondary, this.itemView.getContext()));
        textView2.setAlpha(f);
        boolean z2 = musicTrack2.s;
        View view = this.L;
        bwt0.p0(view, z2);
        view.setBackgroundTintList(ColorStateList.valueOf(z ? num != null ? num.intValue() : this.itemView.getContext().getColor(R.color.vk_white) : e3m.f(R.attr.vk_ui_text_primary, this.itemView.getContext())));
        view.setAlpha(musicTrack2.B() ? 0.4f : 0.6f);
        AudioAttachment audioAttachment = (AudioAttachment) this.C;
        if (audioAttachment == null || (musicTrack = audioAttachment.f) == null) {
            return;
        }
        cr4 cr4Var = this.D;
        boolean i = cr4Var.c().i(musicTrack);
        View view2 = this.O;
        ImageView imageView = this.N;
        if (i || musicTrack.l) {
            imageView.setImageResource(R.drawable.vk_icon_add_24);
            imageView.setContentDescription(v6(R.string.music_add_to_my_music));
            bwt0.p0(imageView, true);
            bwt0.p0(view2, true);
            return;
        }
        if (!cr4Var.c().i0(musicTrack)) {
            bwt0.p0(imageView, false);
            bwt0.p0(view2, false);
        } else {
            imageView.setImageResource(R.drawable.vk_icon_done_24);
            imageView.setContentDescription(v6(R.string.music_remove_from_my_music));
            bwt0.p0(imageView, true);
            bwt0.p0(view2, true);
        }
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        AudioAttachment audioAttachment;
        MusicTrack musicTrack;
        if (jjc.b() || (audioAttachment = (AudioAttachment) this.C) == null) {
            return;
        }
        NewsEntry t6 = t6();
        PromoPost promoPost = t6 instanceof PromoPost ? (PromoPost) t6 : null;
        AdsAudioPixelsContainer adsAudioPixelsContainer = promoPost != null ? promoPost.I : null;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.audio_attachment_play_btn) {
            lm4 X6 = X6();
            X6.getClass();
            X6.i(audioAttachment.f, audioAttachment.g, audioAttachment.h, audioAttachment.i, adsAudioPixelsContainer);
            hd60.a().r1(t6);
            return;
        }
        if (valueOf == null || valueOf.intValue() != R.id.audio_attachment_add_btn) {
            if (valueOf != null && valueOf.intValue() == R.id.container) {
                X6().g(this.itemView.getContext(), audioAttachment.f, audioAttachment.g, audioAttachment.h, audioAttachment.i, 0, null);
                hd60.a().r1(t6);
                return;
            }
            return;
        }
        AudioAttachment audioAttachment2 = (AudioAttachment) this.C;
        if (audioAttachment2 == null || (musicTrack = audioAttachment2.f) == null) {
            return;
        }
        cr4 cr4Var = this.D;
        if (cr4Var.c().i(musicTrack) || musicTrack.l) {
            X6().a(itg0.l(hg1.l(X6().b(musicTrack, audioAttachment2.h), this.itemView.getContext(), 62).i(new pdw(e7d0.b, 20))));
        } else if (cr4Var.c().i0(musicTrack)) {
            X6().a(itg0.l(hg1.l(X6().l(musicTrack), this.itemView.getContext(), 62).i(new j3z(f7d0.b, 13))));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        X6().e(this);
        this.G.s();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        X6().f(this);
        this.G.t();
        d3m.b(this.Q, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
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

    /* compiled from: PrimaryAudioHolder.kt */
    public static final class a implements b780 {
        public a() {
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
            d7d0.this.b7(false);
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
            d7d0.this.b7(false);
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
            d7d0.this.b7(true);
        }

        @Override // xsna.b780
        public final void g(String str) {
        }
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
