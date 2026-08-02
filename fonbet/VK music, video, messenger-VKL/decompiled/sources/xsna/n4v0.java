package xsna;

import com.vk.music.player.PlayerTrack;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import java.util.List;
import java.util.Map;

/* compiled from: VkMixPlaybackQueueCacheStrategy.kt */
/* loaded from: classes3.dex */
public final class n4v0 implements sxa0 {
    public final com.vk.music.player.playback.e b;
    public final pxa0 c;
    public final t4v0 d;
    public final boolean e;
    public final t370 f;

    public n4v0(com.vk.music.player.playback.e eVar, pxa0 pxa0Var, t4v0 t4v0Var) {
        this.b = eVar;
        this.c = pxa0Var;
        this.d = t4v0Var;
        StartPlaySource startPlaySource = eVar.a;
        StartPlayVkMixSource startPlayVkMixSource = startPlaySource instanceof StartPlayVkMixSource ? (StartPlayVkMixSource) startPlaySource : null;
        boolean z = false;
        if (startPlayVkMixSource != null && startPlayVkMixSource.f) {
            z = true;
        }
        this.e = z;
        this.f = new t370();
    }

    @Override // xsna.txa0
    public final void a() {
        this.c.a();
    }

    @Override // xsna.txa0
    public final void f(com.vk.music.player.playback.e eVar) {
        this.c.f(eVar);
    }

    @Override // xsna.sxa0
    public final io.reactivex.rxjava3.core.x<com.vk.music.player.playback.e> h() {
        return new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.b(new q9f0(this, 7)), new aam0(new lxh0(this, 14), 6));
    }

    @Override // xsna.sxa0
    public final io.reactivex.rxjava3.core.x<ixa0> i(com.vk.music.player.playback.e eVar) {
        return this.f.i(eVar);
    }

    @Override // xsna.txa0
    public final void b(List<gza0> list) {
    }

    @Override // xsna.txa0
    public final void e(Map<String, xd50> map) {
    }

    @Override // xsna.txa0
    public final void j(PlayerTrack playerTrack) {
    }

    @Override // xsna.txa0
    public final void k(List<String> list) {
    }

    @Override // xsna.txa0
    public final void l(List<gza0> list) {
    }
}
