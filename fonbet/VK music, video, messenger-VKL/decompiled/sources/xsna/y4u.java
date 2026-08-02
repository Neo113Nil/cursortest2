package xsna;

import com.vk.bridges.ImageViewer;
import com.vk.bridges.di.BridgeComponent;
import com.vk.comments.api.di.CommentsComponent;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.market.impl.di.MarketInternalComponent;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.ecomm.shop_conditions.api.di.MarketShopConditionsComponent;
import com.vk.ecomm.storefront.api.di.StorefrontComponent;
import com.vk.fave.di.FaveComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.profile.community.api.component.CommunityComponent;
import com.vk.report.api.di.ReportComponent;
import com.vk.sharing.api.di.SharingComponent;
import kotlin.LazyThreadSafetyMode;

/* compiled from: GoodFragmentDependencies.kt */
/* loaded from: classes18.dex */
public final class y4u {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final CartComponent a;
    public final Object a0;
    public final CommentsComponent b;
    public final Object b0;
    public final ClassifiedsComponent c;
    public final Object c0;
    public final CommunityComponent d;
    public final Object d0;
    public final ReviewsComponent e;
    public final b25 e0;
    public final SharingComponent f;
    public final ImageViewer f0;
    public final MarketComponent g;
    public final Object g0;
    public final FaveComponent h;
    public final Object h0;
    public final ModerationComponent i;
    public final Object i0;
    public final MarketInternalComponent j;
    public final Object j0;
    public final MarketShopConditionsComponent k;
    public final Object k0;
    public final NewsFeedComponent l;
    public final Object l0;
    public final ReportComponent m;
    public final Object m0;
    public final BridgeComponent n;
    public final Object n0;
    public final StorefrontComponent o;
    public final Object o0;
    public final Object p;
    public final Object p0;
    public final Object q;
    public final Object q0;
    public final Object r;
    public final Object r0;
    public final Object s;
    public final Object s0;
    public final Object t;
    public final Object t0;
    public final Object u;
    public final Object u0;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    public y4u(l7m l7mVar) {
        this.a = (CartComponent) l7mVar.a(fpf0.a(CartComponent.class));
        this.b = (CommentsComponent) l7mVar.mo408a(fpf0.a(CommentsComponent.class));
        this.c = (ClassifiedsComponent) l7mVar.a(fpf0.a(ClassifiedsComponent.class));
        this.d = (CommunityComponent) l7mVar.a(fpf0.a(CommunityComponent.class));
        this.e = (ReviewsComponent) l7mVar.a(fpf0.a(ReviewsComponent.class));
        this.f = (SharingComponent) l7mVar.a(fpf0.a(SharingComponent.class));
        this.g = (MarketComponent) l7mVar.a(fpf0.a(MarketComponent.class));
        this.h = (FaveComponent) l7mVar.mo408a(fpf0.a(FaveComponent.class));
        this.i = (ModerationComponent) l7mVar.mo408a(fpf0.a(ModerationComponent.class));
        this.j = (MarketInternalComponent) l7mVar.mo408a(fpf0.a(MarketInternalComponent.class));
        this.k = (MarketShopConditionsComponent) l7mVar.mo408a(fpf0.a(MarketShopConditionsComponent.class));
        this.l = (NewsFeedComponent) l7mVar.a(fpf0.a(NewsFeedComponent.class));
        this.m = (ReportComponent) l7mVar.mo408a(fpf0.a(ReportComponent.class));
        BridgeComponent bridgeComponent = (BridgeComponent) l7mVar.a(fpf0.a(BridgeComponent.class));
        this.n = bridgeComponent;
        this.o = (StorefrontComponent) l7mVar.a(fpf0.a(StorefrontComponent.class));
        sbg sbgVar = new sbg(this, 20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.p = msy.a(lazyThreadSafetyMode, sbgVar);
        int i = 20;
        this.q = msy.a(lazyThreadSafetyMode, new m3g(this, i));
        this.r = msy.a(lazyThreadSafetyMode, new tbh(this, i));
        this.s = msy.a(lazyThreadSafetyMode, new trf(this, 29));
        this.t = msy.a(lazyThreadSafetyMode, new cwg(this, 25));
        this.u = msy.a(lazyThreadSafetyMode, new v3n(this, 8));
        this.v = msy.a(lazyThreadSafetyMode, new p3h(this, 24));
        this.w = msy.a(lazyThreadSafetyMode, new bnh(l7mVar, 1));
        this.x = msy.a(lazyThreadSafetyMode, new cnh(this, 13));
        this.y = msy.a(lazyThreadSafetyMode, new k5h(this, 21));
        this.z = msy.a(lazyThreadSafetyMode, new atm(this, 9));
        this.A = msy.a(lazyThreadSafetyMode, new g4g(this, 21));
        this.B = msy.a(lazyThreadSafetyMode, new x3i(this, 14));
        this.C = msy.a(lazyThreadSafetyMode, new bzj(this, 15));
        this.D = msy.a(lazyThreadSafetyMode, new c5f(this, 23));
        this.E = msy.a(lazyThreadSafetyMode, new jrh(this, 13));
        this.F = msy.a(lazyThreadSafetyMode, new myh(this, 19));
        this.G = msy.a(lazyThreadSafetyMode, new dne(this, 29));
        this.H = msy.a(lazyThreadSafetyMode, new krh(this, 19));
        this.I = msy.a(lazyThreadSafetyMode, new tbg(this, 20));
        this.J = msy.a(lazyThreadSafetyMode, new bfm(this, 9));
        this.K = msy.a(lazyThreadSafetyMode, new qfj(this, 7));
        this.L = msy.a(lazyThreadSafetyMode, new w4u(this, 0));
        this.M = msy.a(lazyThreadSafetyMode, new pvh(this, 8));
        this.N = msy.a(lazyThreadSafetyMode, new obh(this, 11));
        this.O = msy.a(lazyThreadSafetyMode, new wnh(this, 15));
        this.P = msy.a(lazyThreadSafetyMode, new nef(this, 13));
        this.Q = msy.a(lazyThreadSafetyMode, new sim(this, 9));
        this.R = msy.a(lazyThreadSafetyMode, new m1o(this, 7));
        this.S = msy.a(lazyThreadSafetyMode, new btm(this, 9));
        this.T = msy.a(lazyThreadSafetyMode, new s1m(this, 13));
        this.U = msy.a(lazyThreadSafetyMode, new bu0(12));
        this.V = msy.a(lazyThreadSafetyMode, new gbj(this, 15));
        this.W = msy.a(lazyThreadSafetyMode, new u3k(this, 16));
        this.X = msy.a(lazyThreadSafetyMode, new w8q(this, 6));
        this.Y = msy.a(lazyThreadSafetyMode, new n5i(this, 19));
        this.Z = msy.a(lazyThreadSafetyMode, new jcg(this, 21));
        this.a0 = msy.a(lazyThreadSafetyMode, new z0h(this, 17));
        this.b0 = msy.a(lazyThreadSafetyMode, new drg(this, 20));
        this.c0 = msy.a(lazyThreadSafetyMode, new wqf(this, 25));
        this.d0 = msy.a(lazyThreadSafetyMode, new x4u(this, 0));
        this.e0 = bridgeComponent.s();
        this.f0 = bridgeComponent.ob();
        this.g0 = msy.a(lazyThreadSafetyMode, new dof(this, 27));
        this.h0 = msy.a(lazyThreadSafetyMode, new jb(17));
        this.i0 = msy.a(lazyThreadSafetyMode, new ncg(this, 24));
        this.j0 = msy.a(lazyThreadSafetyMode, new xu0(17));
        this.k0 = msy.a(lazyThreadSafetyMode, new yv2(15));
        int i2 = 13;
        this.l0 = msy.a(lazyThreadSafetyMode, new y3i(this, i2));
        this.m0 = msy.a(lazyThreadSafetyMode, new tj2(i2));
        int i3 = 15;
        this.n0 = msy.a(lazyThreadSafetyMode, new nd1(i3));
        this.o0 = msy.a(lazyThreadSafetyMode, new fn4(i3));
        this.p0 = msy.a(lazyThreadSafetyMode, new sv0(18));
        this.q0 = msy.a(lazyThreadSafetyMode, new uv0(15));
        this.r0 = msy.a(lazyThreadSafetyMode, new yqf(this, 23));
        this.s0 = msy.a(lazyThreadSafetyMode, new iz3(10));
        this.t0 = msy.a(lazyThreadSafetyMode, new wv0(17));
        this.u0 = msy.a(lazyThreadSafetyMode, new nuj(this, 12));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final c4u a() {
        return (c4u) this.i0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final maz b() {
        return (maz) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final hc10 c() {
        return (hc10) this.l0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final com.vk.ecomm.market.good.c d() {
        return (com.vk.ecomm.market.good.c) this.r0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ffp0 e() {
        return (ffp0) this.o0.getValue();
    }
}
