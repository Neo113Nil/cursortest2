package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;

/* compiled from: PlaylistEvents.kt */
/* loaded from: classes3.dex */
public final class qeb0 extends c8b0 {
    public final MusicTrack b;
    public final String c;

    public qeb0(MusicTrack musicTrack, Playlist playlist) {
        super(playlist);
        this.b = musicTrack;
        this.c = "trackId=" + musicTrack.b + ", playlistId=" + playlist.b + " playlistOwnerId=" + playlist.c.b;
    }

    @Override // xsna.a9b0, xsna.yj40
    public final String a() {
        return this.c;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "PlaylistTrackRemoved";
    }
}
