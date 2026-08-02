package xsna;

import com.vk.ads.api.di.AdsComponent;
import com.vk.coowners.di.NewsfeedCoownersComponent;
import com.vk.dzenarticle.api.DzenArticleComponent;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import kotlin.Lazy;

/* compiled from: NewsfeedNavigatorExternalDependencies.kt */
/* loaded from: classes4.dex */
public final class iu60 {
    public final Lazy<NewsFeedBridgeComponent> a;
    public final Lazy<StoryViewerComponent> b;
    public final Lazy<mrp> c;
    public final Lazy<NewsfeedCoownersComponent> d;
    public final Lazy<DzenArticleComponent> e;
    public final Lazy<AdsComponent> f;
    public final Lazy<NewsFeedComponent> g;
    public final bpn0 h;
    public final Object i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final Lazy<g7s0> m;

    public iu60(Lazy lazy, Lazy lazy2, bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3, bpn0 bpn0Var4, Lazy lazy3, bpn0 bpn0Var5, Lazy lazy4, bpn0 bpn0Var6, bpn0 bpn0Var7, bpn0 bpn0Var8, Lazy lazy5) {
        this.a = lazy;
        this.b = lazy2;
        this.c = bpn0Var;
        this.d = bpn0Var2;
        this.e = bpn0Var3;
        this.f = bpn0Var4;
        this.g = lazy3;
        this.h = bpn0Var5;
        this.i = lazy4;
        this.j = bpn0Var6;
        this.k = bpn0Var7;
        this.l = bpn0Var8;
        this.m = lazy5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu60)) {
            return false;
        }
        iu60 iu60Var = (iu60) obj;
        return epx.f(this.a, iu60Var.a) && epx.f(this.b, iu60Var.b) && epx.f(this.c, iu60Var.c) && epx.f(this.d, iu60Var.d) && epx.f(this.e, iu60Var.e) && epx.f(this.f, iu60Var.f) && epx.f(this.g, iu60Var.g) && this.h.equals(iu60Var.h) && this.i.equals(iu60Var.i) && this.j.equals(iu60Var.j) && this.k.equals(iu60Var.k) && this.l.equals(iu60Var.l) && epx.f(this.m, iu60Var.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + tq.b(this.l, tq.b(this.k, tq.b(this.j, vul0.a(tq.b(this.h, g7r0.a(this.g, g7r0.a(this.f, g7r0.a(this.e, g7r0.a(this.d, g7r0.a(this.c, g7r0.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.i), 31), 31), 31);
    }

    public final String toString() {
        return "NewsfeedNavigatorExternalDependencies(newsfeedBridgeComponentLazy=" + this.a + ", storyViewerComponentLazy=" + this.b + ", entryListRouterLazy=" + this.c + ", coownersComponentLazy=" + this.d + ", dzenArticleComponentLazy=" + this.e + ", adsComponentLazy=" + this.f + ", newsfeedComponentLazy=" + this.g + ", linksBridgeComponentLazy=" + this.h + ", routerComponentLazy=" + this.i + ", cartComponentLazy=" + this.j + ", classifiedsComponentLazy=" + this.k + ", dataRepositoryComponentLazy=" + this.l + ", videoBridgeLazy=" + this.m + ')';
    }
}
