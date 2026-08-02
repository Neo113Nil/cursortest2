package defpackage;

import android.content.Context;
import com.squareup.moshi.Moshi;
import com.yandex.delivery.utils.dialogmanager.impl.b;
import com.yandex.messaging.div.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditDepositFragment;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationFragment;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.c;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.circle_input.d;
import ru.yandex.taxi.delivery.cost_details.DeliveryCostDetailsModalView;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.l;
import ru.yandex.taxi.requirements.interactor.e0;
import ru.yandex.taxi.superapp.address.f;

/* loaded from: classes5.dex */
public final class f2b implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ f2b(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new a((sml) ((bzf) xvf0Var3).get(), (w3i) ((bzf) xvf0Var2).get(), (Moshi) ((bzf) xvf0Var).get());
            case 1:
                return new h6b((o1b0) xvf0Var3.get(), (p150) ((q150) xvf0Var2).get(), (ch60) xvf0Var.get());
            case 2:
                return new sk7(16, (tt2) xvf0Var3.get(), (e0) ((sb1) xvf0Var2).get(), (p1b) ((dx9) xvf0Var).get());
            case 3:
                return new ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.data.a(i5m.a(xvf0Var3), (bsb) ((srb) xvf0Var2).get(), ((prb) ((xxf) xvf0Var).b.b).a);
            case 4:
                return new ptb((kcz0) ((flx0) xvf0Var3).get(), (j00) ((c1) xvf0Var2).get(), (l) ((ii9) xvf0Var).get());
            case 5:
                return new d((ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a) xvf0Var3.get(), (p070) ((lq40) xvf0Var2).get(), (ao6) ((bo6) xvf0Var).get());
            case 6:
                return new sk7(18, (Context) xvf0Var3.get(), (f3c) xvf0Var2.get(), (r4t) ((k1w) xvf0Var).get());
            case 7:
                return new com.yandex.go.yb.domain.a((tse) xvf0Var3.get(), (fw51) xvf0Var2.get(), (a5c) ((pcg) xvf0Var).get());
            case 8:
                return new CodeConfirmationFragment((t9c) ((n3w) xvf0Var3).a, (j9c) ((k9c) xvf0Var2).get(), (fj3) ((k6g) xvf0Var).get());
            case 9:
                return new c((f4l0) xvf0Var3.get(), (is0) ((js0) xvf0Var2).get(), (b) xvf0Var.get());
            case 10:
                return new an8((zuj0) xvf0Var3.get(), (gu11) xvf0Var2.get(), (rqo) ((u0g) xvf0Var).get());
            case 11:
                return new com.yandex.go.taxi.order.search.overlay.companions.b((ah00) ((i9g) xvf0Var3).get(), (o2y0) ((n3w) xvf0Var2).a, (com.yandex.go.taxi.order.search.overlay.companions.a) ((mu7) xvf0Var).get());
            case 12:
                return new zsa(8, (Context) ((yxf) xvf0Var3).get(), (tj60) ((yxf) xvf0Var2).get(), (pav) ((yxf) xvf0Var).get());
            case 13:
                return new com.yandex.go.places.complaint.impl.domain.interactors.a((d3a) ((qzb) xvf0Var3).get(), (k7x0) ((yxf) xvf0Var2).get(), (pwy0) ((yxf) xvf0Var).get());
            case 14:
                com.yandex.fintechsdk.data.config.impl.internal.datasources.network.requesters.payment.applink.a aVar = (com.yandex.fintechsdk.data.config.impl.internal.datasources.network.requesters.payment.applink.a) ((njp) xvf0Var3).get();
                com.yandex.fintechsdk.data.config.impl.internal.datasources.network.requesters.payment.paymentkit.a aVar2 = (com.yandex.fintechsdk.data.config.impl.internal.datasources.network.requesters.payment.paymentkit.a) ((xat) xvf0Var2).get();
                ((xat) xvf0Var).get();
                return new com.yandex.fintechsdk.data.config.impl.internal.datasources.network.a(aVar, aVar2);
            case 15:
                return new sk7(22, (f) xvf0Var3.get(), (hgn) ((szf) xvf0Var2).get(), (h1p) xvf0Var.get());
            case 16:
                return new sk7(24, (htg) ((exf) xvf0Var3).get(), (boj0) ((ncb) xvf0Var2).get(), (u1n) ((k0n) xvf0Var).get());
            case 17:
                return new jpe((zgf) ((f1g) xvf0Var3).get(), (zuj0) xvf0Var2.get(), (sit0) xvf0Var);
            case 18:
                return new sk7(25, (com.yandex.go.taxi.order.cost_center.b) xvf0Var3.get(), (ru.yandex.taxi.costcenters.ride.c) xvf0Var2.get(), (dxe) ((srb) xvf0Var).get());
            case 19:
                return new sk7(26, (gyc) ((srb) xvf0Var3).get(), (zwe) ((g0g) xvf0Var2).get(), (wiq0) ((w0g) xvf0Var).get());
            case 20:
                return new i2f((Context) ((n3w) xvf0Var3).a, (ah00) ((i9g) xvf0Var2).get(), (xm00) ((j9g) xvf0Var).get());
            case 21:
                return new CreditDepositFragment((ebf) ((n3w) xvf0Var3).a, (ca41) ((oxf) xvf0Var2).get(), (y9f) ((xea) xvf0Var).get());
            case 22:
                return new ej1(3, (w030) ((u6g) xvf0Var3).get(), (dmf) xvf0Var2.get(), (hmf) ((n3w) xvf0Var).a);
            case 23:
                return new jhg((vdc) xvf0Var3.get(), (m4v) ((xat) xvf0Var2).get(), (gd3) xvf0Var.get());
            case 24:
                return new com.ybsdk.feature.dashboard.internal.domain.interactor.a((yig) ((oxf) xvf0Var3).get(), (com.ybsdk.feature.dashboard.internal.data.c) ((epf) xvf0Var2).get(), (com.ybsdk.common.a) ((oxf) xvf0Var).get());
            case 25:
                return new wwf((tv3) ((byf) xvf0Var3).get(), (a3h) ((ayf) xvf0Var2).get(), (AppAnalyticsReporter) ((ayf) xvf0Var).get());
            case 26:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.domain.b((Context) ((n3w) xvf0Var3).a, (b) ((gbg) xvf0Var2).get(), (fza0) ((gbg) xvf0Var).get());
            case 27:
                return new fhh((Context) xvf0Var3.get(), (fva0) xvf0Var2.get(), (ghh) ((zfa) xvf0Var).get());
            case 28:
                return new wwf((String) xvf0Var3.get(), (gzh) xvf0Var2.get(), (zgf) ((gmh) xvf0Var).get());
            default:
                return new DeliveryCostDetailsModalView((Context) ((ywf) xvf0Var3).get(), (e2i) xvf0Var2.get(), (t1i) xvf0Var.get());
        }
    }
}
