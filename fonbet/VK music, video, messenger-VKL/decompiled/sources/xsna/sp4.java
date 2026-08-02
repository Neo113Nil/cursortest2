package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioAttachment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xsna.tlo0;
import xsna.utu0;

/* compiled from: AudioHolderV2.kt */
/* loaded from: classes4.dex */
public final class sp4 extends m56<AudioAttachment> implements pt4 {
    public final utu0 D;
    public final lm4 E;
    public final c F;
    public MusicTrack G;
    public ArrayList<MusicTrack> H;
    public boolean I;
    public boolean J;
    public e6o K;
    public final b L;
    public q2r M;
    public final SpannableStringBuilder N;

    /* compiled from: AudioHolderV2.kt */
    public final class a implements utu0.b {
        public a() {
        }

        @Override // xsna.utu0.b
        public final void a() {
            sp4 sp4Var = sp4.this;
            sp4Var.E.i(sp4Var.G, sp4Var.H, sp4Var.u, sp4Var.w, null);
            hd60.a().r1(sp4Var.t6());
        }

        @Override // xsna.utu0.b
        public final void b() {
            sp4 sp4Var = sp4.this;
            sp4Var.E.g(sp4Var.itemView.getContext(), sp4Var.G, sp4Var.H, sp4Var.u, sp4Var.w, 0, null);
            hd60.a().r1(sp4Var.t6());
        }

        @Override // xsna.utu0.b
        public final void c(View view) {
            q2r q2rVar = sp4.this.M;
            if (q2rVar != null) {
                q2rVar.onClick(view);
            }
        }

        @Override // xsna.utu0.b
        public final void onAttachedToWindow() {
            sp4 sp4Var = sp4.this;
            sp4Var.E.e(sp4Var.F);
        }

        @Override // xsna.utu0.b
        public final void onDetachedFromWindow() {
            sp4 sp4Var = sp4.this;
            sp4Var.E.f(sp4Var.F);
            sp4Var.J = false;
        }
    }

