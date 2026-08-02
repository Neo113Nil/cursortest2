package xsna;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.profile.community.creationonboarding.api.di.CreationOnboardingComponent;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.newsfeed.api.di.CommunityNewsfeedComponent;
import com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent;
import kotlin.LazyThreadSafetyMode;

/* compiled from: CommunityProfileDiDependencies.kt */
/* loaded from: classes5.dex */
public final class ynh {
    public final Object A;
    public final bpn0 A0;
    public final Object B;
    public final Object B0;
    public final Object C;
    public final Object C0;
    public final Object D;
    public final Object D0;
    public final Object E;
    public final Object E0;
    public final Object F;
    public final Object F0;
    public final Object G;
    public final Object G0;
    public final Object H;
    public final Object H0;
    public final Object I;
    public final Object I0;
    public final Object J;
    public final bpn0 J0;
    public final Object K;
    public final Object K0;
    public final Object L;
    public final Object L0;
    public final Object M;
    public final Object M0;
    public final Object N;
    public final Object N0;
    public final Object O;
    public final Object O0;
    public final Object P;
    public final Object P0;
    public final Object Q;
    public final Object Q0;
    public final Object R;
    public final Object R0;
    public final Object S;
    public final Object S0;
    public final Object T;
    public final Object T0;
    public final Object U;
    public final Object U0;
    public final Object V;
    public final Object V0;
    public final Object W;
    public final Object W0;
    public final Object X;
    public final Object X0;
    public final Object Y;
    public final Object Y0;
    public final Object Z;
    public final Object Z0;
    public final CommunityProfileFragment a;
    public final Object a0;
    public final Object a1;
    public final bpn0 b;
    public final Object b0;
    public final Object b1;
    public final bpn0 c;
    public final Object c0;
    public final bpn0 d;
    public final Object d0;
    public final bpn0 e;
    public final Object e0;
    public final bpn0 f;
    public final Object f0;
    public final bpn0 g;
    public final Object g0;
    public final bpn0 h;
    public final Object h0;
    public final bpn0 i;
    public final Object i0;
    public final bpn0 j;
    public final Object j0;
    public final bpn0 k;
    public final Object k0;
    public final bpn0 l;
    public final Object l0;
    public final bpn0 m;
    public final Object m0;
    public final bpn0 n;
    public final Object n0;
    public final bpn0 o;
    public final Object o0;
    public final bpn0 p;
    public final Object p0;
    public final bpn0 q;
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
    public final Object v0;
    public final Object w;
    public final Object w0;
    public final Object x;
    public final Object x0;
    public final Object y;
    public final Object y0;
    public final Object z;
    public final Object z0;

