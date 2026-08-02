package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Merchant;
import com.yandex.go.navigator.domain.e;
import com.yandex.go.navigator.gas_stations.b;
import com.yandex.go.navigator.repository.o;
import com.yandex.go.places.impl.data.providers.a;
import com.ybsdk.feature.futurepayments.internal.network.FuturePaymentsApi;
import com.ybsdk.feature.main.internal.screens.products.ProductsFragment;
import com.ybsdk.feature.main.internal.screens.sbpAccount.SbpAccountInfoFragment;
import com.ybsdk.feature.main.internal.screens.sbpPartners.SbpPartnersFragment;
import com.ybsdk.feature.main.internal.screens.userCards.UserCardsFragment;
import com.ybsdk.screens.changephone.presentation.ChangePhoneStatusFragment;
import com.ybsdk.screens.registration.applicationstatus.presentation.RegistrationApplicationStatusFragment;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationFragment;
import com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationFragment;
import io.appmetrica.analytics.AppMetricaYandex;
import java.util.LinkedHashMap;
import ru.yandex.taxi.logistics.sdk.tracking.impl.data.c;

/* loaded from: classes3.dex */
public final class njp implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ njp(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static njp a(eqh eqhVar) {
        return new njp(eqhVar, 24);
    }

    public static njp b(eqh eqhVar) {
        return new njp(eqhVar, 25);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 17;
        int i3 = 29;
        int i4 = 2;
        int i5 = 14;
        int i6 = 28;
        int i7 = 4;
        int i8 = 1;
        int i9 = 0;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new a((vac0) xvf0Var.get());
            case 1:
                tw51 tw51Var = (tw51) xvf0Var.get();
                vu4 vu4Var = new vu4();
                xat xatVar = new xat(i5m.b(new xu4(vu4Var, new gwf(tw51Var, 29), 0)), 12);
                gwf gwfVar = new gwf(tw51Var, 28);
                eqh eqhVar = new eqh();
                prq prqVar = new prq(gwfVar, i5m.b(new xu4(vu4Var, new eu0(vu4Var, eqhVar), 1)), new gwf(tw51Var, 27), new hbn(new owf(tw51Var, 0), new nwf(0, tw51Var)), new owf(tw51Var, 1), 6);
                xvf0 b = i5m.b(new xu4(vu4Var, new gwf(tw51Var, 26), i4));
                eqh.a(eqhVar, i5m.b(new c4(xatVar, prqVar, new jde0(b, 4), b)));
                return (tu4) eqhVar.get();
            case 2:
                tw51 tw51Var2 = (tw51) xvf0Var.get();
                u2g u2gVar = new u2g(tw51Var2, 13);
                tw11 tw11Var = new tw11(new tw11(new v400(u2gVar, 2), 5), i7);
                u1g u1gVar = new u1g(tw51Var2, 27);
                u1g u1gVar2 = new u1g(tw51Var2, 18);
                u2g u2gVar2 = new u2g(tw51Var2, 11);
                u2g u2gVar3 = new u2g(tw51Var2, 18);
                u2g u2gVar4 = new u2g(tw51Var2, 2);
                u2g u2gVar5 = new u2g(tw51Var2, 14);
                ubq0 ubq0Var = new ubq0(tw11Var, u1gVar, u1gVar2, u2gVar2, u2gVar3, u2gVar4, u2gVar5, 20);
                aos aosVar = new aos(n3w.a(tw51Var2), 6);
                sk21 sk21Var = new sk21(ubq0Var, u2gVar4, aosVar, i9);
                u2g u2gVar6 = new u2g(tw51Var2, 1);
                k4 k4Var = new k4(new v400(u2gVar, 0), new u1g(tw51Var2, 22), new u2g(tw51Var2, 4), new u2g(tw51Var2, 12), new u1g(tw51Var2, 24), new u1g(tw51Var2, 25), new u1g(tw51Var2, 20), new kxb0(new u2g(tw51Var2, 3), 13), new u2g(tw51Var2, 17), u2gVar4, new u1g(tw51Var2, 26), 20);
                u2g u2gVar7 = new u2g(tw51Var2, 19);
                u2g u2gVar8 = new u2g(tw51Var2, 6);
                w400 w400Var = new w400(u2gVar2, 0);
                h1t h1tVar = new h1t(new u1g(tw51Var2, 19), 28);
                u2g u2gVar9 = new u2g(tw51Var2, 7);
                u2g u2gVar10 = new u2g(tw51Var2, 8);
                u1g u1gVar3 = new u1g(tw51Var2, 21);
                k4 k4Var2 = new k4(n3w.a(new dcf0(new pzf(u1gVar, u2gVar2, u2gVar6, k4Var, u2gVar4, u2gVar7, u2gVar8, w400Var, h1tVar, u2gVar9, u2gVar5, u2gVar10, new tgb0(u2gVar2, u2gVar4, u1gVar3, 10)))), new u1g(tw51Var2, 29), new u2g(tw51Var2, 0), new u2g(tw51Var2, 10), new u2g(tw51Var2, 20), aosVar, u2gVar4, w400Var, new u2g(tw51Var2, 5), new u1g(tw51Var2, 23), new u2g(tw51Var2, 16), 21);
                jzi0 jzi0Var = new jzi0(19, new v400(u2gVar, 1));
                u2g u2gVar11 = new u2g(tw51Var2, 15);
                v8c0 v8c0Var = new v8c0(n3w.a(new kem0(new kdd0(jzi0Var, u2gVar11, u2gVar5, u2gVar2))), 14);
                u2g u2gVar12 = new u2g(tw51Var2, 9);
                jzi0 jzi0Var2 = new jzi0(23, new m580(jzi0Var, u1gVar, u2gVar5, u2gVar12, new u1g(tw51Var2, 28), n3w.a(new shm0(new krl0(u2gVar5, u2gVar12))), u2gVar11, new w400(u2gVar2, 1), u1gVar3, 8));
                LinkedHashMap A = gtq0.A(4);
                A.put(UserCardsFragment.class, sk21Var);
                A.put(ProductsFragment.class, k4Var2);
                A.put(SbpAccountInfoFragment.class, v8c0Var);
                A.put(SbpPartnersFragment.class, jzi0Var2);
                p400 p400Var = (p400) i5m.b(new dsl(qc00.a, new br00(A), 3)).get();
                q5z.i(p400Var);
                return p400Var;
            case 3:
                tw51 tw51Var3 = (tw51) xvf0Var.get();
                xvf0 b2 = i5m.b(iri0.a);
                k6g k6gVar = new k6g(tw51Var3, 7);
                c6g c6gVar = new c6g(tw51Var3, i3);
                k6g k6gVar2 = new k6g(tw51Var3, 0);
                k6g k6gVar3 = new k6g(tw51Var3, 4);
                k6g k6gVar4 = new k6g(tw51Var3, 19);
                k6g k6gVar5 = new k6g(tw51Var3, 15);
                xvf0 b3 = i5m.b(new cta0(c6gVar, k6gVar2, k6gVar3, k6gVar4, k6gVar5, 13));
                k6g k6gVar6 = new k6g(tw51Var3, 18);
                lq40 lq40Var = new lq40(i5, c6gVar);
                g680 g680Var = new g680((Object) new k6g(tw51Var3, 16), b3, i2);
                k6g k6gVar7 = new k6g(tw51Var3, 23);
                ie9 ie9Var = new ie9(c6gVar, k6gVar5, i8);
                c6g c6gVar2 = new c6g(tw51Var3, i6);
                xvf0 b4 = i5m.b(new ie9(c6gVar, k6gVar5, i9));
                xvf0 b5 = i5m.b(new ht0(k6gVar7, ie9Var, c6gVar2, b3, b4, lq40Var, new k6g(tw51Var3, 9)));
                k6g k6gVar8 = new k6g(tw51Var3, 2);
                k6g k6gVar9 = new k6g(tw51Var3, 21);
                k6g k6gVar10 = new k6g(tw51Var3, 5);
                k6g k6gVar11 = new k6g(tw51Var3, 26);
                c6g c6gVar3 = new c6g(tw51Var3, 27);
                aos aosVar2 = new aos(n3w.a(new neb0(new st0(g680Var, b5, (xvf0) dgb0.a, k6gVar4, b2, k6gVar8, k6gVar9, k6gVar10, k6gVar11, (xvf0) jeb0.a, c6gVar3))), i6);
                n3w a = n3w.a(new u9c(new st0(new k6g(tw51Var3, 25), k6gVar4, k6gVar6, (xvf0) iez0.a, k6gVar11, new k6g(tw51Var3, 24), new k6g(tw51Var3, 8), new k6g(tw51Var3, 3), k6gVar9, k6gVar10, b5)));
                eqh eqhVar2 = new eqh();
                n3w a2 = n3w.a(new vqi0(new uqi0(b3, k6gVar9, k6gVar4, k6gVar8, eqhVar2)));
                xvf0 b6 = i5m.b(new tgb0(new k6g(tw51Var3, 10), i5m.b(new kxb0(new k6g(tw51Var3, 11), 26)), i5m.b(new kxb0(new k6g(tw51Var3, 20), 27)), 20));
                k6g k6gVar12 = new k6g(tw51Var3, 6);
                k6g k6gVar13 = new k6g(tw51Var3, 13);
                k6g k6gVar14 = new k6g(tw51Var3, 22);
                eqh eqhVar3 = new eqh();
                xat xatVar2 = new xat(eqhVar3, 27);
                k9c k9cVar = new k9c(a2, n3w.a(new tm3(new sm3(b6, k6gVar12, k6gVar9, k6gVar13, k6gVar14, k6gVar6, xatVar2))), n3w.a(new he9(new ge9(b4, k6gVar9, eqhVar2, k6gVar4, k6gVar8, k6gVar6))), i9);
                k6g k6gVar15 = new k6g(tw51Var3, 1);
                f2b f2bVar = new f2b(a, k9cVar, k6gVar15, 8);
                v8c0 v8c0Var2 = new v8c0(n3w.a(new rqi0(new tt(b5, k6gVar6, k6gVar9, k6gVar4, k6gVar11, k6gVar14, jqi0.a, new k6g(tw51Var3, 12), k6gVar10, c6gVar3, xatVar2, new k6g(tw51Var3, 17), k6gVar3, k6gVar8))), 8);
                dx7 dx7Var = new dx7(n3w.a(new we9(new fn6(ze9.a, b5, k6gVar6, k6gVar9, k6gVar10, k6gVar11, eqhVar2, k6gVar14, new ba9(k6gVar4, 6), k6gVar8, new k6g(tw51Var3, 14), xatVar2))), (xvf0) k6gVar15, 19);
                LinkedHashMap A2 = gtq0.A(4);
                A2.put(PhoneConfirmationFragment.class, aosVar2);
                A2.put(CodeConfirmationFragment.class, f2bVar);
                A2.put(RegistrationApplicationStatusFragment.class, v8c0Var2);
                A2.put(ChangePhoneStatusFragment.class, dx7Var);
                eqh.a(eqhVar3, new br00(A2));
                eqh.a(eqhVar2, i5m.b(new q150(b2, k6gVar, b3, k6gVar6, lq40Var, k6gVar3, eqhVar3)));
                com.ybsdk.screens.registration.a aVar = (com.ybsdk.screens.registration.a) eqhVar2.get();
                q5z.i(aVar);
                return aVar;
            case 4:
                return new c((String) xvf0Var.get());
            case 5:
                return new jln(18, (oyq) xvf0Var.get());
            case 6:
                return new a3r();
            case 7:
                return new ru.yandex.taxi.address.base.a((atd0) xvf0Var.get());
            case 8:
                return new car(0, (h450) xvf0Var.get());
            case 9:
                return new fdr((Context) xvf0Var.get());
            case 10:
                return (FlexAdapter) ((t70) xvf0Var.get()).a(FlexAdapter.class, "com.yandex.fintechsdk.adapters.flex.sdk.impl.FlexAdapterFactory");
            case 11:
                return ((pcy) xvf0Var.get()).a();
            case 12:
                return new nkr((nf4) xvf0Var.get());
            case 13:
                return new e((o) xvf0Var.get());
            case 14:
                return new d1s((com.yandex.go.taxi.order.repositories.c) xvf0Var.get());
            case 15:
                return new o61((pho) xvf0Var.get());
            case 16:
                return new z3s((Context) xvf0Var.get());
            case 17:
                return new mum((rzq0) xvf0Var.get());
            case 18:
                return ((poy0) xvf0Var.get()).a();
            case 19:
                return new mgs((Merchant) xvf0Var.get());
            case 20:
                xf41 a3 = ((scg) ((ff41) xvf0Var.get())).a();
                q5z.i(a3);
                return a3;
            case 21:
                return new com.ybsdk.feature.futurepayments.internal.data.a((FuturePaymentsApi) xvf0Var.get());
            case 22:
                Context context = (Context) xvf0Var.get();
                krs krsVar = new krs();
                AppMetricaYandex.requestAdvIdentifiers(context, new xen(15, krsVar));
                return krsVar;
            case 23:
                return new kws((b) xvf0Var.get());
            case 24:
                return new pj((pho) xvf0Var.get());
            case 25:
                return new mzs((pho) xvf0Var.get());
            case 26:
                return new o61((pho) xvf0Var.get());
            case 27:
                return new com.yandex.fintechsdk.data.config.impl.internal.datasources.network.requesters.payment.applink.a((jgs) xvf0Var.get());
            case 28:
                return new com.yandex.messaging.domain.chat.c((com.yandex.messaging.internal.e) xvf0Var.get());
            default:
                return new r4t((SharedPreferences) xvf0Var.get());
        }
    }

    public /* synthetic */ njp(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
