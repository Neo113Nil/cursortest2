package xsna;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.RegistrationTrackingElement;
import com.vk.catalog2.feature.news.holders.FeedVh;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.text.VkText;
import com.vk.donut.design.view.badge.LargeOneTimeDonutBadge;
import com.vk.dto.user.RequestUserProfile;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import com.vk.managed_groups.api.ManagedGroupsComponent;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeGamesCatalogClick;
import com.vk.stories.design.view.StoryProgressView;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.c;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabaseConfiguration;
import kotlin.Lazy;
import one.video.player.OneVideoPlayer;
import xsna.fss;
import xsna.o9t;
import xsna.xn50;
import xsna.z4h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class k5h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k5h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        MobileOfficialAppsCoreNavStat$EventScreen a;
        int i = this.b;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                j5h j5hVar = (j5h) obj;
                CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType communityMenuActionType = CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.HIDE_APP;
                j5hVar.B6(false);
                j5hVar.n.invoke(new CommunityProfileAction.CommunityInternalMenuAction(communityMenuActionType, (z4h.a) j5hVar.m, Integer.valueOf(((wak0) j5hVar.o).getIntValue())));
                return s3q0.a;
            case 1:
                lrh lrhVar = (lrh) obj;
                return new bfh(lrhVar.c, lrhVar.d, lrhVar.e, lrhVar.f);
            case 2:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) obj;
                WriteBar writeBar = communityReviewsFragment.g0;
                if (writeBar != null) {
                    e2g0 e2g0Var = communityReviewsFragment.S;
                    String a2 = e2g0Var != null ? e2g0Var.a() : null;
                    xn50.a.c(communityReviewsFragment, new c.u.h(a2 != null ? a2 : "", writeBar.getAttachments()));
                }
                return s3q0.a;
            case 3:
                return ((a.C0084a) obj).open(SQLiteDatabaseConfiguration.MEMORY_DB_PATH);
            case 4:
                com.vk.im.ui.components.contacts.b bVar = (com.vk.im.ui.components.contacts.b) obj;
                bVar.o.onNext(gdj.a(bVar.d(), null, null, null, null, null, true, null, 1791));
                return s3q0.a;
            case 5:
                puj pujVar = (puj) obj;
                ((j1z) pujVar.t.w.c).r.a(pujVar.y.e);
                s3q0 s3q0Var = s3q0.a;
                return Boolean.TRUE;
            case 6:
                lak lakVar = (lak) obj;
                return new iak((RecyclerView) lakVar.findViewById(R.id.voip_default_session_rooms_timings), new lwh(lakVar, 1));
            case 7:
                xhk xhkVar = (xhk) obj;
                ac acVar = new ac(xhkVar, 27);
                xhkVar.getClass();
                xhk.b(xhkVar, acVar, false);
                return s3q0.a;
            case 8:
                DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
                return ((RegistrationTrackingElement) obj).c;
            case 9:
                return ((otm) obj).b.a(OpenChatListReporter.Span.LOADER_SPINNER);
            case 10:
                return new xso0(((czm) obj).d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, n8g.l(-16777216, an10.b(204.0f)), 0, 26);
            case 11:
                return ((hao) obj).i.d.c;
            case 12:
                return ((wxo) obj).c instanceof c.b ? SchemeStatSak$EventScreen.ECOSYSTEM_NAVIGATION_ACCOUNT_VIEW : SchemeStatSak$EventScreen.ECOSYSTEM_NAVIGATION;
            case 13:
                ((m3r) obj).u.removeCallbacksAndMessages(null);
                return s3q0.a;
            case 14:
                dha dhaVar = ((FeedVh) obj).d;
                return (dhaVar == null || (a = dhaVar.a()) == null) ? "" : com.vk.stat.scheme.t0.a(a);
            case 15:
                return Integer.valueOf(((ror) obj).f);
            case 16:
                return ((ManagedGroupsComponent) m7m.d(((l1s) obj).n).a(fpf0.a(ManagedGroupsComponent.class))).Ge();
            case 17:
                cjs cjsVar = (cjs) obj;
                cjsVar.n.a(new fss.d((RequestUserProfile) cjsVar.m, cjsVar.q));
                return s3q0.a;
            case 18:
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) obj;
                int i2 = GalleryFragmentImpl.R0;
                ((j3t) galleryFragmentImpl.G0.getValue()).b = 0;
                com.vk.lists.c cVar = galleryFragmentImpl.f0;
                if (cVar != null) {
                    cVar.o();
                }
                com.vk.lists.c cVar2 = galleryFragmentImpl.f0;
                if (cVar2 != null) {
                    cVar2.p(false);
                }
                galleryFragmentImpl.no(new pr0(14));
                return s3q0.a;
            case 19:
                GamesCatalogFragment gamesCatalogFragment = (GamesCatalogFragment) obj;
                int i3 = GamesCatalogFragment.i0;
                gamesCatalogFragment.fo().getClass();
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new SchemeStat$TypeGamesCatalogClick(SchemeStat$TypeGamesCatalogClick.Type.CLOSE_WELCOME_ACHIEVEMENTS_MODAL, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
                xn50.a.c(gamesCatalogFragment, o9t.f.b);
                return s3q0.a;
            case 20:
                GoodFragment goodFragment = (GoodFragment) obj;
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                return goodFragment;
            case 21:
                return ((y4u) obj).o.a();
            case 22:
                return ((ClipEditComponent) ((k7m) m7m.f((e1x) obj)).a(fpf0.a(ClipEditComponent.class))).d6();
            case 23:
                ((StoryProgressView) ((wex) obj).v0.getValue()).setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 24:
                return ((OneVideoPlayer) obj).L();
            case 25:
                return new d7y((e7y) obj);
            case 26:
                int i4 = LargeOneTimeDonutBadge.d;
                return (VkText) ((LargeOneTimeDonutBadge) obj).findViewById(R.id.donut_one_time_badge_large_text);
            case 27:
                return new llu((Lazy) obj);
            case 28:
                int i5 = MarketAllReviewsFragment.d0;
                FragmentActivity activity = ((MarketAllReviewsFragment) obj).getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            default:
                int i6 = MarketItemCommentsFragment.j0;
                return (ViewGroup) ((MarketItemCommentsFragment) obj).requireView().findViewById(R.id.container);
        }
    }
}
