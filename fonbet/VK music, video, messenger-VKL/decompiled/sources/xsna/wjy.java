package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vk.api.sdk.utils.clientagent.model.ClientAgentKey;
import com.vk.api.sdk.utils.clientagent.model.Net;
import com.vk.knet.core.http.metric.HttpMetrics;
import com.vk.knet.cornet.CronetHttpLogger$DebugType;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.jvm.internal.FunctionReferenceImpl;
import okhttp3.o;
import xsna.b0g;
import xsna.by70;
import xsna.dky;
import xsna.elc;
import xsna.jjy;
import xsna.ujv;
import xsna.wjy;

/* compiled from: KnetExecutorProvider.kt */
/* loaded from: classes.dex */
public final class wjy {
    public static final wjy a = new wjy();
    public static jjy b;

    @SuppressLint({"StaticFieldLeak"})
    public static a c;
    public static uek d;

    /* compiled from: KnetExecutorProvider.kt */
    public static final class a {
        public final b A;
        public final boolean B;
        public final Executor C;
        public final xb3 D;
        public final bpn0 E;
        public final bpn0 F;
        public final bpn0 G;
        public final long H;
        public final long I;
        public final Context a;
        public final boolean b;
        public final C3937a c;
        public final File d;
        public final File e;
        public final String f;
        public final q360 g;
        public final dky.a h;
        public final jb3 i;
        public final bky j;
        public final boolean k;
        public final ExecutorService l;
        public final fky m;
        public final wrk0 n;
        public final ikv o;
        public final aky p;
        public final dky.b q;
        public final c r;
        public final m7y0 s;
        public final boolean t;
        public final int u;
        public final Set<String> v;
        public final Set<String> w;
        public final izs<String, s3q0> x;
        public final ejv y;
        public final v62 z;

        /* compiled from: KnetExecutorProvider.kt */
        /* renamed from: xsna.wjy$a$a, reason: collision with other inner class name */
        public static final class C3937a {
            public final zkv a;
            public final gzs<Integer> b;

            public C3937a(gzs gzsVar, zkv zkvVar) {
                this.a = zkvVar;
                this.b = gzsVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3937a)) {
                    return false;
                }
                C3937a c3937a = (C3937a) obj;
                return this.a.equals(c3937a.a) && epx.f(this.b, c3937a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DebugSettings(fakeNetworkConditions=");
                sb.append(this.a);
                sb.append(", sleepTimeout=");
                return uf3.d(sb, this.b, ')');
            }
        }

        /* compiled from: KnetExecutorProvider.kt */
        public static final class b {
            public final s65 a;
            public final c24 b;
            public final l67 c;

            public b(s65 s65Var, c24 c24Var, l67 l67Var) {
                this.a = s65Var;
                this.b = c24Var;
                this.c = l67Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "TimedFallbackSetting(isEnabled=" + this.a + ", exceptionsCount=" + this.b + ", timeWindowMs=" + this.c + ')';
            }
        }

        /* compiled from: KnetExecutorProvider.kt */
        public static final class c {
            public final long a;
            public final long b;
            public final long c;

            public c(long j, long j2, long j3) {
                this.a = j;
                this.b = j2;
                this.c = j3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c;
            }

            public final int hashCode() {
                return Long.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Timeout(connectionMs=");
                sb.append(this.a);
                sb.append(", readMs=");
                sb.append(this.b);
                sb.append(", writeMs=");
                return vu5.a(')', this.c, sb);
            }
        }

        public a() {
            throw null;
        }

