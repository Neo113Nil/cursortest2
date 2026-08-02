package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.catalog.mvi.legacy.api.CatalogLegacyComponent;
import com.vk.censoredsettings.presentation.obscenetext.ObsceneTextFilterFragment;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.design.view.tile.MarketProductTileView;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.geo.api.di.GeoComponent;
import com.vk.im.ui.views.ScrollToBottomView;
import com.vk.libvideo.api.di.VideoNotificationsPermissionComponent;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.profile.user.impl.di.ProfileOnboardingComponentImpl;
import com.vk.search.communities.map.impl.ui.map.SearchCommunitiesOnMapFragment;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.superapp.analytics.di.SakAnalyticsComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.ghc0.g;
import xsna.tzp0;
import xsna.w1g0;
import xsna.xn50;
import xsna.z0d0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class t210 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t210(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        NewsEntry newsEntry;
        Object obj;
        int i = this.b;
        int i2 = 4;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = MarketItemReviewRepliesFragment.b0;
                ((MarketItemReviewRepliesFragment) obj2).eo(w1g0.c.b);
                return s3q0.a;
            case 1:
                rg50 rg50Var = (rg50) obj2;
                rg50Var.C(rg50Var.getIntValue() + 1);
                return s3q0.a;
            case 2:
                return Integer.valueOf(((ViewGroup) obj2).getContext().getColor(R.color.ecomm_design_ozon_badge_light));
            case 3:
                gzs<s3q0> gzsVar = ((MarketProductTileView) obj2).J;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 4:
                return ((VideoNotificationsPermissionComponent) ((k7m) m7m.c((k120) obj2)).a(fpf0.a(VideoNotificationsPermissionComponent.class))).V();
            case 5:
                return (ScrollToBottomView) ((ViewStub) ((vm30) obj2).t.findViewById(R.id.scroll_to_mention_view_stub)).inflate();
            case 6:
                Context context = ((ps30) obj2).d;
                return Integer.valueOf(e3m.a(R.dimen.msg_photo_max_height, context == null ? null : context));
            case 7:
                return ((CatalogLegacyComponent) ((k7m) m7m.f((com.vk.catalog2.feature.music.configuration.b) obj2)).a(fpf0.a(CatalogLegacyComponent.class))).qf();
            case 8:
                rt40 rt40Var = (rt40) obj2;
                tzp0.c.a aVar = rt40.s1;
                xr40 xr40Var = xr40.b;
                rt40Var.getClass();
                xn50.a.c(rt40Var, xr40Var);
                return s3q0.a;
            case 9:
                return ((PlayerAnalyticsComponent) ((k7m) m7m.f((l550) obj2)).a(fpf0.a(PlayerAnalyticsComponent.class))).Ia();
            case 10:
                return (TextView) ((g850) obj2).a.findViewById(R.id.nativeads_rating);
            case 11:
                return ((NewsFeedComponent) m7m.a(((ha50) obj2).b).a(fpf0.a(NewsFeedComponent.class))).ze();
            case 12:
                mo60 mo60Var = (mo60) obj2;
                return new aw60(new x0d0(mo60Var.c.a, new ly3(), new d6f0(), mo60Var.x, (w5r0) mo60Var.q.getValue(), mo60Var.p.a(), (dui) mo60Var.T.getValue(), mo60Var.d()), mo60Var.e, mo60Var.b, new ap30(mo60Var, i2));
            case 13:
                int i3 = ObsceneTextFilterFragment.R;
                h3p0.b((ObsceneTextFilterFragment) obj2);
                return s3q0.a;
            case 14:
                return ((AuthBridgeComponent) ((x390) obj2).c().a(fpf0.a(AuthBridgeComponent.class))).s().c();
            case 15:
                int i4 = h2a0.j1;
                return ((SakAnalyticsComponent) m7m.d((h2a0) obj2).a(fpf0.a(SakAnalyticsComponent.class))).kd();
            case 16:
                int i5 = m8a0.v1;
                return ((m8a0) obj2).bo().p7().a();
            case 17:
                ((com.vk.photogallery.c) obj2).z.X(4);
                return s3q0.a;
            case 18:
                int i6 = cbb0.q1;
                return ((AudioModelsComponent) m7m.d((cbb0) obj2).a(fpf0.a(AudioModelsComponent.class))).r();
            case 19:
                return ((StoryViewerComponent) ((k7m) m7m.f((y1c0) obj2)).a(fpf0.a(StoryViewerComponent.class))).tb();
            case 20:
                int i7 = PostFragment.S0;
                Bundle requireArguments = ((PostFragment) obj2).requireArguments();
                Long e = bo8.e(requireArguments, "entry_key");
                UserId userId = (UserId) requireArguments.getParcelable("owner_id");
                if (userId == null) {
                    userId = UserId.d;
                }
                UserId userId2 = userId;
                int i8 = requireArguments.getInt("id");
                int i9 = requireArguments.getInt("comment_id");
                int i10 = requireArguments.getInt("arg_parent_comment_id");
                boolean z = requireArguments.getBoolean("dismiss_on_opening_video", false);
                boolean z2 = requireArguments.getBoolean("show_likes_info", true);
                boolean z3 = requireArguments.getBoolean("is_suggest_subscribe_allowed", true);
                boolean z4 = requireArguments.getBoolean("should_show_reactions_panel", true);
                boolean z5 = requireArguments.getBoolean("should_send_donut_button", true);
                boolean z6 = requireArguments.getBoolean("is_time_spent_tracker_enabled", false);
                String string = requireArguments.getString("referrer", "");
                int i11 = requireArguments.getInt("entry_type");
                if (e != null || (newsEntry = (NewsEntry) requireArguments.getParcelable("entry")) == null) {
                    newsEntry = null;
                } else if (newsEntry instanceof Post) {
                    Serializer.c<Post> cVar = Post.CREATOR;
                    newsEntry = Post.a.b((Post) newsEntry);
                } else if (newsEntry instanceof PromoPost) {
                    PromoPost promoPost = (PromoPost) newsEntry;
                    Post post = promoPost.n;
                    Serializer.c<Post> cVar2 = Post.CREATOR;
                    Post b = Post.a.b(post);
                    if (b != null) {
                        post = b;
                    }
                    PromoPost Eb = PromoPost.Eb(promoPost, post);
                    Eb.c = newsEntry.c;
                    Eb.g = newsEntry.g;
                    Eb.h = newsEntry.h;
                    newsEntry = Eb;
                }
                String string2 = requireArguments.getString("access_key");
                ArrayList parcelableArrayList = requireArguments.getParcelableArrayList("friends_tags");
                UserProfile userProfile = (UserProfile) requireArguments.getParcelable("placer_profile");
                String string3 = requireArguments.getString("track_code", null);
                String string4 = requireArguments.getString("entry_content_id");
                boolean z7 = requireArguments.getBoolean("load_as_videos", false);
                boolean z8 = requireArguments.getBoolean("load_as_short_videos", false);
                boolean z9 = requireArguments.getBoolean("load_as_photos", false);
                int i12 = requireArguments.getInt("arg_start_comment_id");
                boolean z10 = requireArguments.getBoolean("scroll_to_comments");
                boolean z11 = requireArguments.getBoolean("arg_can_share_on_wall", true);
                int i13 = requireArguments.getInt("tag_id");
                String string5 = requireArguments.getString("referrer", "");
                boolean z12 = requireArguments.getBoolean("arg_is_footer_disabled", false);
                boolean z13 = requireArguments.getBoolean("arg_is_order_info_disabled", false);
                boolean z14 = requireArguments.getBoolean("show_comments_count", false);
                boolean z15 = requireArguments.getBoolean("start_from_parent", false);
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = requireArguments.getSerializable("post_from", Post.SourceFrom.class);
                } else {
                    Object serializable = requireArguments.getSerializable("post_from");
                    if (!(serializable instanceof Post.SourceFrom)) {
                        serializable = null;
                    }
                    obj = (Post.SourceFrom) serializable;
                }
                Post.SourceFrom sourceFrom = (Post.SourceFrom) obj;
                if (sourceFrom == null) {
                    sourceFrom = Post.SourceFrom.Newsfeed;
                }
                return new f0c0(sourceFrom, userId2, i8, Integer.valueOf(i9), i12, i10, z, z2, z3, z4, z5, z6, string, e, i11, newsEntry, string2, parcelableArrayList, userProfile, string3, string4, z7, z8, z9, z10, z11, string5, i13, z12, z13, z14, z15, requireArguments.getBoolean("PostViewFrgament.show_keyboard", false), requireArguments.getBoolean("show_writebar_attach", true));
            case 21:
                return ((rbc0) obj2).a.getString("creation_entry_point");
            case 22:
                return ((ghc0) obj2).new g();
            case 23:
                return new lnc0((enc0) obj2);
            case 24:
                qcy<Object>[] qcyVarArr2 = PostponedPostsFragment.q0;
                return ((PostponedPostsFragment) obj2).eo();
            case 25:
                Iterator<z0d0.b> it = ((z0d0) obj2).g.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                return s3q0.a;
            case 26:
                return new o0e0(((InfoBridgeComponent) ((ProfileOnboardingComponentImpl) obj2).a.getValue()).t().b(), fxc0.B().s());
            case 27:
                qcy<Object>[] qcyVarArr3 = ReactionsFeedFragment.q0;
                h3p0.b((ReactionsFeedFragment) obj2);
                return s3q0.a;
            case 28:
                return (TextView) ((prf0) obj2).a.findViewById(R.id.nativeads_title);
            default:
                int i14 = SearchCommunitiesOnMapFragment.e0;
                return ((GeoComponent) m7m.d((SearchCommunitiesOnMapFragment) obj2).mo408a(fpf0.a(GeoComponent.class))).s7();
        }
    }

    public /* synthetic */ t210(z0d0 z0d0Var, dbn dbnVar) {
        this.b = 25;
        this.c = z0d0Var;
    }
}
