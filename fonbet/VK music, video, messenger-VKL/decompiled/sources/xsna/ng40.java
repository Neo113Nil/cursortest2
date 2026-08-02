package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng40 implements Callable {
    public final /* synthetic */ sg40 b;
    public final /* synthetic */ UserId c;
    public final /* synthetic */ MusicTrack d;
    public final /* synthetic */ Playlist e;

    public /* synthetic */ ng40(sg40 sg40Var, UserId userId, MusicTrack musicTrack, Playlist playlist) {
        this.b = sg40Var;
        this.c = userId;
        this.d = musicTrack;
        this.e = playlist;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Playlist playlist = this.e;
        String Ib = playlist != null ? playlist.Ib() : null;
        sg40 sg40Var = this.b;
        kgp0 kgp0Var = sg40Var.e;
        UserId userId = this.c;
        MusicTrack musicTrack = this.d;
        if (kgp0Var.m(userId, musicTrack, Ib) != 0) {
            sg40Var.a.j0(musicTrack, (((Boolean) sg40Var.p.getValue()).booleanValue() || ((Boolean) sg40Var.q.getValue()).booleanValue()) && sg40Var.k.l(musicTrack.Fb()) != null);
            sg40Var.l.C(musicTrack.Fb());
        }
        return s3q0.a;
    }
}
