package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: MusicPlayerDownloadEvent.kt */
/* loaded from: classes3.dex */
public final class hw40 implements iw40 {
    public final MusicTrack a;

    public hw40(MusicTrack musicTrack) {
        this.a = musicTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hw40) && epx.f(this.a, ((hw40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return rq.c(new StringBuilder("Music(track="), this.a, ')');
    }
}
