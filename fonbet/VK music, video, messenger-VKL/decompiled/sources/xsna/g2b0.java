package xsna;

import java.util.List;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: PlayerInfo.kt */
/* loaded from: classes8.dex */
public final class g2b0 {
    public final OneVideoPlayer.State a;
    public final OneVideoPlaybackException b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final List<one.video.player.tracks.c> k;

    /* JADX WARN: Multi-variable type inference failed */
    public g2b0(OneVideoPlayer.State state, OneVideoPlaybackException oneVideoPlaybackException, boolean z, boolean z2, long j, long j2, long j3, boolean z3, boolean z4, boolean z5, List<? extends one.video.player.tracks.c> list) {
        this.a = state;
        this.b = oneVideoPlaybackException;
        this.c = z;
        this.d = z2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = list;
    }

    public static g2b0 a(g2b0 g2b0Var, OneVideoPlayer.State state, long j, long j2, long j3, boolean z, int i) {
        OneVideoPlayer.State state2 = (i & 1) != 0 ? g2b0Var.a : state;
        OneVideoPlaybackException oneVideoPlaybackException = g2b0Var.b;
        boolean z2 = g2b0Var.c;
        boolean z3 = g2b0Var.d;
        long j4 = (i & 16) != 0 ? g2b0Var.e : j;
        long j5 = (i & 32) != 0 ? g2b0Var.f : j2;
        long j6 = (i & 64) != 0 ? g2b0Var.g : j3;
        boolean z4 = g2b0Var.h;
        boolean z5 = g2b0Var.i;
        boolean z6 = (i & 512) != 0 ? g2b0Var.j : z;
        List<one.video.player.tracks.c> list = g2b0Var.k;
        g2b0Var.getClass();
        return new g2b0(state2, oneVideoPlaybackException, z2, z3, j4, j5, j6, z4, z5, z6, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2b0)) {
            return false;
        }
        g2b0 g2b0Var = (g2b0) obj;
        return this.a == g2b0Var.a && epx.f(this.b, g2b0Var.b) && this.c == g2b0Var.c && this.d == g2b0Var.d && this.e == g2b0Var.e && this.f == g2b0Var.f && this.g == g2b0Var.g && this.h == g2b0Var.h && this.i == g2b0Var.i && this.j == g2b0Var.j && epx.f(this.k, g2b0Var.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        OneVideoPlaybackException oneVideoPlaybackException = this.b;
        return this.k.hashCode() + qoy.b(qoy.b(qoy.b(bh10.a(bh10.a(bh10.a(qoy.b(qoy.b((hashCode + (oneVideoPlaybackException == null ? 0 : oneVideoPlaybackException.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerInfo(playerState=");
        sb.append(this.a);
        sb.append(", error=");
        sb.append(this.b);
        sb.append(", canPause=");
        gsi0.c(sb, this.c, ", canSeek=", this.d, ", currentPosition=");
        sb.append(this.e);
        tj0.d(sb, ", bufferedPosition=", this.f, ", duration=");
        sb.append(this.g);
        sb.append(", isLive=");
        sb.append(this.h);
        sb.append(", isStandardLiveSeekSupported=");
        sb.append(this.i);
        sb.append(", isLiveEdge=");
        sb.append(this.j);
        sb.append(", videoTracks=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
