package com.yandex.plus.pay.internal.di;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.pay.common.api.network.OkHttpLog$Level;
import defpackage.ced0;
import defpackage.dbd0;
import defpackage.ded0;
import defpackage.fad0;
import defpackage.fnh;
import defpackage.gw60;
import defpackage.i3y;
import defpackage.ioc;
import defpackage.kjz;
import defpackage.kkb;
import defpackage.owu;
import defpackage.qc20;
import defpackage.rkd0;
import defpackage.ryj;
import defpackage.sbx;
import defpackage.scc;
import defpackage.skd0;
import defpackage.sls;
import defpackage.tne;
import defpackage.uc;
import defpackage.uch;
import defpackage.v0k0;
import defpackage.vch;
import defpackage.weu;
import defpackage.wyj;
import defpackage.yk;
import defpackage.zs50;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

/* loaded from: classes8.dex */
public final /* synthetic */ class c implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        Object obj = this.b;
        switch (i) {
            case 0:
                dbd0 dbd0Var = (dbd0) obj;
                return new com.yandex.plus.pay.graphql.upsale.a(dbd0Var.a(), new PlusPayDataModule$compositeUpsaleRepository$2$1(dbd0Var.a.b()), dbd0Var.b());
            case 1:
                dbd0 dbd0Var2 = (dbd0) obj;
                PlusPayDataModule$createOkHttpClient$refreshTokenInterceptor$1 plusPayDataModule$createOkHttpClient$refreshTokenInterceptor$1 = new PlusPayDataModule$createOkHttpClient$refreshTokenInterceptor$1(dbd0Var2, null);
                yk ykVar = new yk(19);
                i3y i3yVar = skd0.a;
                com.yandex.plus.core.network.api.interceptors.b bVar = new com.yandex.plus.core.network.api.interceptors.b(plusPayDataModule$createOkHttpClient$refreshTokenInterceptor$1, ykVar, skd0.a(PlusLogTag.SDK));
                ced0 ced0Var = (ced0) dbd0Var2.d.getValue();
                b bVar2 = dbd0Var2.a;
                OkHttpClient.a aVar = bVar2.l;
                ded0 ded0Var = (ded0) ced0Var;
                ded0Var.getClass();
                OkHttpClient.a b = aVar != null ? new OkHttpClient(aVar).b() : new OkHttpClient.a();
                ArrayList arrayList = b.d;
                b.f(scc.g(Protocol.HTTP_1_1, Protocol.HTTP_2));
                TimeUnit timeUnit = TimeUnit.SECONDS;
                b.b(15L, timeUnit);
                b.g(20L, timeUnit);
                b.i(20L);
                ryj ryjVar = new ryj(Executors.newCachedThreadPool());
                ryjVar.d(32);
                ryjVar.e();
                b.a = ryjVar;
                b.c.add(new uc(15, ded0Var.c));
                arrayList.add(new uc(18, "PlusPaySDK-110.0.2"));
                arrayList.add(new gw60(OkHttpLog$Level.BODY, new weu(i2, ded0Var.a)));
                arrayList.add(new uc(12, ded0Var.b));
                OkHttpClient.a b2 = new OkHttpClient(b).b();
                ArrayList arrayList2 = b2.c;
                arrayList2.add((ioc) dbd0Var2.g.getValue());
                arrayList2.add((kkb) dbd0Var2.f.getValue());
                arrayList2.add(new com.yandex.plus.pay.internal.network.a(bVar2.t));
                arrayList2.add(bVar);
                b2.d.add((tne) dbd0Var2.H.getValue());
                return new OkHttpClient(b2);
            default:
                fad0 fad0Var = (fad0) obj;
                b bVar3 = fad0Var.a;
                String uri = ((fnh) bVar3.A.e.getValue()).getUrl().toString();
                sbx a = bVar3.a();
                com.yandex.plus.core.network.error.a aVar2 = (com.yandex.plus.core.network.error.a) bVar3.C.getValue();
                zs50 zs50Var = (zs50) bVar3.B.getValue();
                ((uch) vch.a.getValue()).getClass();
                qc20 qc20Var = new qc20(new kjz(10, new v0k0(uri, a, aVar2, zs50Var, PlusPayAnalyticsModule$dwhAnalyticsReporter_delegate$lambda$1$$inlined$create$default$1.b, new weu(26, fad0Var)), (sls[]) Arrays.copyOf(new sls[]{new PlusPayAnalyticsModule$dwhAnalyticsReporter$2$callProvider$1(0, (fnh) bVar3.A.e.getValue(), owu.class, "asNetworkCallInterceptor", "asNetworkCallInterceptor(Lcom/yandex/plus/core/network/urls/UrlProvider;)Lcom/yandex/plus/core/network/okhttp/interceptor/OkHttpNetworkCallInterceptor;", 1)}, 1)));
                i3y i3yVar2 = skd0.a;
                rkd0 a2 = skd0.a(PlusLogTag.SDK);
                ((wyj) bVar3.n).getClass();
                return new com.yandex.plus.analytics.dwh.a(qc20Var, a2, wyj.e);
        }
    }
}
