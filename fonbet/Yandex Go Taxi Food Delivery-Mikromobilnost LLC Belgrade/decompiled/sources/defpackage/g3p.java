package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.go.account.phonish_upgrade.p;
import com.yandex.go.feedback_common.services.c;
import com.yandex.go.mainscreen.superapp.popup.data.experiments.d;
import com.yandex.go.mainscreen.superapp.popup.data.state.scenario.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import ru.yandex.logistics.cargo_form.send_event.impl.data.FormSendEventApi;
import ru.yandex.taxi.favorites.address.impl.data.a;
import ru.yandex.taxi.preorder.extraphone.e;

/* loaded from: classes8.dex */
public final class g3p implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public g3p(w8r w8rVar, n3w n3wVar, ur3 ur3Var) {
        this.a = 10;
        this.b = n3wVar;
        this.c = ur3Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 1;
        xvf0 xvf0Var = this.b;
        xvf0 xvf0Var2 = this.c;
        switch (i) {
            case 0:
                return new f3p((v8w0) ((miv0) xvf0Var2).get(), (r8h) xvf0Var.get());
            case 1:
                return new e((wiq0) xvf0Var.get(), (b8r) ((cuo) xvf0Var2).get());
            case 2:
                return new b((d) ((lag) xvf0Var2).get(), (fk7) ((u5g) xvf0Var).get());
            case 3:
                return new a((ru.yandex.taxi.favorites.data.repo.a) xvf0Var.get(), (ru.yandex.taxi.favorites.address.api.experiment.a) ((p9p) xvf0Var2).get());
            case 4:
                return new wjp((dne0) ((y5g) xvf0Var2).get(), (rs2) ((y5g) xvf0Var).get());
            case 5:
                return new j1q(((h420) xvf0Var).b.n, (j420) ((gk10) xvf0Var2).get());
            case 6:
                return new u1n(17, (dm21) xvf0Var.get(), (com.yandex.go.taxi.order.api.details.common.domain.feedback.a) ((cuo) xvf0Var2).get());
            case 7:
                return new com.yandex.go.feedback_common.services.d((hit) xvf0Var.get(), (c) ((p9p) xvf0Var2).get());
            case 8:
                return new m6r((co40) ((m7q0) xvf0Var2).get(), (ru.yandex.taxi.perf.b) xvf0Var.get());
            case 9:
                gfw0 gfw0Var = (gfw0) xvf0Var.get();
                ((oag) xvf0Var2).get();
                return new r2h(i2, gfw0Var, drt.b);
            case 10:
                return new com.ybsdk.di.modules.e();
            case 11:
                return new jbr((oep0) xvf0Var.get(), (cuo) xvf0Var2);
            case 12:
                Set set = (Set) ((y2r0) xvf0Var2).get();
                com.yandex.go.flex.common.divkit.a aVar = (com.yandex.go.flex.common.divkit.a) ((can) xvf0Var).get();
                Set set2 = set;
                ArrayList arrayList = new ArrayList(tcc.n(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((i231) it.next()).create());
                }
                c231[] c231VarArr = (c231[]) arrayList.toArray(new c231[0]);
                com.yandex.div.core.expression.variables.a aVar2 = new com.yandex.div.core.expression.variables.a(null);
                aVar2.i((c231[]) Arrays.copyOf(c231VarArr, c231VarArr.length));
                aVar.a(set2, aVar2);
                return aVar2;
            case 13:
                return new p((tt2) xvf0Var.get(), (hzk) ((cuo) xvf0Var2).get());
            case 14:
                return new ru.yandex.logistics.cargo_form.async.impl.data.b(i5m.a((wnw) xvf0Var2), (i3s) xvf0Var.get());
            case 15:
                return new ru.yandex.logistics.cargo_form.send_event.impl.data.a((FormSendEventApi) ((wnw) xvf0Var2).get(), (i6s) ((qsn) xvf0Var).get());
            case 16:
                return new s6s((l6s) ((cuo) xvf0Var2).get(), (c7s) xvf0Var.get());
            case 17:
                return new ru.yandex.logistics.cargo_form.async.impl.polling.a((st2) xvf0Var.get(), (ru.yandex.logistics.cargo_form.async.impl.data.b) ((g3p) xvf0Var2).get());
            case 18:
                return new q7s((jc4) ((xpj0) xvf0Var2).get(), (dy6) ((n4g0) xvf0Var).get());
            case 19:
                return new v920((s8s) ((n3w) xvf0Var2).a, (sy4) ((nf) xvf0Var).get());
            case 20:
                return new pys((rxm0) xvf0Var2, (alm) xvf0Var);
            case 21:
                return new sat((wnt) xvf0Var.get(), (vit) ((o0t) xvf0Var2).get());
            case 22:
                return new u1n(26, (SharedPreferences) xvf0Var.get(), (gym) ((o0t) xvf0Var2).get());
            case 23:
                return new lot(i2, (nle) ((ole) xvf0Var2).get(), (wot) ((o0t) xvf0Var).get());
            case 24:
                return new com.yandex.go.proxyprovision.mob.a((tt2) xvf0Var.get(), (hzk) ((a4t) xvf0Var2).get());
            case 25:
                return new hu2(i2, (tqt) ((xsi) xvf0Var2).get(), (o3h) xvf0Var.get());
            case 26:
                return new ru.yandex.taxi.vendor_api.google.b((Context) ((d6g) xvf0Var2).get(), (cug) ((cnt) xvf0Var).get());
            case 27:
                return new com.yandex.go.payments.superapp.payment.a((Activity) ((c3g) xvf0Var).get(), (com.yandex.go.payments.googlepay.domain.e) ((c3g) xvf0Var2).get());
            case 28:
                return new t3u((Context) xvf0Var.get(), (k0b0) ((i0b0) xvf0Var2).get());
            default:
                return new hzk((rp60) ((n2g) xvf0Var2).get(), (uxx) ((m2g) xvf0Var).get());
        }
    }

    public /* synthetic */ g3p(xvf0 xvf0Var, xvf0 xvf0Var2, int i, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    public /* synthetic */ g3p(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
    }
}
