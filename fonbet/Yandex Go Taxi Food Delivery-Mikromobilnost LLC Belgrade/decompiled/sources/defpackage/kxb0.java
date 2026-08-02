package defpackage;

import android.content.Context;
import com.squareup.moshi.Moshi;
import com.yandex.go.places.address.loader.impl.domain.interactors.a;
import com.yandex.go.plus.api.model.PlusBrandType;
import com.yandex.plus.glide.b;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.pin.internal.network.PinApi;
import com.ybsdk.feature.qr.payments.internal.network.QrPaymentsApi;
import com.ybsdk.feature.qr.payments.internal.screens.list.presentation.QrSubscriptionsListFragment;
import com.ybsdk.feature.rebind.payment.internal.network.RebindPaymentMethodApi;
import com.ybsdk.network.CorpCardPciDssApi;
import com.ybsdk.screens.registration.data.auth.MkkCashout2faApi;
import java.util.Locale;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.progress_bar.c;
import ru.yandex.taxi.masstransit.geopayment.qrscan.experiment.e;
import ru.yandex.taxi.plus.sdk.Environment;
import ru.yandex.taxi.summary.requirements.list.interactors.y;

/* loaded from: classes13.dex */
public final class kxb0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ kxb0(sdd0 sdd0Var, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return (PinApi) ((t0k0) ((p5g) xvf0Var).get()).b(PinApi.class);
            case 1:
                return new a((atd0) ((q5g) xvf0Var).get());
            case 2:
                return new s6c0((yz4) ((y4g) xvf0Var).get());
            case 3:
                return new vr((Context) ((n5g) xvf0Var).get(), (char) 0);
            case 4:
                return new q6c0((fva0) ((n5g) xvf0Var).get());
            case 5:
                return new nac0((ip11) ((z4g) xvf0Var).get());
            case 6:
                return new com.yandex.go.places.impl.data.repositories.bookings.a((bl80) ((f380) xvf0Var).get());
            case 7:
                ((r5g) xvf0Var).get();
                PlusBrandType plusBrandType = PlusBrandType.YANDEX;
                q5z.i(plusBrandType);
                return plusBrandType;
            case 8:
                ((r5g) xvf0Var).get();
                Environment environment = Environment.PRODUCTION;
                q5z.i(environment);
                return environment;
            case 9:
                return new b((Context) ((r5g) xvf0Var).get());
            case 10:
                final ko21 ko21Var = (ko21) ((r5g) xvf0Var).get();
                return new p5z() { // from class: rdd0
                    @Override // defpackage.p5z
                    public final Locale getLocale() {
                        return ko21.this.a().a;
                    }
                };
            case 11:
                return new nee0((Moshi) ((rbg) xvf0Var).get());
            case 12:
                return new nw70(27, (y) ((xv8) xvf0Var).get());
            case 13:
                return new com.ybsdk.feature.main.internal.data.network.b((w530) ((u2g) xvf0Var).get());
            case 14:
                return new c((p070) ((lq40) xvf0Var).get());
            case 15:
                return new v5c0(14, (bu0) ((so4) xvf0Var).get());
            case 16:
                return new x7g0((v5c0) ((y7g0) xvf0Var).get());
            case 17:
                return (QrPaymentsApi) ((t0k0) ((c6g) xvf0Var).get()).b(QrPaymentsApi.class);
            case 18:
                return new ebg0((Context) ((c6g) xvf0Var).get());
            case 19:
                return new xcg0((Context) ((p5g) xvf0Var).get());
            case 20:
                return new dfg0((e) ((y501) xvf0Var).get());
            case 21:
                return new m04((AppAnalyticsReporter) ((p5g) xvf0Var).get());
            case 22:
                return new QrSubscriptionsListFragment((vfg0) xvf0Var);
            case 23:
                return new com.ybsdk.feature.qr.payments.internal.screens.list.data.a((QrPaymentsApi) ((kxb0) xvf0Var).get());
            case 24:
                return new ljg0((lx4) ((i9g) xvf0Var).get());
            case 25:
                return (RebindPaymentMethodApi) ((t0k0) ((c6g) xvf0Var).get()).b(RebindPaymentMethodApi.class);
            case 26:
                return (CorpCardPciDssApi) ((t0k0) ((r960) ((k6g) xvf0Var).get()).a.get()).b(CorpCardPciDssApi.class);
            case 27:
                return (MkkCashout2faApi) ((t0k0) ((k6g) xvf0Var).get()).b(MkkCashout2faApi.class);
            case 28:
                return new ewi0((zuj0) ((w0g) xvf0Var).get());
            default:
                return new m8h((jwh) ((l6g) xvf0Var).get());
        }
    }

    public /* synthetic */ kxb0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
