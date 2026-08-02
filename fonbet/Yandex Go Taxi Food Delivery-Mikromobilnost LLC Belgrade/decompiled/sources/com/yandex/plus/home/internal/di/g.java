package com.yandex.plus.home.internal.di;

import android.net.Uri;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import defpackage.a4u;
import defpackage.bgc;
import defpackage.cop0;
import defpackage.evu0;
import defpackage.h6d0;
import defpackage.i3y;
import defpackage.ic50;
import defpackage.ioc;
import defpackage.ir50;
import defpackage.jr50;
import defpackage.lgx;
import defpackage.q5z;
import defpackage.q8z0;
import defpackage.qo2;
import defpackage.s0k0;
import defpackage.s59;
import defpackage.skd0;
import defpackage.sls;
import defpackage.tne;
import defpackage.uc;
import defpackage.vpu;
import defpackage.x75;
import defpackage.yk;
import java.util.ArrayList;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class g {
    public final cop0 a;
    public final b b;
    public final com.yandex.plus.domain.auth.impl.a c;
    public final x75 d;
    public final i3y e;
    public final i3y k;
    public final i3y m;
    public final i3y n;
    public final i3y f = kotlin.a.a(new ir50(this, 9));
    public final i3y g = kotlin.a.a(new ir50(this, 10));
    public final i3y h = kotlin.a.a(new ir50(this, 11));
    public final i3y i = kotlin.a.a(new ic50(12));
    public final i3y j = kotlin.a.a(new ic50(13));
    public final i3y l = kotlin.a.a(new ir50(this, 2));
    public final i3y o = kotlin.a.a(new ir50(this, 6));
    public final i3y p = kotlin.a.a(new ic50(11));
    public final i3y q = kotlin.a.a(new ir50(this, 7));
    public final i3y r = kotlin.a.a(new ir50(this, 8));

    public g(cop0 cop0Var, b bVar, com.yandex.plus.domain.auth.impl.a aVar, x75 x75Var) {
        this.a = cop0Var;
        this.b = bVar;
        this.c = aVar;
        this.d = x75Var;
        final int i = 0;
        this.e = kotlin.a.a(new ir50(this, i));
        final int i2 = 1;
        this.k = kotlin.a.a(new ir50(this, i2));
        this.m = kotlin.a.a(new sls(this) { // from class: com.yandex.plus.home.internal.di.f
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                int i4 = 0;
                g gVar = this.b;
                switch (i3) {
                    case 0:
                        OkHttpClient.a a = gVar.a();
                        cop0 cop0Var2 = gVar.a;
                        uc ucVar = new uc(i4, new NetworkDataSourcesModule$restGatewayRetrofit$2$okHttpClient$1(0, cop0Var2.q, q5z.class, "getAcceptLanguage", "getAcceptLanguage(Lcom/yandex/plus/core/locale/LocaleProvider;)Ljava/lang/String;", 1));
                        ArrayList arrayList = a.c;
                        arrayList.add(ucVar);
                        arrayList.add(new q8z0());
                        vpu vpuVar = cop0Var2.o;
                        arrayList.add(new uc(10, new jr50(vpuVar, 1)));
                        OkHttpClient okHttpClient = new OkHttpClient(a);
                        s0k0 s0k0Var = new s0k0();
                        s0k0Var.a((lgx) gVar.q.getValue());
                        s0k0Var.a = okHttpClient;
                        s0k0Var.d.add(new h6d0());
                        s0k0Var.b(g.c(vpuVar.b()));
                        return s0k0Var.c();
                    default:
                        OkHttpClient.a a2 = gVar.a();
                        cop0 cop0Var3 = gVar.a;
                        uc ucVar2 = new uc(i4, new NetworkDataSourcesModule$experimentsRetrofit$2$okHttpClient$1(0, cop0Var3.q, q5z.class, "getAcceptLanguage", "getAcceptLanguage(Lcom/yandex/plus/core/locale/LocaleProvider;)Ljava/lang/String;", 1));
                        ArrayList arrayList2 = a2.c;
                        arrayList2.add(ucVar2);
                        arrayList2.add(new q8z0());
                        OkHttpClient okHttpClient2 = new OkHttpClient(a2);
                        s0k0 s0k0Var2 = new s0k0();
                        s0k0Var2.a((lgx) gVar.q.getValue());
                        s0k0Var2.a = okHttpClient2;
                        s0k0Var2.d.add(new h6d0());
                        s0k0Var2.b(g.c(cop0Var3.o.c()));
                        return s0k0Var2.c();
                }
            }
        });
        this.n = kotlin.a.a(new sls(this) { // from class: com.yandex.plus.home.internal.di.f
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                int i4 = 0;
                g gVar = this.b;
                switch (i3) {
                    case 0:
                        OkHttpClient.a a = gVar.a();
                        cop0 cop0Var2 = gVar.a;
                        uc ucVar = new uc(i4, new NetworkDataSourcesModule$restGatewayRetrofit$2$okHttpClient$1(0, cop0Var2.q, q5z.class, "getAcceptLanguage", "getAcceptLanguage(Lcom/yandex/plus/core/locale/LocaleProvider;)Ljava/lang/String;", 1));
                        ArrayList arrayList = a.c;
                        arrayList.add(ucVar);
                        arrayList.add(new q8z0());
                        vpu vpuVar = cop0Var2.o;
                        arrayList.add(new uc(10, new jr50(vpuVar, 1)));
                        OkHttpClient okHttpClient = new OkHttpClient(a);
                        s0k0 s0k0Var = new s0k0();
                        s0k0Var.a((lgx) gVar.q.getValue());
                        s0k0Var.a = okHttpClient;
                        s0k0Var.d.add(new h6d0());
                        s0k0Var.b(g.c(vpuVar.b()));
                        return s0k0Var.c();
                    default:
                        OkHttpClient.a a2 = gVar.a();
                        cop0 cop0Var3 = gVar.a;
                        uc ucVar2 = new uc(i4, new NetworkDataSourcesModule$experimentsRetrofit$2$okHttpClient$1(0, cop0Var3.q, q5z.class, "getAcceptLanguage", "getAcceptLanguage(Lcom/yandex/plus/core/locale/LocaleProvider;)Ljava/lang/String;", 1));
                        ArrayList arrayList2 = a2.c;
                        arrayList2.add(ucVar2);
                        arrayList2.add(new q8z0());
                        OkHttpClient okHttpClient2 = new OkHttpClient(a2);
                        s0k0 s0k0Var2 = new s0k0();
                        s0k0Var2.a((lgx) gVar.q.getValue());
                        s0k0Var2.a = okHttpClient2;
                        s0k0Var2.d.add(new h6d0());
                        s0k0Var2.b(g.c(cop0Var3.o.c()));
                        return s0k0Var2.c();
                }
            }
        });
    }

    public static String c(Uri uri) {
        String decode = Uri.decode(uri.toString());
        return evu0.B(decode, '/') ? decode : decode.concat("/");
    }

    public final OkHttpClient.a a() {
        OkHttpClient okHttpClient = (OkHttpClient) this.r.getValue();
        OkHttpClient.a b = okHttpClient != null ? okHttpClient.b() : new OkHttpClient.a();
        ArrayList arrayList = b.c;
        arrayList.add(new a4u());
        arrayList.add(new uc(15, new s59(this)));
        arrayList.add(new com.yandex.plus.core.network.api.interceptors.a(new NetworkDataSourcesModule$createBaseOkHttpClientBuilder$1(this, null)));
        cop0 cop0Var = this.a;
        arrayList.add(new ioc(cop0Var.c, new ir50(this, 3), new ir50(this, 4), new ir50(this, 5), new bgc(4), this.b.c, cop0Var.u, cop0Var.v, "PlusSdk"));
        NetworkDataSourcesModule$createRefreshTokenInterceptor$1 networkDataSourcesModule$createRefreshTokenInterceptor$1 = new NetworkDataSourcesModule$createRefreshTokenInterceptor$1(this, null);
        yk ykVar = new yk(15);
        i3y i3yVar = skd0.a;
        arrayList.add(new com.yandex.plus.core.network.api.interceptors.b(networkDataSourcesModule$createRefreshTokenInterceptor$1, ykVar, skd0.a(PlusLogTag.SDK)));
        b.d.add((tne) this.j.getValue());
        return b;
    }

    public final qo2 b() {
        return (qo2) this.l.getValue();
    }
}
