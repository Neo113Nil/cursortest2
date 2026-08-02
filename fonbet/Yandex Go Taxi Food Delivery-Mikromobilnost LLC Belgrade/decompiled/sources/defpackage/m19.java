package defpackage;

import android.content.Context;
import com.yandex.go.chargers.error.data.a;
import com.yandex.go.chargers.push.domain.c;
import com.yandex.go.payments.domain.q0;
import ru.yandex.taxi.analytics.g;
import ru.yandex.taxi.delivery.impl.paid_insurance.d;
import ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.b;
import ru.yandex.taxi.logistics.sdk.management.f;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;
import ru.yandex.taxi.masstransit.experiment.e;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes.dex */
public final class m19 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public m19(nl9 nl9Var, eqh eqhVar, nl9 nl9Var2) {
        this.a = 5;
        this.c = nl9Var;
        this.b = eqhVar;
        this.d = nl9Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        xvf0 xvf0Var3 = this.d;
        switch (i) {
            case 0:
                return new zsa(4, (v7n) xvf0Var2.get(), (pw) xvf0Var3, (z0j) xvf0Var.get());
            case 1:
                return new j49((wiq0) xvf0Var2.get(), (nux0) ((abx0) xvf0Var3).get(), (ck31) xvf0Var.get());
            case 2:
                return new ea9((a3g) xvf0Var, i5m.a((a3g) xvf0Var3), (oep0) xvf0Var2.get());
            case 3:
                return new kl9((xdf) xvf0Var2.get(), (j5a) xvf0Var.get(), (a) ((cg7) xvf0Var3).get());
            case 4:
                return new y4c0(xvf0Var2, (i6r) xvf0Var.get(), (gw7) xvf0Var3, 3);
            case 5:
                return new c((em9) ((nl9) xvf0Var).get(), (y4g0) xvf0Var2.get(), (ysa) ((nl9) xvf0Var3).get());
            case 6:
                return new zsa(0, xvf0Var2, (fva0) xvf0Var.get(), (dm9) ((fr3) xvf0Var3).get());
            case 7:
                return new ru.yandex.taxi.masstransit.geopayment.checkout.a((w030) xvf0Var2.get(), (Context) xvf0Var.get(), (e) ((g430) xvf0Var3).get());
            case 8:
                return new b((AppVisibilitySubscriptionImpl) xvf0Var2.get(), (u7i) xvf0Var.get(), (cot) ((gw7) xvf0Var3).get());
            case 9:
                return new ypc((nqc) ((n3w) xvf0Var2).a, (p1b) ((x2b) xvf0Var).get(), (vbb) ((x2b) xvf0Var3).get());
            case 10:
                return new eqe((xzq0) xvf0Var2.get(), (ru.yandex.taxi.preorder.source.userposition.repository.a) xvf0Var.get(), (gp50) ((y500) xvf0Var3).get());
            case 11:
                return new iue((cda0) xvf0Var2.get(), (n3a) ((kyd) xvf0Var3).get(), (ic4) xvf0Var.get());
            case 12:
                return new com.yandex.go.payments.shared.antifraud.ui.a((on2) xvf0Var2.get(), (yfa) ((kyd) xvf0Var3).get(), (h) xvf0Var.get());
            case 13:
                return new com.yandex.go.payments.cards.ui.e((com.yandex.go.payments.cards.data.a) ((aj0) xvf0Var3).get(), (l9z) xvf0Var2.get(), (q0) xvf0Var.get());
            case 14:
                dqe0 dqe0Var = (dqe0) xvf0Var2.get();
                c400 c400Var = (c400) ((kqz) xvf0Var3).get();
                return new khg(dqe0Var, c400Var);
            case 15:
                return new wwf((zxs0) ((rmv0) xvf0Var3).get(), (rvx0) xvf0Var2.get(), (yy80) xvf0Var.get());
            case 16:
                return new da0(7, (w030) xvf0Var2.get(), (yy80) xvf0Var.get(), (wwf) ((m19) xvf0Var3).get());
            case 17:
                return new com.yandex.go.analytics.b((g) ((jk0) xvf0Var3).get(), (ac20) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 18:
                return new rlh((Context) xvf0Var2.get(), (String) xvf0Var.get(), (ofg) ((w8g) xvf0Var3).get());
            case 19:
                return new ru.yandex.taxi.analytics.referrer.c((c3w) xvf0Var2.get(), (exc0) xvf0Var.get(), (s66) ((ziv) xvf0Var3).get());
            case 20:
                return new ru.yandex.taxi.deeplinks.g((as21) xvf0Var2.get(), (zf) ((zzg) xvf0Var3).get(), (ac20) xvf0Var.get());
            case 21:
                return new ru.yandex.taxi.favorites.rides.delete_modal.domain.a((Context) xvf0Var2.get(), (ru.yandex.taxi.favorites.rides.delete_modal.data.a) xvf0Var.get(), (aip) ((p9p) xvf0Var3).get());
            case 22:
                return new muh(i5m.a((cuo) xvf0Var3), (iy11) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 23:
                return new vxh((xw91) ((z5i) xvf0Var3).get(), (z0j) xvf0Var2.get(), i5m.a(xvf0Var));
            case 24:
                return new q1i((dfj0) ((lcw) xvf0Var3).get(), (cda0) xvf0Var2.get(), (amc) xvf0Var.get());
            case 25:
                return new oci((ici) ((lyh) xvf0Var3).get(), (lci) xvf0Var2.get(), (wiq0) xvf0Var.get());
            case 26:
                return new gei((f) xvf0Var2.get(), (tt2) xvf0Var.get(), (ru.yandex.taxi.delivery.b) ((lyh) xvf0Var3).get());
            case 27:
                return new wwf((gsi) ((r2i) xvf0Var3).get(), (lvp0) xvf0Var2.get(), (dni) xvf0Var.get());
            case 28:
                return new d((ygi) ((nma) xvf0Var3).get(), (hit) xvf0Var2.get(), (dne0) xvf0Var.get());
            default:
                return new yli((bzi0) ((n4g0) xvf0Var3).get(), (czi0) xvf0Var2.get(), (wiq0) xvf0Var.get());
        }
    }

    public /* synthetic */ m19(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.d = v7pVar;
        this.c = xvf0Var2;
    }

    public /* synthetic */ m19(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public /* synthetic */ m19(v7p v7pVar, xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.d = v7pVar;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    public m19(a3g a3gVar, a3g a3gVar2, a3g a3gVar3) {
        this.a = 2;
        this.c = a3gVar;
        this.d = a3gVar2;
        this.b = a3gVar3;
    }
}
