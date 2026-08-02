package xsna;

import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.story.viewer.api.StoryViewerRouter;

/* compiled from: StoryViewDependencies.kt */
/* loaded from: classes6.dex */
public final class qlm0 {
    public final xsl0 a;
    public final rul0 b;
    public final j6v c;
    public final gu50 d;
    public final qpl0 e;
    public final anm0 f;
    public final StoryViewerRouter g;
    public final yjc h;
    public final wvl0 i;
    public final kz8 j;
    public final s7m0 k;
    public final fnm0 l;
    public final gul0 m;
    public final jnm0 n;
    public final uvl0 o;
    public final otl0 p;
    public final p870 q;
    public final lnm0 r;
    public final q7m0 s;
    public final smm0 t;
    public final jfm0 u;
    public final h7v v;
    public final lt00 w;
    public final b25 x;
    public final AudienceResearchComponent y;

    public qlm0(xsl0 xsl0Var, rul0 rul0Var, j6v j6vVar, gu50 gu50Var, qpl0 qpl0Var, anm0 anm0Var, StoryViewerRouter storyViewerRouter, yjc yjcVar, wvl0 wvl0Var, kz8 kz8Var, s7m0 s7m0Var, fnm0 fnm0Var, gul0 gul0Var, jnm0 jnm0Var, uvl0 uvl0Var, otl0 otl0Var, p870 p870Var, lnm0 lnm0Var, q7m0 q7m0Var, smm0 smm0Var, jfm0 jfm0Var, h7v h7vVar, lt00 lt00Var, b25 b25Var, AudienceResearchComponent audienceResearchComponent) {
        this.a = xsl0Var;
        this.b = rul0Var;
        this.c = j6vVar;
        this.d = gu50Var;
        this.e = qpl0Var;
        this.f = anm0Var;
        this.g = storyViewerRouter;
        this.h = yjcVar;
        this.i = wvl0Var;
        this.j = kz8Var;
        this.k = s7m0Var;
        this.l = fnm0Var;
        this.m = gul0Var;
        this.n = jnm0Var;
        this.o = uvl0Var;
        this.p = otl0Var;
        this.q = p870Var;
        this.r = lnm0Var;
        this.s = q7m0Var;
        this.t = smm0Var;
        this.u = jfm0Var;
        this.v = h7vVar;
        this.w = lt00Var;
        this.x = b25Var;
        this.y = audienceResearchComponent;
    }

    public final rul0 a() {
        return this.b;
    }

    public final anm0 b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlm0)) {
            return false;
        }
        qlm0 qlm0Var = (qlm0) obj;
        return epx.f(this.a, qlm0Var.a) && epx.f(this.b, qlm0Var.b) && epx.f(this.c, qlm0Var.c) && epx.f(this.d, qlm0Var.d) && epx.f(this.e, qlm0Var.e) && epx.f(this.f, qlm0Var.f) && epx.f(this.g, qlm0Var.g) && epx.f(this.h, qlm0Var.h) && epx.f(this.i, qlm0Var.i) && epx.f(this.j, qlm0Var.j) && epx.f(this.k, qlm0Var.k) && epx.f(this.l, qlm0Var.l) && epx.f(this.m, qlm0Var.m) && epx.f(this.n, qlm0Var.n) && epx.f(this.o, qlm0Var.o) && epx.f(this.p, qlm0Var.p) && epx.f(this.q, qlm0Var.q) && epx.f(this.r, qlm0Var.r) && this.s.equals(qlm0Var.s) && this.t.equals(qlm0Var.t) && epx.f(this.u, qlm0Var.u) && epx.f(this.v, qlm0Var.v) && epx.f(this.w, qlm0Var.w) && epx.f(this.x, qlm0Var.x) && epx.f(this.y, qlm0Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + ((this.x.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StoryViewDependencies(interactor=" + this.a + ", seenInteractor=" + this.b + ", highlightsAnalyticsTracker=" + this.c + ", narrativeController=" + this.d + ", adsController=" + this.e + ", storyViewerAnalytics=" + this.f + ", storyViewerRouter=" + this.g + ", clickableStickerDelegateFactory=" + this.h + ", storiesUtil=" + this.i + ", cadreUtil=" + this.j + ", storyOwnerUtil=" + this.k + ", viewerInteractor=" + this.l + ", rearranger=" + this.m + ", lifecycle=" + this.n + ", uploadInteractor=" + this.o + ", loadInteractor=" + this.p + ", notificationCenter=" + this.q + ", viewerPreferenceManager=" + this.r + ", storyOpeningState=" + this.s + ", storyViewPrioritizingLoading=" + this.t + ", storyStatisticsInteractor=" + this.u + ", hintsManager=" + this.v + ", marketAnalytics=" + this.w + ", authBridge=" + this.x + ", researchComponent=" + this.y + ')';
    }
}