    public ynh(final l7m l7mVar, CommunityProfileFragment communityProfileFragment) {
        this.a = communityProfileFragment;
        this.b = new bpn0(new rze(l7mVar, 2));
        this.c = new bpn0(new f7f(l7mVar, 1));
        this.d = new bpn0(new fff(l7mVar, 2));
        this.e = new bpn0(new dne(l7mVar, 8));
        this.f = new bpn0(new com.vk.movika.sdk.base.ui.f(l7mVar, 26));
        this.g = new bpn0(new knh(l7mVar, 0));
        this.h = new bpn0(new nnh(l7mVar, 0));
        this.i = new bpn0(new skg(l7mVar, 1));
        this.j = new bpn0(new uef(l7mVar, 2));
        final int i = 0;
        this.k = new bpn0(new gzs() { // from class: xsna.zmh
            @Override // xsna.gzs
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((CommunityNewsfeedComponent) l7mVar.mo408a(fpf0.a(CommunityNewsfeedComponent.class))).Jb();
                    default:
                        return ((AuthBridgeComponent) l7mVar.a(fpf0.a(AuthBridgeComponent.class))).s();
                }
            }
        });
        this.l = new bpn0(new com.vk.movika.sdk.base.logic.interactor.h(l7mVar, 25));
        this.m = new bpn0(new tnh(l7mVar, 0));
        this.n = new bpn0(new rze(l7mVar, 3));
        this.o = new bpn0(new zef(l7mVar, 2));
        this.p = new bpn0(new xef(l7mVar, 1));
        this.q = new bpn0(new yef(l7mVar, 1));
        zef zefVar = new zef(l7mVar, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.r = msy.a(lazyThreadSafetyMode, zefVar);
        int i2 = 1;
        this.s = msy.a(lazyThreadSafetyMode, new aff(l7mVar, i2));
        this.t = msy.a(lazyThreadSafetyMode, new bff(l7mVar, i2));
        this.u = msy.a(lazyThreadSafetyMode, new e7f(l7mVar, i2));
        int i3 = 2;
        this.v = msy.a(lazyThreadSafetyMode, new g7f(l7mVar, i3));
        this.w = msy.a(lazyThreadSafetyMode, new h7f(l7mVar, i3));
        this.x = msy.a(lazyThreadSafetyMode, new i7f(l7mVar, i3));
        this.y = msy.a(lazyThreadSafetyMode, new c53(l7mVar, i3));
        this.z = msy.a(lazyThreadSafetyMode, new kxd(l7mVar, 1));
        this.A = msy.a(lazyThreadSafetyMode, new anh(l7mVar, 0));
        int i4 = 1;
        this.B = msy.a(lazyThreadSafetyMode, new dff(l7mVar, i4));
        this.C = msy.a(lazyThreadSafetyMode, new e1h(l7mVar, i4));
        this.D = msy.a(lazyThreadSafetyMode, new eff(l7mVar, 2));
        this.E = msy.a(lazyThreadSafetyMode, new f1h(l7mVar, 1));
        this.F = msy.a(lazyThreadSafetyMode, new gff(l7mVar, 2));
        int i5 = 1;
        this.G = msy.a(lazyThreadSafetyMode, new g1h(l7mVar, i5));
        this.H = msy.a(lazyThreadSafetyMode, new i1h(l7mVar, i5));
        this.I = msy.a(lazyThreadSafetyMode, new j1h(l7mVar, i5));
        int i6 = 0;
        this.J = msy.a(lazyThreadSafetyMode, new bnh(l7mVar, i6));
        this.K = msy.a(lazyThreadSafetyMode, new cnh(l7mVar, i6));
        this.L = msy.a(lazyThreadSafetyMode, new fc(8));
        this.M = msy.a(lazyThreadSafetyMode, new c5f(this, 4));
        this.N = msy.a(lazyThreadSafetyMode, new yh(this, 29));
        this.O = msy.a(lazyThreadSafetyMode, new com.vk.newsfeed.common.recycler.holders.attachments.a(10, l7mVar, this));
        int i7 = 9;
        this.P = msy.a(lazyThreadSafetyMode, new ig1(i7, l7mVar, this));
        this.Q = msy.a(lazyThreadSafetyMode, new d1(i7));
        this.R = msy.a(lazyThreadSafetyMode, new pd4(i7));
        this.S = msy.a(lazyThreadSafetyMode, new pff(l7mVar, 10));
        this.T = msy.a(lazyThreadSafetyMode, new m2g(l7mVar, 4));
        this.U = msy.a(lazyThreadSafetyMode, new fbh(l7mVar, 1));
        this.V = msy.a(lazyThreadSafetyMode, new dnh(l7mVar, 0));
        this.W = msy.a(lazyThreadSafetyMode, new p5h(l7mVar, 2));
        this.X = msy.a(lazyThreadSafetyMode, new q5f(l7mVar, 6));
        this.Y = msy.a(lazyThreadSafetyMode, new enh(l7mVar, 0));
        this.Z = msy.a(lazyThreadSafetyMode, new kbe(l7mVar, 6));
        int i8 = 0;
        this.a0 = msy.a(lazyThreadSafetyMode, new fnh(l7mVar, i8));
        this.b0 = msy.a(lazyThreadSafetyMode, new gnh(l7mVar, i8));
        this.c0 = msy.a(lazyThreadSafetyMode, new hnh(l7mVar, i8));
        this.d0 = msy.a(lazyThreadSafetyMode, new inh(l7mVar, i8));
        int i9 = 1;
        this.e0 = msy.a(lazyThreadSafetyMode, new k63(l7mVar, i9));
        this.f0 = msy.a(lazyThreadSafetyMode, new qzg(l7mVar, i9));
        this.g0 = msy.a(lazyThreadSafetyMode, new ozf(l7mVar, 7));
        this.h0 = msy.a(lazyThreadSafetyMode, new jnh(l7mVar, 0));
        int i10 = 27;
        this.i0 = msy.a(lazyThreadSafetyMode, new v40(l7mVar, i10));
        this.j0 = msy.a(lazyThreadSafetyMode, new px0(l7mVar, i10));
        this.k0 = msy.a(lazyThreadSafetyMode, new mag(l7mVar, 5));
        int i11 = 0;
        this.l0 = msy.a(lazyThreadSafetyMode, new lnh(l7mVar, i11));
        this.m0 = msy.a(lazyThreadSafetyMode, new mnh(l7mVar, i11));
        this.n0 = msy.a(lazyThreadSafetyMode, new t61(17));
        this.o0 = msy.a(lazyThreadSafetyMode, new bih(l7mVar, 2));
        int i12 = 1;
        this.p0 = msy.a(lazyThreadSafetyMode, new kmh(this, i12));
        this.q0 = msy.a(lazyThreadSafetyMode, new lmh(this, i12));
        this.r0 = msy.a(lazyThreadSafetyMode, new oo(l7mVar, 29));
        this.s0 = msy.a(lazyThreadSafetyMode, new wm1(l7mVar, 27));
        this.t0 = msy.a(lazyThreadSafetyMode, new mk(7, this, l7mVar));
        int i13 = 0;
        this.u0 = msy.a(lazyThreadSafetyMode, new onh(l7mVar, i13));
        this.v0 = msy.a(lazyThreadSafetyMode, new pnh(l7mVar, i13));
        this.w0 = msy.a(lazyThreadSafetyMode, new b3(this, 26));
        this.x0 = msy.a(lazyThreadSafetyMode, new sbg(this, 6));
        int i14 = 0;
        this.y0 = msy.a(lazyThreadSafetyMode, new qnh(l7mVar, i14));
        this.z0 = msy.a(lazyThreadSafetyMode, new rnh(l7mVar, i14));
        this.A0 = new bpn0(new snh(l7mVar, i14));
        int i15 = 0;
        this.B0 = msy.a(lazyThreadSafetyMode, new unh(l7mVar, i15));
        this.C0 = msy.a(lazyThreadSafetyMode, new vnh(l7mVar, i15));
        this.D0 = msy.a(lazyThreadSafetyMode, new wnh(this, i15));
        this.E0 = msy.a(lazyThreadSafetyMode, new xnh(l7mVar, i15));
        this.F0 = msy.a(lazyThreadSafetyMode, new kg(10, l7mVar, this));
        this.G0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.i(this, 24));
        this.H0 = msy.a(lazyThreadSafetyMode, new bu1(this, 17));
        int i16 = 2;
        this.I0 = msy.a(lazyThreadSafetyMode, new pze(l7mVar, i16));
        this.J0 = new bpn0(new qze(l7mVar, i16));
        final int i17 = 1;
        this.K0 = msy.a(lazyThreadSafetyMode, new gzs() { // from class: xsna.xmh
            @Override // xsna.gzs
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return ((CommunitySubscriptionComponent) l7mVar.mo408a(fpf0.a(CommunitySubscriptionComponent.class))).D6();
                    default:
                        return ((InfoBridgeComponent) l7mVar.a(fpf0.a(InfoBridgeComponent.class))).t();
                }
            }
        });
        this.L0 = msy.a(lazyThreadSafetyMode, new ymh(l7mVar, i17));
        this.M0 = msy.a(lazyThreadSafetyMode, new tef(l7mVar, 2));
        final int i18 = 1;
        this.N0 = msy.a(lazyThreadSafetyMode, new gzs() { // from class: xsna.zmh
            @Override // xsna.gzs
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return ((CommunityNewsfeedComponent) l7mVar.mo408a(fpf0.a(CommunityNewsfeedComponent.class))).Jb();
                    default:
                        return ((AuthBridgeComponent) l7mVar.a(fpf0.a(AuthBridgeComponent.class))).s();
                }
            }
        });
        this.O0 = msy.a(lazyThreadSafetyMode, new vef(l7mVar, i18));
        this.P0 = msy.a(lazyThreadSafetyMode, new g4g(l7mVar, 3));
        this.Q0 = msy.a(lazyThreadSafetyMode, new wef(l7mVar, 1));
        int i19 = 2;
        this.R0 = msy.a(lazyThreadSafetyMode, new xef(l7mVar, i19));
        this.S0 = msy.a(lazyThreadSafetyMode, new yef(l7mVar, i19));
        final int i20 = 0;
        this.T0 = msy.a(lazyThreadSafetyMode, new gzs() { // from class: xsna.xmh
            @Override // xsna.gzs
            public final Object invoke() {
                switch (i20) {
                    case 0:
                        return ((CommunitySubscriptionComponent) l7mVar.mo408a(fpf0.a(CommunitySubscriptionComponent.class))).D6();
                    default:
                        return ((InfoBridgeComponent) l7mVar.a(fpf0.a(InfoBridgeComponent.class))).t();
                }
            }
        });
        this.U0 = msy.a(lazyThreadSafetyMode, new ymh(l7mVar, i20));
        int i21 = 1;
        this.V0 = msy.a(lazyThreadSafetyMode, new tef(l7mVar, i21));
        this.W0 = msy.a(lazyThreadSafetyMode, new uef(l7mVar, i21));
        this.X0 = msy.a(lazyThreadSafetyMode, new jxd(l7mVar, 2));
        this.Y0 = msy.a(lazyThreadSafetyMode, new h1h(l7mVar, 1));
        this.Z0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.presenter.b(l7mVar, 23));
        this.a1 = msy.a(lazyThreadSafetyMode, new yce(l7mVar, 6));
        this.b1 = msy.a(lazyThreadSafetyMode, new w40(l7mVar, 26));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final b25 a() {
        return (b25) this.N0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final CreationOnboardingComponent b() {
        return (CreationOnboardingComponent) this.R0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final cpu c() {
        return (cpu) this.j0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final h7v d() {
        return (h7v) this.o0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final sdz e() {
        return (sdz) this.h0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final maz f() {
        return (maz) this.g0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final fy00 g() {
        return (fy00) this.b0.getValue();
    }
}
