package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.player.playback.PlaybackLaunchMeta;

/* compiled from: ListeningTimeEntity.kt */
/* loaded from: classes3.dex */
public final class lhz {
    public final long a;
    public final MusicTrack b;
    public final long c;
    public final long d;
    public final boolean e;
    public final PlaybackLaunchMeta f;

    public lhz(long j, long j2, long j3, MusicTrack musicTrack, PlaybackLaunchMeta playbackLaunchMeta, boolean z) {
        this.a = j;
        this.b = musicTrack;
        this.c = j2;
        this.d = j3;
        this.e = z;
        this.f = playbackLaunchMeta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhz)) {
            return false;
        }
        lhz lhzVar = (lhz) obj;
        return this.a == lhzVar.a && epx.f(this.b, lhzVar.b) && this.c == lhzVar.c && this.d == lhzVar.d && this.e == lhzVar.e && epx.f(this.f, lhzVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + qoy.b(bh10.a(bh10.a((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "ListeningTimeEntity(timestampMs=" + this.a + ", playable=" + this.b + ", listeningTimeMs=" + this.c + ", streamDurationMs=" + this.d + ", isFinal=" + this.e + ", playbackLaunchMeta=" + this.f + ')';
    }
}
