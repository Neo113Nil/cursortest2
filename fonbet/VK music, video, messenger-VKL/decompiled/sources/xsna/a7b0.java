package xsna;

import com.vk.dto.music.Playlist;

/* compiled from: PlaylistEvents.kt */
/* loaded from: classes3.dex */
public final class a7b0 implements yj40 {
    public final String a;

    public a7b0(Playlist playlist) {
        this.a = "playlist added to play next " + playlist;
    }

    @Override // xsna.yj40
    public final String a() {
        return this.a;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "PlaylistAddedToPlayNextEvent";
    }
}