        public a(Context context, boolean z, C3937a c3937a, File file, File file2, String str, q360 q360Var, dky.a aVar, jb3 jb3Var, bky bkyVar, boolean z2, ExecutorService executorService, fky fkyVar, wrk0 wrk0Var, ikv ikvVar, aky akyVar, dky.b bVar, c cVar, m7y0 m7y0Var, boolean z3, int i, Set set, Set set2, izs izsVar, ejv ejvVar, v62 v62Var, b bVar2, boolean z4, Executor executor, xb3 xb3Var, bpn0 bpn0Var, bpn0 bpn0Var2, long j, long j2) {
            bpn0 bpn0Var3 = new bpn0(new c24(0));
            this.a = context;
            this.b = z;
            this.c = c3937a;
            this.d = file;
            this.e = file2;
            this.f = str;
            this.g = q360Var;
            this.h = aVar;
            this.i = jb3Var;
            this.j = bkyVar;
            this.k = z2;
            this.l = executorService;
            this.m = fkyVar;
            this.n = wrk0Var;
            this.o = ikvVar;
            this.p = akyVar;
            this.q = bVar;
            this.r = cVar;
            this.s = m7y0Var;
            this.t = z3;
            this.u = i;
            this.v = set;
            this.w = set2;
            this.x = izsVar;
            this.y = ejvVar;
            this.z = v62Var;
            this.A = bVar2;
            this.B = z4;
            this.C = executor;
            this.D = xb3Var;
            this.E = bpn0Var;
            this.F = bpn0Var2;
            this.G = bpn0Var3;
            this.H = j;
            this.I = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && this.k == aVar.k && epx.f(this.l, aVar.l) && epx.f(this.m, aVar.m) && epx.f(this.n, aVar.n) && epx.f(this.o, aVar.o) && epx.f(this.p, aVar.p) && epx.f(this.q, aVar.q) && epx.f(this.r, aVar.r) && epx.f(this.s, aVar.s) && this.t == aVar.t && this.u == aVar.u && epx.f(this.v, aVar.v) && epx.f(this.w, aVar.w) && epx.f(this.x, aVar.x) && epx.f(this.y, aVar.y) && epx.f(this.z, aVar.z) && epx.f(this.A, aVar.A) && this.B == aVar.B && epx.f(this.C, aVar.C) && epx.f(this.D, aVar.D) && epx.f(this.E, aVar.E) && epx.f(this.F, aVar.F) && epx.f(this.G, aVar.G) && this.H == aVar.H && this.I == aVar.I;
        }

