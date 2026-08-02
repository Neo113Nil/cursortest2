package xsna;

import com.vk.dto.music.Playlist;

/* compiled from: PlaylistEvents.kt */
/* loaded from: classes3.dex */
public final class i8b0 extends a9b0 {
    public final String b;

    public i8b0(Playlist playlist) {
        super(playlist);
        this.b = "id=" + playlist.b + " ownerId=" + playlist.c.b;
    }

    @Override // xsna.a9b0, xsna.yj40
    public final String a() {
        return this.b;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "PlaylistCreated";
    }
}
