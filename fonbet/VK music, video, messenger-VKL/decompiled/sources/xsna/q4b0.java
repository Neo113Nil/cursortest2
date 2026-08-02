package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.player.playback.PlayableType;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PlayerStatePlayableMeta.kt */
/* loaded from: classes3.dex */
public final class q4b0 {
    public static final Object g = msy.a(LazyThreadSafetyMode.NONE, new nh0(28));
    public final MusicTrack a;
    public final PlayableType b;
    public final boolean c;
    public final long d;
    public final r4b0 e;
    public final int f;

    public q4b0(MusicTrack musicTrack, PlayableType playableType, boolean z, long j, r4b0 r4b0Var) {
        this.a = musicTrack;
        this.b = playableType;
        this.c = z;
        this.d = j;
        this.e = r4b0Var;
        this.f = an10.b(j / 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4b0)) {
            return false;
        }
        q4b0 q4b0Var = (q4b0) obj;
        return epx.f(this.a, q4b0Var.a) && this.b == q4b0Var.b && this.c == q4b0Var.c && this.d == q4b0Var.d && epx.f(this.e, q4b0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + bh10.a(qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "PlayerStatePlayableMeta(playable=" + this.a + ", playableType=" + this.b + ", isPlayableInCache=" + this.c + ", streamDurationMs=" + this.d + ", navMeta=" + this.e + ')';
    }
}
