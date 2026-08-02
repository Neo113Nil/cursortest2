package xsna;

import com.vk.dto.music.MusicTrack;
import java.util.List;

/* compiled from: MusicTrackEvents.kt */
/* loaded from: classes.dex */
public final class yd50 extends mb50 {
    public final List<String> b;
    public final MusicTrack c;
    public final boolean d;
    public final String e;

    public yd50(List<String> list, MusicTrack musicTrack, MusicTrack musicTrack2, boolean z) {
        super(musicTrack2);
        this.b = list;
        this.c = musicTrack;
        this.d = z;
        this.e = "oldTrackId=" + musicTrack.b + " oldTrackOwnerId=" + musicTrack.c.b + ", newTrackId=" + musicTrack2.b + " newTrackOwnerId=" + musicTrack2.c.b;
    }

    @Override // xsna.mb50, xsna.yj40
    public final String a() {
        return this.e;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "MusicTrackRemoved";
    }
}
