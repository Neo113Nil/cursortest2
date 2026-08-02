package defpackage;

import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class msu implements xf7 {
    public final OkHttpClient a;
    public final t6f0 b;

    public msu(OkHttpClient okHttpClient, t6f0 t6f0Var) {
        this.a = okHttpClient;
        this.b = t6f0Var;
    }

    @Override // defpackage.xf7
    public final yf7 newCall(d5j0 d5j0Var) {
        String host = ((uh21) this.b.b).getUrl().getHost();
        if (host == null) {
            host = "";
        }
        kwu kwuVar = d5j0Var.a;
        if (!jl40.l(kwuVar.d, host)) {
            jwu g = kwuVar.g();
            g.h(host);
            kwu e = g.e();
            t4j0 b = d5j0Var.b();
            b.a = e;
            d5j0Var = new d5j0(b);
        }
        return this.a.newCall(d5j0Var);
    }
}
