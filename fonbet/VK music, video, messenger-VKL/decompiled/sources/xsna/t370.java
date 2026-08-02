package xsna;

import com.vk.music.player.PlayerTrack;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import java.util.List;
import java.util.Map;

/* compiled from: NoOpPlaybackQueueCacheStrategy.kt */
/* loaded from: classes3.dex */
public final class t370 implements sxa0 {
    @Override // xsna.sxa0
    public final io.reactivex.rxjava3.core.x<com.vk.music.player.playback.e> h() {
        Object obj = PlaybackLaunchMeta.g;
        return io.reactivex.rxjava3.core.x.k(new com.vk.music.player.playback.e(null, PlaybackLaunchMeta.a.a()));
    }

    @Override // xsna.sxa0
    public final io.reactivex.rxjava3.core.x<ixa0> i(com.vk.music.player.playback.e eVar) {
        return new io.reactivex.rxjava3.internal.operators.single.c(new z0w(1, eVar, this)).l(new q40(new xmz(14), 27));
    }

    @Override // xsna.txa0
    public final void a() {
    }

    @Override // xsna.txa0
    public final void b(List<gza0> list) {
    }

    @Override // xsna.txa0
    public final void e(Map<String, xd50> map) {
    }

    @Override // xsna.txa0
    public final void f(com.vk.music.player.playback.e eVar) {
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
