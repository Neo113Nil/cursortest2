package defpackage;

import com.yandex.go.net.taxi.dto.response.CanMakeMoreOrders;
import com.yandex.go.overdraft.data.model.PaymentState;
import com.yandex.go.payments.api.shared.model.PaymentSummaryEntryPoints;
import com.yandex.go.payments.badges.PaymentMethodsBadgesExperiment;
import com.yandex.go.payments.badges.PaymentMethodsBadgesExperiment$AddPaymentBadge$$serializer;
import com.yandex.go.payments.badges.PaymentMethodsBadgesExperiment$Badge$$serializer;
import com.yandex.go.payments.badges.d;
import com.yandex.go.payments.data.model.PaymentMethodsParams;
import com.yandex.go.payments.data.model.b0;
import com.yandex.go.payments.experiments.PaymentMethodsServiceExperiment;
import com.yandex.go.payments.experiments.PaymentMethodsServiceExperiment$PaymentMethodsService$$serializer;
import com.yandex.go.payments.experiments.c;
import com.yandex.go.payments.experiments.e;
import com.yandex.go.payments.paymentlist.experiments.PaymentMethodsAddButtonExperiment;
import com.yandex.go.payments.paymentlist.experiments.PaymentMethodsCashIconExperiment;
import com.yandex.go.payments.paymentlist.experiments.PaymentMethodsCashIconExperiment$CurrencyDescription$$serializer;
import com.yandex.go.payments.paymentlist.experiments.PaymentMethodsCustomSubtitlesExperiment;
import com.yandex.go.payments.paymentlist.experiments.PaymentMethodsCustomSubtitlesExperiment$PaymentMethodsDescription$$serializer;
import com.yandex.go.payments.paymentlist.experiments.p;
import com.yandex.go.payments.paymentlist.experiments.r;
import com.yandex.go.payments.paymentlist.experiments.s;
import com.yandex.go.payments.paymentlist.experiments.t;
import com.yandex.go.payments.promo.PaymentMethodsPromoBannerExperiment;
import com.yandex.go.payments.promo.PaymentMethodsPromoBannerExperiment$PromoBannerDto$$serializer;
import com.yandex.go.payments.promo.a;
import com.yandex.go.payments_widgets.section.payments.PaymentWidgetsDataDto;
import flex.section.divkit.DivkitSnippet;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.requirements.models.net.PersistenceTypeDto;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public final /* synthetic */ class f9a0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ f9a0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                p pVar = PaymentMethodsAddButtonExperiment.Companion;
                return PaymentMethodsAddButtonExperiment.PaymentMethodsAddButtonPosition.Companion.serializer();
            case 1:
                return vez0.g("com.yandex.go.payments.paymentlist.experiments.PaymentMethodsAddButtonExperiment.PaymentMethodsAddButtonPosition", PaymentMethodsAddButtonExperiment.PaymentMethodsAddButtonPosition.values(), new String[]{"list", "footer"}, new Annotation[][]{null, null});
            case 2:
                d dVar = PaymentMethodsBadgesExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 3:
                d dVar2 = PaymentMethodsBadgesExperiment.Companion;
                return new p53(PaymentMethodsBadgesExperiment$Badge$$serializer.INSTANCE, 0);
            case 4:
                d dVar3 = PaymentMethodsBadgesExperiment.Companion;
                return new p53(PaymentMethodsBadgesExperiment$AddPaymentBadge$$serializer.INSTANCE, 0);
            case 5:
                r rVar = PaymentMethodsCashIconExperiment.Companion;
                return new k8u(auu0.a, PaymentMethodsCashIconExperiment$CurrencyDescription$$serializer.INSTANCE, 1);
            case 6:
                s sVar = PaymentMethodsCashIconExperiment.CurrencyDescription.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 7:
                t tVar = PaymentMethodsCustomSubtitlesExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 8:
                t tVar2 = PaymentMethodsCustomSubtitlesExperiment.Companion;
                return new p53(PaymentMethodsCustomSubtitlesExperiment$PaymentMethodsDescription$$serializer.INSTANCE, 0);
            case 9:
                b0 b0Var = PaymentMethodsParams.Companion;
                return new p53(auu0.a, 0);
            case 10:
                a aVar = PaymentMethodsPromoBannerExperiment.Companion;
                return new p53(PaymentMethodsPromoBannerExperiment$PromoBannerDto$$serializer.INSTANCE, 0);
            case 11:
                a aVar2 = PaymentMethodsPromoBannerExperiment.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, auu0Var4, 1);
            case 12:
                c cVar = PaymentMethodsServiceExperiment.Companion;
                return new p53(PaymentMethodsServiceExperiment$PaymentMethodsService$$serializer.INSTANCE, 0);
            case 13:
                return vez0.g("com.yandex.go.payments.experiments.PaymentMethodsServiceExperiment.LpmEntryPoint", PaymentMethodsServiceExperiment.LpmEntryPoint.values(), new String[]{"debts", TariffOrderFlow.ORDER_FLOW_DRIVE_KEY, "profile", "ride", null}, new Annotation[][]{null, null, null, null, null});
            case 14:
                e eVar = PaymentMethodsServiceExperiment.PaymentMethodsService.Companion;
                return PaymentMethodsServiceExperiment.LpmEntryPoint.Companion.serializer();
            case 15:
                e eVar2 = PaymentMethodsServiceExperiment.PaymentMethodsService.Companion;
                return PaymentMethodsServiceExperiment.ServiceEndpoint.Companion.serializer();
            case 16:
                return vez0.g("com.yandex.go.payments.experiments.PaymentMethodsServiceExperiment.ServiceEndpoint", PaymentMethodsServiceExperiment.ServiceEndpoint.values(), new String[]{"list_payment_methods", "payment_methods", null}, new Annotation[][]{null, null, null});
            case 17:
                qfa0 qfa0Var = rfa0.Companion;
                return PaymentMethod$Type.Companion.serializer();
            case 18:
                qfa0 qfa0Var2 = rfa0.Companion;
                return new p53(pfa0.a, 0);
            case 19:
                return new hca0();
            case 20:
                wja0 wja0Var = xja0.Companion;
                return new p53(yja0.a, 0);
            case 21:
                return vez0.g("com.yandex.go.overdraft.data.model.PaymentState", PaymentState.values(), new String[]{"debt", "awaiting_sbp_tokens", "awaiting_for_sbp_user_interaction", "processing", "no_debt", null}, new Annotation[][]{null, null, null, null, null, null});
            case 22:
                com.yandex.go.payments.api.shared.model.d dVar4 = PaymentSummaryEntryPoints.Companion;
                return new p53(auu0.a, 0);
            case 23:
                com.yandex.go.payments_widgets.section.payments.a aVar3 = PaymentWidgetsDataDto.Companion;
                return DivkitSnippet.Companion.serializer();
            case 24:
                com.yandex.go.payments_widgets.section.payments.a aVar4 = PaymentWidgetsDataDto.Companion;
                return DivkitSnippet.Companion.serializer();
            case 25:
                zsa0 zsa0Var = ata0.Companion;
                return CanMakeMoreOrders.Companion.serializer();
            case 26:
                zsa0 zsa0Var2 = ata0.Companion;
                return new p53(d20.a, 0);
            case 27:
                zsa0 zsa0Var3 = ata0.Companion;
                return new p53(ptq.a, 0);
            case 28:
                zsa0 zsa0Var4 = ata0.Companion;
                return new p53(nz1.a, 0);
            default:
                e1b0 e1b0Var = f1b0.Companion;
                return PersistenceTypeDto.Companion.serializer();
        }
    }
}
