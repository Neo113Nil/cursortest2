package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.music.playerservice.impl.PlayerService;
import xsna.g8x;
import xsna.mu90;

/* compiled from: CrossfadeMusicPlayerDependenciesProvider.kt */
/* loaded from: classes3.dex */
public final class ojk extends oh6 {
    public final com.vk.music.pref.a k;
    public final hxa0 l;
    public final bpn0 m;

    public ojk(PlayerService playerService, mb4 mb4Var, boolean z, uw1 uw1Var, com.vk.music.pref.a aVar, com.vk.music.audioeffect.a aVar2, hxa0 hxa0Var) {
        super(z, aVar2);
        this.k = aVar;
        this.l = hxa0Var;
        this.m = new bpn0(new kfb(playerService, mb4Var, uw1Var, 1));
    }

    @Override // xsna.oh6, xsna.aw40
    public final boolean g() {
        PlayerTrack b;
        MusicTrack musicTrack;
        PlayerTrack b2;
        PlaybackLaunchMeta playbackLaunchMeta;
        g8x.a aVar;
        mu90 value = i().a().getValue();
        mu90.b bVar = value instanceof mu90.b ? (mu90.b) value : null;
        boolean z = ((i().a().getValue() instanceof mu90.b) && (bVar != null && (aVar = bVar.a.m) != null && aVar.a)) ? false : true;
        com.vk.music.pref.a aVar2 = this.k;
        if (aVar2.z0() && aVar2.n0() != LoopMode.TRACK) {
            hxa0 hxa0Var = this.l;
            if ((hxa0Var != null ? Integer.valueOf(hxa0Var.getSize()) : null) != null && hxa0Var.getSize() > 1 && z && (b = hxa0Var.b()) != null && (musicTrack = b.b) != null && musicTrack.Tb()) {
                com.vk.music.player.playback.e i = hxa0Var.i();
                Serializer.StreamParcelableAdapter streamParcelableAdapter = (i == null || (playbackLaunchMeta = i.b) == null) ? null : playbackLaunchMeta.e;
                PlaySourceMeta.PlaylistPlaySourceMeta playlistPlaySourceMeta = streamParcelableAdapter instanceof PlaySourceMeta.PlaylistPlaySourceMeta ? (PlaySourceMeta.PlaylistPlaySourceMeta) streamParcelableAdapter : null;
                if ((playlistPlaySourceMeta == null || !playlistPlaySourceMeta.c) && ((b2 = hxa0Var.b()) == null || b2.d + 1 != hxa0Var.getSize())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final nb4 i() {
        return (nb4) this.m.getValue();
    }
}
