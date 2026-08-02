package xsna;

import android.os.Parcelable;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlayerTrack;
import com.vk.music.stickyplayer.domain.PlayerContext;
import xsna.tx40;

/* compiled from: PodcastActionHandler.kt */
/* loaded from: classes3.dex */
public final class agb0 implements n10 {
    public final a630 a;
    public final f4z b;
    public final f4z c;
    public final io.reactivex.rxjava3.disposables.b d;

    public agb0(a630 a630Var, f4z f4zVar, f4z f4zVar2, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = a630Var;
        this.b = f4zVar;
        this.c = f4zVar2;
        this.d = bVar;
    }

    @Override // xsna.n10
    public final void b(sy40 sy40Var, PlayerTrack playerTrack, PlayerContext playerContext) {
        Parcelable parcelable = playerTrack.c.e;
        boolean h = playerContext.h();
        PlaySourceMeta.a aVar = parcelable instanceof PlaySourceMeta.a ? (PlaySourceMeta.a) parcelable : null;
        boolean z = false;
        if (aVar != null && aVar.p7()) {
            z = true;
        }
        this.b.b(new tx40.r(playerTrack, h, z));
    }

    @Override // xsna.n10
    public final void d(MusicTrack musicTrack) {
        this.b.b(new tx40.m(musicTrack.c, musicTrack.b, musicTrack.y, jnj.a(musicTrack.V)));
    }

    @Override // xsna.n10
    public final void e(sy40 sy40Var) {
        MusicTrack musicTrack;
        PlayerTrack playerTrack = sy40Var.d;
        if (playerTrack == null || (musicTrack = playerTrack.b) == null) {
            return;
        }
        this.b.b(new tx40.l(musicTrack.c, jnj.a(musicTrack.V)));
    }

    @Override // xsna.n10
    public final void a(sy40 sy40Var, MusicTrack musicTrack) {
    }

    @Override // xsna.n10
    public final void c(sy40 sy40Var, MusicTrack musicTrack) {
    }
}
