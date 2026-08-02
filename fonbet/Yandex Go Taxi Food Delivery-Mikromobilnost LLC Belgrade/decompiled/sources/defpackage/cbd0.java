package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.yandex.plus.core.config.Environment;
import com.yandex.plus.pay.common.api.model.PlusPayPlatform;
import com.yandex.plus.pay.data.acquisition.PlusPayAcquisitionApi;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import com.yandex.plus.pay.internal.di.b;
import com.yandex.plus.pay.internal.feature.subscription.a;
import com.yandex.plus.pay.internal.feature.user.c;
import com.yandex.plus.pay.internal.feature.user.d;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.net.URI;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final /* synthetic */ class cbd0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ dbd0 b;

    public /* synthetic */ cbd0(dbd0 dbd0Var, int i) {
        this.a = i;
        this.b = dbd0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        dbd0 dbd0Var = this.b;
        switch (i) {
            case 0:
                ExternalMediaBillingApi c = dbd0Var.c();
                ((wyj) dbd0Var.a.n).getClass();
                wyj wyjVar = wyj.b;
                return new c(c, dbd0Var.b.e);
            case 1:
                fad0 fad0Var = dbd0Var.b;
                ndd0 ndd0Var = fad0Var.e;
                ExternalMediaBillingApi c2 = dbd0Var.c();
                y1v0 y1v0Var = (y1v0) ((icj) fad0Var.j.getValue()).c.getValue();
                ((wyj) dbd0Var.a.n).getClass();
                return new a(ndd0Var, c2, y1v0Var, wyj.e);
            case 2:
                qo2 a = dbd0Var.a();
                b bVar = dbd0Var.a;
                return new com.yandex.plus.pay.graphql.offers.a(a, bVar.b(), bVar.t.h, dbd0Var.b());
            case 3:
                PlusPayAcquisitionApi plusPayAcquisitionApi = (PlusPayAcquisitionApi) dbd0Var.m.getValue();
                ocd0 ocd0Var = (ocd0) dbd0Var.F.getValue();
                b bVar2 = dbd0Var.a;
                lzs lzsVar = bVar2.k;
                bbd0 bbd0Var = new bbd0(dbd0Var);
                r0d0 r0d0Var = new r0d0(6, dbd0Var);
                ((wyj) bVar2.n).getClass();
                return new com.yandex.plus.pay.internal.feature.offers.smart.b(plusPayAcquisitionApi, ocd0Var, lzsVar, bbd0Var, r0d0Var, wyj.e, dbd0Var.b.e);
            case 4:
                return new com.yandex.plus.pay.graphql.avatar.a(dbd0Var.a(), (fnh) dbd0Var.a.A.b.getValue());
            case 5:
                qo2 a2 = dbd0Var.a();
                b bVar3 = dbd0Var.a;
                return new com.yandex.plus.pay.graphql.invoice.a(a2, bVar3.b(), dbd0Var.b(), bVar3.a());
            case 6:
                return new com.yandex.plus.pay.graphql.user.a(dbd0Var.a());
            case 7:
                return new com.yandex.plus.pay.graphql.family.a(dbd0Var.a(), dbd0Var.a.b());
            case 8:
                return new kzs(dbd0Var.a.k);
            case 9:
                return new com.yandex.plus.pay.graphql.offers.b(dbd0Var.a(), dbd0Var.a.b());
            case 10:
                qo2 a3 = dbd0Var.a();
                b bVar4 = dbd0Var.a;
                return new com.yandex.plus.pay.graphql.contacts.a(a3, bVar4.b(), bVar4.a);
            case 11:
                ExternalMediaBillingApi c3 = dbd0Var.c();
                b bVar5 = dbd0Var.a;
                p5z b = bVar5.b();
                ((wyj) bVar5.n).getClass();
                return new com.yandex.plus.pay.internal.feature.topup.a(c3, b, wyj.e);
            case 12:
                ExternalMediaBillingApi c4 = dbd0Var.c();
                b bVar6 = dbd0Var.a;
                p5z b2 = bVar6.b();
                ((wyj) bVar6.n).getClass();
                return new com.yandex.plus.pay.internal.feature.success.a(c4, b2, wyj.e);
            case 13:
                ExternalMediaBillingApi c5 = dbd0Var.c();
                b bVar7 = dbd0Var.a;
                p5z b3 = bVar7.b();
                ((wyj) bVar7.n).getClass();
                return new com.yandex.plus.pay.internal.feature.closing.b(c5, b3, wyj.e, dbd0Var.b.e);
            case 14:
                ExternalMediaBillingApi c6 = dbd0Var.c();
                b bVar8 = dbd0Var.a;
                p5z b4 = bVar8.b();
                ((wyj) bVar8.n).getClass();
                return new com.yandex.plus.pay.internal.feature.counter_offers.b(c6, b4, wyj.e, dbd0Var.b.e);
            case 15:
                ExternalMediaBillingApi c7 = dbd0Var.c();
                b bVar9 = dbd0Var.a;
                p5z b5 = bVar9.b();
                ((wyj) bVar9.n).getClass();
                return new com.yandex.plus.pay.internal.feature.presale.b(c7, b5, wyj.e, dbd0Var.b.e);
            case 16:
                ExternalMediaBillingApi c8 = dbd0Var.c();
                y1v0 y1v0Var2 = (y1v0) ((icj) dbd0Var.b.j.getValue()).c.getValue();
                b bVar10 = dbd0Var.a;
                sbx a4 = bVar10.a();
                ((wyj) bVar10.n).getClass();
                return new com.yandex.plus.pay.internal.feature.payment.inapp.google.data.a(c8, y1v0Var2, a4, wyj.e);
            case 17:
                return new com.yandex.plus.pay.internal.analytics.a((ocd0) dbd0Var.F.getValue(), (yqx0) ((icj) dbd0Var.b.j.getValue()).a.getValue());
            case 18:
                return ((lj) dbd0Var.a.t.h.getValue()).getId();
            case 19:
                b bVar11 = dbd0Var.a;
                return new ioc(bVar11.a, new cbd0(dbd0Var, 18), new cbd0(dbd0Var, 25), new cbd0(dbd0Var, 26), new cbd0(dbd0Var, 27), dbd0Var.b.e.a.toString(), bVar11.c(), bVar11.f, "PlusPaySdk");
            case 20:
                tls tlsVar = dbd0Var.a.m;
                fad0 fad0Var2 = dbd0Var.b;
                i3y i3yVar = fad0Var2.j;
                return new mad0(tlsVar, (sr50) ((icj) i3yVar.getValue()).d.getValue(), (uqx0) ((icj) i3yVar.getValue()).b.getValue(), fad0Var2.e);
            case 21:
                mad0 mad0Var = (mad0) dbd0Var.h.getValue();
                OkHttpClient okHttpClient = (OkHttpClient) dbd0Var.i.getValue();
                fnh fnhVar = (fnh) dbd0Var.a.A.a.getValue();
                mad0Var.getClass();
                String uri = fnhVar.getUrl().toString();
                com.yandex.plus.pay.graphql.analytics.a aVar = new com.yandex.plus.pay.graphql.analytics.a(mad0Var.b, mad0Var.d, new URI(uri));
                OkHttpClient.a b6 = okHttpClient.b();
                ro2 ro2Var = new ro2();
                ArrayList arrayList = b6.c;
                arrayList.add(ro2Var);
                arrayList.add(aVar);
                msu msuVar = new msu(new OkHttpClient(b6), new t6f0(10, fnhVar));
                po2 po2Var = new po2();
                po2Var.e = uri;
                po2Var.f = new tch(msuVar);
                po2Var.g = Boolean.TRUE;
                ArrayList arrayList2 = po2Var.b;
                arrayList2.add(aVar);
                arrayList2.add(new com.yandex.plus.pay.graphql.analytics.b(mad0Var.c));
                foe foeVar = new foe(14);
                vkf vkfVar = po2Var.a;
                vkfVar.a.put("Map_String_ObjectScalar", foeVar);
                vkfVar.a.put("Map_String_StringScalar", new foe(15));
                return ((po2) mad0Var.a.invoke(po2Var)).a();
            case 22:
                b bVar12 = dbd0Var.a;
                Environment environment = bVar12.h.getEnvironment();
                ike ikeVar = bVar12.i;
                ((wyj) bVar12.n).getClass();
                mdh mdhVar = wyj.e;
                zhf.a.getClass();
                xhf xhfVar = yhf.b;
                com.yandex.plus.core.graphql.internal.b bVar13 = new com.yandex.plus.core.graphql.internal.b(dbd0Var.a());
                kzs kzsVar = (kzs) dbd0Var.e.getValue();
                Map i2 = kotlin.collections.b.i(new Pair("platform", ConstantDeviceInfo.APP_PLATFORM), new Pair("platform_version", Build.VERSION.RELEASE), new Pair("pay_service_name", bVar12.a), new Pair("pay_sdk_version", "110.0.2"), new Pair("client_app_version", bVar12.f));
                long j = bVar12.x;
                ndd0 ndd0Var2 = dbd0Var.b.e;
                cbd0 cbd0Var = new cbd0(dbd0Var, 28);
                wqo wqoVar = new wqo(new m2d0(environment, ikeVar, mdhVar, xhfVar, bVar13, kzsVar, cbd0Var, i2, ndd0Var2, j));
                SharedPreferences sharedPreferences = bVar12.g.getSharedPreferences("com.yandex.plus.pay.experiments", 0);
                return new com.yandex.plus.experiments.impl.providers.a(ikeVar, mdhVar, xhfVar, (fro) wqoVar.c.getValue(), (l2d0) wqoVar.b.getValue(), new com.yandex.plus.experiments.impl.cache.a(xhfVar, j, environment, mdhVar, bVar12.a(), sharedPreferences, cbd0Var), new com.yandex.plus.experiments.impl.cooldown.a(xhfVar, mdhVar, sharedPreferences), ndd0Var2);
            case 23:
                OkHttpClient okHttpClient2 = (OkHttpClient) dbd0Var.i.getValue();
                b bVar14 = dbd0Var.a;
                fnh fnhVar2 = (fnh) bVar14.A.d.getValue();
                sbx a5 = bVar14.a();
                msu msuVar2 = new msu(new OkHttpClient(okHttpClient2.b()), new t6f0(10, fnhVar2));
                s0k0 s0k0Var = new s0k0();
                s0k0Var.d.add(new uz50());
                s0k0Var.a(new lgx(a5, 2));
                s0k0Var.a = msuVar2;
                s0k0Var.b(fnhVar2.getUrl().toString());
                return (ExternalMediaBillingApi) s0k0Var.c().b(ExternalMediaBillingApi.class);
            case 24:
                x7d0 x7d0Var = PlusPayAcquisitionApi.Companion;
                OkHttpClient okHttpClient3 = (OkHttpClient) dbd0Var.i.getValue();
                b bVar15 = dbd0Var.a;
                fnh fnhVar3 = (fnh) bVar15.A.f.getValue();
                sbx a6 = bVar15.a();
                x7d0Var.getClass();
                return x7d0.a(okHttpClient3, fnhVar3, a6);
            case 25:
                return dbd0Var.a.p.b();
            case 26:
                return dbd0Var.a.p.a();
            case 27:
                ned0 ned0Var = PlusPayPlatform.Companion;
                Context context = dbd0Var.a.g;
                ned0Var.getClass();
                return ned0.a(context, true).getHeaderValue();
            case 28:
                return ((lj) dbd0Var.a.t.h.getValue()).getId();
            default:
                b bVar16 = dbd0Var.a;
                com.yandex.plus.domain.auth.impl.a aVar2 = bVar16.t;
                ExternalMediaBillingApi c9 = dbd0Var.c();
                ((wyj) bVar16.n).getClass();
                return new d(aVar2, c9, wyj.e, dbd0Var.b.e);
        }
    }
}
