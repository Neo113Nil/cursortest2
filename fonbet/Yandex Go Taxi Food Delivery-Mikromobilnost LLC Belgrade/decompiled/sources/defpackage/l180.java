package defpackage;

import com.google.common.collect.ImmutableMap;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.go.order.tariffs_suggest.api.ChangeTariffsApi;
import com.yandex.go.payments.cards.domainverification.data.f;
import com.yandex.go.payments.paymentdomain.data.d;
import com.yandex.go.places.experiments.walkroute.b;
import com.yandex.go.taxi.order.repositories.c;
import com.ybsdk.feature.partnerselection.internal.data.a;
import com.ybsdk.feature.partnerselection.internal.network.PartnerSelectionApi;
import com.ybsdk.feature.passes.widget.internal.data.PassesWidgetApi;
import com.ybsdk.feature.paymentsdk.internal.screens.PaymentSdkFragment;
import ru.yandex.taxi.TaxiApplication;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes12.dex */
public final class l180 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ l180(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static l180 a(eqh eqhVar) {
        return new l180(eqhVar, 23);
    }

    public static l180 b(xvf0 xvf0Var) {
        return new l180(xvf0Var, 24);
    }

    public static l180 c(eqh eqhVar) {
        return new l180(eqhVar, 25);
    }

    public static l180 d(eqh eqhVar) {
        return new l180(eqhVar, 26);
    }

    public static l180 e(eqh eqhVar) {
        return new l180(eqhVar, 28);
    }

    public static tc9 f(tw51 tw51Var) {
        int i = 12;
        return new tc9(new fja0(), ImmutableMap.g(PaymentSdkFragment.class, new g680((xvf0) new qx5(n3w.a(tw51Var), jja0.a, i), (xvf0) new j3g(tw51Var, 26), i)));
    }

    public static zn90 g(DefaultEnvironment defaultEnvironment) {
        int i = in90.a[defaultEnvironment.ordinal()];
        if (i == 1) {
            return new zn90("3RG+HIeU586EDZPuhy2N/3TNfUTcqDmt8d9FnPsIUyEKAHqMWG3f6izV3+JaKz6r", "iR7kStfGsZmDC5Gxh32JrHWddbWDGndwaM36N1Oq5AxUYW/VrUZfgHMlTFzjDENf");
        }
        if (i == 2) {
            return new zn90("3BvkGoLGv8jSC8bth3+JrSRloyBpQU17tp/+IZm5Fw4INwzn0cC5WS6i95aEhSha", "2x3iGtec4JyGXJS7hyvar3XEa3lpfwtq9WIIzKX5tWovl06+zun9qMVLxppp/7le");
        }
        w511.b();
        return null;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 3;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new co40((pho) xvf0Var.get());
            case 1:
                return new i380((g8k0) xvf0Var.get());
            case 2:
                return new v380((iu6) xvf0Var.get());
            case 3:
                return new v7j((dne0) xvf0Var.get(), 1);
            case 4:
                return new y480((gs70) xvf0Var.get());
            case 5:
                return new lz70(i2, (oh70) xvf0Var.get());
            case 6:
                return new yj70((yxx0) xvf0Var.get());
            case 7:
                on2 on2Var = (on2) xvf0Var.get();
                on2Var.getClass();
                ChangeTariffsApi changeTariffsApi = (ChangeTariffsApi) on2Var.a(GoApiName.TaxiV4, ChangeTariffsApi.class);
                q5z.i(changeTariffsApi);
                return changeTariffsApi;
            case 8:
                return new b((rqo) xvf0Var.get());
            case 9:
                return new al80((on2) xvf0Var.get());
            case 10:
                return new go80((yac0) xvf0Var.get());
            case 11:
                return new kip((rqo) xvf0Var.get(), 3);
            case 12:
                return new da90((c) xvf0Var.get());
            case 13:
                return new yj70((o5s) xvf0Var.get());
            case 14:
                return new a((PartnerSelectionApi) xvf0Var.get());
            case 15:
                return new com.ybsdk.feature.passes.widget.internal.b((PassesWidgetApi) xvf0Var.get());
            case 16:
                return (dn90) ((t70) xvf0Var.get()).a(dn90.class, "com.yandex.fintechsdk.adapters.passport.sdk.impl.PassportAdapterFactory");
            case 17:
                return (dn90) ((t70) xvf0Var.get()).a(dn90.class, "com.yandex.fintechsdk.adapters.passport.sdk.impl.PassportAdapterFactory");
            case 18:
                return g((DefaultEnvironment) xvf0Var.get());
            case 19:
                TaxiApplication taxiApplication = (TaxiApplication) xvf0Var.get();
                ko21 userLocalePreferences = taxiApplication.getUserLocalePreferences(taxiApplication);
                q5z.i(userLocalePreferences);
                return userLocalePreferences;
            case 20:
                return new wo90((sl3) xvf0Var.get());
            case 21:
                return new ax90((j770) xvf0Var.get());
            case 22:
                return new vyc((ax90) xvf0Var.get());
            case 23:
                return new vy90((pho) xvf0Var.get());
            case 24:
                return new wy90((umx) xvf0Var.get());
            case 25:
                return new ez90((ac20) xvf0Var.get());
            case 26:
                return new d((on2) xvf0Var.get());
            case 27:
                return new aq80((icv0) xvf0Var.get());
            case 28:
                return new f((on2) xvf0Var.get());
            default:
                return f((tw51) xvf0Var.get());
        }
    }
}
