package xsna;

import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;

/* compiled from: FeedFeatureDependenciesHolder.kt */
/* loaded from: classes17.dex */
public final class wyq {
    public final yof a;
    public final hwc b;
    public final gbq c;
    public final fqe d;
    public final okh0 e;
    public final e25 f;
    public final bpn0 g;
    public final ClipFeedListFragment.i h;
    public final b7b0 i;
    public final vjx j;
    public final m0x k;
    public final bkw l;
    public final w8l m;
    public final tih0 n;
    public final v5e o;
    public final y5e p;
    public final te0 q;

    public wyq(yof yofVar, hwc hwcVar, gbq gbqVar, fqe fqeVar, okh0 okh0Var, e25 e25Var, bpn0 bpn0Var, ClipFeedListFragment.i iVar, c7b0 c7b0Var, vjx vjxVar, m0x m0xVar, bkw bkwVar, w8l w8lVar, tih0 tih0Var, v5e v5eVar, y5e y5eVar, te0 te0Var) {
        this.a = yofVar;
        this.b = hwcVar;
        this.c = gbqVar;
        this.d = fqeVar;
        this.e = okh0Var;
        this.f = e25Var;
        this.g = bpn0Var;
        this.h = iVar;
        this.i = c7b0Var;
        this.j = vjxVar;
        this.k = m0xVar;
        this.l = bkwVar;
        this.m = w8lVar;
        this.n = tih0Var;
        this.o = v5eVar;
        this.p = y5eVar;
        this.q = te0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyq)) {
            return false;
        }
        wyq wyqVar = (wyq) obj;
        if (!epx.f(this.a, wyqVar.a) || !epx.f(this.b, wyqVar.b) || !epx.f(this.c, wyqVar.c) || !epx.f(this.d, wyqVar.d) || !epx.f(this.e, wyqVar.e) || !this.f.equals(wyqVar.f) || !this.g.equals(wyqVar.g) || !this.h.equals(wyqVar.h)) {
            return false;
        }
        Object obj2 = sv1.f;
        if (!obj2.equals(obj2)) {
            return false;
        }
        Object obj3 = kaf.a;
        return obj3.equals(obj3) && epx.f(this.i, wyqVar.i) && epx.f(this.j, wyqVar.j) && epx.f(this.k, wyqVar.k) && this.l.equals(wyqVar.l) && epx.f(this.m, wyqVar.m) && epx.f(this.n, wyqVar.n) && epx.f(this.o, wyqVar.o) && epx.f(this.p, wyqVar.p) && this.q.equals(wyqVar.q);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hwc hwcVar = this.b;
        int hashCode2 = (hashCode + (hwcVar == null ? 0 : hwcVar.hashCode())) * 31;
        gbq gbqVar = this.c;
        int hashCode3 = (hashCode2 + (gbqVar == null ? 0 : gbqVar.hashCode())) * 31;
        fqe fqeVar = this.d;
        int hashCode4 = (kaf.a.hashCode() + ((sv1.f.hashCode() + ((this.h.hashCode() + tq.b(this.g, (this.f.a.hashCode() + ((this.e.hashCode() + ((hashCode3 + (fqeVar == null ? 0 : fqeVar.hashCode())) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31;
        b7b0 b7b0Var = this.i;
        int hashCode5 = (hashCode4 + (b7b0Var == null ? 0 : b7b0Var.hashCode())) * 31;
        vjx vjxVar = this.j;
        int hashCode6 = (hashCode5 + (vjxVar == null ? 0 : vjxVar.hashCode())) * 31;
        m0x m0xVar = this.k;
        int hashCode7 = (this.l.hashCode() + ((hashCode6 + (m0xVar == null ? 0 : m0xVar.hashCode())) * 31)) * 31;
        w8l w8lVar = this.m;
        int hashCode8 = (hashCode7 + (w8lVar == null ? 0 : w8lVar.hashCode())) * 31;
        tih0 tih0Var = this.n;
        int hashCode9 = (hashCode8 + (tih0Var == null ? 0 : tih0Var.hashCode())) * 31;
        v5e v5eVar = this.o;
        return this.q.hashCode() + ((this.p.hashCode() + ((hashCode9 + (v5eVar != null ? v5eVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "FeedFeatureDependenciesHolder(experiments=" + this.a + ", externalNpsDelegate=" + this.b + ", extendFeedItemsController=" + this.c + ", playlistsEventObservable=" + this.d + ", performanceReporter=" + this.e + ", authBridge=" + this.f + ", clipsVideoStorage=" + this.g + ", subscriptionObserver=" + this.h + ", videoEventBus=" + sv1.f + ", tracker=" + kaf.a + ", playlistAnalyticsTracker=" + this.i + ", internalNpsRepository=" + this.j + ", inlineNpsRepository=" + this.k + ", imageLoader=" + this.l + ", decorationOnboardingInteractor=" + this.m + ", activitiesRepository=" + this.n + ", activitiesStateHelper=" + this.o + ", analyticContextHolder=" + this.p + ", statInstanceProvider=" + this.q + ')';
    }
}
