package xsna;

import android.os.Parcelable;
import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;
import com.vk.catalog.mvi.section.api.CatalogPerformanceMetrics;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionStateFlow;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.Owner;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.video.playlist.playlistscreen.domain.PlaylistButtonDo;
import com.vk.video.playlist.playlistscreen.domain.PlaylistDataDo;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenData;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenInfoDataState;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState;
import com.vk.video.playlist.playlistscreen.ui.store.PlaylistScreenInlineActor$listenVideoDataChangedEvents$1;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.random.Random;
import xsna.avm0;
import xsna.el50;
import xsna.hcb0;
import xsna.ln50;
import xsna.ncb0;
import xsna.t0a;
import xsna.w2p0;
import xsna.zvu;

/* compiled from: PlaylistScreenInlineActor.kt */
/* loaded from: classes6.dex */
public final class vcb0 extends bl50<PlaylistScreenState, hcb0, on50, bwj, dwj, ncb0> {
    public final CatalogPerformanceMetrics c;
    public final bdb0 d;
    public final m7a e;
    public final b25 f;
    public final cea g;
    public final s0a h;

    public vcb0(CatalogPerformanceMetrics catalogPerformanceMetrics, bdb0 bdb0Var, m7a m7aVar, b25 b25Var, cea ceaVar, s0a s0aVar, sj50 sj50Var) {
        super(sj50Var);
        this.c = catalogPerformanceMetrics;
        this.d = bdb0Var;
        this.e = m7aVar;
        this.f = b25Var;
        this.g = ceaVar;
        this.h = s0aVar;
    }

    @Override // xsna.bl50, xsna.uic
    public final void clear() {
        CatalogSectionStateFlow catalogSectionStateFlow;
        PlaylistScreenData playlistScreenData = ((PlaylistScreenState) this.b.getCurrentState()).f;
        if (playlistScreenData == null || (catalogSectionStateFlow = playlistScreenData.c) == null) {
            return;
        }
        catalogSectionStateFlow.clear();
    }

