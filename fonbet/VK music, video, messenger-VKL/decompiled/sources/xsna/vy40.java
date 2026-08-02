package xsna;

import android.os.Bundle;
import com.vk.api.generated.audio.dto.AudioStreamDto;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PauseReason;
import com.vk.music.player.PlayState;
import com.vk.music.player.ResumeReason;
import com.vk.music.stats.params.MusicTrackStreamingType;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioListeningItem;
import java.util.concurrent.TimeUnit;
import xsna.k840;

/* compiled from: MusicPlayerStats.kt */
/* loaded from: classes3.dex */
public final class vy40 implements w8i {
    public final pw5 b;
    public final u750 c;
    public a d;
    public a e;
    public final fv40 f;
    public boolean g;
    public long h;
    public long i;
    public long j;

    /* compiled from: MusicPlayerStats.kt */
    public static final class a {
        public String a;
        public MusicTrack b;
        public int c;
        public LoopMode d;
        public boolean e;
        public long f;
        public long g;
        public int h;
        public PlayState i;
        public String j;
        public String k;
        public MusicPlaybackLaunchContext l;
        public boolean m;
        public float n;
        public float o;
        public String p;
        public boolean q;
        public boolean r;
        public String s;
        public String t;

        public a() {
            this(0);
        }

        public static a a(a aVar) {
            String str = aVar.a;
            MusicTrack musicTrack = aVar.b;
            int i = aVar.c;
            LoopMode loopMode = aVar.d;
            boolean z = aVar.e;
            long j = aVar.f;
            long j2 = aVar.g;
            int i2 = aVar.h;
            PlayState playState = aVar.i;
            String str2 = aVar.j;
            String str3 = aVar.k;
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = aVar.l;
            boolean z2 = aVar.m;
            float f = aVar.n;
            float f2 = aVar.o;
            String str4 = aVar.p;
            boolean z3 = aVar.q;
            boolean z4 = aVar.r;
            String str5 = aVar.s;
            String str6 = aVar.t;
            aVar.getClass();
            return new a(str, musicTrack, i, loopMode, z, j, j2, i2, playState, str2, str3, musicPlaybackLaunchContext, z2, f, f2, str4, z3, z4, str5, str6);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k) && epx.f(this.l, aVar.l) && this.m == aVar.m && Float.compare(this.n, aVar.n) == 0 && Float.compare(this.o, aVar.o) == 0 && epx.f(this.p, aVar.p) && this.q == aVar.q && this.r == aVar.r && epx.f(this.s, aVar.s) && epx.f(this.t, aVar.t);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            MusicTrack musicTrack = this.b;
            int a = urd0.a((this.i.hashCode() + shy.a(this.h, bh10.a(bh10.a(qoy.b((this.d.hashCode() + shy.a(this.c, (hashCode + (musicTrack == null ? 0 : musicTrack.hashCode())) * 31, 31)) * 31, 31, this.e), 31, this.f), 31, this.g), 31)) * 31, 31, this.j);
            String str2 = this.k;
            int a2 = io.reactivex.rxjava3.subjects.b.a(this.o, io.reactivex.rxjava3.subjects.b.a(this.n, qoy.b((this.l.b.hashCode() + ((a + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.m), 31), 31);
            String str3 = this.p;
            int b = qoy.b(qoy.b((a2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.q), 31, this.r);
            String str4 = this.s;
            int hashCode2 = (b + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.t;
            return hashCode2 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayerSnapshot(playerUId=");
            sb.append(this.a);
            sb.append(", musicTrack=");
            sb.append(this.b);
            sb.append(", audioId=");
            sb.append(this.c);
            sb.append(", loopMode=");
            sb.append(this.d);
            sb.append(", isShuffled=");
            sb.append(this.e);
            sb.append(", playbackPosition=");
            sb.append(this.f);
            sb.append(", duration=");
            sb.append(this.g);
            sb.append(", seekFromPosition=");
            sb.append(this.h);
            sb.append(", state=");
            sb.append(this.i);
            sb.append(", eventReason=");
            sb.append(this.j);
            sb.append(", eventPayload=");
            sb.append(this.k);
            sb.append(", refer=");
            sb.append(this.l);
            sb.append(", networkConnected=");
            sb.append(this.m);
            sb.append(", volume=");
            sb.append(this.n);
            sb.append(", speed=");
            sb.append(this.o);
            sb.append(", chapterId=");
            sb.append(this.p);
            sb.append(", crossfade=");
            sb.append(this.q);
            sb.append(", loudnessNormalization=");
            sb.append(this.r);
            sb.append(", streamingUrlType=");
            sb.append(this.s);
            sb.append(", urlDomain=");
            return ho8.a(sb, this.t, ')');
        }

        public a(String str, MusicTrack musicTrack, int i, LoopMode loopMode, boolean z, long j, long j2, int i2, PlayState playState, String str2, String str3, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z2, float f, float f2, String str4, boolean z3, boolean z4, String str5, String str6) {
            this.a = str;
            this.b = musicTrack;
            this.c = i;
            this.d = loopMode;
            this.e = z;
            this.f = j;
            this.g = j2;
            this.h = i2;
            this.i = playState;
            this.j = str2;
            this.k = str3;
            this.l = musicPlaybackLaunchContext;
            this.m = z2;
            this.n = f;
            this.o = f2;
            this.p = str4;
            this.q = z3;
            this.r = z4;
            this.s = str5;
            this.t = str6;
        }

        public /* synthetic */ a(int i) {
            this(null, null, 0, LoopMode.NONE, false, 0L, 0L, 0, PlayState.IDLE, "none", null, MusicPlaybackLaunchContext.d, false, 1.0f, 1.0f, null, false, false, "", "");
        }
    }

    public vy40(pw5 pw5Var, u750 u750Var) {
        this.b = pw5Var;
        this.c = u750Var;
        fv40 fv40Var = new fv40();
        fv40Var.c = MusicPlaybackLaunchContext.d;
        fv40Var.d = LoopMode.NONE;
        fv40Var.l = MusicTrackStreamingType.NONE;
        fv40Var.q = "";
        this.f = fv40Var;
    }

    public static CommonAudioStat$TypeAudioListeningItem.StreamingUrlType a(String str) {
        return epx.f(str, AudioStreamDto.TypeDto.DASH.j()) ? CommonAudioStat$TypeAudioListeningItem.StreamingUrlType.DASH : epx.f(str, AudioStreamDto.TypeDto.HLS_RANGE.j()) ? CommonAudioStat$TypeAudioListeningItem.StreamingUrlType.HLS_RANGE : epx.f(str, AudioStreamDto.TypeDto.HLS_TS.j()) ? CommonAudioStat$TypeAudioListeningItem.StreamingUrlType.HLS_TS : epx.f(str, AudioStreamDto.TypeDto.HLS.j()) ? CommonAudioStat$TypeAudioListeningItem.StreamingUrlType.HLS : epx.f(str, AudioStreamDto.TypeDto.MP3.j()) ? CommonAudioStat$TypeAudioListeningItem.StreamingUrlType.MP3 : CommonAudioStat$TypeAudioListeningItem.StreamingUrlType.MUSIC_SOURCE_MP3;
    }

    public static float b(long j) {
        return j / 1000;
    }

    public final void c(long j, a aVar) {
        MusicTrack musicTrack = aVar.b;
        if (musicTrack == null || musicTrack.Vb()) {
            return;
        }
        if (this.g) {
            this.g = false;
            this.i = j;
        }
        this.h = (j - this.i) + this.h;
        this.i = j;
        this.c.onProgress(j);
    }

    public final void d(a aVar) {
        String Fb;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext;
        MusicTrack musicTrack;
        u750 u750Var = this.c;
        fv40 fv40Var = this.f;
        a aVar2 = this.d;
        String str = null;
        MusicTrack musicTrack2 = aVar2 != null ? aVar2.b : null;
        if (aVar2 == null || musicTrack2 == null || musicTrack2.Vb()) {
            u750Var.J(null);
            return;
        }
        Bundle bundle = musicTrack2.v;
        if (bundle == null || (Fb = bundle.getString("contentId")) == null) {
            Fb = musicTrack2.Fb();
        }
        fv40Var.a = Fb;
        fv40Var.g = musicTrack2.y;
        fv40Var.d = aVar.d;
        fv40Var.i = aVar.j;
        fv40Var.h = b(aVar.f);
        fv40Var.e = b(this.h);
        c63 c63Var = c63.a;
        fv40Var.b = !c63.f;
        fv40Var.c = aVar2.l;
        fv40Var.f = this.j;
        a aVar3 = this.d;
        fv40Var.j = (aVar3 == null || (musicTrack = aVar3.b) == null) ? null : musicTrack.Fb();
        a aVar4 = this.d;
        if (aVar4 != null && (musicPlaybackLaunchContext = aVar4.l) != null) {
            str = musicPlaybackLaunchContext.Kb();
        }
        fv40Var.k = str;
        u750Var.J(fv40Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x011c, code lost:
    
        if (com.vk.music.player.PlayState.IDLE != r9) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(a aVar, ResumeReason resumeReason) {
        String Fb;
        int i;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext;
        MusicTrack musicTrack;
        MusicTrack musicTrack2;
        fv40 fv40Var = this.f;
        u750 u750Var = this.c;
        MusicTrack musicTrack3 = aVar.b;
        if (musicTrack3 == null || musicTrack3.Vb() || musicTrack3.Mb()) {
            return;
        }
        this.e = a.a(aVar);
        String Fb2 = musicTrack3.Fb();
        a aVar2 = this.d;
        String str = null;
        Number valueOf = !epx.f(Fb2, (aVar2 == null || (musicTrack2 = aVar2.b) == null) ? null : musicTrack2.Fb()) ? 0 : Float.valueOf(b(aVar.f));
        this.j = (long) b(System.currentTimeMillis());
        Bundle bundle = musicTrack3.v;
        if (bundle == null || (Fb = bundle.getString("contentId")) == null) {
            Fb = musicTrack3.Fb();
        }
        fv40Var.a = Fb;
        fv40Var.g = musicTrack3.y;
        fv40Var.d = aVar.d;
        c63 c63Var = c63.a;
        fv40Var.b = !c63.f;
        fv40Var.c = aVar.l;
        fv40Var.h = valueOf.floatValue();
        fv40Var.i = aVar.j;
        if (resumeReason != null) {
            resumeReason.name();
        }
        fv40Var.f = this.j;
        fv40Var.l = k840.a.f().d().a(musicTrack3) ? aVar.m ? MusicTrackStreamingType.ONLINE_CACHE : MusicTrackStreamingType.OFFLINE : MusicTrackStreamingType.ONLINE;
        fv40Var.m = TimeUnit.MILLISECONDS.toMicros(qni0.a());
        if (!"continue".equals(fv40Var.i)) {
            a aVar3 = this.d;
            fv40Var.j = (aVar3 == null || (musicTrack = aVar3.b) == null) ? null : musicTrack.Fb();
            a aVar4 = this.d;
            if (aVar4 != null && (musicPlaybackLaunchContext = aVar4.l) != null) {
                str = musicPlaybackLaunchContext.Kb();
            }
            fv40Var.k = str;
        }
        fv40Var.n = aVar.q;
        fv40Var.o = aVar.r;
        fv40Var.p = a(aVar.s);
        String str2 = aVar.t;
        if (str2 != null) {
            String host = jeq0.g(str2).getHost();
            if (host == null) {
                host = "";
            }
            fv40Var.q = host;
        }
        if (musicTrack3.Wb() && (i = musicTrack3.b) > 0) {
            u750Var.y(i, musicTrack3.y);
            return;
        }
        u750Var.O(fv40Var);
        a aVar5 = this.d;
        if (aVar5 != null) {
            PlayState playState = PlayState.STOPPED;
            PlayState playState2 = aVar5.i;
            if (playState != playState2) {
            }
        }
        u750Var.i(false);
        try {
            u750Var.n0(this.b.a());
        } catch (Exception e) {
            bn40.c(e, new Object[0]);
        }
    }

    public final void f(a aVar, PauseReason pauseReason) {
        MusicTrack musicTrack;
        String Fb;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext;
        MusicTrack musicTrack2;
        u750 u750Var = this.c;
        fv40 fv40Var = this.f;
        a aVar2 = this.e;
        if (aVar2 == null || (musicTrack = aVar2.b) == null || musicTrack.Vb() || musicTrack.Mb()) {
            return;
        }
        Bundle bundle = musicTrack.v;
        if (bundle == null || (Fb = bundle.getString("contentId")) == null) {
            Fb = musicTrack.Fb();
        }
        fv40Var.a = Fb;
        fv40Var.g = musicTrack.y;
        fv40Var.d = aVar.d;
        fv40Var.i = aVar.j;
        if (pauseReason != null) {
            pauseReason.name();
        }
        fv40Var.h = b(aVar.f);
        fv40Var.e = aVar.q ? b(this.h + 4100) : b(this.h);
        c63 c63Var = c63.a;
        fv40Var.b = !c63.f;
        fv40Var.l = k840.a.f().d().a(musicTrack) ? aVar2.m ? MusicTrackStreamingType.ONLINE_CACHE : MusicTrackStreamingType.OFFLINE : MusicTrackStreamingType.ONLINE;
        fv40Var.c = aVar2.l;
        fv40Var.f = this.j;
        fv40Var.m = TimeUnit.MILLISECONDS.toMicros(qni0.a());
        if (!"pause".equals(fv40Var.i)) {
            a aVar3 = this.d;
            fv40Var.j = (aVar3 == null || (musicTrack2 = aVar3.b) == null) ? null : musicTrack2.Fb();
            a aVar4 = this.d;
            fv40Var.k = (aVar4 == null || (musicPlaybackLaunchContext = aVar4.l) == null) ? null : musicPlaybackLaunchContext.Kb();
        }
        fv40Var.n = aVar.q;
        fv40Var.o = aVar.r;
        fv40Var.p = a(aVar.s);
        String str = aVar.t;
        if (str != null) {
            String host = jeq0.g(str).getHost();
            if (host == null) {
                host = "";
            }
            fv40Var.q = host;
        }
        if (musicTrack.Wb()) {
            if (musicTrack.b <= 0 || epx.f(aVar.j, "stop")) {
                return;
            }
            u750Var.g(musicTrack.b, (int) b(this.h), musicTrack.y);
            return;
        }
        u750Var.i0(fv40Var);
        this.d = a.a(aVar2);
        this.e = null;
        this.h = 0L;
        this.i = 0L;
    }
}
