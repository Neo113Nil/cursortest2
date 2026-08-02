package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: MusicTrackEvents.kt */
/* loaded from: classes.dex */
public final class ib50 extends mb50 {
    public final MusicTrack b;
    public final String c;

    public ib50(MusicTrack musicTrack, MusicTrack musicTrack2) {
        super(musicTrack2);
        this.b = musicTrack;
        this.c = "oldTrackId=" + musicTrack.b + " oldTrackOwnerId=" + musicTrack.c.b + ", trackId=" + musicTrack2.b + " trackOwnerId=" + musicTrack2.c;
    }

    @Override // xsna.mb50, xsna.yj40
    public final String a() {
        return this.c;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "MusicTrackDownloadEvent";
    }
}
