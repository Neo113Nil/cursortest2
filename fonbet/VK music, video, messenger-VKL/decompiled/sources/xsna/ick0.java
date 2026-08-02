package xsna;

import android.os.Bundle;
import android.os.Parcelable;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.f;
import com.vk.music.player.playback.PlayableType;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ry40;

/* compiled from: SnippetPlayerModel.kt */
/* loaded from: classes3.dex */
public final class ick0 extends wgp {
    public final ArrayList i = new ArrayList();
    public final zbk0 j;
    public StartPlaySource k;
    public MusicTrack l;
    public final EmptyList m;

    public ick0(hx40 hx40Var, fck0 fck0Var, gck0 gck0Var) {
        hck0 hck0Var = new hck0(this);
        zbk0 a = gck0Var.a(hx40Var, fck0Var);
        a.n(hck0Var);
        this.j = a;
        this.m = EmptyList.b;
    }

    @Override // xsna.wgp, xsna.u2b0
    public final com.vk.music.player.f H() {
        com.vk.music.player.f fVar = new com.vk.music.player.f(1, new f.a.C1335a());
        PlayerTrack o0 = o0();
        fVar.q(o0);
        fVar.e[0] = o0.b.f;
        return fVar;
    }

    @Override // xsna.wgp, xsna.u2b0
    public final MusicTrack K0() {
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wgp, xsna.u2b0
    public final void N0(lqk0 lqk0Var) {
        PlaySourceMeta playSourceMeta;
        PlaybackActionMeta d;
        int i;
        int i2;
        StartPlaySource startPlaySource = lqk0Var.a;
        MusicTrack musicTrack = lqk0Var.b;
        MusicTrack musicTrack2 = musicTrack == null ? new MusicTrack(0, null, null, null, 0, 0, null, null, null, 0, false, false, 0, null, false, null, null, false, null, null, null, null, null, null, 0L, 0, false, 0L, null, false, false, false, null, null, null, null, false, false, 0, null, false, 0, false, null, null, false, 0, null, false, null, null, null, -1, 1048575, null) : musicTrack;
        wva0 wva0Var = new wva0(lqk0Var.f, 2);
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = lqk0Var.d;
        boolean z = startPlaySource instanceof yba;
        yba ybaVar = z ? (yba) startPlaySource : null;
        String v0 = ybaVar != null ? ybaVar.v0() : null;
        if (v0 == null) {
            v0 = "";
        }
        String str = v0;
        PlayableType playableType = PlayableType.MUSIC_TRACK;
        if (startPlaySource == 0 || (playSourceMeta = startPlaySource.zb()) == null) {
            playSourceMeta = PlaySourceMeta.Default.b;
        }
        PlaybackLaunchMeta playbackLaunchMeta = new PlaybackLaunchMeta(musicPlaybackLaunchContext, str, playableType, playSourceMeta, null, 16, null);
        Parcelable parcelable = this.k;
        yba ybaVar2 = parcelable instanceof yba ? (yba) parcelable : null;
        String w = ybaVar2 != null ? ybaVar2.w() : null;
        yba ybaVar3 = z ? (yba) startPlaySource : null;
        String w2 = ybaVar3 != null ? ybaVar3.w() : null;
        this.k = startPlaySource;
        if (epx.f(w2, w)) {
            MusicTrack b = b();
            long j = lqk0Var.j;
            List list = lqk0Var.c;
            if (list == null) {
                list = EmptyList.b;
            }
            Iterator it = list.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else {
                    if (epx.f(((MusicTrack) it.next()).Fb(), b.Fb())) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
            }
            Iterator it2 = list.iterator();
            int i4 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i4 = -1;
                    break;
                } else {
                    if (epx.f(((MusicTrack) it2.next()).Fb(), musicTrack != null ? musicTrack.Fb() : null)) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            d = (i2 == -1 || i4 == -1) ? lqk0Var.d() : i4 > i2 ? new PlaybackActionMeta(7, j) : i4 < i2 ? new PlaybackActionMeta(8, j) : lqk0Var.d();
        } else {
            d = lqk0Var.d();
        }
        bck0 bck0Var = new bck0(new kx40(null, musicTrack2, wva0Var, playbackLaunchMeta, d, true, musicTrack != null ? musicTrack.a0 : null, 385), (Bundle) null, 4);
        kx40 kx40Var = bck0Var.a;
        boolean f = kx40Var.f();
        PlaybackActionMeta playbackActionMeta = kx40Var.e;
        if (f) {
            boolean z2 = lqk0Var.e;
            zbk0 zbk0Var = this.j;
            if (z2) {
                this.l = b();
                zbk0Var.k(bck0Var);
                return;
            }
            boolean equals = b().equals(kx40Var.b);
            ry40 state = zbk0Var.c.getState();
            if (equals && state.j()) {
                pause(6);
                return;
            }
            if (!equals || !state.i()) {
                this.l = b();
                zbk0Var.k(bck0Var);
                return;
            }
            long j2 = kx40Var.c.c;
            if (j2 > 0) {
                i = 2;
                ((dx40) ((e0a) zbk0Var.b).b).j((int) j2, PlaybackActionMeta.zb(playbackActionMeta, 26, 0L, 2));
            } else {
                i = 2;
            }
            f(PlaybackActionMeta.zb(playbackActionMeta, 6, 0L, i));
        }
    }

    @Override // xsna.wgp, xsna.u2b0
    public final void P0(com.vk.music.player.e eVar, boolean z) {
        this.i.add(eVar);
        if (z) {
            eVar.N3(m0(), H());
        }
    }

    @Override // xsna.wgp, xsna.u2b0
    public final MusicTrack b() {
        MusicTrack i = this.j.i();
        return i == null ? new MusicTrack(0, null, null, null, 0, 0, null, null, null, 0, false, false, 0, null, false, null, null, false, null, null, null, null, null, null, 0L, 0, false, 0L, null, false, false, false, null, null, null, null, false, false, 0, null, false, 0, false, null, null, false, 0, null, false, null, null, null, -1, 1048575, null) : i;
    }

    @Override // xsna.wgp, xsna.u2b0
    public final List<gza0> d() {
        return this.m;
    }

    @Override // xsna.wgp, xsna.u2b0
    public final void f(PlaybackActionMeta playbackActionMeta) {
        this.j.m(playbackActionMeta);
    }

    @Override // xsna.wgp, xsna.u2b0
    public final List<PlayerTrack> g() {
        return Collections.singletonList(o0());
    }

    @Override // xsna.wgp, xsna.u2b0
    public final boolean h() {
        return this.j.c.getState().j();
    }

    @Override // xsna.wgp, xsna.u2b0
    public final StartPlaySource j() {
        return this.k;
    }

    @Override // xsna.wgp, xsna.u2b0
    public final PlayState m0() {
        zbk0 zbk0Var = this.j;
        dx40 dx40Var = zbk0Var.c;
        dx40 dx40Var2 = zbk0Var.c;
        return dx40Var.getState().j() ? PlayState.PLAYING : dx40Var2.getState().i() ? PlayState.PAUSED : dx40Var2.getState() instanceof ry40.f ? PlayState.STOPPED : PlayState.IDLE;
    }

    @Override // xsna.wgp, xsna.u2b0
    public final void n0(com.vk.music.player.e eVar) {
        this.i.remove(eVar);
    }

    @Override // xsna.wgp, xsna.u2b0
    public final PlayerTrack o0() {
        return new PlayerTrack(b(), null, 0, 0L, null, 30, null);
    }

    @Override // xsna.wgp, xsna.u2b0
    public final void pause(int i) {
        this.j.j(i);
    }

    @Override // xsna.wgp, xsna.i80
    public final void release() {
        this.l = null;
        this.i.clear();
        this.j.l(32);
    }

    @Override // xsna.wgp, xsna.u2b0
    public final void stop(int i) {
        this.l = null;
        this.j.o(i);
    }

    public final void y(PlayState playState) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((com.vk.music.player.e) it.next()).N3(playState, H());
        }
    }

    @Override // xsna.wgp, xsna.u2b0
    public final boolean y0(MusicTrack musicTrack) {
        return musicTrack.equals(b());
    }
}
