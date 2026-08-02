package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.music.impl.artists.slider.entity.ArtistSliderState;
import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.catalog.mvi.block.music.models.MusicMviAnalyticsInfo;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayPlaylistSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.et3;
import xsna.ln50;
import xsna.xs3;
import xsna.yc40;

/* compiled from: ArtistSliderActor.kt */
/* loaded from: classes16.dex */
public final class ht3 extends u1a<ArtistSliderState, xs3> {
    public final u2b0 c;

    public ht3(b2a b2aVar, u2b0 u2b0Var) {
        super(b2aVar);
        this.c = u2b0Var;
        w1a.a(this, new rn50("TASK_INIT"), ln50.a.b, new vxw(this, null));
    }

    @Override // xsna.u1a
    public final void g(xs3 xs3Var) {
        xs3 xs3Var2 = xs3Var;
        b2a b2aVar = (b2a) this.b.b;
        if (!(xs3Var2 instanceof xs3.a)) {
            if (!(xs3Var2 instanceof xs3.b)) {
                throw new NoWhenBranchMatchedException();
            }
            t(new et3.a(((ArtistSliderState) b2aVar.getCurrentState()).b, ((ArtistSliderState) b2aVar.getCurrentState()).e));
            v(new yc40.f(((xs3.b) xs3Var2).b.getId(), new MusicMviAnalyticsInfo(MusicMviAnalyticsInfo.ClickTarget.Open)));
            return;
        }
        BlockId blockId = ((xs3.a) xs3Var2).b;
        ArtistSliderState artistSliderState = (ArtistSliderState) b2aVar.getCurrentState();
        Playlist playlist = artistSliderState.e;
        BlockId blockId2 = artistSliderState.b;
        if (playlist.B()) {
            t(new et3.b(blockId2, playlist));
            return;
        }
        u2b0 u2b0Var = this.c;
        if (uzp.i(playlist, u2b0Var)) {
            v(new yc40.f(blockId2.getId(), new MusicMviAnalyticsInfo(((ArtistSliderState) b2aVar.getCurrentState()).d == PlayingState.PLAYING ? MusicMviAnalyticsInfo.ClickTarget.Pause : MusicMviAnalyticsInfo.ClickTarget.Play)));
            u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
            return;
        }
        v(new yc40.f(blockId2.getId(), new MusicMviAnalyticsInfo(MusicMviAnalyticsInfo.ClickTarget.PlayAll)));
        m(new k9(PlayingState.BUFFERING, 4));
        ArtistSliderState artistSliderState2 = (ArtistSliderState) b2aVar.getCurrentState();
        Playlist playlist2 = artistSliderState2.e;
        String id = blockId.getId();
        String str = artistSliderState2.g;
        String str2 = playlist2.x;
        String str3 = playlist2.h;
        if (str3 == null) {
            str3 = "";
        }
        u2b0Var.N0(new lqk0(new StartPlayPlaylistSource(new PlaySourceMeta.PlaylistPlaySourceMeta(str3, playlist2.Eb(), playlist2.c, playlist2.b, playlist2.O, playlist2.z), id, str, str2), (MusicTrack) null, (List) null, MusicPlaybackLaunchContext.Fb(blockId.getId()).Db(artistSliderState2.e), 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 886));
    }
}
