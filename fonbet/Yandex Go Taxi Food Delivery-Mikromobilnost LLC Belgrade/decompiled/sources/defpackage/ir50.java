package defpackage;

import com.yandex.plus.core.graphql.internal.b;
import com.yandex.plus.home.analytics.diagnostic.server.a;
import com.yandex.plus.home.api.prefetch.PrefetchApi;
import com.yandex.plus.home.datasource.openapi.apis.CommonExperimentsControllerApi;
import com.yandex.plus.home.datasource.openapi.apis.PlusStateControllerApi;
import com.yandex.plus.home.datasource.openapi.apis.SdkConfigurationControllerApi;
import com.yandex.plus.home.internal.di.g;
import java.util.ArrayList;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final /* synthetic */ class ir50 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ ir50(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        int i2 = 10;
        int i3 = 15;
        int i4 = 2;
        g gVar = this.b;
        switch (i) {
            case 0:
                return (CommonExperimentsControllerApi) ((t0k0) gVar.n.getValue()).b(CommonExperimentsControllerApi.class);
            case 1:
                return new b(gVar.b());
            case 2:
                OkHttpClient.a a = gVar.a();
                ro2 ro2Var = new ro2();
                ArrayList arrayList = a.c;
                arrayList.add(ro2Var);
                vpu vpuVar = gVar.a.o;
                arrayList.add(new uc(i2, new jr50(vpuVar, 0)));
                OkHttpClient okHttpClient = new OkHttpClient(a);
                po2 po2Var = new po2();
                po2Var.e = g.c(vpuVar.e());
                po2Var.f = new tch(okHttpClient);
                po2Var.g = Boolean.TRUE;
                a aVar = new a(gVar.b.b(), (o1k0) gVar.p.getValue());
                ArrayList arrayList2 = po2Var.b;
                arrayList2.add(aVar);
                arrayList2.add(new com.yandex.plus.home.graphql.analytics.a());
                foe foeVar = new foe(14);
                vkf vkfVar = po2Var.a;
                vkfVar.a.put("Map_String_ObjectScalar", foeVar);
                vkfVar.a.put("Map_String_StringScalar", new foe(15));
                return po2Var.a();
            case 3:
                return ((lj) gVar.c.h.getValue()).getId();
            case 4:
                return gVar.d.b();
            case 5:
                return gVar.d.a();
            case 6:
                OkHttpClient okHttpClient2 = (OkHttpClient) gVar.r.getValue();
                vpu vpuVar2 = gVar.a.o;
                OkHttpClient.a b = okHttpClient2 != null ? okHttpClient2.b() : new OkHttpClient.a();
                ArrayList arrayList3 = b.c;
                arrayList3.add(new a4u());
                arrayList3.add(new uc(i3, new s59(gVar)));
                arrayList3.add(new uc(i2, new jr50(vpuVar2, i4)));
                OkHttpClient okHttpClient3 = new OkHttpClient(b);
                s0k0 s0k0Var = new s0k0();
                s0k0Var.a((lgx) gVar.q.getValue());
                s0k0Var.a = okHttpClient3;
                s0k0Var.b(g.c(vpuVar2.f()));
                return s0k0Var.c();
            case 7:
                return new lgx((sbx) gVar.i.getValue(), 2);
            case 8:
                OkHttpClient.a aVar2 = gVar.a.l;
                if (aVar2 != null) {
                    return new OkHttpClient(aVar2);
                }
                return null;
            case 9:
                return (SdkConfigurationControllerApi) ((t0k0) gVar.m.getValue()).b(SdkConfigurationControllerApi.class);
            case 10:
                return (PlusStateControllerApi) ((t0k0) gVar.m.getValue()).b(PlusStateControllerApi.class);
            default:
                return (PrefetchApi) ((t0k0) gVar.o.getValue()).b(PrefetchApi.class);
        }
    }
}
