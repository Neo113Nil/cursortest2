package xsna;

import com.vk.music.player.PlayerTrack;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: NoOpPlaybackQueueCacheController.kt */
/* loaded from: classes3.dex */
public final class s370 implements nxa0 {
    @Override // xsna.nxa0
    public final void c(am6 am6Var) {
        Object obj = PlaybackLaunchMeta.g;
        com.vk.music.player.playback.e eVar = new com.vk.music.player.playback.e(null, PlaybackLaunchMeta.a.a());
        EmptyList emptyList = EmptyList.b;
        am6Var.invoke(new ixa0(eVar, null, emptyList, emptyList, jgp.b));
    }

    @Override // xsna.jxa0
    public final boolean p() {
        return false;
    }

    @Override // xsna.txa0
    public final void a() {
    }

    @Override // xsna.nxa0
    public final void d() {
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
