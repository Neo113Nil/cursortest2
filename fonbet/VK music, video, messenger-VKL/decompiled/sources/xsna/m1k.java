package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.attachpicker.impl.graffiti.presentation.GraffitiDrawingFragment;
import com.vk.catalog2.common.ui.mvp.holder.container.GridListVh;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.Peer;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.music.Playlist;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.model.clickable.ClickablePhoto;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.folders.impl.configure.e;
import com.vk.friends.groupinvite.api.domain.InviteFriendsAnalytics;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain.FriendsAndFollowersTabType;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.impl.postmodal.reactions.ModalPostReactionsFragment;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.permission.PermissionHelper;
import com.vk.profile.community.creationonboarding.api.models.CreationOnboardingArguments;
import com.vk.profile.community.creationonboarding.api.models.OnBoardingTaskType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.story.api.LoadContext;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.video.ui.upload.impl.publish.presentation.description.fragment.DescriptionModalInternalComponent;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.d110;
import xsna.e0o0;
import xsna.fks;
import xsna.gp20;
import xsna.gwn;
import xsna.h5x;
import xsna.hls;
import xsna.ise;
import xsna.j130;
import xsna.jqe;
import xsna.m8v0;
import xsna.tlo0;
import xsna.uhu;
import xsna.via0;
import xsna.x89;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class m1k implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m1k(EntriesListPresenter entriesListPresenter, NewsEntry newsEntry) {
        this.b = 6;
        this.c = newsEntry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Integer num;
        Pair pair;
        int i = this.b;
        int i2 = 19;
        int i3 = 6;
        int i4 = 8;
        boolean z = false;
        r6 = false;
        boolean z2 = false;
        r6 = false;
        boolean z3 = false;
        boolean z4 = false;
        r6 = false;
        boolean z5 = false;
        z = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                jqe jqeVar = ((ise.b) obj2).d;
                jqe.b bVar = jqeVar instanceof jqe.b ? (jqe.b) jqeVar : null;
                if (bVar != null && bVar.a) {
                    z = true;
                }
                qgi0.o(tgi0Var, z);
                return s3q0.a;
            case 1:
                fck fckVar = (fck) obj2;
                ?? r1 = fckVar.j1;
                tck tckVar = (tck) obj;
                qcy<Object>[] qcyVarArr = fck.t1;
                if (tckVar.equals(pck.a)) {
                    fckVar.fo(OnBoardingTaskType.COVER);
                } else if (tckVar.equals(nck.a)) {
                    fckVar.fo(OnBoardingTaskType.DESCRIPTION);
                } else if (tckVar.equals(gck.a)) {
                    fckVar.fo(OnBoardingTaskType.AVATAR);
                } else if (tckVar.equals(ock.a)) {
                    ((com.vk.friends.groupinvite.api.domain.a) fckVar.k1.getValue()).a(fckVar.requireContext(), ((b25) r1.getValue()).c(), fkq0.a(((CreationOnboardingArguments) fckVar.i1.getValue()).g), InviteFriendsAnalytics.InviteFriendsSource.MAIN, true);
                } else if (tckVar.equals(mck.a)) {
                    com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(MobileOfficialAppsCoreNavStat$EventScreen.COMMUNITY_PAGE, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.COMMUNITY_CREATION_ONBOARDING_BLOCK);
                    aVar.E0 = true;
                    aVar.g = e43.l(StoryCameraMode.STORY, StoryCameraMode.STORY_VIDEO);
                    aVar.C(fckVar.requireContext());
                } else if (tckVar.equals(lck.a)) {
                    ((kk6) fckVar.p1.getValue()).j().i(PostingCreationEntryPoint.CommunityCreationOnboardingBlock).a(((b25) r1.getValue()).c(), null, true).l(fckVar.requireContext());
                } else if (tckVar.equals(ick.a)) {
                    fckVar.fo(OnBoardingTaskType.CONTACTS);
                } else if (tckVar.equals(hck.a)) {
                    fckVar.fo(OnBoardingTaskType.ACTION_BUTTON);
                } else if (tckVar.equals(jck.a)) {
                    fckVar.fo(OnBoardingTaskType.GOODS);
                } else if (tckVar.equals(kck.a)) {
                    fckVar.fo(OnBoardingTaskType.SERVICES);
                } else if (tckVar.equals(qck.a)) {
                    bhh bhhVar = fckVar.h1;
                    (bhhVar != null ? bhhVar : null).invoke(OnBoardingTaskType.ADS);
                } else if (tckVar instanceof sck) {
                    StoryViewerRouter.e((StoryViewerRouter) fckVar.n1.getValue(), fckVar.requireContext(), ((sck) tckVar).a, LoadContext.Story.b, null, 24);
                } else {
                    if (!(tckVar instanceof rck)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((rtc0) fckVar.o1.getValue()).c(((rck) tckVar).a).k(fckVar.requireContext());
                }
                return s3q0.a;
            case 2:
                qcy<Object>[] qcyVarArr2 = com.vk.video.ui.upload.impl.publish.presentation.description.fragment.b.j1;
                DescriptionModalInternalComponent descriptionModalInternalComponent = (DescriptionModalInternalComponent) ((com.vk.video.ui.upload.impl.publish.presentation.description.fragment.b) obj2).h1.getValue();
                descriptionModalInternalComponent.getClass();
                return new cn50(up2.d(new com.vk.movika.sdk.android.defaultplayer.container.e(i4, (gzs) obj, descriptionModalInternalComponent), new e2m(descriptionModalInternalComponent, false ? 1 : 0), new tti(new xk6(descriptionModalInternalComponent, 3))));
            case 3:
                return ((csm) obj2).a();
            case 4:
                final DiscoverSimilarFeedFragment discoverSimilarFeedFragment = (DiscoverSimilarFeedFragment) obj2;
                com.vk.mvi.binder.c cVar = (com.vk.mvi.binder.c) obj;
                qcy<Object>[] qcyVarArr3 = DiscoverSimilarFeedFragment.s0;
                com.vk.mvi.binder.c.a(cVar, f9t.w(discoverSimilarFeedFragment.io()), new iyp() { // from class: xsna.i7n
                    @Override // xsna.iyp
                    public final void a(pk50 pk50Var) {
                        qcy<Object>[] qcyVarArr4 = DiscoverSimilarFeedFragment.s0;
                        DiscoverSimilarFeedFragment discoverSimilarFeedFragment2 = DiscoverSimilarFeedFragment.this;
                        discoverSimilarFeedFragment2.eo();
                        c7n.a(discoverSimilarFeedFragment2.eo(), discoverSimilarFeedFragment2, discoverSimilarFeedFragment2.getActivity(), discoverSimilarFeedFragment2.b0, (t7n) pk50Var);
                    }
                });
                com.vk.mvi.binder.c.b(cVar, f9t.F(f9t.z(discoverSimilarFeedFragment.io()), new rd1(14)), new pj4(discoverSimilarFeedFragment, i2));
                return s3q0.a;
            case 5:
                wb80 wb80Var = (wb80) obj;
                gwn.a aVar2 = ((gwn) obj2).e;
                if (aVar2 == null) {
                    return s3q0.a;
                }
                gwn.a.InterfaceC2959a state = aVar2.getState();
                if (state instanceof gwn.a.InterfaceC2959a.d) {
                    long j = wb80Var.b;
                    gwn.a.InterfaceC2959a.d dVar = (gwn.a.InterfaceC2959a.d) state;
                    AttachImage attachImage = dVar.a;
                    if (j == attachImage.e && epx.f(wb80Var.c, attachImage.d) && wb80Var.d == dVar.a.f) {
                        aVar2.setState(gwn.a.InterfaceC2959a.C2960a.a);
                    }
                }
                return s3q0.a;
            case 6:
                NewsEntry newsEntry = (NewsEntry) obj2;
                u1c0 u1c0Var = (u1c0) obj;
                if (u1c0Var.c == 263 && u1c0Var.b == newsEntry) {
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            case 7:
                ((m6r) obj2).a.d(new PostingAction.Fetch.LoadedGroupsInfo((List) obj));
                return s3q0.a;
            case 8:
                com.vk.folders.impl.configure.d dVar2 = (com.vk.folders.impl.configure.d) obj2;
                ayr ayrVar = (ayr) obj;
                dVar2.m(new e.a(ayrVar.h, ayrVar.i, dVar2.h));
                return s3q0.a;
            case 9:
                fxt0 fxt0Var = (fxt0) obj2;
                tyu0 tyu0Var = (tyu0) obj;
                if (tyu0Var.getChildCount() == 0) {
                    VkFormField vkFormField = new VkFormField(tyu0Var.getContext(), null, 6);
                    vkFormField.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                    tyu0Var.addView(vkFormField);
                    VkFormField vkFormField2 = new VkFormField(tyu0Var.getContext(), null, 6);
                    vkFormField2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                    tyu0Var.addView(vkFormField2);
                }
                View childAt = tyu0Var.getChildAt(0);
                VkFormField vkFormField3 = childAt instanceof VkFormField ? (VkFormField) childAt : null;
                if (vkFormField3 != null) {
                    t8s.z(vkFormField3, new u8s((String) ((zak0) fxt0Var.h).getValue(), ((Boolean) ((zak0) fxt0Var.a).getValue()).booleanValue(), ((Boolean) ((zak0) fxt0Var.b).getValue()).booleanValue(), ((Boolean) ((zak0) fxt0Var.g).getValue()).booleanValue(), fxt0Var.a(), ((Boolean) ((zak0) fxt0Var.f).getValue()).booleanValue(), fxt0Var.b(), ((Boolean) ((zak0) fxt0Var.c).getValue()).booleanValue()), fxt0Var, null);
                }
                View childAt2 = tyu0Var.getChildAt(1);
                VkFormField vkFormField4 = childAt2 instanceof VkFormField ? (VkFormField) childAt2 : null;
                if (vkFormField4 != null) {
                    t8s.z(vkFormField4, new u8s((String) ((zak0) fxt0Var.l).getValue(), ((Boolean) ((zak0) fxt0Var.j).getValue()).booleanValue(), ((Boolean) ((zak0) fxt0Var.k).getValue()).booleanValue(), ((Boolean) ((zak0) fxt0Var.g).getValue()).booleanValue(), fxt0Var.a(), false, false, false), fxt0Var, new cwg(fxt0Var, i2));
                }
                return s3q0.a;
            case 10:
                gls glsVar = (gls) obj2;
                jks jksVar = (jks) obj;
                glsVar.T(new hls.d.b(new dls(jksVar.a, jksVar.b)));
                FriendsAndFollowersTabType friendsAndFollowersTabType = glsVar.i;
                if (friendsAndFollowersTabType != null && (num = jksVar.c) != null) {
                    int intValue = num.intValue();
                    wj50<fks> wj50Var = glsVar.h;
                    if (wj50Var != null) {
                        wj50Var.b(new fks.b(intValue, friendsAndFollowersTabType));
                    }
                }
                return s3q0.a;
            case 11:
                wht whtVar = (wht) obj2;
                int i5 = m8v0.M;
                m8v0.a.a(whtVar.b.getSideControlPanel().getMusicButtonView(), (String) obj, null, null, VkTooltip$MarkerSize.Size64, null, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Right, new rop(whtVar, i3), new j60(24), null, null, null, null, null, 0, false, null, null, false, null, false, 16776236);
                return s3q0.a;
            case 12:
                GraffitiDrawingFragment graffitiDrawingFragment = (GraffitiDrawingFragment) obj2;
                int i6 = GraffitiDrawingFragment.Q;
                xis xisVar = new xis(graffitiDrawingFragment, 5);
                if (gz80.a(34)) {
                    xisVar.invoke();
                    return s3q0.a;
                }
                PermissionHelper permissionHelper = PermissionHelper.a;
                Context requireContext = graffitiDrawingFragment.requireContext();
                permissionHelper.getClass();
                permissionHelper.d(requireContext, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, xisVar, null);
                return s3q0.a;
            case 13:
                GridListVh gridListVh = (GridListVh) obj2;
                int intValue2 = ((Integer) obj).intValue();
                RecyclerView recyclerView = gridListVh.n;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof GridLayoutManager) {
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                    pair = new Pair(Integer.valueOf(gridLayoutManager.x.c(intValue2)), Integer.valueOf(gridLayoutManager.s));
                } else {
                    pair = layoutManager instanceof StaggeredGridLayoutManager ? new Pair(1, Integer.valueOf(((StaggeredGridLayoutManager) layoutManager).getSpanCount())) : new Pair(null, null);
                }
                Integer num2 = (Integer) pair.d();
                Integer num3 = (Integer) pair.g();
                RecyclerView recyclerView2 = gridListVh.n;
                return new s8a((recyclerView2 != null ? recyclerView2 : null).getWidth(), num3, num2);
            case 14:
                uhu.a aVar3 = ((aiu) obj2).q;
                if (aVar3 != null) {
                    uhu uhuVar = uhu.this;
                    x89 x89Var = uhuVar.t;
                    if (x89Var instanceof x89.a) {
                        uhuVar.Z0();
                        a2 a2Var = new a2();
                        a2Var.z(((x89.a) x89Var).a.f == null ? MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_INVITE : MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_INVITE_ANONYMOUS);
                        a2Var.y(uhuVar.k);
                        a2Var.k(uhuVar.i);
                    }
                }
                return s3q0.a;
            case 15:
                com.vk.catalog2.common.ui.holders.group.a.d((com.vk.catalog2.common.ui.holders.group.a) obj2, true, (AdminLeaveAction) obj, null, 8);
                return s3q0.a;
            case 16:
                List<e0l0> list = (List) obj;
                nts0 nts0Var = ((oew) obj2).d;
                if (nts0Var != null) {
                    nts0Var.setStencils(list);
                }
                return s3q0.a;
            case 17:
                h5x h5xVar = (h5x) obj2;
                aoj aojVar = (aoj) obj;
                Iterator<atm0> it = h5xVar.getAllStyles().iterator();
                while (it.hasNext()) {
                    aojVar.a(new h5x.a(it.next(), h5xVar));
                }
                return s3q0.a;
            case 18:
                drx drxVar = (drx) obj2;
                tlo0.a aVar4 = tlo0.Companion;
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "";
                }
                aVar4.getClass();
                drxVar.Y(new tlo0.h(message));
                return s3q0.a;
            case 19:
                ClickablePhoto clickablePhoto = (ClickablePhoto) obj;
                uy9 uy9Var = ((p5z) obj2).a.U;
                if (uy9Var != null) {
                    uov uovVar = (uov) uy9Var.c;
                    uovVar.setActionInProgress(true);
                    uovVar.pause();
                    StoryViewerRouter storyViewerRouter = (StoryViewerRouter) uy9Var.b;
                    ViewGroup view = uovVar.getView();
                    StringBuilder sb = new StringBuilder();
                    sb.append(clickablePhoto.f);
                    sb.append('_');
                    sb.append(clickablePhoto.g);
                    int i7 = 2;
                    storyViewerRouter.j(view, Collections.singletonList(sb.toString()), new h6m0(uy9Var, i7), new ikk0(uy9Var, 4), new mdm0(uy9Var, i7));
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 20:
                ia00 ia00Var = (ia00) obj2;
                ma00 ma00Var = (ma00) ia00Var.l;
                if (ma00Var != null) {
                    ia00Var.n.L2(new kz6(ma00Var.a));
                }
                return s3q0.a;
            case 21:
                ((com.vk.ecomm.reviews.impl.allreviews.presentation.b) obj2).T((c.l) obj);
                return s3q0.a;
            case 22:
                ((n010) obj2).T(new d110.b.a((Throwable) obj));
                return s3q0.a;
            case 23:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) obj2;
                VkSpinner vkSpinner = marketItemReviewsFragment.b0;
                if (vkSpinner == null) {
                    vkSpinner = null;
                }
                bwt0.p0(vkSpinner, true);
                NestedScrollView nestedScrollView = marketItemReviewsFragment.h0;
                if (nestedScrollView == null) {
                    nestedScrollView = null;
                }
                bwt0.p0(nestedScrollView, true);
                LinearLayout linearLayout = marketItemReviewsFragment.d0;
                if (linearLayout == null) {
                    linearLayout = null;
                }
                bwt0.p0(linearLayout, false);
                VkPlaceholder vkPlaceholder = marketItemReviewsFragment.i0;
                if (vkPlaceholder == null) {
                    vkPlaceholder = null;
                }
                bwt0.p0(vkPlaceholder, false);
                SwipeRefreshLayout swipeRefreshLayout = marketItemReviewsFragment.g0;
                bwt0.p0(swipeRefreshLayout != null ? swipeRefreshLayout : null, false);
                return s3q0.a;
            case 24:
                c810 c810Var = (c810) obj2;
                int i8 = c810.o1;
                c810Var.getClass();
                xn50.a.c(c810Var, (z710) obj);
                return s3q0.a;
            case 25:
                via0.b bVar2 = (via0.b) obj2;
                e0o0 e0o0Var = (e0o0) obj;
                if (((e0o0Var instanceof e0o0.c) && ((e0o0.c) e0o0Var).a.a.a == bVar2.a.a) || ((e0o0Var instanceof e0o0.b) && ((e0o0.b) e0o0Var).a.a.a == bVar2.a.a)) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 26:
                gp20.a aVar5 = (gp20.a) obj;
                wq20 wq20Var = ((sq20) obj2).e;
                if (wq20Var != null) {
                    wq20Var.invoke(aVar5);
                }
                return s3q0.a;
            case 27:
                int i9 = ModalPostReactionsFragment.f0;
                ((ModalPostReactionsFragment) obj2).getFeature().C(j130.b.b);
                return s3q0.a;
            case 28:
                return (Playlist) obj2;
            default:
                lk30 lk30Var = (lk30) obj2;
                Attach attach = (Attach) obj;
                if (attach instanceof AttachStory) {
                    Peer peer = lk30Var.d;
                    xuo0.a.getClass();
                    if (!((AttachStory) attach).b(peer, xuo0.a())) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
        }
    }

    public /* synthetic */ m1k(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
