package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: MusicPickerPatch.kt */
/* loaded from: classes4.dex */
public final class ku40 implements fu40 {
    public final MusicTrack b;

    public ku40(MusicTrack musicTrack) {
        this.b = musicTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ku40) && epx.f(this.b, ((ku40) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return rq.c(new StringBuilder("ToggleSelectionTrack(musicTrack="), this.b, ')');
    }
}
