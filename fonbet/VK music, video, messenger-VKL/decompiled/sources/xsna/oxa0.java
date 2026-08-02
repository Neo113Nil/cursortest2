package xsna;

import com.vk.log.L;
import com.vk.music.player.PlayerTrack;
import java.util.List;
import java.util.Map;

/* compiled from: PlaybackQueueCacheControllerImpl.kt */
/* loaded from: classes3.dex */
public final class oxa0 implements nxa0 {
    public final io.reactivex.rxjava3.disposables.g b = new io.reactivex.rxjava3.disposables.g();
    public final rvu c;

    public oxa0(t4v0 t4v0Var, pxa0 pxa0Var) {
        this.c = new rvu(t4v0Var, pxa0Var);
    }

    @Override // xsna.txa0
    public final void a() {
        d();
        ((sxa0) this.c.d).a();
    }

    @Override // xsna.txa0
    public final void b(List<gza0> list) {
        ((sxa0) this.c.d).b(list);
    }

    @Override // xsna.nxa0
    public final void c(am6 am6Var) {
        rvu rvuVar = this.c;
        this.b.b(new io.reactivex.rxjava3.internal.operators.single.r(((pxa0) rvuVar.c).h(), new dnz(new qw30(rvuVar, 16), 8)).q(io.reactivex.rxjava3.schedulers.a.b()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ljs(new hoh(1, am6Var, izs.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, 7), 19), new pdw(new yte(L.a, 9), 15)));
    }

    @Override // xsna.nxa0
    public final void d() {
        this.b.b(null);
    }

    @Override // xsna.txa0
    public final void e(Map<String, xd50> map) {
        ((sxa0) this.c.d).e(map);
    }

    @Override // xsna.txa0
    public final void f(com.vk.music.player.playback.e eVar) {
        d();
        rvu rvuVar = this.c;
        rvuVar.a(eVar);
        ((pxa0) rvuVar.c).a();
        ((sxa0) rvuVar.d).f(eVar);
    }

    @Override // xsna.txa0
    public final void j(PlayerTrack playerTrack) {
        ((sxa0) this.c.d).j(playerTrack);
    }

    @Override // xsna.txa0
    public final void k(List<String> list) {
        ((sxa0) this.c.d).k(list);
    }

    @Override // xsna.txa0
    public final void l(List<gza0> list) {
        ((sxa0) this.c.d).l(list);
    }

    @Override // xsna.jxa0
    public final boolean p() {
        return ((pxa0) this.c.c).p();
    }
}
