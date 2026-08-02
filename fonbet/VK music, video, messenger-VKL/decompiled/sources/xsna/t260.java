package xsna;

import com.vk.httpexecutor.api.NetworkClient;
import java.util.concurrent.Executor;
import xsna.wjy;

/* compiled from: NetworkConfig.kt */
/* loaded from: classes.dex */
public final class t260 {
    public final aky a;
    public final NetworkClient.a b;
    public final yx2 c;
    public final b260 d;
    public final w6l e;
    public final bae0 f;
    public final kse0 g;
    public final t7y0 h;
    public final tnk0 i;
    public final a460 j;
    public final boolean k;
    public final hiv l;
    public final sb8 m;
    public final v62 n;
    public final wjy.a.b o;
    public final wb3 p;
    public final boolean q;
    public final Executor r;
    public final boolean s;
    public final com.vk.toggle.data.b t;
    public final xb3 u;
    public final bpn0 v;
    public final q360 w;
    public final kek x;

    public t260(aky akyVar, NetworkClient.a aVar, yx2 yx2Var, b260 b260Var, w6l w6lVar, bae0 bae0Var, kse0 kse0Var, t7y0 t7y0Var, tnk0 tnk0Var, a460 a460Var, boolean z, hiv hivVar, sb8 sb8Var, v62 v62Var, wjy.a.b bVar, wb3 wb3Var, boolean z2, Executor executor, boolean z3, com.vk.toggle.data.b bVar2, xb3 xb3Var, bpn0 bpn0Var, q360 q360Var, kek kekVar) {
        this.a = akyVar;
        this.b = aVar;
        this.c = yx2Var;
        this.d = b260Var;
        this.e = w6lVar;
        this.f = bae0Var;
        this.g = kse0Var;
        this.h = t7y0Var;
        this.i = tnk0Var;
        this.j = a460Var;
        this.k = z;
        this.l = hivVar;
        this.m = sb8Var;
        this.n = v62Var;
        this.o = bVar;
        this.p = wb3Var;
        this.q = z2;
        this.r = executor;
        this.s = z3;
        this.t = bVar2;
        this.u = xb3Var;
        this.v = bpn0Var;
        this.w = q360Var;
        this.x = kekVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t260)) {
            return false;
        }
        t260 t260Var = (t260) obj;
        return this.a.equals(t260Var.a) && this.b.equals(t260Var.b) && epx.f(this.c, t260Var.c) && epx.f(this.d, t260Var.d) && this.e.equals(t260Var.e) && this.f.equals(t260Var.f) && this.g.equals(t260Var.g) && this.h.equals(t260Var.h) && this.i.equals(t260Var.i) && this.j.equals(t260Var.j) && this.k == t260Var.k && epx.f(this.l, t260Var.l) && this.m.equals(t260Var.m) && this.n.equals(t260Var.n) && this.o.equals(t260Var.o) && this.p.equals(t260Var.p) && this.q == t260Var.q && epx.f(this.r, t260Var.r) && this.s == t260Var.s && epx.f(this.t, t260Var.t) && this.u.equals(t260Var.u) && this.v.equals(t260Var.v) && this.w.equals(t260Var.w) && epx.f(this.x, t260Var.x);
    }

    public final int hashCode() {
        return this.x.hashCode() + ((this.w.hashCode() + tq.b(this.v, (this.u.hashCode() + ((this.t.hashCode() + qoy.b((this.r.hashCode() + qoy.b((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + qoy.b((this.j.hashCode() + qoy.b((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.i.a)) * 31, 31, this.k)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.q)) * 31, 31, this.s)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "NetworkConfig(quicConfig=" + this.a + ", networkClientConfig=" + this.b + ", apiConfig=" + this.c + ", netConfig=" + this.d + ", debugSettingsConfig=" + this.e + ", proxyConfig=" + this.f + ", quicEnabledConfig=" + this.g + ", zstdInitConfig=" + this.h + ", sseInitConfig=" + this.i + ", initializationConfig=" + this.j + ", isPinningEnabled=" + this.k + ", httpCacheConfig=" + this.l + ", telemetryPlayerInterceptor=" + this.m + ", priorityManagerQueueGetter=" + this.n + ", timedFallbackSetting=" + this.o + ", xConfdataOverrideInterceptor=" + this.p + ", networkCommon2=" + this.q + ", statExecutor=" + this.r + ", isTooManyRequestsInterceptorEnabled=" + this.s + ", rateLimiterConfig=" + this.t + ", useNewNetworkDetector=" + this.u + ", skipIgnoredRequests=" + this.v + ", clientAgentFactory=" + this.w + ", cronetExecutorConfig=" + this.x + ')';
    }
}
