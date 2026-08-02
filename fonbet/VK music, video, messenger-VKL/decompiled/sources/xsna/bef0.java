package xsna;

import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.music.impl.entity.PlayingState;
import com.vk.catalog.mvi.block.music.impl.recommended.entity.RecommendedPlaylistState;
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
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.aef0;
import xsna.eef0;
import xsna.ln50;
import xsna.yc40;

/* compiled from: RecommendedPlaylistActor.kt */
/* loaded from: classes16.dex */
public final class bef0 extends u1a<RecommendedPlaylistState, aef0> {
    public final u2b0 c;
    public final fl4 d;

    public bef0(b2a b2aVar, u2b0 u2b0Var, fl4 fl4Var) {
        super(b2aVar);
        this.c = u2b0Var;
        this.d = fl4Var;
        w1a.a(this, new rn50("TASK_INIT"), ln50.a.b, new wxw(this, null));
    }

    public static StartPlayPlaylistSource w(Playlist playlist, String str, String str2) {
        String str3 = playlist.x;
        String str4 = playlist.h;
        if (str4 == null) {
            str4 = "";
        }
        return new StartPlayPlaylistSource(new PlaySourceMeta.PlaylistPlaySourceMeta(str4, playlist.Eb(), playlist.c, playlist.b, playlist.O, playlist.z), str, str2, str3);
    }

    @Override // xsna.u1a
    public final void g(aef0 aef0Var) {
        aef0 aef0Var2 = aef0Var;
        b2a b2aVar = (b2a) this.b.b;
        boolean z = aef0Var2 instanceof aef0.a;
        u2b0 u2b0Var = this.c;
        Object obj = null;
        if (z) {
            BlockId blockId = ((aef0.a) aef0Var2).b;
            RecommendedPlaylistState recommendedPlaylistState = (RecommendedPlaylistState) b2aVar.getCurrentState();
            Playlist playlist = recommendedPlaylistState.h;
            BlockId blockId2 = recommendedPlaylistState.b;
            if (playlist.B()) {
                t(new eef0.b(blockId2, playlist));
                return;
            }
            if (uzp.i(playlist, u2b0Var)) {
                v(new yc40.b(blockId2.getId(), new MusicMviAnalyticsInfo(((RecommendedPlaylistState) b2aVar.getCurrentState()).g == PlayingState.PLAYING ? MusicMviAnalyticsInfo.ClickTarget.Pause : MusicMviAnalyticsInfo.ClickTarget.Play)));
                u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
                return;
            }
            v(new yc40.b(blockId2.getId(), new MusicMviAnalyticsInfo(MusicMviAnalyticsInfo.ClickTarget.PlayAll)));
            m(new qb6(27, PlayingState.BUFFERING, obj));
            RecommendedPlaylistState recommendedPlaylistState2 = (RecommendedPlaylistState) b2aVar.getCurrentState();
            StartPlayPlaylistSource w = w(recommendedPlaylistState2.h, blockId.getId(), recommendedPlaylistState2.d);
            Playlist playlist2 = recommendedPlaylistState2.h;
            u2b0Var.N0(new lqk0(w, (MusicTrack) null, playlist2.y, MusicPlaybackLaunchContext.Fb(blockId.getId()).Db(playlist2), 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 882));
            return;
        }
        if (aef0Var2 instanceof aef0.b) {
            BlockId blockId3 = ((aef0.b) aef0Var2).b;
            t(new eef0.a(blockId3, ((RecommendedPlaylistState) b2aVar.getCurrentState()).h));
            v(new yc40.b(blockId3.getId(), new MusicMviAnalyticsInfo(MusicMviAnalyticsInfo.ClickTarget.Open)));
            return;
        }
        if (!(aef0Var2 instanceof aef0.d)) {
            if (!(aef0Var2 instanceof aef0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            aef0.c cVar = (aef0.c) aef0Var2;
            t(new eef0.c(cVar.b, ((RecommendedPlaylistState) b2aVar.getCurrentState()).h, cVar.c, ((RecommendedPlaylistState) b2aVar.getCurrentState()).d));
            return;
        }
        aef0.d dVar = (aef0.d) aef0Var2;
        RecommendedPlaylistState recommendedPlaylistState3 = (RecommendedPlaylistState) b2aVar.getCurrentState();
        Iterator<T> it = ((RecommendedPlaylistState) b2aVar.getCurrentState()).h.y.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (epx.f(((MusicTrack) next).Fb(), dVar.c)) {
                obj = next;
                break;
            }
        }
        MusicTrack musicTrack = (MusicTrack) obj;
        Playlist playlist3 = recommendedPlaylistState3.h;
        BlockId blockId4 = dVar.b;
        u2b0Var.N0(new lqk0(w(playlist3, blockId4.getId(), ""), musicTrack, recommendedPlaylistState3.h.y, MusicPlaybackLaunchContext.Fb(blockId4.getId()).Db(((RecommendedPlaylistState) b2aVar.getCurrentState()).h), 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 1008));
        if (musicTrack != null) {
            v(new yc40.c(musicTrack, blockId4.getId()));
        }
    }
}
