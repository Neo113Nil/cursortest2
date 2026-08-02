package defpackage;

import android.content.Context;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class hh51 {
    public final Context a;
    public final di51 b;
    public final w4o c;
    public final sls d;
    public final sls e;
    public final tls f;
    public final tls g;
    public final n4u0 h;
    public final gh51 i;
    public final n4u0 j;
    public final sls k;
    public final tls l;
    public final tls m;

    public hh51(Context context, di51 di51Var, w4o w4oVar, sls slsVar, sls slsVar2, tls tlsVar, ump0 ump0Var, n4u0 n4u0Var, ump0 ump0Var2, int i) {
        tlsVar = (i & 64) != 0 ? null : tlsVar;
        tls u431Var = (i & 128) != 0 ? new u431(24) : ump0Var;
        gh51 gh51Var = new gh51();
        r0 c = bvf0.c(Boolean.TRUE);
        z151 z151Var = new z151(6);
        u431 u431Var2 = new u431(25);
        tls quVar = (i & 8192) != 0 ? new qu(17) : ump0Var2;
        this.a = context;
        this.b = di51Var;
        this.c = w4oVar;
        this.d = slsVar;
        this.e = slsVar2;
        this.f = tlsVar;
        this.g = u431Var;
        this.h = n4u0Var;
        this.i = gh51Var;
        this.j = c;
        this.k = z151Var;
        this.l = u431Var2;
        this.m = quVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh51)) {
            return false;
        }
        hh51 hh51Var = (hh51) obj;
        return jl40.l(this.a, hh51Var.a) && jl40.l(this.b, hh51Var.b) && jl40.l(this.c, hh51Var.c) && jl40.l(this.d, hh51Var.d) && jl40.l(this.e, hh51Var.e) && jl40.l(this.f, hh51Var.f) && jl40.l(this.g, hh51Var.g) && jl40.l(this.h, hh51Var.h) && jl40.l(this.i, hh51Var.i) && jl40.l(this.j, hh51Var.j) && jl40.l(this.k, hh51Var.k) && jl40.l(this.l, hh51Var.l) && jl40.l(this.m, hh51Var.m);
    }

    public final int hashCode() {
        int a = nnm.a(nnm.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 961, this.e);
        tls tlsVar = this.f;
        return this.m.hashCode() + ly3.a(nnm.a((this.j.hashCode() + ((hashCode() + ((this.h.hashCode() + ly3.a((a + (tlsVar == null ? 0 : tlsVar.hashCode())) * 31, 31, this.g)) * 31)) * 31)) * 31, 31, this.k), 31, this.l);
    }

    public final String toString() {
        return "YBSdkInitDependencies(context=" + this.a + ", tokenLoader=" + this.b + ", environment=" + this.c + ", acceptLanguageProvider=" + this.d + ", userAgentProvider=" + this.e + ", countryCodeProvider=null, pushTokenProvider=" + this.f + ", wrapDeeplink=" + this.g + ", ybSdkTheme=" + this.h + ", debugMessagesHandler=" + this.i + ", pushAllowedFlow=" + this.j + ", webViewFactoryProvider=" + this.k + ", paymentSdkWebViewFactoryProvider=" + this.l + ", hostDeeplinkResolver=" + this.m + Extension.C_BRAKE;
    }
}
