package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.ironsource.O6;
import com.vk.catalog.mvi.block.impl.slider.SliderView;
import com.vk.catalog2.feature.music.ui.holder.PodcastCatalogRootVh;
import com.vk.clips.sdk.shared.item.market_ads.events.MarketAdsItemViewEvent;
import com.vk.core.sticky_header.StickyHeadersLinearLayoutManager;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.StoryBackground;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.feed.settings.impl.presentation.filtered.tab.NewsfeedFilterListFragment2;
import com.vk.feed.settings.impl.presentation.filtered.tab.g;
import com.vk.geo.api.GeoFragmentOptions;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.music.player.StartPlayCatalogSource;
import com.vk.music.player.StartPlayPodcastSource;
import com.vk.music.player.StartPlaySource;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.search.communities.map.impl.ui.map.SearchCommunitiesOnMapFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import xsna.dp20;
import xsna.dug0;
import xsna.ejd0;
import xsna.gm50;
import xsna.gv30;
import xsna.qr60;
import xsna.ws00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class pb00 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pb00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        gv30 gv30Var;
        com.vk.im.engine.models.dialogs.d b;
        String str;
        UserId userId;
        int i = 11;
        int i2 = 10;
        int i3 = 6;
        switch (this.b) {
            case 0:
                qb00 qb00Var = (qb00) this.c;
                qa00 qa00Var = (qa00) qb00Var.l;
                if (qa00Var != null) {
                    qb00Var.n.L2(new kz6(qa00Var.b));
                }
                return s3q0.a;
            case 1:
                ((dq00) this.c).b.a(MarketAdsItemViewEvent.a.b);
                return s3q0.a;
            case 2:
                MarketAllReviewsFragment marketAllReviewsFragment = (MarketAllReviewsFragment) this.c;
                ws00 ws00Var = (ws00) obj;
                int i4 = MarketAllReviewsFragment.d0;
                int i5 = 15;
                if (ws00Var instanceof ws00.b) {
                    ws00.b bVar = (ws00.b) ws00Var;
                    View view = bVar.a;
                    int c = dhr0.t.c(R.attr.vk_ui_background_contrast_themed);
                    view.getContext();
                    e.b bVar2 = new e.b(view, null, null, c, 6);
                    bVar2.w = R.layout.ds_internal_context_menu_item;
                    if (bVar.c) {
                        VkContextMenu.c.c(bVar2, R.string.market_all_reviews_community_modal_action_edit_one, null, false, null, new eg1(9, marketAllReviewsFragment, bVar), 30);
                    }
                    if (bVar.d) {
                        VkContextMenu.c.c(bVar2, R.string.market_all_reviews_community_modal_action_delete_one, null, false, null, new fg1(i5, marketAllReviewsFragment, bVar), 30);
                    }
                    bVar2.j();
                } else if (ws00Var instanceof ws00.c) {
                    ws00.c cVar = (ws00.c) ws00Var;
                    View view2 = cVar.a;
                    int c2 = dhr0.t.c(R.attr.vk_ui_background_contrast_themed);
                    view2.getContext();
                    e.b bVar3 = new e.b(view2, null, null, c2, 6);
                    bVar3.w = R.layout.ds_internal_context_menu_item;
                    if (cVar.c) {
                        VkContextMenu.c.c(bVar3, R.string.market_all_reviews_good_modal_action_edit_one, null, false, null, new com.vk.movika.sdk.base.presenter.c(i5, marketAllReviewsFragment, cVar), 30);
                    }
                    if (cVar.d) {
                        VkContextMenu.c.c(bVar3, R.string.market_all_reviews_good_modal_action_delete_one, null, false, null, new zv(13, marketAllReviewsFragment, cVar), 30);
                    }
                    bVar3.j();
                } else {
                    if (!(ws00Var instanceof ws00.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cvk.u(R.string.market_all_reviews_delete_and_restore_error, false);
                    SwipeRefreshLayout swipeRefreshLayout = marketAllReviewsFragment.Q;
                    if (swipeRefreshLayout == null) {
                        swipeRefreshLayout = null;
                    }
                    swipeRefreshLayout.setRefreshing(false);
                    SwipeRefreshLayout swipeRefreshLayout2 = marketAllReviewsFragment.Q;
                    if (swipeRefreshLayout2 == null) {
                        swipeRefreshLayout2 = null;
                    }
                    swipeRefreshLayout2.setEnabled(true);
                    NestedScrollView nestedScrollView = marketAllReviewsFragment.U;
                    if (nestedScrollView != null) {
                        bwt0.p0(nestedScrollView, false);
                    }
                    RecyclerView recyclerView = marketAllReviewsFragment.R;
                    bwt0.p0(recyclerView != null ? recyclerView : null, true);
                    VkSpinner vkSpinner = marketAllReviewsFragment.S;
                    if (vkSpinner != null) {
                        bwt0.p0(vkSpinner, false);
                    }
                }
                return s3q0.a;
            case 3:
                pg20 pg20Var = (pg20) this.c;
                return pg20Var.a.C(pg20Var, new eb20()).l(new ed(new s6x(7), 24));
            case 4:
                po20 po20Var = (po20) this.c;
                mlp mlpVar = (mlp) obj;
                int i6 = mlpVar.b;
                arm0.n(mlpVar.d);
                po20Var.d.onNext(new dp20.a(mlpVar.e));
                return s3q0.a;
            case 5:
                ((zak0) ((dr20) this.c).i).setValue((String) obj);
                return s3q0.a;
            case 6:
                gi30 gi30Var = (gi30) this.c;
                int i7 = gi30Var.d;
                w2w w2wVar = gi30Var.c;
                long j = gi30Var.f;
                int i8 = gi30Var.e;
                if (i7 == i8) {
                    gv30.a aVar = new gv30.a();
                    aVar.a = j;
                    aVar.a();
                    aVar.b();
                    aVar.c();
                    aVar.c = Integer.valueOf(i7);
                    gv30Var = new gv30(aVar);
                } else {
                    gv30.a aVar2 = new gv30.a();
                    aVar2.a = j;
                    aVar2.a();
                    aVar2.b();
                    aVar2.e = Integer.valueOf(i7);
                    aVar2.d(i8);
                    gv30Var = new gv30(aVar2);
                }
                Collection<Msg> a = new zd20(gv30Var, new utb(w2wVar.I0(), w2wVar.getExperiments()), false, false).a(w2wVar);
                gi30Var.h = a;
                r5 = a != null ? a.size() : 0;
                if (gi30Var.g == 1 && r5 != 0 && (b = w2wVar.I0().b().a().b(DialogsCounters.Type.BUSINESS_NOTIFY_TOTAL)) != null) {
                    w2wVar.I0().b().a().g(com.vk.im.engine.models.dialogs.d.a(b, b.b - r5));
                }
                return s3q0.a;
            case 7:
                u440 u440Var = (u440) this.c;
                Throwable th = (Throwable) obj;
                L.g("MultiStory", th);
                th.printStackTrace();
                h03.b(th);
                ((g440) u440Var.s).ik();
                u440Var.j.M();
                return s3q0.a;
            case 8:
                zrd0.a.e(((zy50) this.c).e);
                return s3q0.a;
            case 9:
                ((x660) this.c).a(((s380) obj).b);
                return s3q0.a;
            case 10:
                yp80 yp80Var = (yp80) this.c;
                Throwable th2 = (Throwable) obj;
                if (yp80Var != null) {
                    yp80Var.onError(th2);
                }
                return s3q0.a;
            case 11:
                NewsfeedFilterListFragment2 newsfeedFilterListFragment2 = (NewsfeedFilterListFragment2) this.c;
                g.a aVar3 = (g.a) obj;
                int i9 = NewsfeedFilterListFragment2.X;
                gm50.a.a(newsfeedFilterListFragment2, aVar3.a, new cvh(newsfeedFilterListFragment2, 27));
                gm50.a.a(newsfeedFilterListFragment2, aVar3.b, new d2y(newsfeedFilterListFragment2, i));
                return s3q0.a;
            case 12:
                ((tt80) this.c).h = SystemClock.elapsedRealtime();
                return s3q0.a;
            case 13:
                ((PodcastCatalogRootVh) this.c).r.b();
                return s3q0.a;
            case 14:
                ihb0 ihb0Var = (ihb0) this.c;
                Throwable th3 = (Throwable) obj;
                com.vk.music.player.playback.e eVar = ihb0Var.a;
                StartPlaySource startPlaySource = eVar.a;
                if (startPlaySource instanceof StartPlayPodcastSource) {
                    StringBuilder sb = new StringBuilder("Tracks fetching failed for user ");
                    StartPlaySource startPlaySource2 = eVar.a;
                    StartPlayPodcastSource startPlayPodcastSource = startPlaySource2 instanceof StartPlayPodcastSource ? (StartPlayPodcastSource) startPlaySource2 : null;
                    if (startPlayPodcastSource == null || (userId = startPlayPodcastSource.c) == null) {
                        userId = UserId.d;
                    }
                    sb.append(userId);
                    str = sb.toString();
                } else if (startPlaySource instanceof StartPlayCatalogSource) {
                    str = "Tracks fetching failed for blockId=" + ihb0Var.g + ", nextFrom=" + ihb0Var.h;
                } else {
                    str = "Not either podcast or catalog source";
                }
                bn40.c(th3, str);
                return s3q0.a;
            case 15:
                ((fa00) this.c).invoke((Throwable) obj);
                return s3q0.a;
            case 16:
                PostViewFragment postViewFragment = (PostViewFragment) this.c;
                tgi0 tgi0Var = (tgi0) obj;
                String[] strArr = PostViewFragment.T0;
                qgi0.r(tgi0Var, "post_view_fragment_toolbar_back_tag");
                qgi0.h(tgi0Var, postViewFragment.getString(R.string.accessibility_back));
                return s3q0.a;
            case 17:
                pvc0.this.e(new qvc0(new qr60.a.d(true)));
                return s3q0.a;
            case 18:
                ((zjd0) this.c).a.invoke(new ejd0.b.f((AdminLeaveAction) obj));
                return s3q0.a;
            case 19:
                ((lld0) this.c).a.invoke(new ejd0.f.a(((gmq) obj).X()));
                return s3q0.a;
            case 20:
                ReactionsFeedFragment reactionsFeedFragment = (ReactionsFeedFragment) this.c;
                gom0 gom0Var = (gom0) obj;
                qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
                int i10 = 8;
                gom0.a(gom0Var, new tcu(22), new w5h(reactionsFeedFragment, i10));
                gom0.a(gom0Var, new byo(20), new yde(reactionsFeedFragment, 5));
                gom0.a(gom0Var, new xmz(26), new uog(reactionsFeedFragment, i3));
                gom0.a(gom0Var, new oi40(i), new no3(reactionsFeedFragment, i10));
                gom0.a(gom0Var, x3f0.b, new te1(reactionsFeedFragment, i2));
                return s3q0.a;
            case 21:
                return Boolean.valueOf(epx.f(((PhotoAttachment) obj).l.e, ((Photo) this.c).e));
            case 22:
                Bundle bundle = (Bundle) this.c;
                GeoFragmentOptions geoFragmentOptions = (GeoFragmentOptions) obj;
                int i11 = SearchCommunitiesOnMapFragment.e0;
                geoFragmentOptions.b = false;
                geoFragmentOptions.c = true;
                if (bundle != null) {
                    double d = bundle.getDouble(O6.s);
                    double d2 = bundle.getDouble("lon");
                    float f = bundle.getFloat("zoom");
                    geoFragmentOptions.e = Double.valueOf(d);
                    geoFragmentOptions.f = Double.valueOf(d2);
                    geoFragmentOptions.g = Float.valueOf(f);
                    geoFragmentOptions.h = false;
                }
                return s3q0.a;
            case 23:
                ((rg50) this.c).C((int) (((q9x) obj).a >> 32));
                return s3q0.a;
            case 24:
                ((io.reactivex.rxjava3.core.y) this.c).onError((Throwable) obj);
                return s3q0.a;
            case 25:
                return s3q0.a;
            case 26:
                SliderView.a aVar4 = (SliderView.a) this.c;
                final boolean booleanValue = ((Boolean) obj).booleanValue();
                aVar4.m(new izs() { // from class: com.vk.catalog.mvi.block.impl.slider.d
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        return SliderView.State.a((SliderView.State) obj2, null, null, booleanValue, 31);
                    }
                });
                return s3q0.a;
            case 27:
                a9k0 a9k0Var = (a9k0) this.c;
                Context context = (Context) obj;
                VkBlurContentView vkBlurContentView = new VkBlurContentView(context, null, 6);
                vkBlurContentView.setId(R.id.design_demo_blur_content_view);
                vkBlurContentView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                vkBlurContentView.setBlurBackgroundColorAttr(Integer.valueOf(R.attr.vk_ui_background));
                ComposeView composeView = new ComposeView(context, null, 6);
                composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                composeView.setContent(new jai(199922588, new xa2(a9k0Var, i2), true));
                vkBlurContentView.addView(composeView);
                ((zak0) a9k0Var.j).setValue(vkBlurContentView);
                return vkBlurContentView;
            case 28:
                StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = (StickyHeadersLinearLayoutManager) this.c;
                int intValue = ((Integer) obj).intValue();
                RecyclerView.Adapter adapter = stickyHeadersLinearLayoutManager.u;
                if (adapter != null && ((vel0) adapter).V(intValue)) {
                    r5 = 1;
                }
                return Boolean.valueOf(r5 ^ 1);
            default:
                return StoryBackground.zb((StoryBackground) this.c, null, ((dug0.c) obj).c, 255);
        }
    }
}
