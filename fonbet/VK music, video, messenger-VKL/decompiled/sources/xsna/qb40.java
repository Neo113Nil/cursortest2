package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.StartPlayPlaylistSource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayUserSource;

/* compiled from: MusicBigPlayerFeature.kt */
@ozl
/* loaded from: classes3.dex */
public final class qb40 {
    public final u2b0 a;
    public final com.vk.music.track.a b;
    public final boolean c;
    public final tb40 d;
    public final ny40 e;
    public final u750 f;
    public final io.reactivex.rxjava3.disposables.g g = new io.reactivex.rxjava3.disposables.g();
    public final io.reactivex.rxjava3.disposables.g h = new io.reactivex.rxjava3.disposables.g();
    public final io.reactivex.rxjava3.disposables.g i = new io.reactivex.rxjava3.disposables.g();
    public final pb40 j = new pb40(this);

    public qb40(u2b0 u2b0Var, com.vk.music.track.a aVar, boolean z, tb40 tb40Var, ny40 ny40Var, u750 u750Var) {
        this.a = u2b0Var;
        this.b = aVar;
        this.c = z;
        this.d = tb40Var;
        this.e = ny40Var;
        this.f = u750Var;
    }

    public final hg40 a(MusicTrack musicTrack) {
        int i;
        Long valueOf;
        Integer num;
        Long l;
        u2b0 u2b0Var = this.a;
        StartPlaySource j = u2b0Var.j();
        if (j instanceof StartPlayPlaylistSource) {
            StartPlaySource j2 = u2b0Var.j();
            StartPlayPlaylistSource startPlayPlaylistSource = j2 instanceof StartPlayPlaylistSource ? (StartPlayPlaylistSource) j2 : null;
            if (startPlayPlaylistSource != null) {
                PlaySourceMeta.PlaylistPlaySourceMeta playlistPlaySourceMeta = startPlayPlaylistSource.c;
                i = Integer.valueOf(playlistPlaySourceMeta.e);
                valueOf = Long.valueOf(playlistPlaySourceMeta.d.b);
                l = valueOf;
                num = i;
            }
            num = null;
            l = null;
        } else {
            if (j instanceof StartPlayUserSource) {
                StartPlaySource j3 = u2b0Var.j();
                StartPlayUserSource startPlayUserSource = j3 instanceof StartPlayUserSource ? (StartPlayUserSource) j3 : null;
                if (startPlayUserSource != null) {
                    i = -1;
                    valueOf = Long.valueOf(startPlayUserSource.c.b);
                    l = valueOf;
                    num = i;
                }
            }
            num = null;
            l = null;
        }
        String str = musicTrack.y;
        com.vk.music.player.f fVar = this.d.b.a;
        return new hg40(fVar != null ? Integer.valueOf(fVar.h() / 1000) : null, Integer.valueOf(musicTrack.b), num, Long.valueOf(musicTrack.c.b), l, str);
    }

    public final void b(sb40 sb40Var) {
        this.d.a(sb40Var);
    }
}
