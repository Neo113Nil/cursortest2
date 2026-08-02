package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.datasource.AssetDataSource;
import androidx.media3.datasource.a;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayState;
import com.vk.music.player.api.helper.AudioPlayer;
import com.vk.music.player.api.helper.dto.AudioDiscontinuityReason;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import xsna.gv10;
import xsna.jk80;
import xsna.jza0;
import xsna.kr10;

/* compiled from: ExoPlayerHelper.java */
/* loaded from: classes7.dex */
public final class c6q implements gv10 {
    public final m8x0 d;
    public qxo0 f;
    public boolean g;
    public final Context h;
    public MusicPlaybackLaunchContext i;
    public s850 b = null;

    @NonNull
    public PlayState e = PlayState.IDLE;
    public String j = "";
    public MusicTrack k = null;
    public int l = 0;
    public final float m = 1.0f;
    public float n = 1.0f;
    public boolean o = false;
    public final k5q p = new k5q();
    public final a q = new a();
    public final g9e0 r = new g9e0(new u3k(this, 7));
    public final long c = 50;
    public final oh6 a = new oh6(true, com.vk.music.audioeffect.a.a.getSTUB());

    /* compiled from: ExoPlayerHelper.java */
    public class a implements by1 {
        public a() {
        }

        @Override // xsna.by1
        public final void F(bpz bpzVar, pr10 pr10Var) {
            c6q.this.p.d(new soz(bpzVar.d, bpzVar.b), new or10(pr10Var.f, pr10Var.g, pr10Var.a));
        }

        @Override // xsna.by1
        public final void L(bpz bpzVar, pr10 pr10Var, @NonNull IOException iOException) {
            c6q.this.p.b(new soz(bpzVar.d, bpzVar.b), new or10(pr10Var.f, pr10Var.g, pr10Var.a), iOException);
        }

        @Override // xsna.by1
        public final void R(int i) {
            AudioPlayer.State state;
            c6q c6qVar = c6q.this;
            if (i == 1) {
                state = AudioPlayer.State.IDLE;
            } else if (i == 2) {
                state = AudioPlayer.State.BUFFERING;
            } else if (i != 3) {
                state = i != 4 ? null : AudioPlayer.State.ENDED;
            } else {
                androidx.media3.exoplayer.l a = c6qVar.a();
                state = (a == null || !a.getPlayWhenReady()) ? AudioPlayer.State.PAUSED : AudioPlayer.State.PLAYING;
            }
            if (state != null) {
                c6qVar.p.e(state);
            }
        }

        @Override // xsna.by1
        public final void W(bpz bpzVar, pr10 pr10Var) {
            c6q.this.p.f(new soz(bpzVar.d, bpzVar.b), new or10(pr10Var.f, pr10Var.g, pr10Var.a));
        }

        @Override // xsna.by1
        public final void d0(int i, @NonNull jza0.c cVar, @NonNull jza0.c cVar2) {
            AudioDiscontinuityReason audioDiscontinuityReason;
            switch (i) {
                case 0:
                    audioDiscontinuityReason = AudioDiscontinuityReason.AUTO_TRANSITION;
                    break;
                case 1:
                    audioDiscontinuityReason = AudioDiscontinuityReason.SEEK;
                    break;
                case 2:
                    audioDiscontinuityReason = AudioDiscontinuityReason.SEEK_ADJUSTMENT;
                    break;
                case 3:
                    audioDiscontinuityReason = AudioDiscontinuityReason.SKIP;
                    break;
                case 4:
                    audioDiscontinuityReason = AudioDiscontinuityReason.REMOVE;
                    break;
                case 5:
                    audioDiscontinuityReason = AudioDiscontinuityReason.INTERNAL;
                    break;
                case 6:
                    audioDiscontinuityReason = AudioDiscontinuityReason.SILENCE_SKIP;
                    break;
                default:
                    audioDiscontinuityReason = null;
                    break;
            }
            if (audioDiscontinuityReason != null) {
                c6q.this.p.g(audioDiscontinuityReason);
            }
        }

        @Override // xsna.by1
        public final void g0(bpz bpzVar, pr10 pr10Var) {
            c6q.this.p.h(new soz(bpzVar.d, bpzVar.b), new or10(pr10Var.f, pr10Var.g, pr10Var.a));
        }
    }

    /* compiled from: ExoPlayerHelper.java */
    public static class b implements Runnable {
        public final gv10.a b;
        public final androidx.media3.exoplayer.l c;
        public final c6q d;

        public b(s850 s850Var, androidx.media3.exoplayer.l lVar, c6q c6qVar) {
            this.b = s850Var;
            this.d = c6qVar;
            this.c = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.media3.exoplayer.l lVar = this.c;
            if (lVar.getPlaybackState() == 3 && lVar.getPlayWhenReady()) {
                int currentPosition = (int) lVar.getCurrentPosition();
                gv10.a aVar = this.b;
                aVar.a(this.d, currentPosition);
                lVar.t();
                lVar.a();
                aVar.getClass();
            }
        }
    }

