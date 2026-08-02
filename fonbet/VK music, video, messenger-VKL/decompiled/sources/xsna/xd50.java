package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.player.playback.PlaybackLaunchMeta;

/* compiled from: MusicTrackQueueInfo.kt */
/* loaded from: classes3.dex */
public final class xd50 {
    public final MusicTrack a;
    public final PlaybackLaunchMeta b;

    public xd50(MusicTrack musicTrack, PlaybackLaunchMeta playbackLaunchMeta) {
        this.a = musicTrack;
        this.b = playbackLaunchMeta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd50)) {
            return false;
        }
        xd50 xd50Var = (xd50) obj;
        return epx.f(this.a, xd50Var.a) && epx.f(this.b, xd50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MusicTrackQueueInfo(musicTrack=" + this.a + ", launchMeta=" + this.b + ')';
    }
}
