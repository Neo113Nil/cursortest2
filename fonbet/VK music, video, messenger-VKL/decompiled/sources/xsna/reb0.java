package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import java.util.List;

/* compiled from: PlaylistEvents.kt */
/* loaded from: classes3.dex */
public final class reb0 extends c8b0 {
    public final List<MusicTrack> b;
    public final String c;

    public reb0(Playlist playlist, List<MusicTrack> list) {
        super(playlist);
        this.b = list;
        this.c = "id=" + playlist.b + " ownerId=" + playlist.c.b + ", tracksSize=" + list.size();
    }

    @Override // xsna.a9b0, xsna.yj40
    public final String a() {
        return this.c;
    }

    public final List<MusicTrack> b() {
        return this.b;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "PlaylistTracksAttached";
    }
}
