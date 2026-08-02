package xsna;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.SeekBar;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.domain.state.LyricsMode;
import com.vk.music.player.presentation.main.BigPlayerLayout;
import com.vk.music.ui.bottomsheet.MusicPlayerPersistentBottomSheet;
import com.vk.music.view.player.MusicBigPlayerParams;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import xsna.k840;

/* compiled from: MusicBigPlayerControlsHolderNew.kt */
/* loaded from: classes3.dex */
public final class mb40 extends rb40 implements too0, f380, xb40, m0q0, a07 {
    public static final int y = iah0.a(300);
    public final c07 n;
    public final u2b0 o;
    public final MusicPlayerPersistentBottomSheet p;
    public final x5v0 q;
    public final y17 r;
    public uti s;
    public final dn40 t;
    public final dn40 u;
    public final io.reactivex.rxjava3.disposables.b v;
    public String w;
    public MusicTrack x;

    public mb40(ViewGroup viewGroup, MusicBigPlayerParams musicBigPlayerParams, c07 c07Var) {
        super(R.layout.music_player_main, viewGroup);
        this.n = c07Var;
        u2b0 u2b0Var = musicBigPlayerParams.c;
        this.o = u2b0Var;
        this.p = musicBigPlayerParams.i;
        this.q = musicBigPlayerParams.h;
        l07 l07Var = new l07(musicBigPlayerParams.j.i() ? R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary : R.attr.vk_ui_icon_accent);
        y17 y17Var = new y17((BigPlayerLayout) this.itemView, this);
        this.r = y17Var;
        this.s = new uti(y17Var, l07Var, new h4i0(y17Var, l07Var, this), this, musicBigPlayerParams.c, new DecimalFormat("#.#x"));
        this.t = new dn40(y17Var.n, u2b0Var, -1);
        this.u = new dn40(y17Var.p, u2b0Var, 1);
        this.v = new io.reactivex.rxjava3.disposables.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xb40
    public final void B0(float f) {
        float m6 = m6();
        com.vk.music.player.domain.state.a aVar = (com.vk.music.player.domain.state.a) this.l;
        LyricsMode lyricsMode = aVar != null ? aVar.l : null;
        LyricsMode lyricsMode2 = LyricsMode.COLLAPSED;
        y17 y17Var = this.r;
        if (lyricsMode != lyricsMode2) {
            View view = y17Var.u;
            float m62 = m6();
            view.animate().setInterpolator(new OvershootInterpolator()).setDuration(500L).scaleX(m62).scaleY(m62).start();
            return;
        }
        View view2 = y17Var.u;
        float f2 = 0.2f * m6;
        if (f > m6) {
            f = m6;
        }
        if (f >= f2) {
            f2 = f;
        }
        view2.animate().setDuration(0L).scaleX(f2).scaleY(f2).start();
    }

    @Override // xsna.a07
    public final void L2(zy6 zy6Var) {
        this.n.a(zy6Var);
    }

    @Override // xsna.too0
    public final void Ng() {
        uti utiVar = this.s;
        if (utiVar != null) {
            utiVar.c();
        }
    }

    @Override // xsna.se50
    public final void a6() {
        this.t.a();
        this.u.a();
        qb40 qb40Var = this.n.f;
        qb40Var.getClass();
        r5v0 r5v0Var = k840.a.h;
        if (r5v0Var == null) {
            r5v0Var = null;
        }
        qb40Var.h.b(r5v0Var.a.a.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new rt10(new lpd(qb40Var, 7), 5)));
        qb40Var.a.P0(qb40Var.j, true);
    }

