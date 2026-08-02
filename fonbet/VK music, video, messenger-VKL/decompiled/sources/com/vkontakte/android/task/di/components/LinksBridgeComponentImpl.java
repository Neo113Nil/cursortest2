package com.vkontakte.android.task.di.components;

import com.navigation.vk.RouterComponent;
import com.vk.biometrics.lock.api.di.BiometricsLockComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.dialogsscreen.api.DialogsScreenFeatureComponent;
import com.vk.dzenarticle.api.DzenArticleComponent;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.contentproducts.di.ContentProductsComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.onlinebooking.api.router.di.OnlineBookingComponent;
import com.vk.ecomm.orders.api.di.MarketOrdersComponent;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.ecomm.storefront.api.di.StorefrontComponent;
import com.vk.ecomm.storefrontservices.api.StorefrontServicesComponent;
import com.vk.ecomm.verifiedseller.api.di.VerifiedSellerComponent;
import com.vk.feed.blacklist.api.di.BlacklistComponent;
import com.vk.games.di.GamesCatalogComponent;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.onboarding.api.di.MusicOnboardingComponent;
import com.vk.music.podcast.api.di.PodcastComponent;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.notifications.list.api.di.NotificationListComponent;
import com.vk.profile.community.address.api.di.CommunityAddressComponent;
import com.vk.profile.community.catalog.api.di.CommunitiesCatalogComponent;
import com.vk.profile.community.chats.api.di.CommunityChatsComponent;
import com.vk.profile.community.details.api.di.CommunityDetailsComponent;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.settings.api.di.NotificationsSettingsComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.tabbar.settings.api.di.TabbarSettingsComponent;
import com.vk.topics.api.di.TopicsComponent;
import com.vk.voip.calls.join.api.di.VoipCallsJoinRouterComponent;
import com.vk.voip.stereo.api.common.di.VoipStereoRouterComponent;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ac8;
import xsna.bc8;
import xsna.c8m;
import xsna.cc8;
import xsna.dc8;
import xsna.ec8;
import xsna.fc8;
import xsna.fpf0;
import xsna.g25;
import xsna.g8m;
import xsna.gc8;
import xsna.h25;
import xsna.i25;
import xsna.iia;
import xsna.j25;
import xsna.jia;
import xsna.k25;
import xsna.kia;
import xsna.lia;
import xsna.mia;
import xsna.msy;
import xsna.nia;
import xsna.nwy;
import xsna.oia;
import xsna.pia;
import xsna.pwj0;
import xsna.q12;
import xsna.qcy;
import xsna.qdz;
import xsna.qia;
import xsna.ria;
import xsna.sia;
import xsna.tia;
import xsna.uia;
import xsna.w62;
import xsna.wb8;
import xsna.xb8;
import xsna.yb8;
import xsna.zb8;

/* compiled from: BridgeComponents.kt */
/* loaded from: classes11.dex */
public final class LinksBridgeComponentImpl implements LinksBridgeComponent {
    public static final /* synthetic */ qcy<Object>[] H;
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final ProfileFragmentProviderComponent F;
    public final nwy G = new nwy(new w62(this, 3));
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final CommunityDetailsComponent x;
    public final Object y;
    public final Object z;

