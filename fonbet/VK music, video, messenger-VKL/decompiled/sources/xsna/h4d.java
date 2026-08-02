package xsna;

import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import java.util.List;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class h4d implements ClipItemViewEvent {
    public final List<ClipsPlaylist> b;

    public h4d(List<ClipsPlaylist> list) {
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h4d) && epx.f(this.b, ((h4d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("PlaylistManyClicked(playlists="), this.b);
    }
}
