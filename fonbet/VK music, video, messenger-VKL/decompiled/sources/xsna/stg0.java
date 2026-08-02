package xsna;

import android.os.Bundle;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.attachpicker.stickers.selection.searchmode.SearchMode;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.libvideo.ui.SimilarVideoBigView;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.music.stickyplayer.StickyMusicPlayerBottomSheet;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.video.profile.di.VideoProfileNavigationComponentImpl;
import com.vk.video.profile.presentation.a;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vkontakte.android.R;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import one.video.player.model.FrameSize;
import xsna.rye;
import xsna.swj0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class stg0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ stg0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        AwaitInitialization initialize$lambda$220$lambda$179;
        String str;
        File file;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((rye.b) obj).a();
                return s3q0.a;
            case 1:
                w1h0 w1h0Var = ((p1h0) obj).d;
                if (w1h0Var == null) {
                    return null;
                }
                Bundle b = yfb.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                w1h0Var.b(b);
                if (b.isEmpty()) {
                    return null;
                }
                return b;
            case 2:
                return ((NarrativeComponent) ((k7m) m7m.f((s8i0) obj)).a(fpf0.a(NarrativeComponent.class))).V7();
            case 3:
                afi0 afi0Var = (afi0) obj;
                VkSearchView vkSearchView = afi0Var.i;
                if (vkSearchView != null) {
                    vkSearchView.setHint(R.string.sticker_search_gif_mode);
                }
                VkSearchView vkSearchView2 = afi0Var.i;
                if (vkSearchView2 != null) {
                    vkSearchView2.d0();
                }
                SearchMode searchMode = SearchMode.GIF;
                if (searchMode != afi0Var.w) {
                    afi0Var.w = searchMode;
                    afi0Var.f();
                }
                afi0Var.j(false);
                afi0Var.r.m.onNext("");
                return s3q0.a;
            case 4:
                initialize$lambda$220$lambda$179 = ServiceProvider.initialize$lambda$220$lambda$179((ServicesRegistry) obj);
                return initialize$lambda$220$lambda$179;
            case 5:
                int i2 = SimilarVideoBigView.f;
                return Boolean.valueOf(((DonutVideoComponent) ((k7m) m7m.c((SimilarVideoBigView) obj)).a(fpf0.a(DonutVideoComponent.class))).J().a());
            case 6:
                ((swj0) obj).b7(swj0.a.C3696a.a);
                return s3q0.a;
            case 7:
                int i3 = StickyMusicPlayerBottomSheet.c0;
                return ((PlayerAnalyticsComponent) ((k7m) m7m.c((StickyMusicPlayerBottomSheet) obj)).a(fpf0.a(PlayerAnalyticsComponent.class))).z7();
            case 8:
                jtl0 jtl0Var = (jtl0) obj;
                anm0.E((anm0) jtl0Var.v.getValue(), StoryViewAction.DISCOVER_UNHIDE, jtl0Var.q, MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER, null, null, 56);
                return s3q0.a;
            case 9:
                StoryArchiveFragment storyArchiveFragment = StoryArchiveFragment.this;
                int i4 = StoryArchiveFragment.h0;
                storyArchiveFragment.mo("archive_menu_button");
                return s3q0.a;
            case 10:
                sbo0 sbo0Var = (sbo0) obj;
                sbo0Var.F = null;
                itl.f(sbo0Var).R();
                itl.f(sbo0Var).Q();
                mio.a(sbo0Var);
                return Boolean.TRUE;
            case 11:
                return new h9x(((l9x) obj).c());
            case 12:
                y2p0 y2p0Var = (y2p0) obj;
                y2p0Var.a.n2(y2p0Var.b.getContext());
                return s3q0.a;
            case 13:
                ((h4p0) obj).invoke(2);
                return Boolean.TRUE;
            case 14:
                return ((pzp0) obj).l;
            case 15:
                dbq0 dbq0Var = (dbq0) obj;
                if (dbq0Var == null || (file = dbq0Var.a) == null || (str = file.getName()) == null) {
                    str = "null";
                }
                return "pop: return ".concat(str);
            case 16:
                return Integer.valueOf(((ja5) obj).a().c);
            case 17:
                return (MarketComponent) ((k7m) m7m.f((mxq0) obj)).a(fpf0.a(MarketComponent.class));
            case 18:
                return new c9r0((d9r0) obj);
            case 19:
                jpr0 jpr0Var = (jpr0) obj;
                y3p M0 = ((StoryEditorExtDepsComponent) ((k7m) m7m.f(jpr0Var)).a(fpf0.a(StoryEditorExtDepsComponent.class))).M0();
                u76 u76Var = jpr0Var.c;
                M0.t(new tj8(u76Var, jpr0Var.b, u76Var.H2()));
                return M0;
            case 20:
                gzs<s3q0> gzsVar = ((VideoCatalogRootVh) obj).s;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 21:
                cms0 cms0Var = (cms0) obj;
                FrameSize frameSize = cms0Var.h;
                if (frameSize != null) {
                    return frameSize;
                }
                AtomicInteger atomicInteger = e3r0.a;
                return e3r0.a(cms0Var.e, cms0Var.f);
            case 22:
                return (DonutVideoComponent) ((k7m) m7m.f((VideoItemListLargeVh) obj)).a(fpf0.a(DonutVideoComponent.class));
            case 23:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj;
                int i5 = VideoMinimizableDiscoveryFragment.p1;
                videoMinimizableDiscoveryFragment.getClass();
                xn50.a.c(videoMinimizableDiscoveryFragment, c.l.e.b);
                return s3q0.a;
            case 24:
                ((cys0) obj).b0.invoke(a.d0.b);
                return s3q0.a;
            case 25:
                VideoProfileNavigationComponentImpl videoProfileNavigationComponentImpl = (VideoProfileNavigationComponentImpl) obj;
                qcy<Object>[] qcyVarArr = VideoProfileNavigationComponentImpl.f;
                return new q8t0(new bpn0(new wcs0(videoProfileNavigationComponentImpl, 3)), new bpn0(new yei0(videoProfileNavigationComponentImpl, 21)), new bpn0(new mwm0(videoProfileNavigationComponentImpl, 13)), new fuc0(videoProfileNavigationComponentImpl, 25));
            case 26:
                return ((kkt0) obj).c.sf();
            case 27:
                return Long.valueOf(((hgl0) ((tau0) obj).h.getValue()).a());
            case 28:
                return ((BridgeComponent) ((k7m) m7m.f((com.vk.catalog2.common.ui.mvp.configuration.a) obj)).a(fpf0.a(BridgeComponent.class))).Le();
            default:
                ((gbv0) obj).n(new a6c(), "a6c");
                return s3q0.a;
        }
    }
}
