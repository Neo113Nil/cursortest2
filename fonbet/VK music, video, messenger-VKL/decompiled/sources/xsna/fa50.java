package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: MusicTrackEvents.kt */
/* loaded from: classes.dex */
public final class fa50 extends mb50 {
    public final MusicTrack b;
    public final boolean c;
    public final String d;

    public fa50(MusicTrack musicTrack, MusicTrack musicTrack2, boolean z) {
        super(musicTrack2);
        this.b = musicTrack;
        this.c = z;
        this.d = "oldTrackId=" + musicTrack.b + " oldTrackOwnerId=" + musicTrack.c.b + ", newTrackId=" + musicTrack2.b + " newTrackOwnerId=" + musicTrack2.c.b;
    }

    @Override // xsna.mb50, xsna.yj40
    public final String a() {
        return this.d;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "MusicTrackAdded";
    }
}
