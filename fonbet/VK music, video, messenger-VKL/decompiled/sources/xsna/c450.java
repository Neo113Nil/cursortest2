package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dz40;

/* compiled from: MusicRenderProvider.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class c450 extends FunctionReferenceImpl implements izs<sy40, ipw<dz40.d>> {
    @Override // xsna.izs
    public final ipw<dz40.d> invoke(sy40 sy40Var) {
        Integer valueOf;
        MusicTrack musicTrack;
        MusicTrack musicTrack2;
        sy40 sy40Var2 = sy40Var;
        ((m450) this.receiver).getClass();
        StartPlaySource startPlaySource = sy40Var2.t;
        PlayerTrack playerTrack = sy40Var2.d;
        StartPlayVkMixSource startPlayVkMixSource = startPlaySource instanceof StartPlayVkMixSource ? (StartPlayVkMixSource) startPlaySource : null;
        boolean z = startPlayVkMixSource != null ? startPlayVkMixSource.f : false;
        DownloadingState downloadingState = sy40Var2.n;
        boolean z2 = (playerTrack == null || (musicTrack2 = playerTrack.b) == null || !jnj.c(musicTrack2.V)) ? false : true;
        boolean z3 = (playerTrack == null || (musicTrack = playerTrack.b) == null || !jnj.d(musicTrack.V)) ? false : true;
        lac lacVar = sy40Var2.D;
        dz40.d.b bVar = lacVar != null ? new dz40.d.b(lacVar.a, lacVar.b, lacVar.c) : null;
        dz40.d.C2771d c2771d = new dz40.d.C2771d(!sy40Var2.e.c, z3);
        if (MusicFeatures.AUDIO_MULTI_REACTIONS.h()) {
            c2771d = null;
        }
        dz40.d.c cVar = dz40.d.c.a;
        if (!z) {
            cVar = null;
        }
        if (z || downloadingState.equals(DownloadingState.Downloaded.b) || downloadingState.equals(DownloadingState.PartlyDownloaded.b) || downloadingState.equals(DownloadingState.Corrupted.b)) {
            valueOf = null;
        } else if (downloadingState.equals(DownloadingState.NotLoaded.b)) {
            valueOf = Integer.valueOf(R.string.music_player_button_download_track_title);
        } else {
            if (!(downloadingState instanceof DownloadingState.Downloading) && !downloadingState.equals(DownloadingState.PendingDownload.b)) {
                throw new NoWhenBranchMatchedException();
            }
            valueOf = Integer.valueOf(R.string.music_player_button_downloading_track_title);
        }
        return new ipw<>(izi0.m(c2771d, cVar, new dz40.d.e.b(downloadingState, valueOf, z3), bVar, z2 ? null : dz40.d.a.a, new dz40.d.k(sy40Var2.u), dz40.d.j.a));
    }
}
