package xsna;

import android.content.Context;
import android.util.Size;
import android.view.ViewConfiguration;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.archive.api.di.StoryArchiveComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.holders.ClickType;
import com.vk.catalog2.common.ui.holders.ComposeHeaderClearBlocksVh;
import com.vk.catalog2.common.ui.mvp.holder.friends.FriendsComposeHeaderIconShowAllBadgeVh;
import com.vk.catalog2.feature.music.ui.holder.MusicDownloadsHistoryCatalogRootVh;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.HighlightCover;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.friends.requests.impl.allrequests.presentation.FriendsAllRequestsFragment;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vk.narratives.impl.highlights.HighlightChooseCoverFragment;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.posting.privacy_picker.presentation.donut_levels.DonutLevelsFragment;
import com.vk.stickers.views.LongtapRecyclerView;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.e3m;
import xsna.hfk;
import xsna.ikv0;
import xsna.w1g0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class enh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ enh(ImAvatarView imAvatarView, Context context) {
        this.b = 21;
        this.c = imAvatarView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        gvv0 view;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((MarketComponent) ((h7m) obj).a(fpf0.a(MarketComponent.class))).l7();
            case 1:
                CommunityRepliesFragment communityRepliesFragment = (CommunityRepliesFragment) obj;
                int i2 = CommunityRepliesFragment.d0;
                w1g0.c cVar = w1g0.c.b;
                communityRepliesFragment.getClass();
                xn50.a.c(communityRepliesFragment, cVar);
                return s3q0.a;
            case 2:
                ComposeHeaderClearBlocksVh composeHeaderClearBlocksVh = (ComposeHeaderClearBlocksVh) obj;
                int i3 = ComposeHeaderClearBlocksVh.r;
                if (!jjc.d().a()) {
                    int i4 = ComposeHeaderClearBlocksVh.r;
                    composeHeaderClearBlocksVh.b(ClickType.CLOSE_ITEM);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 3:
                ((baj) obj).invoke();
                return s3q0.a;
            case 4:
                hfk.a aVar = ((hfk) obj).F;
                if (aVar != null) {
                    aVar.b();
                }
                return s3q0.a;
            case 5:
                RecyclerView recyclerView = ((fhl) obj).a;
                elg0 elg0Var = new elg0(recyclerView);
                ren renVar = new ren(recyclerView, elg0Var);
                sen senVar = new sen(recyclerView, renVar, elg0Var);
                FeedRecyclerView feedRecyclerView = (FeedRecyclerView) recyclerView;
                feedRecyclerView.e.b.add(renVar);
                feedRecyclerView.setDisplayItemsRippleEffectTouchListener(senVar);
                return renVar;
            case 6:
                Integer num = (Integer) ((List) obj).get(2);
                num.intValue();
                return num;
            case 7:
                return new ldm(((pdm) obj).b);
            case 8:
                Context context = ((egm) obj).d;
                e3m.a aVar2 = e3m.a;
                return m33.a(R.drawable.ic_online_web_composite_16, context);
            case 9:
                DiscoverMediaTabFragment2 discoverMediaTabFragment2 = (DiscoverMediaTabFragment2) obj;
                return new uq60(discoverMediaTabFragment2, discoverMediaTabFragment2.W, discoverMediaTabFragment2.fo().l, discoverMediaTabFragment2.fo().n);
            case 10:
                int i5 = DonutLevelsFragment.R;
                ((DonutLevelsFragment) obj).Mf(0, null);
                return s3q0.a;
            case 11:
                return ((w3p) obj).i;
            case 12:
                EditText editText = ((zop) obj).x;
                return com.vk.registration.funnels.a.d(editText != null ? editText : null);
            case 13:
                return FeedAnimatedView.b((FeedAnimatedView) obj);
            case 14:
                xti0 xti0Var = ((iar) obj).g;
                return "flush: can not flush append file. Writing new events into session " + (xti0Var != null ? xti0Var : null) + " is prohibited";
            case 15:
                return ((StoryViewerComponent) ((k7m) m7m.f((jlr) obj)).a(fpf0.a(StoryViewerComponent.class))).tb();
            case 16:
                int i6 = FriendRequestsFragment.d0;
                new FriendsAllRequestsFragment.a(FriendsAllRequestsFragment.class, null, null).k(((FriendRequestsFragment) obj).mo2getContext());
                return s3q0.a;
            case 17:
                FriendsComposeHeaderIconShowAllBadgeVh friendsComposeHeaderIconShowAllBadgeVh = (FriendsComposeHeaderIconShowAllBadgeVh) obj;
                int i7 = FriendsComposeHeaderIconShowAllBadgeVh.B;
                if (!jjc.d().a()) {
                    int i8 = FriendsComposeHeaderIconShowAllBadgeVh.B;
                    friendsComposeHeaderIconShowAllBadgeVh.b(ClickType.SHOW_ALL_CHEVRON);
                    s3q0 s3q0Var2 = s3q0.a;
                }
                return s3q0.a;
            case 18:
                HighlightChooseCoverFragment highlightChooseCoverFragment = (HighlightChooseCoverFragment) obj;
                int i9 = HighlightChooseCoverFragment.R;
                upl0 l1 = ((StoryArchiveComponent) m7m.d(highlightChooseCoverFragment).a(fpf0.a(StoryArchiveComponent.class))).l1();
                HighlightCover highlightCover = (HighlightCover) highlightChooseCoverFragment.requireArguments().getParcelable("EXTRA_COVER");
                UserId userId = highlightChooseCoverFragment.N;
                Object obj2 = highlightChooseCoverFragment.O;
                return new HighlightChooseCoverFragment.c(highlightCover, l1.c(userId, obj2 != null ? obj2 : null), new t2l(highlightChooseCoverFragment, 11));
            case 19:
                gzs<Boolean> gzsVar = ((zbv) obj).c.f;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 20:
                return Integer.valueOf(((quv) obj).getPosition());
            case 21:
                return ImAvatarView.e1((ImAvatarView) obj);
            case 22:
                return ((l4w) obj).d().getString(R.string.video_live_upcoming);
            case 23:
                fvv0 M = ((r6y) obj).M();
                if (M != null && (view = M.getView()) != null) {
                    view.ac();
                }
                return s3q0.a;
            case 24:
                int i10 = LongtapRecyclerView.n;
                return ViewConfiguration.get((Context) obj);
            case 25:
                int i11 = MarketAllReviewsFragment.d0;
                return ((BridgeComponent) m7m.d((MarketAllReviewsFragment) obj).a(fpf0.a(BridgeComponent.class))).ob();
            case 26:
                yf10 yf10Var = (yf10) obj;
                if (((wak0) yf10Var.t).getIntValue() <= ((wak0) yf10Var.u).getIntValue()) {
                    return null;
                }
                ((vf10) ((zak0) yf10Var.z).getValue()).getClass();
                return Float.valueOf(yf10Var.i2() + ((wak0) yf10Var.t).getIntValue());
            case 27:
                return k120.e((k120) obj);
            case 28:
                Context context2 = ((xo30) obj).d;
                return Integer.valueOf(e3m.a(R.dimen.msg_photo_max_height, context2 != null ? context2 : null));
            default:
                MusicDownloadsHistoryCatalogRootVh musicDownloadsHistoryCatalogRootVh = (MusicDownloadsHistoryCatalogRootVh) obj;
                DisableableViewPager disableableViewPager = musicDownloadsHistoryCatalogRootVh.A.o;
                if (disableableViewPager == null) {
                    disableableViewPager = null;
                }
                Context context3 = disableableViewPager.getContext();
                g3b g3bVar = new g3b(musicDownloadsHistoryCatalogRootVh, 4);
                musicDownloadsHistoryCatalogRootVh.s.getClass();
                ikv0.a aVar3 = new ikv0.a(context3);
                float f = 24;
                aVar3.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), new Size(iah0.a(f), iah0.a(f)), 8);
                aVar3.u = new ikv0.d(new ikv0.d.c(context3.getString(R.string.misoc_offline_downloads_history_snackbar_text), 3), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                aVar3.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context3.getString(R.string.retry), new i50(g3bVar, 26));
                aVar3.b().c();
                return s3q0.a;
        }
    }

    public /* synthetic */ enh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
