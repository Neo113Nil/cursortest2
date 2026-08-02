package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: MusicTrackEvents.kt */
/* loaded from: classes3.dex */
public final class gb50 extends mb50 {
    public final MusicTrack b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public gb50(MusicTrack musicTrack, boolean z, boolean z2) {
        super(musicTrack);
        this.b = musicTrack;
        this.c = z;
        this.d = z2;
        this.e = "oldTrackId=" + musicTrack.b + " oldTrackOwnerId=" + musicTrack.c.b + ", addedToMyMusic=" + z;
    }

    @Override // xsna.mb50, xsna.yj40
    public final String a() {
        return this.e;
    }

    public final boolean b() {
        return this.d;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "MusicTrackDislikeCanceledEvent";
    }
}
