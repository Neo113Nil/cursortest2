package xsna;

import java.util.List;

/* compiled from: FeatureDelegates.kt */
/* loaded from: classes5.dex */
public final class iuq implements mtl {
    public final jmq0 b;
    public final qvl0 c;
    public final rlq0 d;
    public final jtq0 e;
    public final cvq0 f;
    public final bvq0 g;
    public final stq0 h;
    public final koq0 i;
    public final vlq0 j;
    public final vpq0 k;
    public final gpq0 l;
    public final buq0 m;
    public final ynq0 n;
    public final fqq0 o;
    public final gvq0 p;
    public final gxq0 q;
    public final omq0 r;
    public final c5e0 s;
    public final b960 t;
    public final dsi0 u;
    public final ctn0 v;
    public final dxn w;
    public final pnq0 x;
    public final f31 y;

    public iuq(jmq0 jmq0Var, qvl0 qvl0Var, rlq0 rlq0Var, jtq0 jtq0Var, cvq0 cvq0Var, bvq0 bvq0Var, stq0 stq0Var, koq0 koq0Var, vlq0 vlq0Var, vpq0 vpq0Var, gpq0 gpq0Var, buq0 buq0Var, ynq0 ynq0Var, fqq0 fqq0Var, gvq0 gvq0Var, gxq0 gxq0Var, omq0 omq0Var, c5e0 c5e0Var, b960 b960Var, dsi0 dsi0Var, ctn0 ctn0Var, dxn dxnVar, pnq0 pnq0Var, f31 f31Var, zqq0 zqq0Var) {
        this.b = jmq0Var;
        this.c = qvl0Var;
        this.d = rlq0Var;
        this.e = jtq0Var;
        this.f = cvq0Var;
        this.g = bvq0Var;
        this.h = stq0Var;
        this.i = koq0Var;
        this.j = vlq0Var;
        this.k = vpq0Var;
        this.l = gpq0Var;
        this.m = buq0Var;
        this.n = ynq0Var;
        this.o = fqq0Var;
        this.p = gvq0Var;
        this.q = gxq0Var;
        this.r = omq0Var;
        this.s = c5e0Var;
        this.t = b960Var;
        this.u = dsi0Var;
        this.v = ctn0Var;
        this.w = dxnVar;
        this.x = pnq0Var;
        this.y = f31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iuq)) {
            return false;
        }
        iuq iuqVar = (iuq) obj;
        return epx.f(this.b, iuqVar.b) && epx.f(this.c, iuqVar.c) && epx.f(this.d, iuqVar.d) && epx.f(this.e, iuqVar.e) && epx.f(this.f, iuqVar.f) && epx.f(this.g, iuqVar.g) && epx.f(this.h, iuqVar.h) && epx.f(this.i, iuqVar.i) && epx.f(this.j, iuqVar.j) && epx.f(this.k, iuqVar.k) && epx.f(this.l, iuqVar.l) && epx.f(this.m, iuqVar.m) && epx.f(this.n, iuqVar.n) && epx.f(this.o, iuqVar.o) && epx.f(this.p, iuqVar.p) && epx.f(this.q, iuqVar.q) && epx.f(this.r, iuqVar.r) && epx.f(this.s, iuqVar.s) && epx.f(this.t, iuqVar.t) && epx.f(this.u, iuqVar.u) && epx.f(this.v, iuqVar.v) && epx.f(this.w, iuqVar.w) && epx.f(this.x, iuqVar.x) && epx.f(this.y, iuqVar.y) && epx.f(null, null);
    }

    public final int hashCode() {
        return ((this.y.hashCode() + ((this.x.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + 0;
    }

    public final String toString() {
        return "FeatureDelegates(avatarFeatureDelegate=" + this.b + ", storiesSubscriptionFeatureDelegate=" + this.c + ", actionButtonsFeatureDelegate=" + this.d + ", postingFeatureDelegate=" + this.e + ", unpublishedFeatureDelegate=" + this.f + ", statusFeatureDelegate=" + this.g + ", privacyFeatureDelegate=" + this.h + ", detailsFeatureDelegate=" + this.i + ", additionalActionFeatureDelegate=" + this.j + ", friendsFeatureDelegate=" + this.k + ", followersModeFeatureDelegate=" + this.l + ", recommendationsFeatureDelegate=" + this.m + ", contentTabsFeatureDelegate=" + this.n + ", headerFeatureDelegate=" + this.o + ", userProfileWallActionFeatureDelegate=" + this.p + ", userProfileWallTabActionFeatureDelegate=" + this.q + ", broadcastFeatureDelegate=" + this.r + ", promoFeatureDelegate=" + this.s + ", newUserOnboardingFeatureDelegate=" + this.t + ", servicesOnboardingFeatureDelegate=" + this.u + ", tabPinningFeatureDelegate=" + this.v + ", donutBannerFeatureDelegate=" + this.w + ", contentPublishedFeatureDelegate=" + this.x + ", adBannerFeatureDelegate=" + this.y + ", legoAuthorHeaderDelegate=" + ((Object) null) + ')';
    }

    @Override // xsna.mtl
    public final List<huq> w2() {
        return e43.o(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y);
    }
}
