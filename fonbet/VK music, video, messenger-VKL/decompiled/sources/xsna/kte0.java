package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayerTrack;
import com.vk.music.stickyplayer.domain.PlayerContext;
import xsna.tx40;

/* compiled from: RadioActionHandler.kt */
/* loaded from: classes3.dex */
public final class kte0 implements n10 {
    public final a630 a;
    public final f4z b;
    public final f4z c;
    public final f4z d;
    public final io.reactivex.rxjava3.disposables.b e;

    /* compiled from: RadioActionHandler.kt */
    public static final class a implements io.reactivex.rxjava3.functions.f {
        public final /* synthetic */ izs b;

        public a(izs izsVar) {
            this.b = izsVar;
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final /* synthetic */ void accept(Object obj) {
            this.b.invoke(obj);
        }
    }

    public kte0(a630 a630Var, f4z f4zVar, f4z f4zVar2, f4z f4zVar3, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = a630Var;
        this.b = f4zVar;
        this.c = f4zVar2;
        this.d = f4zVar3;
        this.e = bVar;
    }

    @Override // xsna.n10
    public final void a(sy40 sy40Var, MusicTrack musicTrack) {
        int i = musicTrack.b;
        MusicPlaybackLaunchContext zb = MusicPlaybackLaunchContext.A.zb();
        zb.b.putString("__META_PLAYER_TYPE", "radio_player");
        this.e.b(this.a.Q(i, false, zb).F(new a(new ite0(this))).subscribe(new a(new jte0(this, sy40Var))));
    }

    @Override // xsna.n10
    public final void b(sy40 sy40Var, PlayerTrack playerTrack, PlayerContext playerContext) {
        this.b.b(new tx40.r(playerTrack, playerContext.h(), false));
    }

    @Override // xsna.n10
    public final void c(sy40 sy40Var, MusicTrack musicTrack) {
        int i = musicTrack.b;
        MusicPlaybackLaunchContext zb = MusicPlaybackLaunchContext.A.zb();
        zb.b.putString("__META_PLAYER_TYPE", "radio_player");
        this.e.b(this.a.j0(i, false, zb).F(new a(new ite0(this))).subscribe(new a(new jte0(this, sy40Var))));
    }

    @Override // xsna.n10
    public final void d(MusicTrack musicTrack) {
    }

    @Override // xsna.n10
    public final void e(sy40 sy40Var) {
    }
}
