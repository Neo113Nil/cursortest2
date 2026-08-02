package xsna;

import com.vk.dto.music.Playlist;

/* compiled from: PlaylistEvents.kt */
/* loaded from: classes3.dex */
public final class u8b0 extends c8b0 {
    public final String b;

    public u8b0(Playlist playlist) {
        super(playlist);
        this.b = "id=" + playlist.b + " ownerId=" + playlist.c.b;
    }

    @Override // xsna.a9b0, xsna.yj40
    public final String a() {
        return this.b;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "PlaylistEditSaved";
    }
}
