package xsna;

import android.net.Uri;
import android.os.SystemClock;
import com.vk.core.utils.newtork.NetworkType;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.api.helper.AudioPlayer;
import com.vk.music.player.api.helper.dto.AudioDiscontinuityReason;
import com.vk.music.player.api.helper.dto.AudioPlaybackError;
import com.vk.stat.scheme.CommonAudioStat$TypeNetworkAudioStallItem;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import xsna.cru0;
import xsna.e260;

/* compiled from: ExoAudioListener.kt */
/* loaded from: classes7.dex */
public final class k5q implements ks4, rs4 {
    public volatile MusicTrack a;
    public volatile long b;
    public volatile long c;
    public volatile boolean d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile am4 g;
    public volatile a h;
    public final ConcurrentHashMap<Uri, am4> i = new ConcurrentHashMap<>();

    /* compiled from: ExoAudioListener.kt */
    public static final class a {
        public final or10 a;
        public final Uri b;

        public a(or10 or10Var, Uri uri) {
            this.a = or10Var;
            this.b = uri;
        }
    }

    /* compiled from: ExoAudioListener.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioPlayer.State.values().length];
            try {
                iArr[AudioPlayer.State.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioPlayer.State.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioPlayer.State.BUFFERING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioPlayer.State.IDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AudioPlayer.State.ENDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void m(gzs gzsVar) {
        asu0.a.getClass();
        asu0.x().execute(new sx3(gzsVar, 5));
    }

    @Override // xsna.ks4
    public final void b(soz sozVar, or10 or10Var, IOException iOException) {
        m(new j5q(this, sozVar, or10Var, 0));
    }

    @Override // xsna.ks4
    public final void d(soz sozVar, or10 or10Var) {
        this.h = new a(or10Var, sozVar.a);
        m(new hn9(11, this, sozVar));
    }

    @Override // xsna.rs4
    public final void e(AudioPlayer.State state) {
        m(new com.vk.voip.a(10, this, state));
    }

    @Override // xsna.ks4
    public final void f(soz sozVar, or10 or10Var) {
        m(new ax5(this, sozVar, or10Var, 3));
    }

    @Override // xsna.rs4
    public final void g(AudioDiscontinuityReason audioDiscontinuityReason) {
        if (audioDiscontinuityReason == AudioDiscontinuityReason.SEEK) {
            this.e = true;
        }
    }

    @Override // xsna.ks4
    public final void h(soz sozVar, or10 or10Var) {
        l();
        m(new fpb(this, sozVar, or10Var, 1));
    }

    public final void i() {
        this.i.clear();
        this.g = null;
        this.b = 0L;
        this.c = 0L;
        this.d = false;
        this.e = false;
        this.f = false;
    }

    public final void j(soz sozVar, or10 or10Var, String str) {
        if (drm0.D(sozVar.a.toString(), ".ts", false) && this.i.get(sozVar.a) != null) {
            if (this.g != null) {
                if (this.c > 0) {
                    if (!this.f) {
                        k();
                    }
                    this.i.remove(sozVar.a);
                    return;
                }
                return;
            }
            am4 remove = this.i.remove(sozVar.a);
            if (remove != null) {
                long j = or10Var.a;
                remove.g = j;
                remove.h = or10Var.b - j;
                remove.f = sozVar.b;
                remove.d = str;
                n(remove);
            }
        }
    }

    public final void k() {
        am4 am4Var = this.g;
        if (am4Var != null) {
            am4Var.i = this.c;
            am4Var.d = "fragment_stalled";
            n(am4Var);
            MusicTrack musicTrack = this.a;
            if (musicTrack != null && musicTrack.b == am4Var.a) {
                this.b = 0L;
                this.c = 0L;
            }
            this.g = null;
        }
    }

    public final void l() {
        MusicTrack musicTrack = this.a;
        a aVar = this.h;
        if (musicTrack == null || aVar == null) {
            return;
        }
        if (this.b > 0 || this.c > 0) {
            if (this.g == null) {
                am4 am4Var = new am4(musicTrack.b, musicTrack.c, aVar.b.toString());
                am4Var.g = aVar.a.a;
                this.g = am4Var;
            }
            long j = this.c;
            long j2 = this.b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = j2 > elapsedRealtime ? elapsedRealtime : j2;
            if (j2 < elapsedRealtime) {
                j2 = elapsedRealtime;
            }
            this.c = j + ((j3 > 0 || j2 > 0) ? (j3 <= 0 || j2 <= 0) ? -1L : j2 - j3 : 0L);
            k();
            this.i.remove(aVar.b);
        }
    }

    public final void n(am4 am4Var) {
        ConcurrentHashMap concurrentHashMap;
        MusicTrack musicTrack;
        MusicTrack musicTrack2 = this.a;
        if (musicTrack2 == null || musicTrack2.b != am4Var.a) {
            return;
        }
        MusicTrack musicTrack3 = this.a;
        if (musicTrack3 == null || musicTrack3.Tb() || (musicTrack = this.a) == null || musicTrack.Vb()) {
            if (!am4Var.d.equals("fragment_stalled")) {
                bpn0 bpn0Var = e260.e;
                e260 a2 = e260.a.a();
                a2.getClass();
                Object obj = cru0.j;
                if (cru0.a.b()) {
                    e260.b bVar = a2.b.get(am4Var.c);
                    if (bVar != null && (concurrentHashMap = bVar.a) != null) {
                    }
                    a2.c(am4Var);
                    return;
                }
                return;
            }
            ((ay4) ay4.a.getValue()).getClass();
            long j = am4Var.b.b;
            long j2 = am4Var.a;
            long j3 = am4Var.g;
            Integer valueOf = Integer.valueOf((int) am4Var.i);
            NetworkType.a aVar = NetworkType.Companion;
            Set<Integer> set = com.vk.core.utils.newtork.b.c().b;
            aVar.getClass();
            CommonAudioStat$TypeNetworkAudioStallItem commonAudioStat$TypeNetworkAudioStallItem = new CommonAudioStat$TypeNetworkAudioStallItem(j, j2, j3, valueOf, Boolean.valueOf(NetworkType.VPN.n(set)), jeq0.g(am4Var.c).getHost(), x260.d(com.vk.core.utils.newtork.b.c()), x260.a(com.vk.core.utils.newtork.b.c()));
            kx6 kx6Var = new kx6();
            kx6Var.f = commonAudioStat$TypeNetworkAudioStallItem;
            kx6Var.q();
        }
    }

    @Override // xsna.rs4
    public final void a(int i) {
    }

    @Override // xsna.rs4
    public final void c(AudioPlaybackError audioPlaybackError) {
    }

    @Override // xsna.rs4
    public final void onIsLoadingChanged(boolean z) {
    }

    @Override // xsna.rs4
    public final void onIsPlayingChanged(boolean z) {
    }
}
