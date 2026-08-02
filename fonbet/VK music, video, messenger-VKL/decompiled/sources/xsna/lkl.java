package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayerTrack;
import java.util.List;
import java.util.Map;

/* compiled from: DefaultPlaybackQueueCacheStrategy.kt */
/* loaded from: classes3.dex */
public final class lkl implements sxa0 {
    public final com.vk.music.player.playback.e b;
    public final pxa0 c;

    public lkl(com.vk.music.player.playback.e eVar, pxa0 pxa0Var) {
        this.b = eVar;
        this.c = pxa0Var;
    }

    @Override // xsna.txa0
    public final void a() {
        this.c.a();
    }

    @Override // xsna.txa0
    public final void b(List<gza0> list) {
        this.c.b(list);
    }

    @Override // xsna.txa0
    public final void e(Map<String, xd50> map) {
        this.c.e(map);
    }

    @Override // xsna.txa0
    public final void f(com.vk.music.player.playback.e eVar) {
        this.c.f(eVar);
    }

    @Override // xsna.sxa0
    public final io.reactivex.rxjava3.core.x<com.vk.music.player.playback.e> h() {
        return new io.reactivex.rxjava3.internal.operators.single.c(new kkl(this, 0));
    }

    @Override // xsna.sxa0
    public final io.reactivex.rxjava3.core.x<ixa0> i(com.vk.music.player.playback.e eVar) {
        return this.c.i(eVar);
    }

    @Override // xsna.txa0
    public final void j(PlayerTrack playerTrack) {
        MusicTrack musicTrack;
        if (playerTrack != null && (musicTrack = playerTrack.b) != null && musicTrack.Wb()) {
            playerTrack = PlayerTrack.zb(playerTrack, null, 23);
        }
        this.c.j(playerTrack);
    }

    @Override // xsna.txa0
    public final void k(List<String> list) {
        this.c.k(list);
    }

    @Override // xsna.txa0
    public final void l(List<gza0> list) {
        this.c.l(list);
    }
}