    @Override // xsna.se50
    public final void b6(com.vk.music.player.domain.state.a aVar) {
        com.vk.music.player.domain.state.a aVar2 = aVar;
        uti utiVar = this.s;
        if (utiVar != null) {
            utiVar.a(aVar2);
        }
        com.vk.music.player.f fVar = aVar2.a;
        MusicTrack f = fVar != null ? fVar.f() : null;
        int i = y;
        if (f != null) {
            if (!epx.f(this.w, f.Fb())) {
                this.w = f.Fb();
                bn40.f("Item: " + aVar2 + ", url: " + f.Kb(i));
            }
            MusicTrack musicTrack = this.x;
            PlayerTrack playerTrack = fVar.c;
            if (!epx.f(musicTrack, playerTrack != null ? playerTrack.b : null)) {
                PlayerTrack playerTrack2 = fVar.c;
                this.x = playerTrack2 != null ? playerTrack2.b : null;
            }
        } else if (this.w != null) {
            this.w = null;
            bn40.f("Item(none):", aVar2, "url: null");
        }
        LoopMode repeatMode = this.o.getRepeatMode();
        com.vk.music.player.f fVar2 = aVar2.a;
        List<PlayerTrack> list = aVar2.d;
        int e = fVar2 == null ? 0 : fVar2.e() / 1000;
        int h = e - (fVar2 == null ? 0 : fVar2.h() / 1000);
        if (h <= 0) {
            h = 0;
        }
        if (h <= e) {
            e = h;
        }
        if (e <= 10 && repeatMode != LoopMode.TRACK) {
            PlayerTrack playerTrack3 = fVar2 != null ? fVar2.c : null;
            if (!list.isEmpty() && playerTrack3 != null && fVar2.m()) {
                int indexOf = list.indexOf(playerTrack3) + 1;
                if (indexOf >= list.size()) {
                    if (repeatMode == LoopMode.LIST) {
                        indexOf = 0;
                    }
                }
                this.v.b(mcr0.s(list.get(indexOf).b.Kb(i)).subscribe());
            }
        }
        MusicPlayerPersistentBottomSheet musicPlayerPersistentBottomSheet = this.p;
        if (musicPlayerPersistentBottomSheet != null) {
            if (!(musicPlayerPersistentBottomSheet.getState() == 1)) {
                View view = this.r.u;
                float m6 = m6();
                view.animate().setInterpolator(new OvershootInterpolator()).setDuration(500L).scaleX(m6).scaleY(m6).start();
            }
        }
        l6(aVar2.b);
    }

    @Override // xsna.se50
    public final void h6() {
        iz6 iz6Var = iz6.a;
        c07 c07Var = this.n;
        c07Var.a(iz6Var);
        dn40 dn40Var = this.t;
        if (p1p0.a(dn40Var.f)) {
            bn40.f("ltseek: destroy");
            dn40Var.b.n0(dn40Var.h);
            dn40Var.c(false);
        }
        dn40 dn40Var2 = this.u;
        if (p1p0.a(dn40Var2.f)) {
            bn40.f("ltseek: destroy");
            dn40Var2.b.n0(dn40Var2.h);
            dn40Var2.c(false);
        }
        qb40 qb40Var = c07Var.f;
        qb40Var.g.b(null);
        qb40Var.h.b(null);
        qb40Var.i.b(null);
        qb40Var.a.n0(qb40Var.j);
    }

    @Override // xsna.rb40
    public final void l6(ugp0 ugp0Var) {
        uti utiVar = this.s;
        if (utiVar != null) {
            h4i0 h4i0Var = utiVar.c;
            l07 l07Var = h4i0Var.c;
            y17 y17Var = h4i0Var.b;
            SeekBar seekBar = y17Var.t;
            h4i0Var.j = ugp0Var.a;
            h4i0Var.a(h4i0Var.e ? l07Var.t : l07Var.u, h4i0Var.f, false);
            if (ugp0Var.a == 0) {
                if (h4i0Var.g) {
                    seekBar.setProgress(0);
                }
                seekBar.setSecondaryProgress(0);
                y17Var.j.setText(String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{0, 0}, 2)));
                return;
            }
            int max = seekBar.getMax();
            int i = ugp0Var.a;
            if (max != i) {
                seekBar.setMax(i);
            }
            if (h4i0Var.g) {
                seekBar.setProgress(ugp0Var.b);
                int i2 = ugp0Var.a;
                int i3 = i2 / 1000;
                int i4 = ugp0Var.b;
                int i5 = i4 / 1000;
                if (i5 <= 0) {
                    i5 = 0;
                }
                if (i5 <= i3) {
                    i3 = i5;
                }
                int i6 = i2 / 1000;
                int i7 = i6 - (i4 / 1000);
                int i8 = i7 > 0 ? i7 : 0;
                if (i8 <= i6) {
                    i6 = i8;
                }
                h4i0Var.g(i6, i3);
            }
            seekBar.setSecondaryProgress((int) ((ugp0Var.a / 100.0f) * ugp0Var.c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float m6() {
        PlayState playState;
        com.vk.music.player.domain.state.a aVar = (com.vk.music.player.domain.state.a) this.l;
        if (aVar == null || (playState = aVar.c) == null || playState.h()) {
            return 1.0f;
        }
        com.vk.music.player.domain.state.a aVar2 = (com.vk.music.player.domain.state.a) this.l;
        return (aVar2 != null ? aVar2.l : null) == LyricsMode.COLLAPSED ? 0.8f : 1.0f;
    }

    @Override // xsna.f380
    public final void onConfigurationChanged(Configuration configuration) {
        this.q.a();
        L2(iz6.a);
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_CONTROLS;
    }
}
