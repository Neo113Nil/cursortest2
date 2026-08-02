package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.player.playback.PlaybackLaunchMeta;

/* compiled from: MusicListeningTimeAnalyticsCollectorEvent.kt */
/* loaded from: classes3.dex */
public final class xm40 implements ykk {
    public final boolean a;
    public final long b;
    public final MusicTrack c;
    public final long d;
    public final long e;
    public final PlaybackLaunchMeta f;
    public final String g;

    public xm40(long j, long j2, long j3, MusicTrack musicTrack, PlaybackLaunchMeta playbackLaunchMeta, boolean z) {
        this.a = z;
        this.b = j;
        this.c = musicTrack;
        this.d = j2;
        this.e = j3;
        this.f = playbackLaunchMeta;
        this.g = musicTrack.Fb();
    }

    @Override // xsna.ykk
    public final xm40 a(ykk ykkVar) {
        if (!(ykkVar instanceof xm40)) {
            return this;
        }
        boolean z = this.a || ((xm40) ykkVar).a;
        xm40 xm40Var = (xm40) ykkVar;
        return new xm40(((my1) jw5.v(new my1(this.b), new my1(xm40Var.b))).b, xm40Var.d + this.d, this.e, this.c, this.f, z);
    }

    @Override // xsna.ax1
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xm40) {
            xm40 xm40Var = (xm40) obj;
            if (this.a == xm40Var.a && this.b == xm40Var.b && epx.f(this.c, xm40Var.c) && this.d == xm40Var.d && this.e == xm40Var.e && epx.f(this.f, xm40Var.f)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.ax1
    public final String getId() {
        return this.g;
    }

    public final int hashCode() {
        return this.f.hashCode() + bh10.a(bh10.a((this.c.hashCode() + bh10.a(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    @Override // xsna.ax1
    public final boolean isFinal() {
        return this.a;
    }

    public final String toString() {
        return "MusicListeningTimeAnalyticsCollectorEvent(isFinal=" + this.a + ", timestamp=" + ((Object) my1.b(this.b)) + ", playable=" + this.c + ", listeningTimeMs=" + this.d + ", streamDurationMs=" + this.e + ", playbackLaunchMeta=" + this.f + ')';
    }
}
