package defpackage;

import android.content.Context;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.domain.auth.impl.a;

/* loaded from: classes8.dex */
public final class bdd0 {
    public final sls A;
    public final sls B;
    public final ocd0 C;
    public final tls D;
    public final ffd0 E;
    public final ffd0 F;
    public final ffd0 G;
    public final sls H;
    public final sls I;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final PlusSdkBrandType e;
    public final String f;
    public final String g;
    public final Long h;
    public final Context i;
    public final p5z j;
    public final a k;
    public final lzs l;
    public final e5o m;
    public final xyj n;
    public final com.yandex.plus.metrica.api.a o;
    public final x75 p;
    public final hl21 q;
    public final tyq0 r;
    public final asd s;
    public final ku2 t;
    public final sls u;
    public final com.yandex.plus.core.benchmark.a v;
    public final sls w;
    public final mdd0 x;
    public final ped0 y;
    public final sls z;

    public bdd0(String str, String str2, String str3, String str4, PlusSdkBrandType plusSdkBrandType, String str5, String str6, Long l, Context context, p5z p5zVar, a aVar, lzs lzsVar, e5o e5oVar, xyj xyjVar, com.yandex.plus.metrica.api.a aVar2, x75 x75Var, hl21 hl21Var, tyq0 tyq0Var, asd asdVar, ku2 ku2Var, sls slsVar, com.yandex.plus.core.benchmark.a aVar3, sls slsVar2, mdd0 mdd0Var, ped0 ped0Var, sls slsVar3, sls slsVar4, sls slsVar5, ocd0 ocd0Var, tls tlsVar, ffd0 ffd0Var, ffd0 ffd0Var2, ffd0 ffd0Var3, sls slsVar6, sls slsVar7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = plusSdkBrandType;
        this.f = str5;
        this.g = str6;
        this.h = l;
        this.i = context;
        this.j = p5zVar;
        this.k = aVar;
        this.l = lzsVar;
        this.m = e5oVar;
        this.n = xyjVar;
        this.o = aVar2;
        this.p = x75Var;
        this.q = hl21Var;
        this.r = tyq0Var;
        this.s = asdVar;
        this.t = ku2Var;
        this.u = slsVar;
        this.v = aVar3;
        this.w = slsVar2;
        this.x = mdd0Var;
        this.y = ped0Var;
        this.z = slsVar3;
        this.A = slsVar4;
        this.B = slsVar5;
        this.C = ocd0Var;
        this.D = tlsVar;
        this.E = ffd0Var;
        this.F = ffd0Var2;
        this.G = ffd0Var3;
        this.H = slsVar6;
        this.I = slsVar7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bdd0) {
            bdd0 bdd0Var = (bdd0) obj;
            if (jl40.l(this.a, bdd0Var.a) && jl40.l(this.b, bdd0Var.b) && jl40.l(this.c, bdd0Var.c) && jl40.l(this.d, bdd0Var.d) && this.e == bdd0Var.e && this.f.equals(bdd0Var.f) && this.g.equals(bdd0Var.g) && jl40.l(this.h, bdd0Var.h) && jl40.l(this.i, bdd0Var.i) && jl40.l(this.j, bdd0Var.j) && this.k == bdd0Var.k && this.l == bdd0Var.l && this.m.equals(bdd0Var.m) && jl40.l(this.n, bdd0Var.n) && jl40.l(this.o, bdd0Var.o) && jl40.l(this.p, bdd0Var.p) && jl40.l(this.q, bdd0Var.q) && jl40.l(this.r, bdd0Var.r) && this.s == bdd0Var.s && this.t == bdd0Var.t && this.u.equals(bdd0Var.u) && this.v.equals(bdd0Var.v) && this.w.equals(bdd0Var.w) && jl40.l(this.x, bdd0Var.x) && jl40.l(this.y, bdd0Var.y) && this.z.equals(bdd0Var.z) && this.A.equals(bdd0Var.A) && this.B.equals(bdd0Var.B) && jl40.l(this.C, bdd0Var.C) && this.D == bdd0Var.D && this.E == bdd0Var.E && this.F == bdd0Var.F && this.G == bdd0Var.G && this.H.equals(bdd0Var.H) && this.I.equals(bdd0Var.I)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) - 1355077428) * 31;
        String str = this.b;
        int b = unr0.b(unr0.b((this.e.hashCode() + unr0.b(unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 29791, this.d)) * 31, 31, this.f), 31, this.g);
        Long l = this.h;
        return this.I.hashCode() + nnm.a((hashCode() + ((hashCode() + ((hashCode() + ly3.a((this.C.hashCode() + nnm.a(nnm.a(nnm.a((this.y.hashCode() + ((this.x.hashCode() + nnm.a((this.v.hashCode() + nnm.a((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((((b + (l != null ? l.hashCode() : 0)) * 31) + 1986582806) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.u)) * 31, 31, this.w)) * 31)) * 31, 31, this.z), 31, this.A), 31, this.B)) * 31, 31, this.D)) * 31)) * 31)) * 31, 31, this.H);
    }

    public final String toString() {
        return "PlusPayInternalDependenciesImpl(serviceName=" + this.a + ", subServiceName=PlusPaySDK, serviceChannel=" + this.b + ", clientSource=" + this.c + ", clientSubSource=" + this.d + ", clid=null, appDistribution=null, brandType=" + this.e + ", packageName=" + this.f + ", appVersionName=" + this.g + ", appVersionCode=" + this.h + ", sdkVersion=110.0.2, testIdsOverride=null, context=" + this.i + ", localeProvider=" + this.j + ", globalAuthSession=" + this.k + ", geoLocationProvider=" + this.l + ", environmentProvider=" + this.m + ", dispatchersProvider=" + this.n + ", metricaProvider=" + this.o + ", metricaIdsProvider=" + this.p + ", metricaUserConsumerProvider=" + this.q + ", metricaSessionControllerProvider=" + this.r + ", metricaReporterProviders=" + this.s + ", isMetricaLogsEnabled=" + this.t + ", isBenchmarksNeeded=" + this.u + ", benchmarker=" + this.v + ", getOkHttpClient=" + this.w + ", logger=" + this.x + ", reporter=" + this.y + ", getExperimentsRepository=" + this.z + ", getDwhAnalyticsReporter=" + this.A + ", getOriginProvider=" + this.B + ", inAppPaymentFacade=" + this.C + ", getGooglePlayBillingConfig=" + this.D + ", getAnalyticsGlobalParams=" + this.E + ", getOffersAnalyticsGlobalParams=" + this.F + ", getOffersAnalyticsPlatformParams=" + this.G + ", getResetCacheInteractor=" + this.H + ", getBduiGatewayHostProvider=" + this.I + ')';
    }
}
