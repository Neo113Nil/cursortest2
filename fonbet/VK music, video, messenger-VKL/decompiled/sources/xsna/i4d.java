package xsna;

import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class i4d implements ClipItemViewEvent {
    public final ClipsPlaylist b;

    public i4d(ClipsPlaylist clipsPlaylist) {
        this.b = clipsPlaylist;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i4d) && epx.f(this.b, ((i4d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PlaylistSingleClicked(playlist=" + this.b + ')';
    }
}
