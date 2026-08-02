package xsna;

import com.vk.dto.music.Playlist;

/* compiled from: PlaylistEvents.kt */
/* loaded from: classes3.dex */
public final class fi40 implements yj40 {
    public final Playlist a;
    public final boolean b;
    public final String c;

    public fi40(Playlist playlist, boolean z) {
        this.a = playlist;
        this.b = z;
        this.c = "playlist removed from downloads " + playlist;
    }

    @Override // xsna.yj40
    public final String a() {
        return this.c;
    }

    public final Playlist b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "MusicDownloadedPlaylistRemovedEvent";
    }
}
