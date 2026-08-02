package xsna;

import com.vk.dto.music.Artist;

/* compiled from: PersonEvents.kt */
/* loaded from: classes3.dex */
public final class uq3 implements yj40 {
    public final Artist a;
    public final boolean b;
    public final String c;

    public uq3(Artist artist, boolean z) {
        this.a = artist;
        this.b = z;
        this.c = "artistId=" + artist.b + " isFollowed=" + z;
    }

    @Override // xsna.yj40
    public final String a() {
        return this.c;
    }

    public final boolean b() {
        return this.b;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "ArtistFollowed";
    }
}
