package xsna;

import com.vk.catalog2.common.ui.mvp.auto.b;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayPlaylistSource;
import com.vk.music.playlist.ModernPlaylistModel;
import com.vk.music.stats.AdsAudioPixelsContainer;
import java.util.List;
import xsna.q22;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class h22 implements izs {
    public final /* synthetic */ ModernPlaylistModel b;
    public final /* synthetic */ com.vk.catalog2.common.ui.mvp.auto.a c;
    public final /* synthetic */ q22.d d;
    public final /* synthetic */ UserId e;
    public final /* synthetic */ int f;

    public /* synthetic */ h22(ModernPlaylistModel modernPlaylistModel, com.vk.catalog2.common.ui.mvp.auto.a aVar, q22.d dVar, UserId userId, int i) {
        this.b = modernPlaylistModel;
        this.c = aVar;
        this.d = dVar;
        this.e = userId;
        this.f = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List list = (List) obj;
        ModernPlaylistModel modernPlaylistModel = this.b;
        Playlist Z0 = modernPlaylistModel.Z0();
        MusicTrack musicTrack = (MusicTrack) j5g.a0(list);
        bn40.f("Playlist's track successfully loaded");
        q22.d dVar = this.d;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = dVar.d;
        String str = dVar.c;
        com.vk.catalog2.common.ui.mvp.auto.a aVar = this.c;
        aVar.c.b(str, list);
        aVar.i = new b.a(musicPlaybackLaunchContext, str);
        bn40.f("setting queue", Integer.valueOf(list.size()));
        u2b0 u2b0Var = aVar.d;
        String str2 = Z0 != null ? Z0.h : null;
        if (str2 == null) {
            str2 = "";
        }
        u2b0Var.N0(new lqk0(new StartPlayPlaylistSource(new PlaySourceMeta.PlaylistPlaySourceMeta(str2, Z0 != null ? Z0.Eb() : false, this.e, this.f, 0, null, 48, null), dVar.c, null, modernPlaylistModel.D(), 4, null), musicTrack, list, dVar.d, 0, ShuffleMode.SHUFFLE_AUTO, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 816));
        return s3q0.a;
    }
}
