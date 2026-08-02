package defpackage;

import android.content.Context;
import com.yandex.plus.core.config.Environment;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.domain.auth.impl.a;

/* loaded from: classes2.dex */
public final class m0p {
    public final v7d0 A;
    public final add0 B;
    public final yci0 C;
    public final String a;
    public final String b;
    public final String c;
    public final Context d;
    public final PlusSdkBrandType e;
    public final Environment f;
    public final a g;
    public final gbd0 h;
    public final p5z i;
    public final lzs j;
    public final x75 k;
    public final mdd0 l;
    public final ped0 m;
    public final com.yandex.plus.experiments.impl.providers.a n;
    public final tnd0 o;
    public final tyq0 p;
    public final xyj q;
    public final b5d0 r;
    public final yo40 s;
    public final com.yandex.plus.pay.ui.core.internal.common.a t;
    public final kaa0 u;
    public final hzk v;
    public final ht11 w;
    public final com.yandex.plus.core.benchmark.a x;
    public final eu90 y;
    public final fu90 z;

    public m0p(String str, String str2, String str3, Context context, PlusSdkBrandType plusSdkBrandType, Environment environment, a aVar, gbd0 gbd0Var, p5z p5zVar, lzs lzsVar, x75 x75Var, mdd0 mdd0Var, ped0 ped0Var, com.yandex.plus.experiments.impl.providers.a aVar2, tnd0 tnd0Var, tyq0 tyq0Var, xyj xyjVar, b5d0 b5d0Var, yo40 yo40Var, com.yandex.plus.pay.ui.core.internal.common.a aVar3, kaa0 kaa0Var, hzk hzkVar, ht11 ht11Var, com.yandex.plus.core.benchmark.a aVar4, eu90 eu90Var, fu90 fu90Var, v7d0 v7d0Var, add0 add0Var, yci0 yci0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = context;
        this.e = plusSdkBrandType;
        this.f = environment;
        this.g = aVar;
        this.h = gbd0Var;
        this.i = p5zVar;
        this.j = lzsVar;
        this.k = x75Var;
        this.l = mdd0Var;
        this.m = ped0Var;
        this.n = aVar2;
        this.o = tnd0Var;
        this.p = tyq0Var;
        this.q = xyjVar;
        this.r = b5d0Var;
        this.s = yo40Var;
        this.t = aVar3;
        this.u = kaa0Var;
        this.v = hzkVar;
        this.w = ht11Var;
        this.x = aVar4;
        this.y = eu90Var;
        this.z = fu90Var;
        this.A = v7d0Var;
        this.B = add0Var;
        this.C = yci0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m0p) {
            m0p m0pVar = (m0p) obj;
            return jl40.l(this.a, m0pVar.a) && this.b.equals(m0pVar.b) && this.c.equals(m0pVar.c) && jl40.l(this.d, m0pVar.d) && this.e == m0pVar.e && this.f == m0pVar.f && this.g == m0pVar.g && jl40.l(this.h, m0pVar.h) && jl40.l(this.i, m0pVar.i) && this.j == m0pVar.j && jl40.l(this.k, m0pVar.k) && jl40.l(this.l, m0pVar.l) && jl40.l(this.m, m0pVar.m) && jl40.l(this.n, m0pVar.n) && this.o == m0pVar.o && jl40.l(this.p, m0pVar.p) && jl40.l(this.q, m0pVar.q) && jl40.l(this.r, m0pVar.r) && this.s == m0pVar.s && jl40.l(this.t, m0pVar.t) && jl40.l(this.u, m0pVar.u) && this.v.equals(m0pVar.v) && jl40.l(this.w, m0pVar.w) && this.x.equals(m0pVar.x) && jl40.l(this.y, m0pVar.y) && jl40.l(this.z, m0pVar.z) && jl40.l(this.A, m0pVar.A) && this.B.equals(m0pVar.B) && this.C == m0pVar.C;
        }
        return false;
    }

    public final int hashCode() {
        return this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + ((this.z.hashCode() + ((this.y.hashCode() + ((this.x.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31) + 1986582806) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ExternalModule(serviceName=" + this.a + ", clientAppPackage=" + this.b + ", clientAppVersion=" + this.c + ", sdkVersion=110.0.2, context=" + this.d + ", brandType=" + this.e + ", environment=" + this.f + ", authSession=" + this.g + ", designSystem=" + this.h + ", localeProvider=" + this.i + ", locationProvider=" + this.j + ", metricaIdsProvider=" + this.k + ", logger=" + this.l + ", reporter=" + this.m + ", experimentsRepository=" + this.n + ", featureFlags=" + this.o + ", sessionControllerProvider=" + this.p + ", dispatchersProvider=" + this.q + ", imageLoader=" + this.r + ", stringsProvider=" + this.s + ", userStateProvider=" + this.t + ", paymentMethodsFacade=" + this.u + ", urlLauncher=" + this.v + ", sslErrorResolverFactory=" + this.w + ", benchmarker=" + this.x + ", evgenAnalytics=" + this.y + ", evgenDiagnostic=" + this.z + ", plusPay=" + this.A + ", plusPayInternal=" + this.B + ", contentScaleFactorProvider=" + this.C + ')';
    }
}
