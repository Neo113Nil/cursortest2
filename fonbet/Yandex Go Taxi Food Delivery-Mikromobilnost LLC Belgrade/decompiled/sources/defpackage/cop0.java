package defpackage;

import android.content.Context;
import com.yandex.plus.core.config.Environment;
import java.util.Map;
import kotlin.a;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class cop0 {
    public final rkd0 A;
    public final am2 B;
    public final i3y C = a.a(new w3m(this, 4));
    public final i3y D = a.a(new w3m(this, 5));
    public final i3y E = a.a(new czo0(this));
    public final Context a;
    public final Environment b;
    public final String c;
    public final String d;
    public final n4u0 e;
    public final e1d0 f;
    public final b5d0 g;
    public final lb7 h;
    public final com.yandex.plus.metrica.api.a i;
    public final n4u0 j;
    public final p4z k;
    public final OkHttpClient.a l;
    public final qda0 m;
    public final Map n;
    public final vpu o;
    public final n4u0 p;
    public final p5z q;
    public final kqd0 r;
    public final nkd0 s;
    public final ow31 t;
    public final String u;
    public final String v;
    public final long w;
    public final long x;
    public final yci0 y;
    public final xyj z;

    public cop0(Context context, Environment environment, String str, String str2, n4u0 n4u0Var, e1d0 e1d0Var, b5d0 b5d0Var, lb7 lb7Var, com.yandex.plus.metrica.api.a aVar, n4u0 n4u0Var2, p4z p4zVar, OkHttpClient.a aVar2, qda0 qda0Var, Map map, vpu vpuVar, n4u0 n4u0Var3, p5z p5zVar, kqd0 kqd0Var, nkd0 nkd0Var, ow31 ow31Var, String str3, String str4, long j, long j2, yci0 yci0Var, xyj xyjVar, rkd0 rkd0Var, am2 am2Var) {
        this.a = context;
        this.b = environment;
        this.c = str;
        this.d = str2;
        this.e = n4u0Var;
        this.f = e1d0Var;
        this.g = b5d0Var;
        this.h = lb7Var;
        this.i = aVar;
        this.j = n4u0Var2;
        this.k = p4zVar;
        this.l = aVar2;
        this.m = qda0Var;
        this.n = map;
        this.o = vpuVar;
        this.p = n4u0Var3;
        this.q = p5zVar;
        this.r = kqd0Var;
        this.s = nkd0Var;
        this.t = ow31Var;
        this.u = str3;
        this.v = str4;
        this.w = j;
        this.x = j2;
        this.y = yci0Var;
        this.z = xyjVar;
        this.A = rkd0Var;
        this.B = am2Var;
    }

    public final bfd0 a() {
        return (bfd0) this.C.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cop0) {
            cop0 cop0Var = (cop0) obj;
            return this.a.equals(cop0Var.a) && this.b == cop0Var.b && jl40.l(this.c, cop0Var.c) && jl40.l(this.d, cop0Var.d) && jl40.l(this.e, cop0Var.e) && jl40.l(this.f, cop0Var.f) && jl40.l(this.g, cop0Var.g) && this.h == cop0Var.h && jl40.l(this.i, cop0Var.i) && jl40.l(this.j, cop0Var.j) && jl40.l(this.k, cop0Var.k) && jl40.l(this.l, cop0Var.l) && this.m == cop0Var.m && this.n.equals(cop0Var.n) && this.o.equals(cop0Var.o) && this.p.equals(cop0Var.p) && this.q.equals(cop0Var.q) && jl40.l(this.r, cop0Var.r) && jl40.l(this.s, cop0Var.s) && jl40.l(this.t, cop0Var.t) && this.u.equals(cop0Var.u) && this.v.equals(cop0Var.v) && e3n.d(this.w, cop0Var.w) && e3n.d(this.x, cop0Var.x) && this.y == cop0Var.y && jl40.l(this.z, cop0Var.z) && this.A == cop0Var.A && this.B == cop0Var.B;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + unr0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31)) * 31)) * 31)) * 961;
        n4u0 n4u0Var = this.j;
        int hashCode2 = (hashCode + (n4u0Var == null ? 0 : n4u0Var.hashCode())) * 31;
        p4z p4zVar = this.k;
        int hashCode3 = (hashCode2 + (p4zVar == null ? 0 : p4zVar.hashCode())) * 31;
        OkHttpClient.a aVar = this.l;
        int hashCode4 = (this.q.hashCode() + ((x4c.S.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + oyr.b(10000, (this.m.hashCode() + ((hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 961, 31)) * 31)) * 31)) * 31)) * 31;
        kqd0 kqd0Var = this.r;
        int b = unr0.b(unr0.b((this.t.hashCode() + ((this.s.hashCode() + ((ngd0.D.hashCode() + ((hashCode4 + (kqd0Var != null ? kqd0Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 29791, 31, this.u), 31, this.v);
        o430 o430Var = e3n.b;
        return this.B.hashCode() + ((this.A.hashCode() + ((this.z.hashCode() + ((this.y.hashCode() + qv10.c(qv10.c(b, 31, this.w), 31, this.x)) * 31)) * 29791)) * 31);
    }

    public final String toString() {
        return "SdkDependenciesModule(appContext=" + this.a + ", environment=" + this.b + ", serviceName=" + this.c + ", hostScheme=" + this.d + ", themeStateFlow=" + this.e + ", authAdapter=" + this.f + ", imageLoader=" + this.g + ", paySdkAdapterProvider=" + this.h + ", metricaProvider=" + this.i + ", source=null, geoLocationStateFlow=" + this.j + ", localSettingCallback=" + this.k + ", okHttpClientBuilder=" + this.l + ", prepareApolloClient=" + this.m + ", analyticsParams=" + this.n + ", maxLogCapacity=10000, weblinksProvider=" + this.o + ", offlineModeStateFlow=" + this.p + ", stylesProvider=" + x4c.S + ", localeProvider=" + this.q + ", treasuryAdapter=" + this.r + ", detectGPPermissionMode=" + ngd0.D + ", sdkFlags=" + this.s + ", viewVisibilityAnimator=" + this.t + ", overriddenTestIds=null, overriddenFlags=null, packageName=" + this.u + ", versionName=" + this.v + ", updateSdkConfigPeriod=" + ((Object) e3n.p(this.w)) + ", updateExperimentsPeriod=" + ((Object) e3n.p(this.x)) + ", timeSource=" + this.y + ", dispatchersProvider=" + this.z + ", testableBreakpoint=null, resourcesProvider=null, logger=" + this.A + ", plusAcqAdapterProvider=" + this.B + ')';
    }
}