    public c6q(Context context) {
        this.h = context;
        this.d = new m8x0(context, gv10.class.getName());
        h(PlayState.STOPPED);
    }

    @Nullable
    public final androidx.media3.exoplayer.l a() {
        g9e0 g9e0Var = this.r;
        if (g9e0Var.c()) {
            return (androidx.media3.exoplayer.l) g9e0Var.b();
        }
        return null;
    }

    public final boolean b() {
        androidx.media3.exoplayer.l a2 = a();
        return a2 != null && a2.getPlayWhenReady();
    }

    public final float c() {
        androidx.media3.exoplayer.l a2 = a();
        if (a2 == null) {
            return 1.0f;
        }
        return a2.getVolume();
    }

    public final void d(@Nullable MusicTrack musicTrack, int i, String str, @Nullable MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z, boolean z2) {
        androidx.media3.exoplayer.source.i nVar;
        bn40.f("mid=", musicTrack == null ? "null" : musicTrack.Fb(), "startFrom=", Integer.valueOf(i), "url=", str, "context=", MusicPlaybackLaunchContext.Mb(musicPlaybackLaunchContext));
        this.i = musicPlaybackLaunchContext;
        e();
        g9e0 g9e0Var = this.r;
        g9e0Var.b();
        this.j = str != null ? str : "null";
        this.k = musicTrack;
        Uri parse = Uri.parse(str);
        if (str == null || !drm0.D(str, ".m3u8", false)) {
            int i2 = 8;
            if (str == null || !str.contains("asset")) {
                androidx.media3.datasource.d dVar = new androidx.media3.datasource.d(this.h, (String) null, (jk80.a) null);
                b630 b630Var = new b630(new uel(), i2);
                androidx.media3.exoplayer.upstream.a aVar = new androidx.media3.exoplayer.upstream.a();
                kr10.b.a aVar2 = new kr10.b.a();
                com.google.common.collect.h hVar = com.google.common.collect.h.h;
                ImmutableList.b bVar = ImmutableList.c;
                com.google.common.collect.g gVar = com.google.common.collect.g.f;
                List list = Collections.EMPTY_LIST;
                com.google.common.collect.g gVar2 = com.google.common.collect.g.f;
                kr10.e.a aVar3 = new kr10.e.a();
                kr10.g gVar3 = kr10.g.a;
                kr10.f fVar = parse != null ? new kr10.f(parse, null, null, list, null, gVar2, C.TIME_UNSET) : null;
                kr10 kr10Var = new kr10("", new kr10.c(aVar2), fVar, new kr10.e(aVar3), vr10.B, gVar3);
                fVar.getClass();
                kr10.f fVar2 = kr10Var.b;
                fVar2.getClass();
                fVar2.getClass();
                nVar = new androidx.media3.exoplayer.source.n(kr10Var, dVar, b630Var, androidx.media3.exoplayer.drm.b.a, aVar, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, null);
            } else {
                a.InterfaceC0045a interfaceC0045a = new a.InterfaceC0045a() { // from class: xsna.b6q
                    @Override // androidx.media3.datasource.a.InterfaceC0045a
                    public final androidx.media3.datasource.a createDataSource() {
                        return new AssetDataSource(c6q.this.h);
                    }
                };
                b630 b630Var2 = new b630(new uel(), i2);
                androidx.media3.exoplayer.upstream.a aVar4 = new androidx.media3.exoplayer.upstream.a();
                kr10.b.a aVar5 = new kr10.b.a();
                com.google.common.collect.h hVar2 = com.google.common.collect.h.h;
                ImmutableList.b bVar2 = ImmutableList.c;
                com.google.common.collect.g gVar4 = com.google.common.collect.g.f;
                List list2 = Collections.EMPTY_LIST;
                com.google.common.collect.g gVar5 = com.google.common.collect.g.f;
                kr10.e.a aVar6 = new kr10.e.a();
                kr10.g gVar6 = kr10.g.a;
                kr10.f fVar3 = parse != null ? new kr10.f(parse, null, null, list2, null, gVar5, C.TIME_UNSET) : null;
                kr10 kr10Var2 = new kr10("", new kr10.c(aVar5), fVar3, new kr10.e(aVar6), vr10.B, gVar6);
                fVar3.getClass();
                kr10.f fVar4 = kr10Var2.b;
                fVar4.getClass();
                fVar4.getClass();
                nVar = new androidx.media3.exoplayer.source.n(kr10Var2, interfaceC0045a, b630Var2, androidx.media3.exoplayer.drm.b.a, aVar4, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, null);
            }
        } else {
            k5q k5qVar = this.p;
            if (musicTrack == null || !z2) {
                k5qVar.i();
            } else {
                k5qVar.l();
                k5q.m(new fk(6, k5qVar, musicTrack));
            }
            oh6 oh6Var = this.a;
            HlsMediaSource.Factory factory = new HlsMediaSource.Factory(oh6Var.a(musicTrack));
            factory.e = oh6Var.b(musicTrack);
            factory.f = oh6Var.c(musicTrack);
            kr10.b.a aVar7 = new kr10.b.a();
            com.google.common.collect.h hVar3 = com.google.common.collect.h.h;
            ImmutableList.b bVar3 = ImmutableList.c;
            com.google.common.collect.g gVar7 = com.google.common.collect.g.f;
            nVar = factory.d(new kr10("", new kr10.c(aVar7), parse != null ? new kr10.f(parse, null, null, Collections.EMPTY_LIST, null, com.google.common.collect.g.f, C.TIME_UNSET) : null, new kr10.e(new kr10.e.a()), vr10.B, kr10.g.a));
        }
        androidx.media3.exoplayer.l lVar = (androidx.media3.exoplayer.l) g9e0Var.b();
        if (i > 0) {
            lVar.setPlayWhenReady(false);
            lVar.r(nVar);
            lVar.prepare();
            lVar.x(i);
            this.l = i;
        } else {
            lVar.r(nVar);
            lVar.prepare();
            this.l = 0;
        }
        g(z);
    }

