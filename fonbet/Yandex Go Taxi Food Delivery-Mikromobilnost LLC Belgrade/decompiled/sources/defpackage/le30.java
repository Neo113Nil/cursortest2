package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.payments.addmethod.data.BindUniversalPaymentMethodApi;
import com.yandex.go.payments.data.c;
import com.yandex.go.payments.domain.i0;
import com.yandex.go.payments.sbp.data.e;
import com.yandex.go.taxi.order.y;
import com.yandex.go.yb.data.u;
import com.yandex.go.zone.interactors.b;
import com.yandex.go.zone.repository.o;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentMethodsFilter;
import com.yandex.payment.sdk.model.data.AdditionalSettings;
import com.yandex.payment.sdk.ui.DefaultTheme;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.rconfig.configs.HostsWithPciDss;
import ru.yandex.taxi.address.d;
import ru.yandex.taxi.am.f0;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.experiments.p;
import ru.yandex.taxi.masstransit.experiment.a;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;

/* loaded from: classes9.dex */
public final class le30 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public le30(fx50 fx50Var, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, w7u w7uVar) {
        this.a = 3;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = w7uVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        ksi0 a;
        ksi0 a2;
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.c;
        xvf0 xvf0Var4 = this.b;
        switch (i) {
            case 0:
                return new a((b) xvf0Var4.get(), (po21) xvf0Var3.get(), (o) xvf0Var2.get(), (tu30) xvf0Var.get());
            case 1:
                return new com.yandex.go.payments.transport.domain.a((po21) xvf0Var4.get(), (qr30) xvf0Var3.get(), (lz30) xvf0Var2.get(), (n6a0) xvf0Var.get());
            case 2:
                Context context = (Context) xvf0Var4.get();
                c0a0 c0a0Var = (c0a0) xvf0Var3.get();
                g gVar = (g) xvf0Var2.get();
                vp21 vp21Var = (vp21) xvf0Var.get();
                kj Ig = gVar.a.Ig();
                String b = gVar.b();
                if (Ig == null || b == null) {
                    Payer payer = new Payer("", null, "", null, null, ((h) vp21Var).Og());
                    Merchant merchant = new Merchant("transport_payment_1ce163f7af7d64eea2728f0fcdd2c4da");
                    AdditionalSettings.a aVar = new AdditionalSettings.a();
                    aVar.e();
                    aVar.g(new PaymentMethodsFilter(false, false, false, false, true, true, 15, null));
                    a = c0a0Var.a(payer, merchant, aVar.a(), qje.s(xng0.themeDarkMode, context) ? DefaultTheme.DARK : DefaultTheme.LIGHT, null);
                    return a;
                }
                Payer payer2 = new Payer(b, Ig.g, String.valueOf(Ig.a), Ig.e, Ig.f, ((h) vp21Var).Og());
                AdditionalSettings.a aVar2 = new AdditionalSettings.a();
                aVar2.e();
                aVar2.g(new PaymentMethodsFilter(false, false, false, false, true, true, 15, null));
                a2 = c0a0Var.a(payer2, new Merchant("transport_payment_1ce163f7af7d64eea2728f0fcdd2c4da"), aVar2.a(), qje.s(xng0.themeDarkMode, context) ? DefaultTheme.DARK : DefaultTheme.LIGHT, null);
                return a2;
            case 3:
                w4o w4oVar = (w4o) xvf0Var4.get();
                return new com.ybsdk.network.okhttp.interceptors.b(new HostsWithPciDss(w4oVar.a, w4oVar.b, w4oVar.c), (AppAnalyticsReporter) xvf0Var3.get(), (dj4) xvf0Var2.get(), (csu) xvf0Var.get());
            case 4:
                return new d((rqo) xvf0Var4.get(), (tse) xvf0Var3.get(), (tt2) xvf0Var2.get(), i5m.a(xvf0Var));
            case 5:
                return new ru.yandex.taxi.settings.handlers.a((wnt) xvf0Var.get(), i5m.a(xvf0Var4), i5m.a(xvf0Var3), i5m.a(xvf0Var2));
            case 6:
                return new ru.yandex.taxi.am.token.internal.b((ru.yandex.taxi.am.token.internal.a) xvf0Var4.get(), (po60) xvf0Var3.get(), (ru11) xvf0Var2.get(), (mo60) xvf0Var.get());
            case 7:
                return new u670(xvf0Var4, (jc00) xvf0Var3.get(), (mf4) xvf0Var2.get(), (ra00) xvf0Var.get());
            case 8:
                return new os70((ps70) xvf0Var4.get(), (clk0) xvf0Var3.get(), i5m.a(xvf0Var2), (jc00) xvf0Var.get());
            case 9:
                return new com.yandex.go.places.impl.navigation.a((oep0) xvf0Var4.get(), xvf0Var3, (rfc0) xvf0Var2.get(), xvf0Var);
            case 10:
                return new com.yandex.go.overdraft.experiments.b(i5m.a(xvf0Var4), (hd) xvf0Var3.get(), (tse) xvf0Var2.get(), (com.yandex.go.lifecycle.a) xvf0Var.get());
            case 11:
                return new com.yandex.go.parks.interactor.a((mxf0) xvf0Var4.get(), (zuj0) xvf0Var3.get(), (tt2) xvf0Var2.get(), (ae61) xvf0Var.get());
            case 12:
                return new f28((Context) xvf0Var4.get(), (tse) xvf0Var3.get(), (w030) xvf0Var2.get(), i5m.a(xvf0Var));
            case 13:
                return new f0((k) xvf0Var4.get(), (u02) xvf0Var3.get(), (ep90) xvf0Var2.get(), (mrj0) xvf0Var.get());
            case 14:
                return new ru.yandex.taxi.am.internal.g((Context) xvf0Var4.get(), (y50) xvf0Var3.get(), (ru.yandex.taxi.activity.g) xvf0Var2.get(), (ep90) xvf0Var.get());
            case 15:
                return new com.yandex.go.payments.superapp.payment.b(i5m.a(xvf0Var4), (cy90) xvf0Var3.get(), (vyz) xvf0Var2.get(), (a30) xvf0Var.get());
            case 16:
                return new c1a0((z0a0) xvf0Var4.get(), (a2a0) xvf0Var3.get(), i5m.a(xvf0Var2), (tse) xvf0Var.get());
            case 17:
                return new g8a0((fga0) xvf0Var4.get(), i5m.a(xvf0Var3), (wiq0) xvf0Var2.get(), (zy51) xvf0Var.get());
            case 18:
                return new zaa0((rqo) xvf0Var4.get(), (u) xvf0Var3.get(), (lw90) xvf0Var2.get(), (yla0) xvf0Var.get());
            case 19:
                return new i0((o) xvf0Var4.get(), (dqe0) xvf0Var3.get(), (acz) xvf0Var2.get(), (b) xvf0Var.get());
            case 20:
                return new e((BindUniversalPaymentMethodApi) xvf0Var4.get(), (cda0) xvf0Var3.get(), (fga0) xvf0Var2.get(), (c) xvf0Var.get());
            case 21:
                return new usa0(i5m.a(xvf0Var4), i5m.a(xvf0Var3), (MainUiAvailabilityMonitor) xvf0Var2.get(), (y) xvf0Var.get());
            case 22:
                return new ru.yandex.taxi.persuggest.api.a((tt2) xvf0Var4.get(), (bva0) xvf0Var3.get(), (blh) xvf0Var2.get(), (on2) xvf0Var.get());
            case 23:
                return new fva0((e270) xvf0Var4.get(), (czf0) xvf0Var3.get(), (ru.yandex.taxi.perf.b) xvf0Var2.get(), (jua0) xvf0Var.get());
            case 24:
                return new p((wnt) xvf0Var4.get(), (tt2) xvf0Var3.get(), (dlw0) xvf0Var2.get(), (wku0) xvf0Var.get());
            case 25:
                return new z2b0((b03) xvf0Var4.get(), (j5z) xvf0Var3.get(), (dne0) xvf0Var2.get(), (wnt) xvf0Var.get());
            case 26:
                return new wdz();
            case 27:
                return new ru.yandex.taxi.personalstate.domain.interactor.h((ru.yandex.taxi.personalstate.domain.o) xvf0Var4.get(), (tt2) xvf0Var3.get(), (tse) xvf0Var2.get(), (Lifecycle) xvf0Var.get());
            case 28:
                Context context2 = (Context) xvf0Var4.get();
                ibq0 ibq0Var = (ibq0) xvf0Var3.get();
                return new qfb0(context2, ibq0Var, (whu) xvf0Var.get());
            default:
                return new com.yandex.go.agreement.photoupload.c((Lifecycle) xvf0Var4.get(), (tse) xvf0Var3.get(), (o) xvf0Var2.get(), (com.yandex.go.agreement.photoupload.a) xvf0Var.get());
        }
    }

    public /* synthetic */ le30(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }
}
