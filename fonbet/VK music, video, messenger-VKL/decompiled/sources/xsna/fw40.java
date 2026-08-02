package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: MusicPlayerDownloadEvent.kt */
/* loaded from: classes3.dex */
public final class fw40 implements iw40 {
    public final MusicTrack a;

    public fw40(MusicTrack musicTrack) {
        this.a = musicTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fw40) && epx.f(this.a, ((fw40) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Music(track=" + this.a + ", skipConfirm=true)";
    }
}
