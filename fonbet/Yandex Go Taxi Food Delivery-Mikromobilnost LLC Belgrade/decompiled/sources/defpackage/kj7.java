package defpackage;

import android.content.Context;
import com.yandex.go.call_order_fallback.domain.c;
import com.yandex.go.call_order_fallback.experiments.b;
import com.yandex.go.chargers.attention.data.e;
import com.yandex.go.morphlex.action.change_requirement.f;
import com.yandex.messaging.ui.settings.calls.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.card.internal.network.CardApi;
import com.ybsdk.feature.card.internal.network.PciDssCardApi;
import com.ybsdk.feature.cashback.impl.network.CashbackApi;
import ru.yandex.taxi.logistics.sdk.tracking.impl.change_datetime.ui.d;
import ru.yandex.taxi.order.view.CarDescriptionTextView;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;

/* loaded from: classes12.dex */
public final class kj7 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ kj7(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
        this.d = xvf0Var3;
    }

    public static kj7 a(xvf0 xvf0Var, xvf0 xvf0Var2, lu9 lu9Var) {
        return new kj7(xvf0Var, xvf0Var2, (xvf0) lu9Var, 26, (char) 0);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new c((b) ((ig7) xvf0Var).get(), (hay0) xvf0Var3.get(), (tt2) xvf0Var2.get());
            case 1:
                return new a((m2v) ((cg7) xvf0Var).get(), (wdz) ((ivo0) xvf0Var2).get(), (ney0) xvf0Var3.get());
            case 2:
                ((b3g) xvf0Var).get();
                return new sq7();
            case 3:
                return new com.yandex.go.taxi.order.cancel.reasons.interactor.a((hx7) xvf0Var3.get(), (tt2) ((xwf) xvf0Var).get(), (o2y0) ((n3w) xvf0Var2).a);
            case 4:
                return new CarDescriptionTextView((Context) xvf0Var3.get(), (t58) ((ig7) xvf0Var).get(), (nf7) xvf0Var2.get());
            case 5:
                return new com.yandex.go.navigator.map_interactions.parkings.c((dne0) xvf0Var3.get(), (com.yandex.go.navigator.map_interactions.experiment.a) xvf0Var2.get(), (com.yandex.go.navigator.map_interactions.parkings.analytics.a) ((t4) xvf0Var).get());
            case 6:
                return new com.ybsdk.feature.card.internal.interactors.b((com.ybsdk.feature.card.internal.repositories.b) ((kj7) xvf0Var).get(), (ua8) ((owf) xvf0Var3).get(), (com.ybsdk.di.modules.features.b) ((owf) xvf0Var2).get());
            case 7:
                com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network.requesters.bininfo.a aVar = (com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network.requesters.bininfo.a) ((kt5) xvf0Var).get();
                ((h1t) xvf0Var3).get();
                return new com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network.a(aVar, (com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network.requesters.tokenize.a) ((kt5) xvf0Var2).get());
            case 8:
                return new bf8(0, (dqe0) ((w0g) xvf0Var).get(), (cda0) ((v0g) xvf0Var3).get(), (d770) ((v0g) xvf0Var2).get());
            case 9:
                CardApi cardApi = (CardApi) xvf0Var3.get();
                PciDssCardApi pciDssCardApi = (PciDssCardApi) xvf0Var2.get();
                ((owf) xvf0Var).get();
                return new com.ybsdk.feature.card.internal.repositories.b(cardApi, pciDssCardApi);
            case 10:
                return new ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.c((oq7) xvf0Var3.get(), i5m.a((cys0) xvf0Var), (st2) ((exf) xvf0Var2).get());
            case 11:
                ((exf) xvf0Var).get();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.c cVar = (ru.yandex.logistics.sdk.cargo_form.impl.ui.c) ((xv8) xvf0Var3).get();
                nv8 nv8Var = (nv8) ((n3w) xvf0Var2).a;
                return new aoi(cVar, nv8Var.a, nv8Var.b);
            case 12:
                return new com.ybsdk.feature.cashback.impl.repositiories.a((CashbackApi) xvf0Var3.get(), (AppAnalyticsReporter) ((owf) xvf0Var).get(), (c49) ((pg5) xvf0Var2).get());
            case 13:
                return new ca9((z4g) xvf0Var, (com.yandex.go.route.interactor.b) ((y4g) xvf0Var2).get(), (oep0) xvf0Var3.get());
            case 14:
                return new ma9((Context) ((mxf) xvf0Var).get(), (d) xvf0Var3.get(), (hwy0) ((mxf) xvf0Var2).get());
            case 15:
                return new oa9((String) xvf0Var3.get(), (gzh) xvf0Var2.get(), (c29) ((ba9) xvf0Var).get());
            case 16:
                return new com.yandex.go.taxi.order.change.due.domain.a((tt2) xvf0Var3.get(), (com.yandex.go.taxi.order.change.due.data.repository.a) ((ba9) xvf0Var).get(), (com.yandex.go.taxi.order.change.common.domain.d) ((t6g) xvf0Var2).get());
            case 17:
                return new f((dqe0) xvf0Var3.get(), (b8r) xvf0Var2.get(), (RequirementsChangedNotifier) ((r3g) xvf0Var).get());
            case 18:
                return new com.yandex.go.taxi.order.change.requirements.interactor.a((tt2) xvf0Var3.get(), (com.yandex.go.taxi.order.change.common.domain.d) xvf0Var2.get(), (com.yandex.go.taxi.order.change.requirements.repository.a) ((ig7) xvf0Var).get());
            case 19:
                return new e((wnt) xvf0Var3.get(), (tt2) ((lxf) xvf0Var).get(), (ru.yandex.taxi.widget.c) xvf0Var2.get());
            case 20:
                return new com.yandex.go.chargers.misc.authorization.c(xvf0Var3, xvf0Var2, (com.yandex.go.chargers.misc.authorization.a) ((dx7) xvf0Var).get());
            case 21:
                return new com.yandex.go.chargers.offer.domain.c((com.yandex.go.chargers.error.data.a) xvf0Var3.get(), (c06) ((mu7) xvf0Var).get(), (com.yandex.go.chargers.data.a) xvf0Var2.get());
            case 22:
                return new sk7(10, (tt2) ((lxf) xvf0Var).get(), (com.yandex.go.chargers.error.a) xvf0Var3.get(), (pwy0) ((qxf) xvf0Var2).get());
            case 23:
                return new zsa(6, xvf0Var3, xvf0Var2, (k4a) xvf0Var);
            case 24:
                return new com.yandex.go.chargers.orchestrator_user_events.domain.b((tt2) ((lxf) xvf0Var).get(), (com.yandex.go.chargers.orchestrator_user_events.domain.a) xvf0Var3.get(), (bo5) ((lu9) xvf0Var2).get());
            case 25:
                return new com.yandex.go.chargers.payments.navigation.a((po21) xvf0Var3.get(), (tla) ((pxf) xvf0Var).get(), (com.yandex.go.chargers.payments.data.a) xvf0Var2.get());
            case 26:
                return new ana((tt2) xvf0Var3.get(), (pwy0) xvf0Var2.get(), (bna) ((lu9) xvf0Var).get());
            case 27:
                return new com.yandex.go.chargers.order.completion.pre_finish.data.a((k7x0) ((qxf) xvf0Var).get(), (ru.yandex.taxi.widget.utils.e) xvf0Var3.get(), (ru.yandex.taxi.widget.c) xvf0Var2.get());
            case 28:
                return new sk7(13, (tst) ((pxf) xvf0Var).get(), (k421) ((pxf) xvf0Var3).get(), (aye0) ((qxf) xvf0Var2).get());
            default:
                return new com.yandex.go.chargers.qr.f((joa) xvf0Var3.get(), (v7j0) xvf0Var2.get(), (d3a) ((lu9) xvf0Var).get());
        }
    }

    public /* synthetic */ kj7(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, byte b) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    public /* synthetic */ kj7(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, char c) {
        this.a = i;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.c = xvf0Var3;
    }

    public /* synthetic */ kj7(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, boolean z) {
        this.a = i;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.b = xvf0Var3;
    }
}
