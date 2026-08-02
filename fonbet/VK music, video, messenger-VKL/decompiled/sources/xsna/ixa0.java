package xsna;

import com.vk.music.player.PlayerTrack;
import java.util.List;
import java.util.Map;

/* compiled from: PlaybackQueueCache.kt */
/* loaded from: classes3.dex */
public final class ixa0 {
    public final com.vk.music.player.playback.e a;
    public final PlayerTrack b;
    public final List<gza0> c;
    public final List<gza0> d;
    public final Map<String, xd50> e;

    public ixa0(com.vk.music.player.playback.e eVar, PlayerTrack playerTrack, List<gza0> list, List<gza0> list2, Map<String, xd50> map) {
        this.a = eVar;
        this.b = playerTrack;
        this.c = list;
        this.d = list2;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixa0)) {
            return false;
        }
        ixa0 ixa0Var = (ixa0) obj;
        return epx.f(this.a, ixa0Var.a) && epx.f(this.b, ixa0Var.b) && epx.f(this.c, ixa0Var.c) && epx.f(this.d, ixa0Var.d) && epx.f(this.e, ixa0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        PlayerTrack playerTrack = this.b;
        return this.e.hashCode() + fw3.a(fw3.a((hashCode + (playerTrack == null ? 0 : playerTrack.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackQueueCache(playSourceMeta=");
        sb.append(this.a);
        sb.append(", currentTrack=");
        sb.append(this.b);
        sb.append(", originalTracksOrder=");
        sb.append(this.c);
        sb.append(", actualTracksOrder=");
        sb.append(this.d);
        sb.append(", tracksCache=");
        return cjl0.a(sb, this.e, ')');
    }
}
