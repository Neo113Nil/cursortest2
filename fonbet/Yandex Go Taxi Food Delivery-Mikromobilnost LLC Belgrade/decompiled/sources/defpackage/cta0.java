package defpackage;

import android.app.Activity;
import android.content.Context;
import com.squareup.moshi.Moshi;
import com.yandex.go.pickup_from_photo.data.c;
import com.yandex.go.pickup_from_photo.experiment.p;
import com.yandex.go.places.map.data.repositories.i;
import com.yandex.go.safety.center.SafetyCenterApi;
import com.yandex.go.taxi.order.map.o;
import com.yandex.go.taxi.order.map.r;
import com.yandex.go.timer.k;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.QrPaymentsMainFragment;
import com.ybsdk.feature.transactions.impl.data.network.TransactionsApi;
import com.ybsdk.network.Api;
import ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui.d;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.b;
import ru.yandex.taxi.summary.personalaction.notification.a;
import ru.yandex.taxi.summary.personalaction.popup.e;

/* loaded from: classes14.dex */
public final class cta0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public cta0(ze zeVar, ze zeVar2, zfa zfaVar, ibz0 ibz0Var, xvf0 xvf0Var) {
        this.a = 9;
        this.f = zeVar;
        this.c = zeVar2;
        this.d = zfaVar;
        this.e = ibz0Var;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.b;
        xvf0 xvf0Var5 = this.f;
        switch (i) {
            case 0:
                ((nbg) xvf0Var5).get();
                TransactionsApi transactionsApi = (TransactionsApi) xvf0Var4.get();
                return new bta0(transactionsApi);
            case 1:
                return new nta0((n5t0) xvf0Var4.get(), (at2) xvf0Var3.get(), (Moshi) xvf0Var2.get(), i5m.a(xvf0Var), (l7q0) ((m7q0) xvf0Var5).get());
            case 2:
                return new a((Context) xvf0Var4.get(), (aq80) ((vqa0) xvf0Var5).get(), (ru.yandex.taxi.personalstate.data.remote.a) xvf0Var3.get(), (c4r0) xvf0Var2.get(), (qpt0) xvf0Var.get());
            case 3:
                return new e((tt2) xvf0Var4.get(), (dx) xvf0Var3.get(), (q150) xvf0Var5, (n3b0) xvf0Var2.get(), (oep0) xvf0Var.get());
            case 4:
                return new c((on2) xvf0Var4.get(), (tt2) xvf0Var3.get(), (p) xvf0Var2.get(), (umb0) ((qta0) xvf0Var5).get(), (vmb0) xvf0Var.get());
            case 5:
                return new com.yandex.go.places.impl.data.repositories.map.layer.a((bl80) xvf0Var4.get(), (com.yandex.go.places.map.data.mappers.a) xvf0Var3.get(), (i) xvf0Var2.get(), (qfc0) xvf0Var.get(), (nfc0) ((vm80) xvf0Var5).get());
            case 6:
                return new mvd0((com.yandex.go.taxi.order.map.route.a) xvf0Var4.get(), (o2y0) xvf0Var3.get(), (yay0) xvf0Var2.get(), (dgi0) xvf0Var.get(), (igi0) ((jpf0) xvf0Var5).get());
            case 7:
                return new com.yandex.messaging.ui.pollinfo.a((com.yandex.messaging.internal.avatar.a) xvf0Var4.get(), (vse) xvf0Var3.get(), (r770) ((n3w) xvf0Var5).a, (wwd0) ((n3w) xvf0Var).a, (rp21) xvf0Var2.get());
            case 8:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.poll.c((String) xvf0Var4.get(), (itq) ((t9n) xvf0Var5).get(), (b) ((mzf) xvf0Var3).get(), (ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e) ((mzf) xvf0Var2).get(), (st2) ((gbg) xvf0Var).get());
            case 9:
                return new gpf0((cs) ((ze) xvf0Var5).get(), (cs) ((ze) xvf0Var3).get(), (wwf) ((zfa) xvf0Var2).get(), (kcz0) ((ibz0) xvf0Var).get(), (wpf0) xvf0Var4.get());
            case 10:
                return new com.yandex.messaging.ui.reactions.a((Activity) xvf0Var4.get(), (dfj) ((faj) xvf0Var5).get(), (wwf) ((ywf) xvf0Var2).get(), (sfl0) xvf0Var3.get(), (i2b) ((jde0) xvf0Var).get());
            case 11:
                return new QrPaymentsMainFragment((k9g0) ((n3w) xvf0Var5).a, (qag0) ((c6g) xvf0Var4).get(), (z7g0) ((c6g) xvf0Var3).get(), (pbg0) ((c6g) xvf0Var2).get(), (anp0) ((c6g) xvf0Var).get());
            case 12:
                return new fkg0((Context) ((n3w) xvf0Var5).a, (tj60) ((j9g) xvf0Var4).get(), (pm5) ((of7) xvf0Var3).get(), (ru.yandex.taxi.widget.utils.e) ((j9g) xvf0Var2).get(), (tt2) ((i9g) xvf0Var).get());
            case 13:
                return new com.ybsdk.screens.registration.data.c((Api) ((c6g) xvf0Var5).get(), (k03) ((k6g) xvf0Var4).get(), (a3h) ((k6g) xvf0Var3).get(), (AppAnalyticsReporter) ((k6g) xvf0Var2).get(), (com.ybsdk.utils.poller.b) ((k6g) xvf0Var).get());
            case 14:
                return new d((com.yandex.go.delivery.rental_duration_selector.e) ((m6g) xvf0Var5).get(), (gzi0) ((m6g) xvf0Var4).b.a, (s9n) ((jzi0) xvf0Var3).get(), (czi0) ((l6g) xvf0Var2).get(), (m8h) ((kxb0) xvf0Var).get());
            case 15:
                return new fcj0((Context) ((t0g) xvf0Var5).get(), (wbj0) xvf0Var4.get(), (ecj0) ((n3w) xvf0Var).a, (f580) xvf0Var3.get(), (i130) xvf0Var2.get());
            case 16:
                return new nej0((wiq0) ((w0g) xvf0Var5).get(), (ldj0) ((ii9) xvf0Var2).get(), (ajj0) xvf0Var4.get(), (biv0) ((b1g) xvf0Var).get(), (zuj0) xvf0Var3.get());
            case 17:
                return new ajj0((xcv0) xvf0Var4.get(), (w421) xvf0Var3.get(), (dqe0) ((w0g) xvf0Var5).get(), (uih) xvf0Var2.get(), (wiq0) ((w0g) xvf0Var).get());
            case 18:
                return new djj0((dqe0) ((w0g) xvf0Var5).get(), (wiq0) ((w0g) xvf0Var4).get(), (cjj0) ((my0) xvf0Var3).get(), (ru.yandex.taxi.orderforanother.repository.a) ((v0g) xvf0Var2).get(), (hqj0) ((a1g) xvf0Var).get());
            case 19:
                return new npj0((roj0) xvf0Var4.get(), (ru.yandex.taxi.orderforanother.repository.a) ((v0g) xvf0Var5).get(), (zuj0) xvf0Var3.get(), (tt2) xvf0Var2.get(), (vfx0) xvf0Var.get());
            case 20:
                return new com.yandex.go.taxi.order.details.v2.domain.a11y.b((Context) ((r6g) xvf0Var5).get(), (o2y0) xvf0Var4.get(), (com.yandex.go.taxi.order.details.v2.domain.a11y.e) xvf0Var3.get(), (com.yandex.go.taxi.order.details.v2.domain.a11y.c) ((jpj0) xvf0Var).get(), (tt2) xvf0Var2.get());
            case 21:
                return new com.yandex.go.taxi.order.details.v2.state.elements.companion.a((ru.yandex.taxi.widget.c) xvf0Var4.get(), (com.yandex.go.taxi.order.details.v2.state.elements.companion.animation.a) ((nck0) xvf0Var5).get(), (com.yandex.go.taxi.order.details.v2.state.elements.companion.icon.a) ((n7i0) xvf0Var).get(), (crg) xvf0Var3.get(), (k) xvf0Var2.get());
            case 22:
                return new com.yandex.go.taxi.order.details.v2.state.elements.driver.avatar.a((ggk0) ((jpj0) xvf0Var5).get(), (zuj0) ((t6g) xvf0Var4).get(), (pwy0) ((u6g) xvf0Var3).get(), (jgv) ((s6g) xvf0Var2).get(), (Context) ((r6g) xvf0Var).get());
            case 23:
                return new xkk0((w030) ((t6g) xvf0Var5).get(), i5m.a(xvf0Var4), i5m.a(xvf0Var3), (ix70) ((zni0) xvf0Var2).get(), i5m.a((s3f0) xvf0Var));
            case 24:
                return new com.yandex.go.taxi.order.details.v2.state.elements.status.a((irs0) ((u6g) xvf0Var5).get(), (sqs0) xvf0Var4.get(), (k) ((u6g) xvf0Var3).get(), (crg) ((r6g) xvf0Var2).get(), (pdc) ((r6g) xvf0Var).get());
            case 25:
                return new ktk0((tse) xvf0Var4.get(), (ah00) xvf0Var3.get(), (o) ((jzi0) xvf0Var5).get(), (tt2) xvf0Var2.get(), (r) ((n7i0) xvf0Var).get());
            case 26:
                return new com.yandex.go.safety.center.analytics.a((ppl0) ((ggl0) xvf0Var5).get(), (SafetyCenterApi) xvf0Var4.get(), (ru.yandex.taxi.am.k) ((b7g) xvf0Var).get(), i5m.a(xvf0Var3), (tt2) xvf0Var2.get());
            case 27:
                return new com.ybsdk.feature.savings.internal.helpers.a((nbp0) ((g7g) xvf0Var5).get(), (com.ybsdk.feature.savings.internal.data.b) ((q150) xvf0Var3).get(), (com.ybsdk.feature.savings.internal.interactors.d) xvf0Var4.get(), (g5) ((g7g) xvf0Var2).get(), (AppAnalyticsReporter) ((g7g) xvf0Var).get());
            case 28:
                return new com.ybsdk.feature.sbp.old.internal.screens.a((com.ybsdk.feature.sbp.old.internal.data.a) ((jzi0) xvf0Var5).get(), (j3h) ((g7g) xvf0Var4).get(), (com.ybsdk.widgets.common.shimmer.b) ((g7g) xvf0Var3).get(), (vfc0) ((g7g) xvf0Var2).get(), (tfl0) ((g7g) xvf0Var).get());
            default:
                return new ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scalable_selector.c((u3s) ((n3w) xvf0Var5).a, (ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scalable_selector.b) ((qy8) xvf0Var4).get(), (hwy0) ((gxf) xvf0Var3).get(), (p6s) ((p1g) xvf0Var2).get(), (sae) ((srb) xvf0Var).get());
        }
    }

    public /* synthetic */ cta0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.f = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
        this.e = xvf0Var5;
    }

    public /* synthetic */ cta0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i, byte b) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.f = xvf0Var3;
        this.d = xvf0Var4;
        this.e = xvf0Var5;
    }

    public /* synthetic */ cta0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i, char c) {
        this.a = i;
        this.f = xvf0Var;
        this.b = xvf0Var2;
        this.e = xvf0Var3;
        this.c = xvf0Var4;
        this.d = xvf0Var5;
    }

    public /* synthetic */ cta0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.f = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
        this.e = xvf0Var5;
    }

    public /* synthetic */ cta0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, v7p v7pVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = v7pVar;
    }

    public cta0(r6g r6gVar, n3w n3wVar, t6g t6gVar, jpj0 jpj0Var, r6g r6gVar2) {
        this.a = 20;
        this.f = r6gVar;
        this.b = n3wVar;
        this.c = t6gVar;
        this.e = jpj0Var;
        this.d = r6gVar2;
    }

    public cta0(n3w n3wVar, faj fajVar, ywf ywfVar, xvf0 xvf0Var, jde0 jde0Var) {
        this.a = 10;
        this.b = n3wVar;
        this.f = fajVar;
        this.d = ywfVar;
        this.c = xvf0Var;
        this.e = jde0Var;
    }

    public cta0(z4g z4gVar, z4g z4gVar2, qta0 qta0Var, qta0 qta0Var2, xvf0 xvf0Var) {
        this.a = 4;
        this.b = z4gVar;
        this.c = z4gVar2;
        this.d = qta0Var;
        this.f = qta0Var2;
        this.e = xvf0Var;
    }

    public cta0(zbg zbgVar, ybg ybgVar, n3w n3wVar, n3w n3wVar2, acg acgVar) {
        this.a = 7;
        this.b = zbgVar;
        this.c = ybgVar;
        this.f = n3wVar;
        this.e = n3wVar2;
        this.d = acgVar;
    }

    public cta0(s6g s6gVar, nck0 nck0Var, n7i0 n7i0Var, r6g r6gVar, u6g u6gVar) {
        this.a = 21;
        this.b = s6gVar;
        this.f = nck0Var;
        this.e = n7i0Var;
        this.c = r6gVar;
        this.d = u6gVar;
    }

    public cta0(g7g g7gVar, q150 q150Var, xvf0 xvf0Var, g7g g7gVar2, g7g g7gVar3) {
        this.a = 27;
        this.f = g7gVar;
        this.c = q150Var;
        this.b = xvf0Var;
        this.d = g7gVar2;
        this.e = g7gVar3;
    }

    public cta0(w0g w0gVar, ii9 ii9Var, cta0 cta0Var, b1g b1gVar, w0g w0gVar2) {
        this.a = 16;
        this.f = w0gVar;
        this.d = ii9Var;
        this.b = cta0Var;
        this.e = b1gVar;
        this.c = w0gVar2;
    }
}