    /* compiled from: BridgeComponents.kt */
    public static final class a implements c8m<LinksBridgeComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            wb8 wb8Var = new wb8(g8mVar, 1);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            Lazy a = msy.a(lazyThreadSafetyMode, wb8Var);
            Lazy a2 = msy.a(lazyThreadSafetyMode, new yb8(g8mVar, 1));
            Lazy a3 = msy.a(lazyThreadSafetyMode, new i25(g8mVar, 3));
            int i = 2;
            Lazy a4 = msy.a(lazyThreadSafetyMode, new j25(g8mVar, i));
            Lazy a5 = msy.a(lazyThreadSafetyMode, new k25(g8mVar, i));
            int i2 = 1;
            Lazy a6 = msy.a(lazyThreadSafetyMode, new iia(g8mVar, i2));
            Lazy a7 = msy.a(lazyThreadSafetyMode, new jia(g8mVar, i2));
            Lazy a8 = msy.a(lazyThreadSafetyMode, new kia(g8mVar, i2));
            Lazy a9 = msy.a(lazyThreadSafetyMode, new lia(g8mVar, i2));
            Lazy a10 = msy.a(lazyThreadSafetyMode, new mia(g8mVar, i2));
            Lazy a11 = msy.a(lazyThreadSafetyMode, new q12(g8mVar, 5));
            int i3 = 1;
            Lazy a12 = msy.a(lazyThreadSafetyMode, new nia(g8mVar, i3));
            Lazy a13 = msy.a(lazyThreadSafetyMode, new oia(g8mVar, i3));
            Lazy a14 = msy.a(lazyThreadSafetyMode, new pia(g8mVar, i3));
            Lazy a15 = msy.a(lazyThreadSafetyMode, new qia(g8mVar, i3));
            Lazy a16 = msy.a(lazyThreadSafetyMode, new ria(g8mVar, i3));
            Lazy a17 = msy.a(lazyThreadSafetyMode, new sia(g8mVar, i3));
            Lazy a18 = msy.a(lazyThreadSafetyMode, new tia(g8mVar, i3));
            Lazy a19 = msy.a(lazyThreadSafetyMode, new uia(g8mVar, 3));
            int i4 = 1;
            Lazy a20 = msy.a(lazyThreadSafetyMode, new xb8(g8mVar, i4));
            Lazy a21 = msy.a(lazyThreadSafetyMode, new zb8(g8mVar, i4));
            Lazy a22 = msy.a(lazyThreadSafetyMode, new ac8(g8mVar, i4));
            Lazy a23 = msy.a(lazyThreadSafetyMode, new bc8(g8mVar, i4));
            CommunityDetailsComponent communityDetailsComponent = (CommunityDetailsComponent) g8mVar.a(fpf0.a(CommunityDetailsComponent.class));
            Lazy a24 = msy.a(lazyThreadSafetyMode, new cc8(g8mVar, i4));
            Lazy a25 = msy.a(lazyThreadSafetyMode, new dc8(g8mVar, i4));
            Lazy a26 = msy.a(lazyThreadSafetyMode, new ec8(g8mVar, i4));
            Lazy a27 = msy.a(lazyThreadSafetyMode, new fc8(g8mVar, i4));
            Lazy a28 = msy.a(lazyThreadSafetyMode, new gc8(g8mVar, i4));
            int i5 = 3;
            return new LinksBridgeComponentImpl(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a15, a16, a17, a14, a18, a19, a20, a21, a22, a23, communityDetailsComponent, a24, a25, a26, a27, a28, msy.a(lazyThreadSafetyMode, new g25(g8mVar, i5)), msy.a(lazyThreadSafetyMode, new h25(g8mVar, i5)), (ProfileFragmentProviderComponent) g8mVar.a(fpf0.a(ProfileFragmentProviderComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(LinksBridgeComponentImpl.class, "linksBridge", "getLinksBridge()Lcom/vk/bridges/LinksBridge;", 0);
        fpf0.a.getClass();
        H = new qcy[]{propertyReference1Impl};
    }

    public LinksBridgeComponentImpl(Lazy<? extends RouterComponent> lazy, Lazy<? extends CartComponent> lazy2, Lazy<? extends StoryViewerComponent> lazy3, Lazy<? extends ReviewsComponent> lazy4, Lazy<? extends MarketOrdersComponent> lazy5, Lazy<? extends VkClientMultiAccountComponent> lazy6, Lazy<? extends NotificationsSettingsComponent> lazy7, Lazy<? extends NotificationListComponent> lazy8, Lazy<? extends VoipCallsJoinRouterComponent> lazy9, Lazy<? extends VoipStereoRouterComponent> lazy10, Lazy<? extends TopicsComponent> lazy11, Lazy<? extends BlacklistComponent> lazy12, Lazy<? extends MarketComponent> lazy13, Lazy<? extends CommunityChatsComponent> lazy14, Lazy<? extends OnlineBookingComponent> lazy15, Lazy<? extends StorefrontComponent> lazy16, Lazy<? extends StorefrontServicesComponent> lazy17, Lazy<? extends TabbarSettingsComponent> lazy18, Lazy<? extends BridgeComponent> lazy19, Lazy<? extends BiometricsLockComponent> lazy20, Lazy<? extends DialogsScreenFeatureComponent> lazy21, Lazy<? extends VerifiedSellerComponent> lazy22, Lazy<? extends CommunityAddressComponent> lazy23, CommunityDetailsComponent communityDetailsComponent, Lazy<? extends MusicOnboardingComponent> lazy24, Lazy<? extends PodcastComponent> lazy25, Lazy<? extends GamesCatalogComponent> lazy26, Lazy<? extends ContentProductsComponent> lazy27, Lazy<? extends CommunitiesCatalogComponent> lazy28, Lazy<? extends NewsfeedRouterComponent> lazy29, Lazy<? extends DzenArticleComponent> lazy30, ProfileFragmentProviderComponent profileFragmentProviderComponent) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
        this.f = lazy6;
        this.g = lazy7;
        this.h = lazy8;
        this.i = lazy9;
        this.j = lazy10;
        this.k = lazy11;
        this.l = lazy12;
        this.m = lazy13;
        this.n = lazy14;
        this.o = lazy15;
        this.p = lazy16;
        this.q = lazy17;
        this.r = lazy18;
        this.s = lazy19;
        this.t = lazy20;
        this.u = lazy21;
        this.v = lazy22;
        this.w = lazy23;
        this.x = communityDetailsComponent;
        this.y = lazy24;
        this.z = lazy25;
        this.A = lazy26;
        this.B = lazy27;
        this.C = lazy28;
        this.D = lazy29;
        this.E = lazy30;
        this.F = profileFragmentProviderComponent;
    }

    @Override // com.vk.bridges.di.LinksBridgeComponent
    public final qdz p() {
        qcy<Object> qcyVar = H[0];
        return (qdz) this.G.c();
    }
}
