package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.accessibility.a;
import com.yandex.go.address.address_map_picker.domain.f;
import com.yandex.go.address.address_map_picker.domain.g;
import com.yandex.go.payments.acceptance.domain.d;
import com.yandex.go.payments.data.PaymentMethodsApi;
import com.yandex.go.payments.domain.i;
import com.yandex.go.payments.domain.i0;
import com.yandex.go.payments.domain.z;
import com.yandex.go.payments.shared.b;
import com.yandex.go.payments.shared.business.b1;
import com.yandex.go.taxi.order.change.source.data.e;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.location.user.c;
import ru.yandex.taxi.systemrequeirements.location.n;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;

/* loaded from: classes8.dex */
public final class ee implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public ee(xvf0 xvf0Var, fn5 fn5Var, fn5 fn5Var2, xvf0 xvf0Var2) {
        this.a = 15;
        this.b = xvf0Var;
        this.e = fn5Var;
        this.d = fn5Var2;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new de((ie) ((x) xvf0Var).get(), (je) xvf0Var4.get(), (Context) xvf0Var3.get(), (w030) xvf0Var2.get());
            case 1:
                return new d((tse) xvf0Var4.get(), (oep0) xvf0Var3.get(), (oe) xvf0Var, (qe) xvf0Var2.get());
            case 2:
                return new a((Context) xvf0Var4.get(), (tse) xvf0Var3.get(), (Lifecycle) xvf0Var2.get(), (cug) ((im21) xvf0Var).get());
            case 3:
                return new ul((k) xvf0Var4.get(), (fhz) xvf0Var3.get(), (p370) ((jc60) xvf0Var).get(), (vo90) xvf0Var2.get());
            case 4:
                return new com.yandex.go.profile.domain.divkit.variables.a(i5m.a((i5g) xvf0Var), i5m.a((u5g) xvf0Var4), i5m.a((u5g) xvf0Var3), i5m.a((i5g) xvf0Var2));
            case 5:
                return new com.yandex.go.payments.domain.a((rqo) xvf0Var4.get(), (b) xvf0Var3.get(), (s59) ((p9p) xvf0Var).get(), (due) ((kyd) xvf0Var2).get());
            case 6:
                return new f((g) xvf0Var4.get(), (ry0) xvf0Var3.get(), (uo21) xvf0Var2.get(), (gl) ((t4) xvf0Var).get());
            case 7:
                return new g((tt) ((o01) xvf0Var).get(), (ru.yandex.taxi.preorder.source.pickup.a) xvf0Var4.get(), (ah00) xvf0Var3.get(), (tt2) xvf0Var2.get());
            case 8:
                return new ru.yandex.taxi.superapp.orders.multi.a((svd0) ((yn51) xvf0Var).get(), (c) xvf0Var4.get(), (com.yandex.go.route.interactor.c) xvf0Var3.get(), (com.yandex.go.zone.interactors.b) xvf0Var2.get());
            case 9:
                return new o41((com.yandex.go.mainscreen.superapp.impl.fragment.a) xvf0Var4.get(), (f01) xvf0Var3.get(), (pl) xvf0Var, (hnb0) xvf0Var2.get());
            case 10:
                return new ru.yandex.taxi.layers.source.factory.componentfactory.g((Context) ((m2g) xvf0Var).get(), (pdc) ((m2g) xvf0Var4).get(), (ru.yandex.taxi.map_common.map.utils.a) ((n2g) xvf0Var3).get(), (pwy0) ((n2g) xvf0Var2).get());
            case 11:
                return new com.yandex.delivery.utils.auth.impl.a((st2) xvf0Var4.get(), i5m.a(xvf0Var3), (ijz) xvf0Var2.get(), i5m.a((dby0) xvf0Var));
            case 12:
                return new com.yandex.go.payments.cards.pci_dss.recognition.a((tst) xvf0Var4.get(), (k421) xvf0Var3.get(), (wp4) xvf0Var2.get(), (v7j0) ((gwb0) xvf0Var).get());
            case 13:
                return new i((fga0) xvf0Var4.get(), (z) ((ec80) xvf0Var).get(), (hit) xvf0Var3.get(), (PaymentMethodsApi) xvf0Var2.get());
            case 14:
                return new ru.yandex.taxi.communications.benefitscenter.b((Context) xvf0Var4.get(), (tse) xvf0Var3.get(), (ru.yandex.taxi.communications.benefitscenter.a) ((fn5) xvf0Var).get(), (tj60) xvf0Var2.get());
            case 15:
                return new com.yandex.go.ads.mobile_ads_sdk.domain.a((tse) xvf0Var4.get(), (cp5) ((fn5) xvf0Var).get(), (vit) ((fn5) xvf0Var2).get(), (ums0) xvf0Var3.get());
            case 16:
                return new l46((zuj0) xvf0Var4.get(), (tt2) xvf0Var3.get(), (me0) ((zzg) xvf0Var).get(), (nf7) xvf0Var2.get());
            case 17:
                return new ej6((o61) ((e4f) xvf0Var).get(), (o61) ((nl9) xvf0Var4).get(), (b1) ((e4f) xvf0Var3).get(), (pj) ((kyd) xvf0Var2).get());
            case 18:
                return new com.yandex.go.payments.shared.business.c((fw6) xvf0Var4.get(), (b1) ((p7r0) xvf0Var).get(), (i0) xvf0Var3.get(), (rw6) ((fn5) xvf0Var2).get());
            case 19:
                return new o48((lg21) xvf0Var4.get(), (aye0) ((zof0) xvf0Var).get(), (n20) xvf0Var3.get(), (MainUiAvailabilityMonitor) xvf0Var2.get());
            case 20:
                return new com.yandex.go.taxi.order.change.source.interactor.b((n) xvf0Var4.get(), (po21) xvf0Var3.get(), (e) xvf0Var2.get(), (d821) ((x7y0) xvf0Var).get());
            case 21:
                return new com.yandex.go.taxi.order.change.source.interactor.d((oep0) xvf0Var4.get(), (com.yandex.go.taxi.order.change.source.interactor.b) xvf0Var3.get(), (hc9) xvf0Var2.get(), (l3e) xvf0Var);
            case 22:
                return new com.yandex.go.chargers.payments.domain.c((tse) xvf0Var4.get(), (jma) xvf0Var3.get(), (com.yandex.go.chargers.payments.data.a) xvf0Var2.get(), (vit) ((nl9) xvf0Var).get());
            case 23:
                return new com.yandex.go.chargers.payments.domain.d((tse) xvf0Var4.get(), (tt2) xvf0Var3.get(), (com.yandex.go.payments.superapp.payment.b) ((le30) xvf0Var).get(), (cxq0) ((fr3) xvf0Var2).get());
            case 24:
                return new com.yandex.go.charity.a((tzd) xvf0Var4.get(), (yfa) ((nl9) xvf0Var).get(), xvf0Var3, (gf41) xvf0Var2.get());
            case 25:
                return new brb((d800) ((v7p) xvf0Var).get(), (zuj0) xvf0Var4.get(), (rv70) xvf0Var3.get(), (z9p) xvf0Var2.get());
            case 26:
                return new com.yandex.go.copter.city_tour.b((tt2) xvf0Var4.get(), (Context) xvf0Var3.get(), i5m.a((pw) xvf0Var), (w030) xvf0Var2.get());
            case 27:
                return new mjc((c29) ((qzb) xvf0Var).get(), (c4r0) xvf0Var4.get(), (wiq0) xvf0Var3.get(), (b8r) xvf0Var2.get());
            case 28:
                return new tzd((itx) xvf0Var4.get(), (ru.yandex.taxi.am.g) xvf0Var3.get(), (fn21) xvf0Var2.get(), (com.yandex.go.charity.js.a) ((nl9) xvf0Var).get());
            default:
                return new y4c0(xvf0Var4, xvf0Var3, (l01) xvf0Var2.get(), (pw) xvf0Var);
        }
    }

    public /* synthetic */ ee(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.e = v7pVar;
        this.d = xvf0Var3;
    }

    public /* synthetic */ ee(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = v7pVar;
    }

    public /* synthetic */ ee(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.e = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
    }

    public /* synthetic */ ee(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.e = v7pVar;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }
}
