package xsna;

/* compiled from: PlaylistEvents.kt */
/* loaded from: classes3.dex */
public final class bb50 implements yj40 {
    public final String a;
    public final String b;

    public bb50(String str) {
        this.a = str;
        this.b = go9.b("playlistPid=", str);
    }

    @Override // xsna.yj40
    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    @Override // xsna.yj40
    public final String getTag() {
        return "MusicTrackCurrentPlayingPlaylistUpdated";
    }
}
