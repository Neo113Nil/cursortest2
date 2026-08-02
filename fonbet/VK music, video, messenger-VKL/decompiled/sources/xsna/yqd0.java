package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.material.appbar.NonBouncedAppBarFixedSwipeRefreshLayout;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.catalog2.common.ui.holders.search.SearchSuggestionVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.category.VideoCategoryRootVh;
import com.vk.comments.api.di.CommentsComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.documents.impl.TypedDocumentsListFragment;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.photo.editor.features.mlenhance.TextSwitcherView;
import com.vk.search.integration.api.SearchTab;
import com.vk.search.integration.api.di.SearchComponent;
import com.vk.search.ui.impl.catalog.SearchInCommunityCatalogFragment;
import com.vk.sharing.im_engine_impl.di.SharingImEngineScopedComponentImpl;
import com.vk.stories.design.view.editor.verticalization.VerticalizationLoadingView;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.StoryStatisticsStickersFragment;
import com.vk.stories.design.view.stickers.selection.SelectionStickerView;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.video.bugreport.api.di.VideoTechBugreportComponent;
import com.vk.video.profile.presentation.a;
import com.vk.writebar.fullscreen.WriteBarButtonsBubbleView;
import com.vkontakte.android.R;
import com.vkontakte.android.api.DocsGetTypesResult;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b4;
import xsna.iqh0;
import xsna.jne0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class yqd0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yqd0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0119, code lost:
    
        r7.v("VideoTrackHandler", "last rendered/written video sample pts=" + r9 + '/' + r13);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v83, types: [T, xsna.bqu0] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object obj;
        int i;
        int i2 = this.b;
        int i3 = 0;
        AttributeSet attributeSet = null;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                return ((CartComponent) ((zqd0) obj2).e.getValue()).I0();
            case 1:
                ((a2t) obj2).b();
                return s3q0.a;
            case 2:
                return ((CommentsComponent) ((k7m) m7m.f((m3g0) obj2)).mo408a(fpf0.a(CommentsComponent.class))).I3();
            case 3:
                np40 np40Var = ((ych0) obj2).k;
                Context context = e43.a;
                np40Var.i(context != null ? context : null);
                return s3q0.a;
            case 4:
                SearchInCommunityCatalogFragment searchInCommunityCatalogFragment = (SearchInCommunityCatalogFragment) obj2;
                int i4 = SearchInCommunityCatalogFragment.T;
                int i5 = searchInCommunityCatalogFragment.requireArguments().getInt("tab");
                Iterator<E> it = SearchTab.h().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((SearchTab) obj).ordinal() == i5) {
                        }
                    } else {
                        obj = null;
                    }
                }
                SearchTab searchTab = (SearchTab) obj;
                if (searchTab == null) {
                    searchTab = SearchTab.WALL;
                }
                Context requireContext = searchInCommunityCatalogFragment.requireContext();
                switch (qvh0.$EnumSwitchMapping$1[searchTab.ordinal()]) {
                    case 1:
                        i = R.string.search_clips;
                        break;
                    case 2:
                        i = R.string.search_market;
                        break;
                    case 3:
                        i = R.string.search_music;
                        break;
                    case 4:
                        i = R.string.search_photos;
                        break;
                    case 5:
                        i = R.string.search_video;
                        break;
                    case 6:
                        i = R.string.search_posts;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return ((SearchComponent) ((k7m) m7m.f(searchInCommunityCatalogFragment)).mo408a(fpf0.a(SearchComponent.class))).V3().a(new iqh0.e(searchInCommunityCatalogFragment, new UserId(searchInCommunityCatalogFragment.requireArguments().getLong("owner_id")), searchTab, requireContext.getString(i)));
            case 5:
                SearchSuggestionVh searchSuggestionVh = (SearchSuggestionVh) obj2;
                Map<String, Integer> map = SearchSuggestionVh.g;
                searchSuggestionVh.z(R.id.search_suggestion_close, searchSuggestionVh.d);
                return s3q0.a;
            case 6:
                SelectionStickerView selectionStickerView = SelectionStickerView.this;
                selectionStickerView.k0.K();
                selectionStickerView.J0();
                return null;
            case 7:
                SharingImEngineScopedComponentImpl sharingImEngineScopedComponentImpl = (SharingImEngineScopedComponentImpl) obj2;
                return new vbj0(sharingImEngineScopedComponentImpl.b.b0(), sharingImEngineScopedComponentImpl.c.l(), sharingImEngineScopedComponentImpl.d.g(), sharingImEngineScopedComponentImpl.e.g());
            case 8:
                return StoryStatisticsStickersFragment.fo((StoryStatisticsStickersFragment) obj2);
            case 9:
                d0u0.a(((TextSwitcherView) obj2).d.animate().alpha(1.0f).setDuration(150L), new xbj0(4)).start();
                return s3q0.a;
            case 10:
                ((xpp0) obj2).dismiss();
                return s3q0.a;
            case 11:
                int i6 = TypedDocumentsListFragment.e0;
                return Integer.valueOf(((TypedDocumentsListFragment) obj2).requireArguments().getInt("type_id", DocsGetTypesResult.DocType.Type.ALL.h()));
            case 12:
                mxq0 mxq0Var = (mxq0) obj2;
                s530 pa = ((ModerationComponent) ((k7m) m7m.f(mxq0Var)).mo408a(fpf0.a(ModerationComponent.class))).pa();
                FragmentImpl fragmentImpl = mxq0Var.b;
                return pa.b(fragmentImpl.requireContext(), fragmentImpl.getViewLifecycleOwner(), false);
            case 13:
                return ((VideoTechBugreportComponent) ((g8m) obj2).c(fpf0.a(VideoTechBugreportComponent.class))).getReporter();
            case 14:
                List<Integer> list = VerticalizationLoadingView.A;
                ((VerticalizationLoadingView) obj2).P4();
                return s3q0.a;
            case 15:
                return (BridgeComponent) ((k7m) m7m.f((b9s0) obj2)).a(fpf0.a(BridgeComponent.class));
            case 16:
                gzs<s3q0> gzsVar = ((VideoCatalogRootVh) obj2).t;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 17:
                VideoCategoryRootVh videoCategoryRootVh = (VideoCategoryRootVh) obj2;
                DisableableViewPager disableableViewPager = videoCategoryRootVh.u.o;
                if (disableableViewPager == null) {
                    disableableViewPager = null;
                }
                CatalogRecyclerPaginatedView catalogRecyclerPaginatedView = (CatalogRecyclerPaginatedView) disableableViewPager.findViewById(R.id.paginated_list);
                videoCategoryRootVh.r = catalogRecyclerPaginatedView;
                if (catalogRecyclerPaginatedView != null) {
                    catalogRecyclerPaginatedView.Om(videoCategoryRootVh);
                }
                videoCategoryRootVh.y = null;
                CatalogRecyclerPaginatedView catalogRecyclerPaginatedView2 = videoCategoryRootVh.r;
                if (catalogRecyclerPaginatedView2 != null) {
                    awt0.x(catalogRecyclerPaginatedView2.getRecyclerView(), 0, 0, 0, 0, 10);
                    ViewGroup viewGroup = videoCategoryRootVh.E;
                    catalogRecyclerPaginatedView2.setRefreshDelegate(new RecyclerPaginatedView.n(viewGroup != null ? (NonBouncedAppBarFixedSwipeRefreshLayout) viewGroup.findViewById(R.id.category_root_swipe) : null));
                }
                return s3q0.a;
            case 18:
                hds0 hds0Var = (hds0) obj2;
                e020 e020Var = hds0Var.b.e;
                long currentTimeMillis = System.currentTimeMillis();
                csp cspVar = hds0Var.a;
                f100 f100Var = cspVar.d;
                if (f100Var != null) {
                    f100Var.v("VideoTrackHandler", "try to drain video track encoder ...");
                }
                fkn0 fkn0Var = hds0Var.g;
                if (fkn0Var == null) {
                    fkn0Var = null;
                }
                long j = 1000;
                long j2 = fkn0Var.d / j;
                long a = e020Var.a();
                while (true) {
                    kfp0<zis0> kfp0Var = hds0Var.h;
                    kfp0 kfp0Var2 = kfp0Var;
                    if (kfp0Var == null) {
                        kfp0Var2 = attributeSet;
                    }
                    if (!kfp0Var2.g.b() && !((Boolean) cspVar.c.get()).booleanValue() && j2 > a && !Thread.currentThread().isInterrupted()) {
                        if (f100Var != null) {
                            f100Var.v("VideoTrackHandler", "last rendered/written video sample pts=" + j2 + '/' + a);
                        }
                        kfp0<zis0> kfp0Var3 = hds0Var.h;
                        if (kfp0Var3 == null) {
                            kfp0Var3 = null;
                        }
                        kfp0Var3.a();
                        fkn0 fkn0Var2 = hds0Var.g;
                        if (fkn0Var2 == null) {
                            fkn0Var2 = null;
                        }
                        j2 = fkn0Var2.d / j;
                        a = e020Var.a();
                        attributeSet = null;
                    }
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (f100Var != null) {
                    f100Var.v("VideoTrackHandler", qlb0.a(currentTimeMillis2, "drain video track encoder took ", " ms"));
                }
                return s3q0.a;
            case 19:
                ((com.vk.libvideo.bottomsheet.about.delegate.g0) obj2).a.d(b4.w.a);
                return s3q0.a;
            case 20:
                ((cys0) obj2).b0.invoke(a.u.b);
                return s3q0.a;
            case 21:
                jat0 jat0Var = (jat0) obj2;
                jat0Var.f.Qc("video_quality_new_settings");
                jat0Var.b = null;
                return s3q0.a;
            case 22:
                return Boolean.valueOf(((VideoView) obj2).s0);
            case 23:
                return new VkButton(((VkGroupHeader.b) obj2).b, attributeSet, 6, i3);
            case 24:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                ?? x = (superappUiRouterBridge != null ? superappUiRouterBridge : null).x(false);
                ref$ObjectRef.element = x;
                if (x != 0) {
                    x.show();
                }
                return s3q0.a;
            case 25:
                ((nmw0) obj2).a.getClass();
                return com.vk.voip.ui.c.J().f();
            case 26:
                ((vvw0) obj2).C(jne0.a.b.b);
                return s3q0.a;
            case 27:
                ((mk) obj2).invoke();
                return s3q0.a;
            default:
                return (WriteBarButtonsBubbleView) ((ViewStub) ((c1y0) obj2).a.findViewById(R.id.writebar_fullscreen_buttons_bubble_viewstub)).inflate();
        }
    }
}
