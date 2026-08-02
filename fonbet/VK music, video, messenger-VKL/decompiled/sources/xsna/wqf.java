package xsna;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.community.design.view.cover.CommunityStaticCover;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.widget.LifecycleHandler;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.discover.carousel.apps.AppCarousel;
import com.vk.geo.api.data.GeoStaticPreviewInput;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import com.vk.network.eventhub.impl.di.EventHubComponentImpl;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchAllCatalogRootVh;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchMarketCatalogRootVh;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.cpu.CpuUsagePercentCalculator;
import xsna.qfs;
import xsna.sst0;
import xsna.xn50;
import xsna.yqx;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class wqf implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wqf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        LinkButton linkButton;
        Action action;
        GeoStaticPreviewInput geoStaticPreviewInput;
        Object obj;
        int i = this.b;
        int i2 = 21;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i3 = ClipsWrapperFragment.Q0;
                return new mjd(new ClipsWrapperFragment.c(0, (ClipsWrapperFragment) obj2, ClipsWrapperFragment.class, "getCurrentClipFeedPage", "getCurrentClipFeedPage()Lcom/vk/clips/sdk/shared/api/ui/ClipsFeedViewPage;", 0));
            case 1:
                ClipsWrapperInputArguments.a aVar = ClipsWrapperInputArguments.r;
                Bundle a = ((ClipsWrapperInputArguments) obj2).a();
                aVar.getClass();
                return Boolean.valueOf(a != null ? a.getBoolean("no_bottom_navigation", false) : false);
            case 2:
                ((pog) obj2).e = null;
                return s3q0.a;
            case 3:
                int i4 = CommunityProfileFragment.k0;
                xn50.a.c((CommunityProfileFragment) obj2, new CommunityProfileAction.s(new t8q0(true)));
                return s3q0.a;
            case 4:
                vuh vuhVar = (vuh) obj2;
                vuhVar.o.b(((sst0.b) vuhVar.m).a, (h270) vuhVar.E.getValue());
                return s3q0.a;
            case 5:
                return (NewsFeedComponent) ((k7m) m7m.f((vvh) obj2)).a(fpf0.a(NewsFeedComponent.class));
            case 6:
                CommunityStaticCover communityStaticCover = (CommunityStaticCover) obj2;
                int i5 = CommunityStaticCover.g;
                CommunityStaticCover.a state = communityStaticCover.getState();
                CommunityStaticCover.a.C0723a c0723a = state instanceof CommunityStaticCover.a.C0723a ? (CommunityStaticCover.a.C0723a) state : null;
                communityStaticCover.setState(new CommunityStaticCover.a.b(c0723a != null ? c0723a.b : null));
                return s3q0.a;
            case 7:
                return (TextView) ((s5i) obj2).a.findViewById(R.id.nativeads_title);
            case 8:
                return Float.valueOf(CpuUsagePercentCalculator.a((CpuUsagePercentCalculator) obj2));
            case 9:
                rdk rdkVar = (rdk) obj2;
                ((tdk) rdkVar.f.getValue()).f();
                rdkVar.a();
                return s3q0.a;
            case 10:
                qal qalVar = (qal) obj2;
                AppCarousel appCarousel = (AppCarousel) qalVar.q6();
                if (appCarousel != null && (linkButton = appCarousel.i) != null && (action = linkButton.c) != null) {
                    hd60.a().v(action, qalVar.itemView.getContext(), (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
                }
                return s3q0.a;
            case 11:
                return Boolean.valueOf(vtk0.d().b(((nrl) obj2).a));
            case 12:
                return ((qum) obj2).b.a(OpenChatListReporter.Span.LOAD_DIALOGS);
            case 13:
                c3n c3nVar = (c3n) obj2;
                c3nVar.d = null;
                c3nVar.a(null);
                return s3q0.a;
            case 14:
                a5n a5nVar = ((e4n) obj2).f;
                return new Result(a5nVar.b.f(new txf0(), new kjj0(a5nVar.c)));
            case 15:
                DiscoverSimilarFeedFragment discoverSimilarFeedFragment = (DiscoverSimilarFeedFragment) obj2;
                qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
                return new b7n(new sje(discoverSimilarFeedFragment, i2), new cwg(discoverSimilarFeedFragment, 12), new z3i(discoverSimilarFeedFragment, 6), new z4f(discoverSimilarFeedFragment, 18));
            case 16:
                return new gsi(((mqp) obj2).y);
            case 17:
                qcy<Object>[] qcyVarArr2 = EventHubComponentImpl.e;
                return ((AuthBridgeComponent) obj2).s();
            case 18:
                return Float.valueOf(((c700) obj2).getValue().floatValue());
            case 19:
                return bwt0.G(((com.vk.newsfeed.common.recycler.holders.a) obj2).c0);
            case 20:
                qfs.a aVar2 = ((ufs) obj2).e;
                qfs.this.l.x(aVar2.a);
                return s3q0.a;
            case 21:
                ((t3t) obj2).f.invoke();
                return s3q0.a;
            case 22:
                ont ontVar = ((com.vk.geo.impl.presentation.b) obj2).i;
                return (ontVar == null || (geoStaticPreviewInput = ontVar.b) == null) ? y5u0.l : new y5u0(geoStaticPreviewInput.l, geoStaticPreviewInput.k, 496);
            case 23:
                Iterator<T> it = ((GlobalSearchAllCatalogRootVh) obj2).k0().mo78O0().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((UIBlock) obj).d == CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS) {
                        }
                    } else {
                        obj = null;
                    }
                }
                UIBlock uIBlock = (UIBlock) obj;
                UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
                ArrayList<UIBlock> arrayList = uIBlockList != null ? uIBlockList.y : null;
                if (arrayList == null) {
                    return EmptyList.b;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (obj3 instanceof UIBlockVideo) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((UIBlockVideo) it2.next()).B);
                }
                return arrayList3;
            case 24:
                return ((GlobalSearchMarketCatalogRootVh) obj2).p.length() == 0 ? CommonMarketStat$TypeRefSource.SEARCH_RECOMMENDATIONS : CommonMarketStat$TypeRefSource.SEARCH_GOODS;
            case 25:
                return ((y4u) obj2).n.F();
            case 26:
                f69 f69Var = (f69) ((gxu) obj2).d.b;
                com.vk.voip.ui.c.b.getClass();
                f69Var.a(new izy(((r6x0) com.vk.voip.ui.c.l0()).o()));
                return s3q0.a;
            case 27:
                m5v m5vVar = (m5v) obj2;
                zt1 zt1Var = m5vVar.n;
                View view = m5vVar.itemView;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int width = view.getWidth() + iArr[0];
                int i6 = 24;
                int height = (view.getHeight() / 2) + iArr[1] + 24;
                Rect rect = new Rect(width - 1, height - 5, width + 1, height + 5);
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                view.getContext();
                e.c cVar = new e.c(null, rect, view, l, 1);
                if (m5vVar.q6().k) {
                    VkContextMenu.c.c(cVar, R.string.favorites_remove, null, false, null, new gbj(m5vVar, 20), 30);
                } else {
                    VkContextMenu.c.c(cVar, R.string.favorites_add, null, false, null, new u3k(m5vVar, i2), 30);
                }
                if (zt1Var.P4()) {
                    VkContextMenu.c.c(cVar, R.string.edit, null, false, null, new w8q(m5vVar, 9), 30);
                }
                if (!m5vVar.q6().l.isEmpty()) {
                    VkContextMenu.c.c(cVar, R.string.share, null, false, null, new n5i(m5vVar, 23), 30);
                }
                if (zt1Var.P4() && m5vVar.q6().j) {
                    VkContextMenu.c.c(cVar, R.string.narrative_delete_action, null, false, null, new jcg(m5vVar, i6), 30);
                }
                cVar.j();
                return s3q0.a;
            case 28:
                yqx.b bVar = yqx.n1;
                return LifecycleHandler.c(((yqx) obj2).kn());
            default:
                xwv0 xwv0Var = ((n1y) obj2).b;
                if (xwv0Var != null) {
                    return xwv0Var.getView();
                }
                return null;
        }
    }
}