    public final void e() {
        bn40.f(new Object[0]);
        h(PlayState.STOPPED);
        this.d.a(10000L);
        g9e0 g9e0Var = this.r;
        if (g9e0Var.c()) {
            ((androidx.media3.exoplayer.l) g9e0Var.b()).release();
            g9e0Var.d();
        }
        this.g = false;
        qxo0 qxo0Var = this.f;
        if (qxo0Var != null) {
            ju4 ju4Var = qxo0Var.c;
            ((Handler) ju4Var.a).removeCallbacks((Runnable) ju4Var.b);
            this.f = null;
        }
    }

    public final boolean f(int i) {
        bn40.f("seekTo", Integer.valueOf(i));
        if (!this.g) {
            return false;
        }
        this.o = true;
        qxo0 qxo0Var = this.f;
        if (qxo0Var != null) {
            ju4 ju4Var = qxo0Var.c;
            ((Handler) ju4Var.a).removeCallbacks((Runnable) ju4Var.b);
            this.f = null;
        }
        ((androidx.media3.exoplayer.l) this.r.b()).x(i);
        j();
        return true;
    }

    public final void g(boolean z) {
        androidx.media3.exoplayer.l a2 = a();
        if (a2 == null) {
            return;
        }
        a2.setPlayWhenReady(z);
        if (z) {
            h(PlayState.PLAYING);
            j();
            return;
        }
        h(PlayState.PAUSED);
        qxo0 qxo0Var = this.f;
        if (qxo0Var != null) {
            ju4 ju4Var = qxo0Var.c;
            ((Handler) ju4Var.a).removeCallbacks((Runnable) ju4Var.b);
            this.f = null;
        }
    }

    @Override // xsna.gv10
    public final long getDuration() {
        if (this.g) {
            return ((androidx.media3.exoplayer.l) this.r.b()).getDuration();
        }
        return 0L;
    }

    public final void h(@NonNull PlayState playState) {
        bn40.f("state=", playState);
        this.e = playState;
        PlayState playState2 = PlayState.PLAYING;
        m8x0 m8x0Var = this.d;
        if (playState != playState2) {
            m8x0Var.a(10000L);
            return;
        }
        PowerManager.WakeLock wakeLock = m8x0Var.a;
        if (!wakeLock.isHeld()) {
            L.l(new String[0]);
            wakeLock.acquire();
        }
        ju4 ju4Var = m8x0Var.b;
        if (ju4Var != null) {
            ((Handler) ju4Var.a).removeCallbacks((Runnable) ju4Var.b);
            m8x0Var.b = null;
        }
    }

    public final void i(float f) {
        bn40.f("volume=", Float.valueOf(f));
        androidx.media3.exoplayer.l a2 = a();
        this.n = f;
        if (a2 == null) {
            return;
        }
        a2.setVolume(f);
    }

    public final void j() {
        s850 s850Var = this.b;
        if (s850Var != null && this.f == null) {
            qxo0 qxo0Var = new qxo0(this.c, new b(s850Var, (androidx.media3.exoplayer.l) this.r.b(), this));
            qxo0Var.c.b(0L);
            this.f = qxo0Var;
        }
    }

    public final void k() {
        if (this.b != null) {
            g9e0 g9e0Var = this.r;
            if (g9e0Var.c() && ((androidx.media3.exoplayer.l) g9e0Var.b()).getPlaybackState() != 4) {
                this.b.getClass();
            }
        }
        bn40.f(new Object[0]);
        e();
    }
}
