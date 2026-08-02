package xsna;

import com.vk.dto.music.MusicTrack;

/* compiled from: MusicPickerAction.kt */
/* loaded from: classes4.dex */
public final class yr40 implements lr40 {
    public final MusicTrack b;

    public yr40(MusicTrack musicTrack) {
        this.b = musicTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yr40) && epx.f(this.b, ((yr40) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return rq.c(new StringBuilder("TriggerPlay(track="), this.b, ')');
    }
}
