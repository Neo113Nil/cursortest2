package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: MusicTrackEvents.kt */
/* loaded from: classes3.dex */
public final class hb50 extends mb50 {
    public final MusicTrack b;
    public final boolean c;
    public final String d;

    public hb50(MusicTrack musicTrack, MusicTrack musicTrack2, boolean z) {
        super(musicTrack2);
        this.b = musicTrack;
        this.c = z;
        this.d = "oldTrackId=" + musicTrack.b + " oldTrackOwnerId=" + musicTrack.c.b + ", trackId=" + musicTrack2.b + " trackOwnerId=" + musicTrack2.c;
    }

    @Override // xsna.mb50, xsna.yj40
    public final String a() {
        return this.d;
    }

    public final boolean b() {
        return this.c;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "MusicTrackDislikedEvent";
    }
}
