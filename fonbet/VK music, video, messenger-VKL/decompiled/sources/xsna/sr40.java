package xsna;

import com.vk.dto.music.Playlist;

/* compiled from: MusicPickerAction.kt */
/* loaded from: classes4.dex */
public final class sr40 implements lr40 {
    public final Playlist b;

    public sr40(Playlist playlist) {
        this.b = playlist;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sr40) && epx.f(this.b, ((sr40) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OpenPlaylist(playlist=" + this.b + ')';
    }
}