    @Override // xsna.bl50, xsna.qj50
    public final void init() {
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        int i = ((PlaylistScreenState) sj50Var.getCurrentState()).b;
        Integer valueOf = Integer.valueOf(i);
        PlaylistDataDo j = ((PlaylistScreenState) sj50Var.getCurrentState()).j();
        if (!epx.f(j != null ? Integer.valueOf(j.b) : null, valueOf)) {
            g3q.a(this, new jab0(this, i, null));
        }
        PlaylistScreenData playlistScreenData = ((PlaylistScreenState) sj50Var.getCurrentState()).f;
        ln50.a.c cVar = ln50.a.c;
        if (playlistScreenData == null) {
            el50.a.a(this, new rn50("SectionStoresLoadTask"), cVar, new qhf(new g60(this, 17), 1));
        } else {
            PlaylistScreenData playlistScreenData2 = ((PlaylistScreenState) sj50Var.getCurrentState()).f;
            if (playlistScreenData2 != null && playlistScreenData2.c.c == null) {
                f4a.a(this, playlistScreenData2);
            }
            el50.a.a(this, new rn50("SectionStoresListenTask"), cVar, new qhf(new jy(this, 23), 1));
        }
        g3q.a(this, new c4a(this, null));
        g3q.a(this, new PlaylistScreenInlineActor$listenVideoDataChangedEvents$1(this, null));
        g3q.a(this, new ucb0(this, null));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        mm50<CatalogSectionState, yda, bea> mm50Var;
        Object obj;
        Object obj2;
        Object obj3;
        CatalogLinkButtonActionDo catalogLinkButtonActionDo;
        hcb0 hcb0Var = (hcb0) lj50Var;
        boolean z = hcb0Var instanceof w2p0;
        sj50<State, TaskId, ll50<TaskId, TaskExecution, TaskExecutionScope>, jl50<State>, Event> sj50Var = this.b;
        if (z) {
            w2p0 w2p0Var = (w2p0) hcb0Var;
            if (w2p0Var.equals(w2p0.a.b)) {
                c(ncb0.b.a);
                return;
            }
            if (w2p0Var.equals(w2p0.b.b)) {
                PlaylistDataDo j = ((PlaylistScreenState) sj50Var.getCurrentState()).j();
                if (j != null) {
                    c(new ncb0.e(j.h));
                    return;
                }
                return;
            }
            if (!w2p0Var.equals(w2p0.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            PlaylistScreenInfoDataState playlistScreenInfoDataState = ((PlaylistScreenState) sj50Var.getCurrentState()).d;
            if (playlistScreenInfoDataState instanceof PlaylistScreenInfoDataState.Loaded) {
                c(new ncb0.j(((PlaylistScreenInfoDataState.Loaded) playlistScreenInfoDataState).b.h));
                return;
            }
            return;
        }
        CatalogLinkButtonActionDo catalogLinkButtonActionDo2 = null;
        if (!(hcb0Var instanceof zvu)) {
            if (hcb0Var instanceof hcb0.a) {
                hcb0.a aVar = (hcb0.a) hcb0Var;
                PlaylistScreenData playlistScreenData = ((PlaylistScreenState) sj50Var.getCurrentState()).f;
                if (playlistScreenData == null || (mm50Var = playlistScreenData.c.c) == null) {
                    return;
                }
                mm50Var.b(aVar.b);
                return;
            }
            if (!(hcb0Var instanceof avm0)) {
                throw new NoWhenBranchMatchedException();
            }
            avm0 avm0Var = (avm0) hcb0Var;
            if (avm0Var.equals(avm0.a.b)) {
                el50.a.b(this, new f6w(26));
                return;
            }
            if (!avm0Var.equals(avm0.b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            el50.a.b(this, new fo20(27));
            PlaylistScreenInfoDataState playlistScreenInfoDataState2 = ((PlaylistScreenState) sj50Var.getCurrentState()).d;
            if (playlistScreenInfoDataState2 instanceof PlaylistScreenInfoDataState.Loaded) {
                yvm0.b(this);
                g3q.a(this, new xvm0(this, playlistScreenInfoDataState2, null));
                return;
            }
            return;
        }
        zvu zvuVar = (zvu) hcb0Var;
        if (zvuVar instanceof zvu.b) {
            if (!this.f.b()) {
                c(ncb0.c.a);
                return;
            }
            PlaylistScreenInfoDataState playlistScreenInfoDataState3 = ((PlaylistScreenState) sj50Var.getCurrentState()).d;
            if (playlistScreenInfoDataState3 instanceof PlaylistScreenInfoDataState.Loaded) {
                PlaylistDataDo j2 = ((PlaylistScreenState) sj50Var.getCurrentState()).j();
                if (j2 != null) {
                    String str = j2.h.n;
                    if (str == null) {
                        str = ((PlaylistScreenState) sj50Var.getCurrentState()).e;
                    }
                    String str2 = str;
                    PlaylistDataDo j3 = ((PlaylistScreenState) sj50Var.getCurrentState()).j();
                    this.h.a(new t0a.a(str2, null, null, new t0a.a.d((j3 == null || !j3.d) ? MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE : MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE, SchemeStat$EventItem.Type.VIDEO_PLAYLIST), 6));
                }
                if (((PlaylistScreenInfoDataState.Loaded) playlistScreenInfoDataState3).b.d) {
                    el50.a.b(this, new oey(29));
                    return;
                }
                PlaylistScreenInfoDataState playlistScreenInfoDataState4 = ((PlaylistScreenState) sj50Var.getCurrentState()).d;
                if (playlistScreenInfoDataState4 instanceof PlaylistScreenInfoDataState.Loaded) {
                    yvm0.b(this);
                    g3q.a(this, new wvm0(this, playlistScreenInfoDataState4, null));
                    return;
                }
                return;
            }
            return;
        }
        if (!zvuVar.equals(zvu.a.b)) {
            if (zvuVar.equals(zvu.c.b)) {
                List<VideoFile> list = ((PlaylistScreenState) sj50Var.getCurrentState()).k;
                PlaylistDataDo j4 = ((PlaylistScreenState) sj50Var.getCurrentState()).j();
                c(new ncb0.h(list, j4 != null ? j4.g : null));
                return;
            }
            if (!zvuVar.equals(zvu.d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator<T> it = ((PlaylistScreenState) sj50Var.getCurrentState()).j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((PlaylistButtonDo) obj).c instanceof CatalogLinkButtonActionDo.ToggleAlbumShuffle) {
                        break;
                    }
                }
            }
            PlaylistButtonDo playlistButtonDo = (PlaylistButtonDo) obj;
            Parcelable parcelable = playlistButtonDo != null ? playlistButtonDo.c : null;
            CatalogLinkButtonActionDo.ToggleAlbumShuffle toggleAlbumShuffle = parcelable instanceof CatalogLinkButtonActionDo.ToggleAlbumShuffle ? (CatalogLinkButtonActionDo.ToggleAlbumShuffle) parcelable : null;
            if (toggleAlbumShuffle == null) {
                return;
            }
            el50.a.a(this, new rn50("ShuffledVideosLoadTask"), ln50.a.c, new qhf(new ba10(this, swe0.n(new k9x(0, Integer.MAX_VALUE, 1), Random.b), toggleAlbumShuffle, 1), 1));
            return;
        }
        PlaylistDataDo j5 = ((PlaylistScreenState) sj50Var.getCurrentState()).j();
        if (j5 == null) {
            return;
        }
        List<PlaylistButtonDo> list2 = ((PlaylistScreenState) sj50Var.getCurrentState()).j;
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it2.next();
                if (((PlaylistButtonDo) obj2).c instanceof CatalogLinkButtonActionDo.OpenAddVideosToAlbum) {
                    break;
                }
            }
        }
        PlaylistButtonDo playlistButtonDo2 = (PlaylistButtonDo) obj2;
        if (playlistButtonDo2 == null || (catalogLinkButtonActionDo = playlistButtonDo2.c) == null) {
            Iterator<T> it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                } else {
                    obj3 = it3.next();
                    if (((PlaylistButtonDo) obj3).c instanceof CatalogLinkButtonActionDo.OpenUploadVideo) {
                        break;
                    }
                }
            }
            PlaylistButtonDo playlistButtonDo3 = (PlaylistButtonDo) obj3;
            if (playlistButtonDo3 != null) {
                catalogLinkButtonActionDo2 = playlistButtonDo3.c;
            }
        } else {
            catalogLinkButtonActionDo2 = catalogLinkButtonActionDo;
        }
        if (catalogLinkButtonActionDo2 instanceof CatalogLinkButtonActionDo.OpenAddVideosToAlbum) {
            c(new ncb0.d(j5.h));
        } else if (catalogLinkButtonActionDo2 instanceof CatalogLinkButtonActionDo.OpenUploadVideo) {
            c(new ncb0.f(new Owner(j5.c, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194302, null)));
        }
    }
}
