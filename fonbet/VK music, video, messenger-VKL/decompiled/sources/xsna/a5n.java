package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.common.links.generator.api.di.LinksGeneratorComponent;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.video.ui.share.api.VideoShareComponent;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;

/* compiled from: DiscoverMediaStoreParams.kt */
/* loaded from: classes4.dex */
public final class a5n {
    public final z3n a;
    public final qn60 b;
    public final pn60 c;
    public final com.vk.channels.impl.channel_screen.send_msg.c d;
    public final AtomicReference<wn60> e;
    public final bpn0 f;
    public final Lazy<NewsFeedComponent> g;
    public final Lazy<BridgeComponent> h;
    public final Lazy<NewsFeedBridgeComponent> i;
    public final Lazy<LinksGeneratorComponent> j;
    public final Lazy<VideoShareComponent> k;
    public final Lazy<StoriesComponent> l;
    public final s1v m;
    public final Lazy<i3n> n;
    public final ysg0<Object> o;
    public final Lazy<y2n> p;
    public final Lazy<q1n> q;
    public final x5n r;
    public final es60 s;

    public a5n(z3n z3nVar, qn60 qn60Var, pn60 pn60Var, com.vk.channels.impl.channel_screen.send_msg.c cVar, AtomicReference atomicReference, bpn0 bpn0Var, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, s1v s1vVar, Lazy lazy7, ysg0 ysg0Var, Lazy lazy8, Lazy lazy9, x5n x5nVar, es60 es60Var) {
        this.a = z3nVar;
        this.b = qn60Var;
        this.c = pn60Var;
        this.d = cVar;
        this.e = atomicReference;
        this.f = bpn0Var;
        this.g = lazy;
        this.h = lazy2;
        this.i = lazy3;
        this.j = lazy4;
        this.k = lazy5;
        this.l = lazy6;
        this.m = s1vVar;
        this.n = lazy7;
        this.o = ysg0Var;
        this.p = lazy8;
        this.q = lazy9;
        this.r = x5nVar;
        this.s = es60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5n)) {
            return false;
        }
        a5n a5nVar = (a5n) obj;
        return this.a.equals(a5nVar.a) && this.b.equals(a5nVar.b) && this.c.equals(a5nVar.c) && this.d.equals(a5nVar.d) && this.e.equals(a5nVar.e) && this.f.equals(a5nVar.f) && epx.f(this.g, a5nVar.g) && epx.f(this.h, a5nVar.h) && epx.f(this.i, a5nVar.i) && epx.f(this.j, a5nVar.j) && epx.f(this.k, a5nVar.k) && epx.f(this.l, a5nVar.l) && this.m.equals(a5nVar.m) && epx.f(this.n, a5nVar.n) && epx.f(this.o, a5nVar.o) && epx.f(this.p, a5nVar.p) && epx.f(this.q, a5nVar.q) && epx.f(this.r, a5nVar.r) && this.s.equals(a5nVar.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + ((this.r.hashCode() + g7r0.a(this.q, g7r0.a(this.p, (this.o.hashCode() + g7r0.a(this.n, (this.m.hashCode() + g7r0.a(this.l, g7r0.a(this.k, g7r0.a(this.j, g7r0.a(this.i, g7r0.a(this.h, g7r0.a(this.g, tq.b(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31)) * 31, 31)) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "DiscoverMediaStoreParams(mappers=" + this.a + ", dataSet=" + this.b + ", itemsTransformer=" + this.c + ", util=" + this.d + ", lifecycleState=" + this.e + ", deduplicatorLazy=" + this.f + ", newsfeedComponentLazy=" + this.g + ", bridgeComponentLazy=" + this.h + ", newsfeedBridgeComponentLazy=" + this.i + ", linksGeneratorComponentLazy=" + this.j + ", videoShareComponentLazy=" + this.k + ", storiesComponentLazy=" + this.l + ", displayItemsPositionSetter=" + this.m + ", eventsHandlerLazy=" + this.n + ", rxBus=" + this.o + ", discoverMediaCacheConfigLazy=" + this.p + ", discoverCacheLazy=" + this.q + ", techStatsPlugin=" + this.r + ", taskExecutorsDependencies=" + this.s + ')';
    }
}
