package xsna;

import com.vk.ads.yandex.api.di.YandexAdFeatureComponent;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.video.ui.share.api.VideoShareComponent;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;

/* compiled from: NewsfeedStoreParams.kt */
/* loaded from: classes4.dex */
public final class zz60 {
    public final jt60 a;
    public final xhs b;
    public final xj60 c;
    public final lsw d;
    public final vh8 e;
    public final uw60 f;
    public final qn60 g;
    public final pn60 h;
    public final com.vk.channels.impl.channel_screen.send_msg.c i;
    public final AtomicReference<wn60> j;
    public final ts60 k;
    public final Lazy<YandexAdFeatureComponent> l;
    public final Lazy<AuthBridgeComponent> m;
    public final Lazy<hv50> n;
    public final Lazy<NewsFeedComponent> o;
    public final Lazy<BridgeComponent> p;
    public final Lazy<VideoShareComponent> q;
    public final f170 r;
    public final s1v s;
    public final Lazy<it60> t;
    public final ot60 u;
    public final st60 v;

    /* JADX WARN: Multi-variable type inference failed */
    public zz60(jt60 jt60Var, xhs xhsVar, xj60 xj60Var, lsw lswVar, vh8 vh8Var, uw60 uw60Var, qn60 qn60Var, pn60 pn60Var, com.vk.channels.impl.channel_screen.send_msg.c cVar, AtomicReference<wn60> atomicReference, ts60 ts60Var, Lazy<? extends YandexAdFeatureComponent> lazy, Lazy<? extends AuthBridgeComponent> lazy2, Lazy<hv50> lazy3, Lazy<? extends NewsFeedComponent> lazy4, Lazy<? extends BridgeComponent> lazy5, Lazy<? extends VideoShareComponent> lazy6, f170 f170Var, s1v s1vVar, Lazy<it60> lazy7, ot60 ot60Var, st60 st60Var) {
        this.a = jt60Var;
        this.b = xhsVar;
        this.c = xj60Var;
        this.d = lswVar;
        this.e = vh8Var;
        this.f = uw60Var;
        this.g = qn60Var;
        this.h = pn60Var;
        this.i = cVar;
        this.j = atomicReference;
        this.k = ts60Var;
        this.l = lazy;
        this.m = lazy2;
        this.n = lazy3;
        this.o = lazy4;
        this.p = lazy5;
        this.q = lazy6;
        this.r = f170Var;
        this.s = s1vVar;
        this.t = lazy7;
        this.u = ot60Var;
        this.v = st60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz60)) {
            return false;
        }
        zz60 zz60Var = (zz60) obj;
        return epx.f(this.a, zz60Var.a) && epx.f(this.b, zz60Var.b) && epx.f(this.c, zz60Var.c) && epx.f(this.d, zz60Var.d) && epx.f(this.e, zz60Var.e) && epx.f(this.f, zz60Var.f) && epx.f(this.g, zz60Var.g) && epx.f(this.h, zz60Var.h) && epx.f(this.i, zz60Var.i) && epx.f(this.j, zz60Var.j) && epx.f(this.k, zz60Var.k) && epx.f(this.l, zz60Var.l) && epx.f(this.m, zz60Var.m) && epx.f(this.n, zz60Var.n) && epx.f(this.o, zz60Var.o) && epx.f(this.p, zz60Var.p) && epx.f(this.q, zz60Var.q) && epx.f(this.r, zz60Var.r) && epx.f(this.s, zz60Var.s) && epx.f(this.t, zz60Var.t) && epx.f(this.u, zz60Var.u) && epx.f(this.v, zz60Var.v);
    }

    public final int hashCode() {
        return this.v.hashCode() + ((this.u.hashCode() + g7r0.a(this.t, (this.s.hashCode() + ((this.r.hashCode() + g7r0.a(this.q, g7r0.a(this.p, g7r0.a(this.o, g7r0.a(this.n, g7r0.a(this.m, g7r0.a(this.l, (this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "NewsfeedStoreParams(freshNewsInteractor=" + this.a + ", freshNewsParams=" + this.b + ", freshTimerInteractor=" + this.c + ", inactiveTaskInteractor=" + this.d + ", inactiveTimeRepository=" + this.e + ", newsfeedScrollItemRepository=" + this.f + ", dataSet=" + this.g + ", itemsTransformer=" + this.h + ", util=" + this.i + ", lifecycleState=" + this.j + ", logger=" + this.k + ", yandexAdFeatureComponent=" + this.l + ", authBridgeComponentLazy=" + this.m + ", nativeAdPreloadDelegateLazy=" + this.n + ", newsfeedComponentLazy=" + this.o + ", bridgeComponentLazy=" + this.p + ", videoShareComponentLazy=" + this.q + ", techStatPlugin=" + this.r + ", displayItemsPositionSetter=" + this.s + ", eventsHandlerLazy=" + this.t + ", mappers=" + this.u + ", taskExecutorsDependencies=" + this.v + ')';
    }
}
