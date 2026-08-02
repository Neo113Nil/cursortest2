package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.collect.ImmutableMap;
import com.yandex.go.safety.center.m;
import com.yandex.go.taxi.order.details.v2.state.elements.decorations.e;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.rebind.payment.internal.domain.a;
import com.ybsdk.feature.rebind.payment.internal.screens.RebindPaymentMethodFragment;
import com.ybsdk.feature.redirect.url.internal.presentation.RedirectUrlFragment;
import com.ybsdk.feature.savings.internal.screens.close.deposit.SavingsAccountCloseDepositFragment;
import com.ybsdk.utils.poller.b;
import ru.yandex.taxi.requirements.interactor.x;
import ru.yandex.taxi.settings.model.PushSettingsOpenReason;

/* loaded from: classes14.dex */
public final class jpf0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final Object c;

    public /* synthetic */ jpf0(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    public static tc9 a(yli0 yli0Var, tw51 tw51Var) {
        return new tc9(ImmutableMap.g(RedirectUrlFragment.class, new jpf0((xvf0) n3w.a(new fmi0(new kdd0(new c6g(tw51Var, 22), new c6g(tw51Var, 26), new c6g(tw51Var, 24), new c6g(tw51Var, 25)))), (xvf0) new c6g(tw51Var, 23), 12)), 8);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        Object obj = this.c;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new ipf0((a630) xvf0Var.get(), (u8w) ((upk0) obj).get());
            case 1:
                return new b3g0((u8w) ((jde0) xvf0Var).get(), (PushSettingsOpenReason) ((n3w) obj).a);
            case 2:
                return new yxf0((c3g0) ((a6g) xvf0Var).get(), (g4g0) ((eqf0) obj).get());
            case 3:
                return new o8g0((x7g0) ((kxb0) xvf0Var).get(), (lag0) ((jpf0) obj).get());
            case 4:
                return new lag0((fbg0) ((y7g0) xvf0Var).get(), (v5c0) ((y7g0) obj).get());
            case 5:
                return new eeg0((d411) xvf0Var.get(), (aye0) ((jde0) obj).get());
            case 6:
                return new sue0((wbz0) ((p6f) obj).get(), (SharedPreferences) xvf0Var.get());
            case 7:
                return new yxf0((xzd) xvf0Var.get(), (sue0) ((jpf0) obj).get());
            case 8:
                return new RebindPaymentMethodFragment((hfi0) ((n3w) xvf0Var).a, (ca41) ((c6g) obj).get());
            case 9:
                return new a((com.ybsdk.feature.rebind.payment.internal.data.a) ((jde0) xvf0Var).get(), (b) ((c6g) obj).get());
            case 10:
                return new igi0((k0b0) ((v4g) obj).get(), (dgi0) xvf0Var.get());
            case 11:
                return a((yli0) obj, (tw51) xvf0Var.get());
            case 12:
                return new RedirectUrlFragment((ami0) ((n3w) xvf0Var).a, (xli0) ((c6g) obj).get());
            case 13:
                return new vaj0((l8i) xvf0Var.get(), (t8i) ((u0g) obj).get());
            case 14:
                return new ru.yandex.taxi.ui.form.constructor.a((lcj0) xvf0Var.get(), (vbj0) ((w0g) obj).get());
            case 15:
                return new sjc(2, (fcj0) ((cta0) obj).get(), (ro0) xvf0Var.get());
            case 16:
                return new x((g580) xvf0Var.get(), (ijj0) ((npe0) obj).get());
            case 17:
                return new epj0((Context) xvf0Var.get(), i5m.a((oto0) obj));
            case 18:
                return new bqj0((dqe0) ((w0g) xvf0Var).get(), (zuj0) ((w0g) obj).get());
            case 19:
                return new com.ybsdk.feature.resolver.internal.interactors.a((com.ybsdk.feature.resolver.internal.data.a) ((zni0) xvf0Var).get(), (zqi0) ((u1g) obj).get());
            case 20:
                return new com.yandex.go.taxi.order.details.v2.state.elements.promoblock.a((ru.yandex.taxi.communications.data.a) ((r6g) xvf0Var).get(), (qpf0) ((t6g) obj).get());
            case 21:
                return new com.yandex.go.taxi.order.details.v2.state.elements.decorations.a((e) ((jpj0) obj).get(), (pwy0) xvf0Var.get());
            case 22:
                return new com.yandex.go.taxi.order.details.v2.state.elements.feedback.question.a((o2y0) xvf0Var.get(), (com.yandex.go.taxi.order.feedback.domain.a) ((s6g) obj).get());
            case 23:
                return new com.yandex.go.taxi.order.details.v2.state.elements.generic.a((xjk0) ((p8k0) obj).get(), (pdc) xvf0Var.get());
            case 24:
                return new com.yandex.go.taxi.order.details.v2.analytics.perf.a((tt2) xvf0Var.get(), (mlk0) ((jpf0) obj).get());
            case 25:
                return new mlk0((lx4) ((r6g) xvf0Var).get(), (yxx0) ((u6g) obj).get());
            case 26:
                return new m((ru.yandex.taxi.stories.domain.b) ((c7g) xvf0Var).get(), (dqe0) ((c7g) obj).get());
            case 27:
                return new o8g0((AppAnalyticsReporter) ((g7g) xvf0Var).get(), (com.ybsdk.feature.savings.internal.data.b) ((q150) obj).get());
            case 28:
                return new SavingsAccountCloseDepositFragment((h3m0) ((n3w) xvf0Var).a, (w530) ((g7g) obj).get());
            default:
                return new u6m0((Context) ((k6g) xvf0Var).get(), (w530) ((g7g) obj).get());
        }
    }

    public /* synthetic */ jpf0(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = xvf0Var;
    }
}
