package com.yandex.go.payments.cards.data;

import defpackage.ddf;
import defpackage.h3y;
import defpackage.sx90;
import defpackage.tt2;
import defpackage.tx90;
import defpackage.u691;
import defpackage.umx;
import defpackage.xf7;

/* loaded from: classes13.dex */
public final class g {
    public final xf7 a;
    public final umx b;
    public final tt2 c;
    public final h3y d;
    public final sx90 e;
    public final sx90 f;
    public final ddf g = new ddf(2);

    public g(xf7 xf7Var, umx umxVar, tt2 tt2Var, h3y h3yVar, sx90 sx90Var, sx90 sx90Var2) {
        this.a = xf7Var;
        this.b = umxVar;
        this.c = tt2Var;
        this.d = h3yVar;
        this.e = sx90Var;
        this.f = sx90Var2;
    }

    public final TrustApi a(tx90 tx90Var) {
        return (TrustApi) u691.e(tx90Var.a, (TrustApi) this.g.m(this.a, this.b, this.e.a(), TrustApi.class, new TrustApiFactory$getOrCreate$1(1, this, g.class, "configureRetrofit", "configureRetrofit(Lretrofit2/Retrofit$Builder;)Lretrofit2/Retrofit$Builder;", 0)), (TrustApi) this.g.m(this.a, this.b, this.f.a(), TrustApi.class, new TrustApiFactory$getOrCreate$1(1, this, g.class, "configureRetrofit", "configureRetrofit(Lretrofit2/Retrofit$Builder;)Lretrofit2/Retrofit$Builder;", 0)));
    }
}
