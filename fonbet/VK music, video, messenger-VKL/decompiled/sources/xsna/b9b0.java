package xsna;

import com.vk.dto.music.Playlist;

/* compiled from: PlaylistEvents.kt */
/* loaded from: classes.dex */
public final class b9b0 extends c8b0 {
    public final Playlist b;
    public final boolean c;
    public final String d;

    public b9b0(Playlist playlist, Playlist playlist2, boolean z) {
        super(playlist2);
        this.b = playlist;
        this.c = z;
        this.d = "oldPlId=" + playlist2.b + " oldPlOwnerId=" + playlist2.c.b + ", plId=" + playlist2.b + " plOwnerId=" + playlist2.c.b + ", isFollowed=" + z;
    }

    @Override // xsna.a9b0, xsna.yj40
    public final String a() {
        return this.d;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "PlaylistFollowed";
    }
}
