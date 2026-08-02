package defpackage;

import android.content.Context;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.go.navigator.domain.t;
import com.yandex.go.navigator.driving.c;
import com.yandex.go.places.experiments.map.map_as_main_places.b;
import com.yandex.go.places.impl.ui.main.e;
import com.yandex.go.summary.interactor.anchored.state.content.l;
import com.yandex.payment.divkit.usecases.j;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.divkit.internal.data.DivApi;
import com.ybsdk.feature.status.screen.internal.ui.DivkitCommonFragment;
import ru.yandex.taxi.delivery.impl.paid_insurance.d;
import ru.yandex.taxi.delivery.impl.paid_insurance.requirement.a;
import ru.yandex.taxi.due_selector.impl.domain.interactor.price.f;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.summary.solid.interactor.p;

/* loaded from: classes5.dex */
public final class pgi implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public pgi(wzk wzkVar, czf czfVar, czf czfVar2, xvf0 xvf0Var) {
        this.a = 14;
        this.c = czfVar;
        this.d = czfVar2;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new a((d) xvf0Var3.get(), (rgi) ((bpf) xvf0Var2).get(), (ygi) ((nma) xvf0Var).get());
            case 1:
                return new zii((wiq0) xvf0Var3.get(), (lx4) xvf0Var2.get(), (nji0) ((jde0) xvf0Var).get());
            case 2:
                return new hvi((wiq0) ((gyf) xvf0Var2).get(), (lx4) ((fyf) xvf0Var).get(), (vsi) xvf0Var3.get());
            case 3:
                return new ovi((vsi) ((n3w) xvf0Var3).a, (ru.yandex.taxi.logistics.delivery_form.repository.a) ((fyf) xvf0Var2).get(), (i47) ((gmh) xvf0Var).get());
            case 4:
                return new com.yandex.go.taxi.order.detailed_price.data.a((ky2) ((zyf) xvf0Var3).get(), (tt2) ((zyf) xvf0Var2).get(), (on2) ((zyf) xvf0Var).get());
            case 5:
                return new p4j((o2y0) xvf0Var3.get(), (lx4) xvf0Var2.get(), (co40) ((t160) xvf0Var).get());
            case 6:
                return new wwf((String) xvf0Var3.get(), (gzh) xvf0Var2.get(), (j0g) ((oti) xvf0Var).get());
            case 7:
                return new wwf((z22) ((twf) xvf0Var2).get(), (qbj) ((twf) xvf0Var).get(), (FlexAdapter) xvf0Var3.get());
            case 8:
                return new l((wiq0) ((w0g) xvf0Var3).get(), (p) ((so4) xvf0Var2).get(), (ru.yandex.taxi.summary.promotions.interactor.a) ((t4v0) xvf0Var).get());
            case 9:
                return new e((tt2) xvf0Var3.get(), (ftj) xvf0Var2.get(), (b) ((h0z) xvf0Var).get());
            case 10:
                return new qwj((tt2) xvf0Var3.get(), (i) ((y4g) xvf0Var2).get(), (com.yandex.go.route.interactor.b) xvf0Var.get());
            case 11:
                return new ook((com.ybsdk.feature.educations.internal.domain.a) xvf0Var3.get(), (dpn) ((byf) xvf0Var2).get(), (AppAnalyticsReporter) ((byf) xvf0Var).get());
            case 12:
                return new j((m93) xvf0Var3.get(), (com.yandex.payment.divkit.common.a) ((elo0) xvf0Var2).get(), (u2l) xvf0Var.get());
            case 13:
                return new ryk((h2b) xvf0Var3.get(), (com.yandex.messaging.div.a) xvf0Var2.get(), (lqo) ((bzf) xvf0Var).get(), new q9y());
            case 14:
                t0k0 t0k0Var = (t0k0) ((czf) xvf0Var2).get();
                return new com.ybsdk.feature.divkit.internal.domain.b((DivApi) t0k0Var.b(DivApi.class), (com.ybsdk.utils.poller.b) ((czf) xvf0Var).get(), (xou) xvf0Var3.get());
            case 15:
                return new DivkitCommonFragment((qsl) ((n3w) xvf0Var3).a, (sb6) ((gmh) xvf0Var2).get(), (zon) ((byf) xvf0Var).get());
            case 16:
                return new c((c9v) ((f9t) xvf0Var2).get(), (t) xvf0Var3.get(), (com.yandex.go.navigator.domain.jam_forecast.a) ((prq) xvf0Var).get());
            case 17:
                return new vjm((tt2) xvf0Var3.get(), (Context) xvf0Var2.get(), (ru.yandex.taxi.widget.utils.e) ((k4g) xvf0Var).get());
            case 18:
                return new wjm((sl3) ((twf) xvf0Var2).get(), (tum) xvf0Var3.get(), (FlexAdapter) xvf0Var.get());
            case 19:
                return new f((com.yandex.go.taxi.tariffs.repository.a) ((izf) xvf0Var2).get(), (lwm) xvf0Var3.get(), (vwm) ((gwm) xvf0Var).get());
            case 20:
                return new sym((Context) ((fzf) xvf0Var2).get(), (wiq0) ((jzf) xvf0Var).get(), (com.yandex.go.due_timetable.experiment.d) xvf0Var3.get());
            case 21:
                return new yym((l0n) xvf0Var3.get(), (ote0) xvf0Var2.get(), (wiq0) ((jzf) xvf0Var).get());
            case 22:
                return new q0n((zuj0) ((jzf) xvf0Var3).get(), (j4n) ((qrb) xvf0Var2).get(), (i47) ((pg5) xvf0Var).get());
            case 23:
                return new com.yandex.go.eboks.objects.data.b((ru.yandex.taxi.widget.utils.e) ((kzf) xvf0Var2).get(), (pwy0) ((kzf) xvf0Var).get(), (zhn) xvf0Var3.get());
            case 24:
                return new com.yandex.go.eboks.objects.ui.a((ah00) ((kzf) xvf0Var3).get(), (vin) ((qrb) xvf0Var2).get(), (com.yandex.go.eboks.objects.domain.c) ((qx5) xvf0Var).get());
            case 25:
                pkb0 pkb0Var = (pkb0) ((lzf) xvf0Var2).get();
                y4a0 y4a0Var = new y4a0((elb0) xvf0Var3.get(), (ru.yandex.taxi.logistics.photocomment.c) ((lzf) xvf0Var).get(), false, 8);
                pzf pzfVar = pkb0Var.a;
                pzfVar.getClass();
                return new wwf(pzfVar, y4a0Var, (ekb0) dkb0.a).c();
            case 26:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.data.a((ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) ((mzf) xvf0Var2).get(), (st2) ((lzf) xvf0Var).get(), (elb0) xvf0Var3.get());
            case 27:
                return new jdj(16, (r3o) xvf0Var3.get(), (wbt0) xvf0Var2.get(), (wae0) ((g680) xvf0Var).get());
            case 28:
                return new g7o((c7o) ((nzf) xvf0Var3).get(), (htg) ((ozf) xvf0Var2).get(), (z6o) ((nzf) xvf0Var).get());
            default:
                return new bf8(1, (com.yandex.go.taxi.summary.router.a) xvf0Var3.get(), (wiq0) ((w0g) xvf0Var2).get(), (voo) ((q02) xvf0Var).get());
        }
    }

    public /* synthetic */ pgi(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, byte b) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
        this.d = xvf0Var3;
    }

    public /* synthetic */ pgi(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, boolean z) {
        this.a = i;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.b = xvf0Var3;
    }

    public /* synthetic */ pgi(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public pgi(rxk rxkVar, m7q0 m7q0Var, elo0 elo0Var, xvf0 xvf0Var) {
        this.a = 12;
        this.b = m7q0Var;
        this.c = elo0Var;
        this.d = xvf0Var;
    }
}
