package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.payments.cards.nfc.experiments.NfcScanCardExperiment;
import com.yandex.go.ridetech.locationsdk.experiment.dto.OnJumpOrDivergenceSimpleDto;
import com.yandex.go.ridetech.locationsdk.experiment.dto.b;
import com.yandex.go.shortcuts.dto.request.OfferSupportedFeature;
import com.yandex.go.shortcuts.dto.request.f;
import com.yandex.go.shortcuts.impl.next.button.NextButtonInShortcut;
import com.yandex.go.shortcuts.impl.next.button.a;
import com.yandex.go.shortcuts.models.OfferType;
import com.yandex.go.zone.dto.objects.Notification;
import com.yandex.go.zone.dto.objects.ScheduledOrderDescriptionItem$$serializer;
import com.yandex.go.zone.dto.objects.o2;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment;
import ru.yandex.taxi.address.experiment.NextButtonShowStrategy;
import ru.yandex.taxi.address.experiment.i;
import ru.yandex.taxi.address.experiment.k;
import ru.yandex.taxi.address.experiment.l;
import ru.yandex.taxi.address.experiment.n;

/* loaded from: classes9.dex */
public final /* synthetic */ class j660 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ j660(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                k660 k660Var = NewbiesRedesignPointsABExperiment.Companion;
                return new p53(m660.e, 0);
            case 1:
                n660 n660Var = i.Companion;
                return new p53(auu0.a, 0);
            case 2:
                n660 n660Var2 = i.Companion;
                return NewbiesRedesignPointsABExperiment.SummaryAddressStyle.Companion.serializer();
            case 3:
                n660 n660Var3 = i.Companion;
                return NewbiesRedesignPointsABExperiment.SummaryAddressStyle.Companion.serializer();
            case 4:
                o660 o660Var = k.Companion;
                return new p53(auu0.a, 0);
            case 5:
                o660 o660Var2 = k.Companion;
                return NewbiesRedesignPointsABExperiment.SummaryAddressStyle.Companion.serializer();
            case 6:
                o660 o660Var3 = k.Companion;
                return NewbiesRedesignPointsABExperiment.SummaryAddressStyle.Companion.serializer();
            case 7:
                return new o4o("ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment.OverrideRule.UnknownOverride", l.INSTANCE, new Annotation[0]);
            case 8:
                p660 p660Var = n.Companion;
                return new p53(auu0.a, 0);
            case 9:
                p660 p660Var2 = n.Companion;
                return NewbiesRedesignPointsABExperiment.SummaryAddressStyle.Companion.serializer();
            case 10:
                p660 p660Var3 = n.Companion;
                return NewbiesRedesignPointsABExperiment.SummaryAddressStyle.Companion.serializer();
            case 11:
                return vez0.g("ru.yandex.taxi.address.experiment.NewbiesRedesignPointsABExperiment.SummaryAddressStyle", NewbiesRedesignPointsABExperiment.SummaryAddressStyle.values(), new String[]{"city_with_address", "only_city", "city_with_address_reversed"}, new Annotation[][]{null, null, null});
            case 12:
                a aVar = NextButtonInShortcut.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 13:
                return vez0.g("ru.yandex.taxi.address.experiment.NextButtonShowStrategy", NextButtonShowStrategy.values(), new String[]{null, "when_has_destination", "always"}, new Annotation[][]{null, null, null});
            case 14:
                com.yandex.go.payments.cards.nfc.experiments.a aVar2 = NfcScanCardExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 15:
                vd60 vd60Var = wd60.Companion;
                return new p53(auu0.a, 0);
            case 16:
                o2 o2Var = Notification.Companion;
                return Notification.Type.Companion.serializer();
            case 17:
                o2 o2Var2 = Notification.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 18:
                o2 o2Var3 = Notification.Companion;
                return new p53(ScheduledOrderDescriptionItem$$serializer.INSTANCE, 0);
            case 19:
                return vez0.g("com.yandex.go.zone.dto.objects.Notification.Type", Notification.Type.values(), new String[]{"tariff_popup", "multiclass_assign", "preorder_promo", "requirement_card_title"}, new Annotation[][]{null, null, null, null});
            case 20:
                sg60 sg60Var = tg60.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 21:
                sg60 sg60Var2 = tg60.Companion;
                return new p53(auu0.a, 0);
            case 22:
                sg60 sg60Var3 = tg60.Companion;
                return new p53(auu0.a, 1);
            case 23:
                bq60 bq60Var = cq60.Companion;
                return new eni0(qoi0.a(Float.class), nor.a);
            case 24:
                bq60 bq60Var2 = cq60.Companion;
                return new p53(bkp.a, 0);
            case 25:
                f fVar = OfferSupportedFeature.Companion;
                return OfferType.Companion.serializer();
            case 26:
                f fVar2 = OfferSupportedFeature.Companion;
                return new p53(cm2.a, 0);
            case 27:
                f fVar3 = OfferSupportedFeature.Companion;
                return new p53(auu0.a, 0);
            case 28:
                return vez0.g("com.yandex.go.shortcuts.models.OfferType", OfferType.values(), new String[]{null, null, Constants.DEEPLINK, "taxi:expected-destination", "media-stories", "taxi:route-input", "header-deeplink", "eats-based:superapp", "drive:fixpoint-offers", "taxi:header-summary-redirect", "header-action-driven", "action-driven", "action-driven-thumb", "personal:action-driven", "personal_slider", "delivery_dashboard", "marketplace", "list-item:action-driven", "round-button:action-driven", "square-button:action-driven"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            default:
                b bVar = OnJumpOrDivergenceSimpleDto.Companion;
                return new p53(auu0.a, 1);
        }
    }
}
