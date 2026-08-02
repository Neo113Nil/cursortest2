package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicClipsSelectorCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh;
import com.vk.catalog2.feature.music.holders.podcast.PodcastCategoryVh;
import com.vk.catalog2.feature.music.ui.holder.MusicDownloadsHistoryCatalogRootVh;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.search.ModernSearchView;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.bottomsheet.about.delegate.e;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.fragments.videos.VideosFragment;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.n1k0;
import xsna.q630;
import xsna.tt9;
import xsna.ush;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class z5 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ModernSearchView modernSearchView;
        int i = this.b;
        us2 us2Var = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                e.a aVar = (e.a) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1992237762, intValue, -1, "com.vk.libvideo.bottomsheet.about.delegate.AboutVideoCounterVkUiDelegate.ViewHolder.<anonymous>.<anonymous> (AboutVideoCounterVkUiDelegate.kt:76)");
                    }
                    vxj vxjVar = (vxj) ((zak0) aVar.l).getValue();
                    if (vxjVar == null) {
                        aVar2.K(-1397863844);
                    } else {
                        aVar2.K(-1397863843);
                        b6.a(vxjVar, null, aVar2, 0);
                    }
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 1:
                ush.a aVar3 = (ush.a) obj;
                l3f l3fVar = ((ush) obj3).f;
                List list = aVar3.a;
                if (list == null) {
                    list = EmptyList.b;
                }
                l3fVar.invoke(new d.n.c.b.g(list, aVar3.c));
                return s3q0.a;
            case 2:
                ((sti) obj).a(new dm20((sl50) obj2, (mo60) obj3));
                return s3q0.a;
            case 3:
                MusicDownloadsHistoryCatalogRootVh musicDownloadsHistoryCatalogRootVh = (MusicDownloadsHistoryCatalogRootVh) obj3;
                String str = (String) obj;
                musicDownloadsHistoryCatalogRootVh.i8(myc0.f(str) ? vyh0.a : alj.a);
                SearchResultsVh.cb(musicDownloadsHistoryCatalogRootVh.C, str, null, null, false, null, false, 60);
                return s3q0.a;
            case 4:
                MusicClipsSelectorCatalogRootVh musicClipsSelectorCatalogRootVh = (MusicClipsSelectorCatalogRootVh) obj3;
                String str2 = (String) obj;
                SearchInputMethod searchInputMethod = (SearchInputMethod) obj2;
                if (!(musicClipsSelectorCatalogRootVh.r && (modernSearchView = musicClipsSelectorCatalogRootVh.A.b.k) != null && modernSearchView.getFocused()) && str2.length() == 0) {
                    return s3q0.a;
                }
                musicClipsSelectorCatalogRootVh.i8(vyh0.a);
                SearchResultsVh.cb(musicClipsSelectorCatalogRootVh.G, str2, null, null, false, searchInputMethod, false, 46);
                MusicSelectorCatalogRootVh.a aVar4 = musicClipsSelectorCatalogRootVh.q;
                if (aVar4 != null) {
                    aVar4.d();
                }
                return s3q0.a;
            case 5:
                final PodcastCategoryVh podcastCategoryVh = (PodcastCategoryVh) obj3;
                final View view = (View) obj;
                final UIBlockLink uIBlockLink = (UIBlockLink) obj2;
                return new c98(new View.OnClickListener() { // from class: xsna.ogb0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        UIBlockLink uIBlockLink2 = UIBlockLink.this;
                        CatalogLink catalogLink = uIBlockLink2.y;
                        if (catalogLink != null) {
                            PodcastCategoryVh podcastCategoryVh2 = podcastCategoryVh;
                            b5a b5aVar = podcastCategoryVh2.b;
                            Meta meta = catalogLink.g;
                            SearchStatsLoggingInfo searchStatsLoggingInfo = null;
                            b5aVar.a(new cfp0(uIBlockLink2, meta != null ? meta.c : null));
                            SearchStatInfoProvider searchStatInfoProvider = podcastCategoryVh2.c;
                            if (searchStatInfoProvider != null) {
                                SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.LINK;
                                String r = uIBlockLink2.r();
                                if (r == null) {
                                    r = "";
                                }
                                searchStatsLoggingInfo = searchStatInfoProvider.b(type, r, false);
                            }
                            LaunchContext.a aVar5 = new LaunchContext.a();
                            aVar5.d = uIBlockLink2.f;
                            if (searchStatsLoggingInfo != null) {
                                aVar5.m = searchStatsLoggingInfo;
                            }
                            maz.c(xwk.d().e(), view.getContext(), catalogLink.e, aVar5.a(), null, null, 24);
                        }
                    }
                }, 1);
            case 6:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                View view2 = ((PostponedPostsFragment) obj3).b0;
                if (view2 != null) {
                    view2.setVisibility(booleanValue ? 0 : 8);
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                ((yfd0) obj3).a(q630.a.a, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                nud0.e((tt9.b) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                gbh0.c((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 10:
                n1k0.a aVar5 = (n1k0.a) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1967409026, intValue2, -1, "com.vk.video.ui.discovery.minimizable.recycler.SlidingBlockDelegate.ViewHolder.<anonymous> (SlidingBlockDelegate.kt:57)");
                    }
                    rrv0.e(true, null, null, null, null, null, kai.c(-1529942235, new m00(aVar5, 6), aVar6), aVar6, 1572870, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 11:
                DonutVideoUiModel.PreviewBadge previewBadge = (DonutVideoUiModel.PreviewBadge) obj3;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                aVar7.K(762727758);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(762727758, intValue3, -1, "com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletViewStateMapper.getPreview.<anonymous>.<anonymous> (VideoLargeListTabletViewStateMapper.kt:134)");
                }
                DonutPriceTemplate donutPriceTemplate = previewBadge.c;
                if (donutPriceTemplate == null) {
                    aVar7.K(2045686232);
                } else {
                    aVar7.K(-1458030775);
                    us2Var = z1o.a(donutPriceTemplate, null, aVar7, 1);
                }
                aVar7.j();
                if (us2Var == null) {
                    aVar7.K(-1458028663);
                    us2Var = ws2.b(previewBadge.b, aVar7, 0);
                    aVar7.j();
                } else {
                    aVar7.K(-1458031360);
                    aVar7.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar7.j();
                return us2Var;
            default:
                VideosFragment videosFragment = (VideosFragment) obj3;
                int i2 = VideosFragment.z0;
                new hp0(videosFragment.getActivity(), videosFragment.m0, ((CharSequence) obj2).toString(), 0).a();
                return null;
        }
    }

    public /* synthetic */ z5(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
