package xsna;

import kotlin.Lazy;

/* compiled from: NewsfeedListDependencies.kt */
/* loaded from: classes4.dex */
public final class rjf0 {
    public final a4r a;
    public final fh9 b;
    public final y3v c;
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

    public rjf0(a4r a4rVar, fh9 fh9Var, y3v y3vVar, Lazy<or60> lazy, Lazy<oc60> lazy2, Lazy<com.vk.stat.recycler.d> lazy3, Lazy<? extends dui> lazy4, Lazy<tc60> lazy5, Lazy<o170> lazy6, Lazy<sr60> lazy7, Lazy<hm60> lazy8, Lazy<ho60> lazy9, Lazy<rl60> lazy10, Lazy<? extends zjf0<ol60>> lazy11, Lazy<yl60> lazy12, Lazy<bs60> lazy13, Lazy<aw60> lazy14) {
        this.a = a4rVar;
        this.b = fh9Var;
        this.c = y3vVar;
        this.d = lazy;
        this.e = lazy2;
        this.f = lazy3;
        this.g = lazy4;
        this.h = lazy5;
        this.i = lazy6;
        this.j = lazy7;
        this.k = lazy8;
        this.l = lazy9;
        this.m = lazy10;
        this.n = lazy11;
        this.o = lazy12;
        this.p = lazy13;
        this.q = lazy14;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ho60 a() {
        return (ho60) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final dui b() {
        return (dui) this.g.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjf0)) {
            return false;
        }
        rjf0 rjf0Var = (rjf0) obj;
        return this.a.equals(rjf0Var.a) && this.b.equals(rjf0Var.b) && epx.f(this.c, rjf0Var.c) && this.d.equals(rjf0Var.d) && this.e.equals(rjf0Var.e) && this.f.equals(rjf0Var.f) && this.g.equals(rjf0Var.g) && this.h.equals(rjf0Var.h) && this.i.equals(rjf0Var.i) && this.j.equals(rjf0Var.j) && this.k.equals(rjf0Var.k) && this.l.equals(rjf0Var.l) && this.m.equals(rjf0Var.m) && this.n.equals(rjf0Var.n) && this.o.equals(rjf0Var.o) && this.p.equals(rjf0Var.p) && this.q.equals(rjf0Var.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + vul0.a(vul0.a(vul0.a(vul0.a(vul0.a(vul0.a(vul0.a(vul0.a(vul0.a(vul0.a(vul0.a(vul0.a(vul0.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecyclerViewDependencies(recyclerViewHolder=");
        sb.append(this.a);
        sb.append(", html5Dependencies=");
        sb.append(this.b);
        sb.append(", hideKeyboardScrollListener=");
        sb.append(this.c);
        sb.append(", pagerLazy=");
        sb.append(this.d);
        sb.append(", asyncBlockLoaderLazy=");
        sb.append(this.e);
        sb.append(", recyclerViewProfilerLazy=");
        sb.append(this.f);
        sb.append(", compositeOnScrollListenersLazy=");
        sb.append(this.g);
        sb.append(", autoPlayScrollControllerLazy=");
        sb.append(this.h);
        sb.append(", watcherScrollControllerLazy=");
        sb.append(this.i);
        sb.append(", reactionsDelegateLazy=");
        sb.append(this.j);
        sb.append(", newsfeedItemAnimatorLazy=");
        sb.append(this.k);
        sb.append(", adapterLazy=");
        sb.append(this.l);
        sb.append(", html5BlockLoaderLazy=");
        sb.append(this.m);
        sb.append(", holdersAdapterObserverLazy=");
        sb.append(this.n);
        sb.append(", inlineCommentScrollControllerLazy=");
        sb.append(this.o);
        sb.append(", statisticsViewsPluginLazy=");
        sb.append(this.p);
        sb.append(", preloadControllerLazy=");
        return k73.c(sb, this.q, ')');
    }
}
