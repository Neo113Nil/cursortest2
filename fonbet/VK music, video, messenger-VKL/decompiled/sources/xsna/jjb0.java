package xsna;

import com.ironsource.X3;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vkontakte.android.data.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import kotlin.Pair;

/* compiled from: PodcastStatSender.kt */
/* loaded from: classes3.dex */
public final class jjb0 {
    public final MusicTrack a;
    public final ArrayList b;
    public final HashSet<Integer> c;
    public boolean d;
    public long e;
    public long f;

    /* compiled from: PodcastStatSender.kt */
    public static final class a {
        public static String a(MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            if (musicPlaybackLaunchContext.Nb(16)) {
                return "cell";
            }
            if (musicPlaybackLaunchContext.Nb(32)) {
                return "cell_button";
            }
            if (musicPlaybackLaunchContext.Nb(64)) {
                return "icon_button";
            }
            if (musicPlaybackLaunchContext.Nb(128)) {
                return "timestamp";
            }
            return null;
        }

        public static void b(String str, u2b0 u2b0Var) {
            MusicTrack b;
            MusicPlaybackLaunchContext x0;
            if (u2b0Var == null || (b = u2b0Var.b()) == null || !b.Vb() || (x0 = u2b0Var.x0()) == null) {
                return;
            }
            float l = u2b0Var.l();
            com.vk.music.player.f H = u2b0Var.H();
            b.d dVar = new b.d(str);
            dVar.b(b.Fb(), "audio_id");
            dVar.b(Integer.valueOf(H != null ? H.h() / 1000 : 0), X3.i.L);
            dVar.b(Float.valueOf(l), "play_rate");
            dVar.b(b.y, "track_code");
            e1j0.a.getClass();
            dVar.b(Boolean.valueOf(e1j0.d == 0), "is_muted");
            if (!x0.equals(MusicPlaybackLaunchContext.d) && x0.t().length() > 0) {
                dVar.b(x0.t(), "ref");
            }
            if (x0.Gb().equals("kids_section")) {
                dVar.b(x0.Gb(), "launch_origin");
            }
            dVar.b(a(x0), "source");
            dVar.e();
        }
    }

    /* compiled from: PodcastStatSender.kt */
    public static final class b {
        public long a;
        public long b;
        public final int c;

        public b(long j, long j2, int i) {
            this.a = j;
            this.b = j2;
            this.c = i;
        }
    }

    public jjb0(MusicTrack musicTrack) {
        this.a = musicTrack;
        ArrayList arrayList = new ArrayList(100);
        int i = 0;
        while (true) {
            if (i >= 100) {
                break;
            }
            int i2 = musicTrack.f;
            long j = i2 < 1800 ? 30L : (long) (i2 / 100.0f);
            int i3 = i + 1;
            long j2 = i3 * j;
            long j3 = i2;
            if (j2 >= j3) {
                arrayList.add(new b(i * j, j3, i3));
                break;
            } else {
                arrayList.add(new b(i * j, j2, i3));
                i = i3;
            }
        }
        this.b = arrayList;
        this.c = new HashSet<>();
        this.f = -1L;
    }

    public final void a(MusicPlaybackLaunchContext musicPlaybackLaunchContext, float f, com.vk.music.player.f fVar, boolean z) {
        c("podcast_play", true, musicPlaybackLaunchContext, f, pn00.k(new Pair("action", z ? "play_auto" : "play"), new Pair(X3.i.L, Integer.valueOf(fVar != null ? fVar.h() / 1000 : 0))));
    }

    public final void b(MusicPlaybackLaunchContext musicPlaybackLaunchContext, float f, com.vk.music.player.f fVar) {
        if (this.e == 0 && this.c.isEmpty()) {
            return;
        }
        c("podcast_play", true, musicPlaybackLaunchContext, f, pn00.k(new Pair("action", "heartbeat"), new Pair(X3.i.L, Integer.valueOf(fVar != null ? fVar.h() / 1000 : 0))));
    }

    public final void c(String str, boolean z, MusicPlaybackLaunchContext musicPlaybackLaunchContext, float f, Map map) {
        long j = 1000;
        long currentTimeMillis = (System.currentTimeMillis() - this.f) / j;
        if (z || Math.abs(currentTimeMillis) >= 30) {
            this.f = System.currentTimeMillis();
            b.d dVar = new b.d(str);
            dVar.b(this.a.Fb(), "audio_id");
            dVar.b(Long.valueOf(this.e / j), "duration");
            dVar.b(Float.valueOf(f), "play_rate");
            dVar.b(this.a.y, "track_code");
            e1j0.a.getClass();
            dVar.b(Boolean.valueOf(e1j0.d == 0), "is_muted");
            String k = p4g.k(this.c, StringUtils.COMMA, null);
            if (k.length() > 0) {
                dVar.b(k, "listened_parts");
            }
            if (map != null && !map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    dVar.b(entry.getValue(), (String) entry.getKey());
                }
            }
            if (!epx.f(musicPlaybackLaunchContext, MusicPlaybackLaunchContext.d) && musicPlaybackLaunchContext.t().length() > 0) {
                dVar.b(musicPlaybackLaunchContext.t(), "ref");
            }
            if (musicPlaybackLaunchContext.Gb().equals("kids_section")) {
                dVar.b(musicPlaybackLaunchContext.Gb(), "launch_origin");
            }
            dVar.b(a.a(musicPlaybackLaunchContext), "source");
            bn40.f("PODCAST", dVar);
            dVar.e();
            this.e = 0L;
            this.c.clear();
        }
    }
}
