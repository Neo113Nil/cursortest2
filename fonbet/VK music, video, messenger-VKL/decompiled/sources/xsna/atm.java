package xsna;

import android.view.GestureDetector;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.auth.qr.OldQrAuthFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.section.di.CatalogInteractorComponent;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.feature.music.holders.artist.ArtistInfoVh;
import com.vk.catalog2.feature.music.holders.artist.MusicPagePhoneHeaderVh;
import com.vk.catalog2.feature.music.holders.artist.MusicPageToolbarVh;
import com.vk.catalog2.feature.music.search.history.di.SearchHistoryProviderComponent;
import com.vk.catalog2.feature.music.ui.holder.MusicArtistCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.di.scope.FeatureScopesKt$createFeatureScope$scope$1;
import com.vk.dto.common.id.UserId;
import com.vk.feed.tool.view.newsfeed.error.FeedErrorPlaceholder;
import com.vk.games.di.GamesCatalogComponent;
import com.vk.games.presentation.detail.GamesCatalogDetailFragment;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.media.player.VideoMode;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.MusicPlaybackQueueComponentImpl;
import com.vk.music.search.history.di.SearchHistoryScope;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.newsfeed.impl.postmodal.reactions.donut.ModalPostDonutFragment;
import com.vk.newsfeed.impl.postmodal.reactions.donut.a;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragmentOld;
import com.vk.search.communities.map.api.di.SearchCommunitiesOnMapComponent;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVhOld;
import com.vk.voip.api.di.VoipCallComponent;
import com.vkontakte.android.R;
import kotlin.Result;
import xsna.dt1;
import xsna.u4a;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class atm implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ atm(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v108, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return "exception while updating dialogs: ".concat(mnh0.A((Throwable) this.c));
            case 1:
                e9n e9nVar = ((h8n) this.c).f;
                return new Result(e9nVar.a.f(new vxf0(), new gjj0(e9nVar.b)));
            case 2:
                return ((NewsFeedComponent) ((k7m) m7m.c(((qto) this.c).itemView)).a(fpf0.a(NewsFeedComponent.class))).w();
            case 3:
                return ((mqp) this.c).d();
            case 4:
                return ((a6q) this.c).u != VideoMode.PREFETCH ? NetworkClient.ClientType.CLIENT_PLAYER : NetworkClient.ClientType.CLIENT_PLAYER_DOWNLOADER;
            case 5:
                FeedErrorPlaceholder feedErrorPlaceholder = (FeedErrorPlaceholder) this.c;
                int i = FeedErrorPlaceholder.e;
                feedErrorPlaceholder.a();
                return s3q0.a;
            case 6:
                GamesCatalogDetailFragment gamesCatalogDetailFragment = (GamesCatalogDetailFragment) this.c;
                int i2 = GamesCatalogDetailFragment.d0;
                return new wat(((GamesCatalogComponent) m7m.d(gamesCatalogDetailFragment).a(fpf0.a(GamesCatalogComponent.class))).c());
            case 7:
                return ((com.vk.geo.impl.presentation.b) this.c).s;
            case 8:
                return ((SearchCommunitiesOnMapComponent) ((k7m) m7m.f((GlobalSearchGroupsCatalogRootVhOld) this.c)).mo408a(fpf0.a(SearchCommunitiesOnMapComponent.class))).ma();
            case 9:
                return ((y4u) this.c).g.rc();
            case 10:
                return ((VoipCallComponent) ((k7m) m7m.f((uhu) this.c)).a(fpf0.a(VoipCallComponent.class))).c0();
            case 11:
                return ((BridgeComponent) ((k7m) m7m.f((nbv) this.c)).a(fpf0.a(BridgeComponent.class))).x().a();
            case 12:
                io2 io2Var = ((com.vk.im.video.g) this.c).u;
                if (io2Var != null) {
                    io2Var.e0();
                }
                return s3q0.a;
            case 13:
                return Float.valueOf(nkn0.h(((yvj) this.c).getCoroutineContext()));
            case 14:
                return Float.valueOf(((kge0) this.c).a());
            case 15:
                return Float.valueOf(((puy) this.c).q.b());
            case 16:
                return (VideoTextureView) ((whz) this.c).getView().findViewById(R.id.video_texture);
            case 17:
                RecyclerView recyclerView = ((LocalMediaPickerFragmentOld) this.c).W;
                if (recyclerView != null) {
                    recyclerView.invalidateItemDecorations();
                }
                return s3q0.a;
            case 18:
                gp00 gp00Var = (gp00) this.c;
                return new GestureDetector(gp00Var.b.a.getContext(), new zp00(gp00Var.d));
            case 19:
                ModalPostDonutFragment modalPostDonutFragment = (ModalPostDonutFragment) this.c;
                int i3 = ModalPostDonutFragment.W;
                xn50.a.c(modalPostDonutFragment, a.C1395a.b);
                return s3q0.a;
            case 20:
                return new bj30(((hk30) this.c).a);
            case 21:
                return new com.vk.im.ui.formatters.a(((x040) this.c).a);
            case 22:
                MusicArtistCatalogRootVh musicArtistCatalogRootVh = (MusicArtistCatalogRootVh) this.c;
                ?? r1 = musicArtistCatalogRootVh.s;
                u4a u4aVar = musicArtistCatalogRootVh.m;
                if (u4aVar.b.c) {
                    return (MusicPageToolbarVh) r1.getValue();
                }
                MusicPagePhoneHeaderVh musicPagePhoneHeaderVh = (MusicPagePhoneHeaderVh) musicArtistCatalogRootVh.x.getValue();
                if (musicPagePhoneHeaderVh == null) {
                    u4a.a aVar = u4aVar.b;
                    hh7 hh7Var = aVar.p;
                    CatalogConfiguration catalogConfiguration = aVar.s;
                    u2b0 u2b0Var = aVar.i;
                    b5a b5aVar = aVar.f;
                    SearchStatInfoProvider searchStatInfoProvider = aVar.m;
                    c750 c750Var = aVar.v;
                    b7a b7aVar = aVar.r;
                    MusicPlaybackLaunchContext musicPlaybackLaunchContext = musicArtistCatalogRootVh.r;
                    zc40 zc40Var = (zc40) musicArtistCatalogRootVh.u.getValue();
                    if (zc40Var == null) {
                        zc40Var = new zc40(catalogConfiguration.U(), catalogConfiguration.K(u4aVar), aVar.e);
                    }
                    musicPagePhoneHeaderVh = new MusicPagePhoneHeaderVh(new ArtistInfoVh(hh7Var, u2b0Var, b5aVar, searchStatInfoProvider, c750Var, b7aVar, musicPlaybackLaunchContext, zc40Var), (MusicPageToolbarVh) r1.getValue());
                }
                return musicPagePhoneHeaderVh;
            case 23:
                l7m f = m7m.f((MusicCatalogRootVh) this.c);
                bpn0 bpn0Var = o25.a;
                if (bpn0Var == null) {
                    bpn0Var = null;
                }
                UserId c = ((b25) bpn0Var.getValue()).c();
                uuh0 uuh0Var = new uuh0(0);
                ewy ewyVar = ((SearchHistoryProviderComponent) ((k7m) f).d(new FeatureScopesKt$createFeatureScope$scope$1(new SearchHistoryScope(c, uuh0Var), new rxh0(c, uuh0Var), fpf0.a(SearchHistoryProviderComponent.class), new sc8(uuh0Var, 3))).b(fpf0.a(SearchHistoryProviderComponent.class), new fvh0(uuh0Var, com.vk.toggle.d.K()))).c;
                qcy<Object> qcyVar = SearchHistoryProviderComponent.d[0];
                return (yp70) ewyVar.c();
            case 24:
                return ((CatalogInteractorComponent) ((k7m) m7m.f((MusicMyAudiosCatalogRootVh) this.c)).a(fpf0.a(CatalogInteractorComponent.class))).z0();
            case 25:
                MusicPlaybackQueueComponentImpl musicPlaybackQueueComponentImpl = (MusicPlaybackQueueComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = MusicPlaybackQueueComponentImpl.f;
                nwy nwyVar = musicPlaybackQueueComponentImpl.e;
                qcy<Object> qcyVar2 = MusicPlaybackQueueComponentImpl.f[4];
                return (pxa0) nwyVar.c();
            case 26:
                return ((NewsfeedFragment) this.c).k0;
            case 27:
                ((rtg0) this.c).invoke(Boolean.TRUE);
                return s3q0.a;
            case 28:
                OldQrAuthFragment oldQrAuthFragment = (OldQrAuthFragment) this.c;
                int i4 = OldQrAuthFragment.U;
                return new OldQrAuthFragment.b(oldQrAuthFragment);
            default:
                wh50 wh50Var = (wh50) this.c;
                dt1.a.getClass();
                wh50Var.setValue(dt1.a.n);
                return s3q0.a;
        }
    }
}