    /* compiled from: AudioHolderV2.kt */
    public final class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            sp4 sp4Var = sp4.this;
            MusicTrack musicTrack = sp4Var.G;
            if (musicTrack != null) {
                boolean z = e3m.h(sp4Var.itemView.getContext()) == null ? false : !g620.f().k0().a(r2);
                boolean c = sp4Var.E.c(musicTrack, MusicPlaybackLaunchContext.p);
                if (z && c) {
                    cvk.u(R.string.audio_added_to_queue, false);
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: AudioHolderV2.kt */
    public final class c extends e.a {
        public c() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            if (fVar == null) {
                return;
            }
            MusicTrack f = fVar.f();
            sp4 sp4Var = sp4.this;
            MusicTrack musicTrack = sp4Var.G;
            boolean z = false;
            if (f == null || musicTrack == null || f.c.b != musicTrack.c.b || f.b != musicTrack.b) {
                a(false);
                sp4Var.X6(false);
                return;
            }
            a(playState == PlayState.PLAYING);
            if (!fVar.n() && !playState.i()) {
                z = true;
            }
            sp4Var.X6(z);
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void W3(com.vk.music.player.f fVar) {
            MusicTrack f = fVar.f();
            sp4 sp4Var = sp4.this;
            MusicTrack musicTrack = sp4Var.G;
            if (f == null || musicTrack == null || f.c.b != musicTrack.c.b || f.b != musicTrack.b) {
                sp4Var.X6(false);
            } else {
                sp4Var.X6(!fVar.n());
            }
        }

        public final void a(boolean z) {
            gko gkoVar = new gko(z ? R.drawable.vk_icon_pause_24 : R.drawable.vk_icon_play_24);
            tlo0.f h = tq.h(tlo0.Companion, z ? R.string.music_talkback_pause : R.string.music_talkback_play);
            utu0 utu0Var = sp4.this.D;
            utu0Var.setPlayButtonDrawable(gkoVar);
            utu0Var.setPlayButtonContentDescription(h);
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void o2(com.vk.music.player.f fVar) {
            MusicTrack f = fVar.f();
            sp4 sp4Var = sp4.this;
            MusicTrack musicTrack = sp4Var.G;
            if (f == null || musicTrack == null || f.c.b != musicTrack.c.b || f.b != musicTrack.b) {
                sp4Var.X6(false);
            } else {
                sp4Var.X6(!fVar.n());
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sp4(ViewGroup viewGroup) {
        super(r1);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(R.id.attach);
        FrameLayout frameLayout2 = (FrameLayout) this.itemView.findViewById(R.id.attach);
        utu0 utu0Var = new utu0(viewGroup.getContext());
        this.D = utu0Var;
        this.E = new lm4(null, null, null, 15);
        this.F = new c();
        this.L = new b();
        this.N = new SpannableStringBuilder();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        int dimensionPixelOffset = this.itemView.getResources().getDimensionPixelOffset(R.dimen.post_side_padding);
        frameLayout2.addView(utu0Var, layoutParams);
        frameLayout2.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        utu0Var.setAudioViewListener(new a());
        View.OnClickListener onClickListener = this.K;
        utu0Var.setUpOnClickListener(onClickListener == null ? utu0Var : onClickListener);
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.q = s6oVar;
        View.OnClickListener onClickListener = s6oVar.e;
        utu0 utu0Var = this.D;
        e6o a2 = s6oVar.a(utu0Var, onClickListener);
        this.K = a2;
        utu0Var.setUpOnClickListener(a2);
    }

    @Override // xsna.pt4
    public final void T4(q2r q2rVar) {
        this.M = q2rVar;
        this.I = true;
        utu0 utu0Var = this.D;
        utu0Var.setIsTimeTextVisible(false);
        X6(false);
        utu0Var.setIsRemoveButtonVisible(true);
        utu0Var.setOnLongClickListener(null);
    }

    @Override // xsna.m56
    public final void T6(AudioAttachment audioAttachment) {
        String str;
        AudioAttachment audioAttachment2 = audioAttachment;
        MusicTrack musicTrack = audioAttachment2.f;
        if (musicTrack != null) {
            List<Artist> list = musicTrack.u;
            List<Artist> list2 = musicTrack.t;
            this.G = musicTrack;
            tlo0.a aVar = tlo0.Companion;
            Context context = this.itemView.getContext();
            String str2 = musicTrack.d;
            String str3 = musicTrack.e;
            utu0 utu0Var = this.D;
            Float valueOf = Float.valueOf(utu0Var.getTitleTextSize());
            ucp ucpVar = ucp.a;
            tlo0.h f = u11.f(aVar, ucp.j(s490.d(context, str2, str3, R.attr.vk_ui_text_secondary), valueOf));
            float artistTextSize = utu0Var.getArtistTextSize();
            StringBuilder sb = new StringBuilder();
            String str4 = "";
            if (list2 != null) {
                str = s490.i(list2);
            } else {
                str = musicTrack.h;
                if (str == null) {
                    str = "";
                }
            }
            sb.append(str);
            sb.append(' ');
            sb.append(s490.c(list));
            tlo0.h hVar = new tlo0.h(ucp.j(drm0.p0(sb.toString()).toString(), Float.valueOf(artistTextSize)));
            boolean Lb = musicTrack.Lb();
            boolean B = musicTrack.B();
            int i = musicTrack.f;
            tlo0.h hVar2 = new tlo0.h(String.format(this.itemView.getContext().getResources().getConfiguration().getLocales().get(0), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2)));
            StringBuilder sb2 = new StringBuilder();
            if (list2 != null) {
                str4 = s490.i(list2);
            } else {
                String str5 = musicTrack.h;
                if (str5 != null) {
                    str4 = str5;
                }
            }
            sb2.append(str4);
            sb2.append(' ');
            sb2.append(s490.c(list));
            CharSequence i2 = ucp.i(drm0.p0(sb2.toString()).toString());
            String str6 = musicTrack.d;
            int i3 = musicTrack.f;
            boolean z = musicTrack.s;
            SpannableStringBuilder spannableStringBuilder = this.N;
            spannableStringBuilder.clear();
            spannableStringBuilder.append(i2);
            spannableStringBuilder.append((CharSequence) "-").append((CharSequence) str6).append((CharSequence) ", ");
            spannableStringBuilder.append((CharSequence) f870.p(this.itemView.getContext(), i3, z));
            boolean z2 = false;
            utu0Var.setData(new utu0.c(f, hVar, hVar2, Lb, B, new tlo0.h(spannableStringBuilder)));
            utu0Var.setOnLongClickListener(this.L);
            lm4 lm4Var = this.E;
            MusicTrack b2 = lm4Var.a.b();
            if (b2 != null && b2.equals(musicTrack)) {
                z2 = true;
            }
            u2b0 u2b0Var = lm4Var.a;
            if (z2) {
                if (u2b0Var.h()) {
                    gko gkoVar = new gko(R.drawable.vk_icon_pause_24);
                    tlo0.f fVar = new tlo0.f(R.string.music_talkback_pause);
                    utu0Var.setPlayButtonDrawable(gkoVar);
                    utu0Var.setPlayButtonContentDescription(fVar);
                } else {
                    gko gkoVar2 = new gko(R.drawable.vk_icon_play_24);
                    aVar.getClass();
                    tlo0.f fVar2 = new tlo0.f(R.string.music_talkback_play);
                    utu0Var.setPlayButtonDrawable(gkoVar2);
                    utu0Var.setPlayButtonContentDescription(fVar2);
                }
                X6(!u2b0Var.I1());
            } else {
                gko gkoVar3 = new gko(R.drawable.vk_icon_play_24);
                aVar.getClass();
                tlo0.f fVar3 = new tlo0.f(R.string.music_talkback_play);
                utu0Var.setPlayButtonDrawable(gkoVar3);
                utu0Var.setPlayButtonContentDescription(fVar3);
            }
        }
        this.H = audioAttachment2.g;
        this.u = audioAttachment2.h;
        this.w = audioAttachment2.i;
    }

    public final void X6(boolean z) {
        tlo0 f;
        boolean z2 = this.J;
        if (z2 != z || (z2 && this.I)) {
            boolean z3 = false;
            boolean z4 = !this.I && z;
            this.J = z4;
            boolean z5 = !z4;
            utu0 utu0Var = this.D;
            utu0Var.setIsArtistTextVisible(z5);
            if (!z4 && !this.I) {
                z3 = true;
            }
            utu0Var.setIsTimeTextVisible(z3);
            utu0Var.setIsExplicitVisible(z5);
            utu0Var.setIsProgressBarVisible(z4);
            if (z4) {
                f = tq.h(tlo0.Companion, R.string.audio_ad_title);
            } else {
                tlo0.a aVar = tlo0.Companion;
                Context context = this.itemView.getContext();
                MusicTrack musicTrack = this.G;
                if (musicTrack == null) {
                    return;
                } else {
                    f = u11.f(aVar, s490.d(context, musicTrack.d, musicTrack.e, R.attr.vk_ui_text_secondary));
                }
            }
            utu0Var.setTitleText(f);
        }
    }
}
