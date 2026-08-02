package xsna;

import com.vk.dto.music.Playlist;

/* compiled from: PlaylistEvents.kt */
/* loaded from: classes.dex */
public final class n8b0 extends c8b0 {
    public final Playlist b;
    public final String c;

    public n8b0(Playlist playlist, Playlist playlist2) {
        super(playlist2);
        this.b = playlist;
        this.c = "oldPlId=" + playlist.b + " oldPlOwnerId=" + playlist.c.b + ", plId=" + playlist2.b + " plOwnerId=" + playlist2.c.b;
    }

    @Override // xsna.a9b0, xsna.yj40
    public final String a() {
        return this.c;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "PlaylistDownloadEvent";
    }
}
