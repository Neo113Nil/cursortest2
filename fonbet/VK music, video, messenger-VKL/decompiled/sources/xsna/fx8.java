package xsna;

import android.net.Uri;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayerTrack;
import com.vk.music.playerservice.impl.PlayerService;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import xsna.kr10;

/* compiled from: CachePrefetchController.kt */
/* loaded from: classes3.dex */
public final class fx8 implements mzc0 {
    public final PlayerService a;
    public final Cache b;
    public final com.vk.music.player.cache.a c;
    public final aw40 d;
    public final Object e;
    public final LinkedList f;
    public final LinkedList g;
    public boolean h;
    public final Object i;
    public final Object j;
    public final ConcurrentHashMap.KeySetView<String, Boolean> k;
    public MusicTrack l;
    public final ex8 m;

    public fx8(PlayerService playerService, Cache cache, com.vk.music.player.cache.a aVar, aw40 aw40Var) {
        this.a = playerService;
        this.b = cache;
        this.c = aVar;
        this.d = aw40Var;
        yh yhVar = new yh(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, yhVar);
        this.f = new LinkedList();
        this.g = new LinkedList();
        this.h = true;
        this.i = msy.a(lazyThreadSafetyMode, new ic(this, 10));
        this.j = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(this, 11));
        this.k = ConcurrentHashMap.newKeySet();
        this.m = new ex8(this);
    }

    public static final void f(fx8 fx8Var, pr10 pr10Var, int i, LinkedList linkedList, LinkedList linkedList2) {
        HlsMediaSource g;
        MusicTrack musicTrack;
        String str;
        int i2 = pr10Var.a;
        long j = pr10Var.g;
        boolean z = i2 == 1;
        boolean z2 = j == fx8Var.h().getDuration();
        boolean z3 = j > ((long) i);
        if ((z && z2) || z3) {
            if (linkedList2 == null && (musicTrack = fx8Var.l) != null && (str = musicTrack.i) != null) {
                fx8Var.k.add(str);
            }
            MusicTrack musicTrack2 = (MusicTrack) linkedList.poll();
            fx8Var.l = musicTrack2;
            if (musicTrack2 != null) {
                HlsMediaSource g2 = fx8Var.g(musicTrack2);
                if (g2 != null) {
                    fx8Var.i(g2);
                    if (linkedList2 != null) {
                        linkedList2.add(musicTrack2);
                        return;
                    }
                    return;
                }
                return;
            }
            if (linkedList2 != null) {
                fx8Var.h = false;
                MusicTrack musicTrack3 = (MusicTrack) linkedList2.poll();
                fx8Var.l = musicTrack3;
                s3q0 s3q0Var = null;
                if (musicTrack3 != null && (g = fx8Var.g(musicTrack3)) != null) {
                    fx8Var.i(g);
                    s3q0Var = s3q0.a;
                }
                if (s3q0Var != null) {
                    return;
                }
            }
            fx8Var.reset();
        }
    }

    @Override // xsna.mzc0
    public final void d(PlayerTrack playerTrack, List<PlayerTrack> list) {
        LinkedList linkedList;
        HlsMediaSource g;
        if (list.isEmpty()) {
            return;
        }
        reset();
        ConcurrentHashMap.KeySetView<String, Boolean> keySetView = this.k;
        Cache cache = this.b;
        if (cache != null) {
            LinkedHashSet d0 = j5g.d0(keySetView, cache.getKeys());
            keySetView.clear();
            keySetView.addAll(d0);
        }
        Iterator<T> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedList = this.f;
            if (!hasNext) {
                break;
            }
            MusicTrack musicTrack = ((PlayerTrack) it.next()).b;
            if (!epx.f(musicTrack.J, DownloadingState.Downloaded.b)) {
                String str = musicTrack.i;
                if (str == null) {
                    str = "";
                }
                if (!keySetView.contains(str)) {
                    linkedList.add(musicTrack);
                }
            }
        }
        MusicTrack musicTrack2 = (MusicTrack) linkedList.poll();
        this.l = musicTrack2;
        if (musicTrack2 == null || (g = g(musicTrack2)) == null) {
            return;
        }
        i(g);
        this.g.add(musicTrack2);
    }

    public final HlsMediaSource g(MusicTrack musicTrack) {
        a.b bVar;
        aw40 aw40Var = this.d;
        Cache cache = this.b;
        if (cache != null) {
            bVar = new a.b();
            bVar.a = cache;
            bVar.e = aw40Var.a(musicTrack);
        } else {
            bVar = null;
        }
        String str = musicTrack.i;
        if (bVar == null || str == null || !drm0.D(str, ".m3u8", false)) {
            return null;
        }
        HlsMediaSource.Factory factory = new HlsMediaSource.Factory(bVar);
        p9v b = aw40Var.b(musicTrack);
        fxc0.t(b, "HlsMediaSource.Factory#setPlaylistParserFactory no longer handles null by instantiating a new DefaultHlsPlaylistParserFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
        factory.e = b;
        HlsPlaylistTracker.a c = aw40Var.c(musicTrack);
        fxc0.t(c, "HlsMediaSource.Factory#setPlaylistTrackerFactory no longer handles null by defaulting to DefaultHlsPlaylistTracker.FACTORY. Explicitly pass a reference to this instance in order to retain the old behavior.");
        factory.f = c;
        kr10.b.a aVar = new kr10.b.a();
        com.google.common.collect.h hVar = com.google.common.collect.h.h;
        ImmutableList.b bVar2 = ImmutableList.c;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        List list = Collections.EMPTY_LIST;
        com.google.common.collect.g gVar2 = com.google.common.collect.g.f;
        kr10.e.a aVar2 = new kr10.e.a();
        kr10.g gVar3 = kr10.g.a;
        Uri parse = Uri.parse(str);
        return factory.d(new kr10("", new kr10.c(aVar), parse != null ? new kr10.f(parse, null, null, list, null, gVar2, C.TIME_UNSET) : null, new kr10.e(aVar2), vr10.B, gVar3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ExoPlayer h() {
        return (ExoPlayer) this.e.getValue();
    }

    public final void i(HlsMediaSource hlsMediaSource) {
        h().n();
        h().r(hlsMediaSource);
        h().prepare();
    }

    @Override // xsna.mzc0
    public final void release() {
        this.h = true;
        h().q(this.m);
        h().release();
    }

    @Override // xsna.mzc0
    public final void reset() {
        this.h = true;
        h().stop();
        h().n();
        this.f.clear();
        this.g.clear();
    }

    @Override // xsna.mzc0
    public final void e(PlayerTrack playerTrack, long j) {
    }

    @Override // xsna.mzc0
    public final void a(long j, String str, String str2) {
    }

    @Override // xsna.mzc0
    public final void b(String str, String str2, String str3) {
    }

    @Override // xsna.mzc0
    public final void c(String str, float f, long j) {
    }
}