        public final int hashCode() {
            int a = urd0.a((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31, 31, this.f);
            q360 q360Var = this.g;
            int hashCode = (this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + qoy.b((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((a + (q360Var == null ? 0 : q360Var.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.k)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            m7y0 m7y0Var = this.s;
            int hashCode2 = (this.y.hashCode() + dq.c(fw3.b(fw3.b(shy.a(this.u, qoy.b((hashCode + (m7y0Var == null ? 0 : m7y0Var.hashCode())) * 31, 31, this.t), 31), 31, this.v), 31, this.w), 31, this.x)) * 961;
            v62 v62Var = this.z;
            int hashCode3 = (hashCode2 + (v62Var == null ? 0 : v62Var.hashCode())) * 31;
            b bVar = this.A;
            return Long.hashCode(this.I) + bh10.a(tq.b(this.G, tq.b(this.F, tq.b(this.E, (this.D.hashCode() + ((this.C.hashCode() + qoy.b((hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31, 31, this.B)) * 31)) * 31, 31), 31), 31), 31, this.H);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Config(context=");
            sb.append(this.a);
            sb.append(", isDebug=");
            sb.append(this.b);
            sb.append(", debugSettings=");
            sb.append(this.c);
            sb.append(", internalStoragePath=");
            sb.append(this.d);
            sb.append(", netlogStoragePath=");
            sb.append(this.e);
            sb.append(", userAgent=");
            sb.append(this.f);
            sb.append(", clientAgentFactory=");
            sb.append(this.g);
            sb.append(", executorTypeProvider=");
            sb.append(this.h);
            sb.append(", logDetailedProvider=");
            sb.append(this.i);
            sb.append(", logFilterCredentialsProvider=");
            sb.append(this.j);
            sb.append(", enableSocketChannels=");
            sb.append(this.k);
            sb.append(", executorService=");
            sb.append(this.l);
            sb.append(", logger=");
            sb.append(this.m);
            sb.append(", metricsListener=");
            sb.append(this.n);
            sb.append(", hostMapper=");
            sb.append(this.o);
            sb.append(", httpExecutorConfig=");
            sb.append(this.p);
            sb.append(", prefixer=");
            sb.append(this.q);
            sb.append(", timeout=");
            sb.append(this.r);
            sb.append(", zstdContext=");
            sb.append(this.s);
            sb.append(", msgpackEnabled=");
            sb.append(this.t);
            sb.append(", maxLogLine=");
            sb.append(this.u);
            sb.append(", xownerAllowedMethods=");
            sb.append(this.v);
            sb.append(", xownerDisabledMethods=");
            sb.append(this.w);
            sb.append(", xownerStatsDelegate=");
            sb.append(this.x);
            sb.append(", xScreenProvider=");
            sb.append(this.y);
            sb.append(", requestLifecycleListener=null, priorityManagerQueueGetter=");
            sb.append(this.z);
            sb.append(", timedFallbackSetting=");
            sb.append(this.A);
            sb.append(", networkCommon2=");
            sb.append(this.B);
            sb.append(", statExecutor=");
            sb.append(this.C);
            sb.append(", useNewNetworkDetector=");
            sb.append(this.D);
            sb.append(", isOtelTracingEnabled=");
            sb.append(this.E);
            sb.append(", skipIgnoredRequests=");
            sb.append(this.F);
            sb.append(", disableCronetOnFallback=");
            sb.append(this.G);
            sb.append(", executorRecyclerAliveTimeMs=");
            sb.append(this.H);
            sb.append(", executorAliveTimeMs=");
            return vu5.a(')', this.I, sb);
        }
    }

    /* compiled from: KnetExecutorProvider.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<Long> {
        @Override // xsna.gzs
        public final Long invoke() {
            wjy wjyVar = (wjy) this.receiver;
            wjy wjyVar2 = wjy.a;
            wjyVar.getClass();
            return Long.valueOf(TimeUnit.HOURS.toMillis(1L) + System.currentTimeMillis());
        }
    }

    /* compiled from: KnetExecutorProvider.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    /* compiled from: KnetExecutorProvider.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    /* compiled from: KnetExecutorProvider.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public static uek b() {
        uek uekVar = d;
        if (uekVar != null) {
            return uekVar;
        }
        throw new IllegalStateException("#init() not called!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [xsna.yx70] */
    public final jjy a(final a aVar) {
        final qjq qjqVar;
        egq0 egq0Var;
        Lazy lazy;
        wdp0 wdp0Var = ((Boolean) aVar.E.getValue()).booleanValue() ? (wdp0) gav0.c.getValue() : null;
        final wdp0 wdp0Var2 = ((Boolean) aVar.E.getValue()).booleanValue() ? (wdp0) gav0.e.getValue() : null;
        wdp0 wdp0Var3 = ((Boolean) aVar.E.getValue()).booleanValue() ? (wdp0) gav0.d.getValue() : null;
        boolean z = aVar.b;
        if (z) {
            a.C3937a c3937a = aVar.c;
            qjqVar = new qjq(c3937a.b, c3937a.a);
        } else {
            qjqVar = null;
        }
        final vsj vsjVar = new vsj(z);
        final egq0 egq0Var2 = new egq0(aVar.f);
        ojy ojyVar = new ojy(aVar);
        final d200 d200Var = new d200(new hky(), aVar.q, new la4(aVar, 4), new pjy(), new y35(ojyVar, 1), new qjy(), new rjy(aVar, ojyVar));
        final hn30 hn30Var = new hn30();
        final m7y0 m7y0Var = aVar.s;
        final asu asuVar = new asu();
        final a4y0 a4y0Var = new a4y0(aVar.v, aVar.w, aVar.x);
        Context context = aVar.a;
        izs izsVar = new izs() { // from class: xsna.ljy
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                by70.a aVar2 = (by70.a) obj;
                wdp0 wdp0Var4 = wdp0Var2;
                wjy.a aVar3 = aVar;
                aVar2.a = (o.a) new ma3(1, wdp0Var4, aVar3).invoke(aVar2.a);
                qjq qjqVar2 = qjq.this;
                if (qjqVar2 != null) {
                    aVar2.a(qjqVar2);
                }
                aVar2.a(vsjVar);
                aVar2.a(egq0Var2);
                q360 q360Var = aVar3.g;
                if (q360Var != null) {
                    elc.a a2 = q360Var.a();
                    a2.a.put(ClientAgentKey.NET, Net.OKHTTP);
                    aVar2.a(new flc((String) a2.a((String) com.vk.core.apps.a.q.getValue()).a.getValue()));
                }
                aVar2.a(d200Var);
                if (aVar3.t) {
                    aVar2.a(hn30Var);
                }
                m7y0 m7y0Var2 = m7y0Var;
                if (m7y0Var2 != null) {
                    aVar2.a(new i7y0(m7y0Var2));
                    aVar2.a(new l7y0(m7y0Var2));
                }
                aVar2.a(asuVar);
                if (aVar3.b) {
                    aVar2.a(a4y0Var);
                }
                aVar2.b.add(aVar3.n);
                if (aVar3.B) {
                    aVar2.d = true;
                    aVar2.e = aVar3.C;
                }
                if (wdp0Var4 != null) {
                    qz80.b(aVar2, wdp0Var4);
                }
                return s3q0.a;
            }
        };
        wdp0 wdp0Var4 = wdp0Var2;
        final by70.a aVar2 = new by70.a();
        izsVar.invoke(aVar2);
        ArrayList arrayList = new ArrayList();
        ujv ujvVar = new ujv(new k46());
        zx70 zx70Var = aVar2.b.isEmpty() ? null : new wjv() { // from class: xsna.zx70
            @Override // xsna.wjv
            public final void a(HttpMetrics httpMetrics, ckv ckvVar, pkv pkvVar) {
                Iterator it = by70.a.this.b.iterator();
                while (it.hasNext()) {
                    ((wjv) it.next()).a(httpMetrics, ckvVar, pkvVar);
                }
            }
        };
        if (aVar2.d) {
            zx70Var = 0;
        }
        qjq qjqVar2 = qjqVar;
        ey70 ey70Var = new ey70(Collections.singletonList(new ay70(new wjv() { // from class: xsna.yx70
            @Override // xsna.wjv
            public final void a(HttpMetrics httpMetrics, ckv ckvVar, pkv pkvVar) {
                Iterator it = by70.a.this.b.iterator();
                while (it.hasNext()) {
                    ((wjv) it.next()).a(httpMetrics, ckvVar, pkvVar);
                }
            }
        }, aVar2)));
        o.a aVar3 = aVar2.a;
        if (zx70Var != 0) {
            ujv.a aVar4 = ujvVar.a;
            byte[] bArr = x2r0.a;
            egq0Var = egq0Var2;
            arrayList.add(new n2r0(aVar4));
        } else {
            egq0Var = egq0Var2;
        }
        if (aVar2.d) {
            arrayList.add(ey70Var);
        }
        aVar3.e = new ey70(arrayList);
        kjy by70Var = new by70(j5g.v0(new cy70(new okhttp3.o(aVar3), ujvVar, zx70Var), aVar2.c));
        fky fkyVar = aVar.m;
        CronetHttpLogger$DebugType.Companion.getClass();
        lazy = CronetHttpLogger$DebugType.ALL$delegate;
        vek.a = new qek(fkyVar, (Set) lazy.getValue());
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        t6j t6jVar = new t6j(new c(1, bVar, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0));
        a.b bVar2 = aVar.A;
        int i = 9;
        kjv kjvVar = new kjv(t6jVar, new qek(new e(1, bVar, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), new sw1(i)), new qkv(bVar2 != null ? bVar2.a : new sw1(i), bVar2 != null ? bVar2.b : new hu2(5), bVar2 != null ? bVar2.c : new s63(6), new d(1, bVar, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0)));
        final ujy ujyVar = new ujy(wdp0Var3, aVar);
        final vjy vjyVar = new vjy(context, qjqVar2, vsjVar, egq0Var, aVar, d200Var, hn30Var, m7y0Var, asuVar, wdp0Var3);
        bpn0 bpn0Var = new bpn0(new gb3(aVar, 6));
        fky fkyVar2 = new fky(false);
        if (wdp0Var4 != null) {
            by70Var = crx0.G(by70Var, wdp0Var4);
        }
        kjy kjyVar = by70Var;
        ikv ikvVar = aVar.o;
        b bVar3 = new b(0, this, wjy.class, "fallbackHostTime", "fallbackHostTime()J", 0);
        v62 v62Var = aVar.z;
        lti ltiVar = new lti(fkyVar2, kjyVar, bpn0Var, kjvVar, ikvVar, bVar3, new g3o(aVar, 3), new uia(aVar, 2), new qy8(aVar, 7), v62Var != null ? (zbd0) v62Var.invoke() : null, wdp0Var);
        b0g b0gVar = b0g.a;
        b0g.a(new b0g.a() { // from class: xsna.tjy
            @Override // xsna.b0g.a
            public final void a() {
                asu0.a.getClass();
                ExecutorService n = asu0.n();
                final ujy ujyVar2 = ujy.this;
                final vjy vjyVar2 = vjyVar;
                n.execute(new Runnable() { // from class: xsna.mjy
                    @Override // java.lang.Runnable
                    public final void run() {
                        ujy.this.invoke(vjyVar2.invoke());
                    }
                });
            }
        });
        ArrayList arrayList2 = new ArrayList();
        if (aVar.b) {
            q5m.a().getClass();
        }
        return new jjy(ltiVar, rt8.c, j5g.v0(new jjy.b(ltiVar), arrayList2));
    }
}
