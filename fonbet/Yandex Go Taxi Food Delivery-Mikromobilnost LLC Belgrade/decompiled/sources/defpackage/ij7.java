package defpackage;

import com.yandex.go.call_order_fallback.experiments.CallOrderFallbackExperiment;
import com.yandex.go.call_order_fallback.experiments.a;
import com.yandex.go.payments.data.model.CardDto;
import com.yandex.go.payments.data.model.VerifyStrategy;
import com.yandex.go.payments.data.model.f;
import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.payments.data.model.response.s;
import com.yandex.go.taxi.order.cancel.paid.ui.CancelledOrderCostModalView;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.cancel.CancelSimilarOrdersNotification;
import com.yandex.go.taxi.order.models.api.cancel.z;
import com.yandex.go.zone.dto.objects.CancelReasonsGrouped;
import com.yandex.go.zone.dto.objects.CancelReasonsGrouped$CancelReason$$serializer;
import com.yandex.go.zone.dto.objects.CancelReasonsGrouped$Group$$serializer;
import com.yandex.go.zone.dto.objects.v;
import com.yandex.go.zone.dto.objects.w;
import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationInputState;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardCvvValidationResult;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardNumberValidationResult;
import defpackage.e78;
import java.lang.annotation.Annotation;
import java.util.UUID;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.carplates.experiments.CarPlateAppearanceExperiment;
import ru.yandex.taxi.scooters.data.model.VehicleType;

/* loaded from: classes5.dex */
public final /* synthetic */ class ij7 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ ij7(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String costString$lambda$0;
        String costMessage$lambda$0;
        zy11 zy11Var;
        switch (this.a) {
            case 0:
                a aVar = CallOrderFallbackExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 1:
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 2:
                q8v q8vVar = new q8v();
                q8vVar.i(0);
                return q8vVar.f();
            case 3:
                return new bu7();
            case 4:
                v vVar = CancelReasonsGrouped.Companion;
                return new p53(CancelReasonsGrouped$CancelReason$$serializer.INSTANCE, 0);
            case 5:
                v vVar2 = CancelReasonsGrouped.Companion;
                return new p53(CancelReasonsGrouped$Group$$serializer.INSTANCE, 0);
            case 6:
                w wVar = CancelReasonsGrouped.Group.Companion;
                return new p53(auu0.a, 0);
            case 7:
                return new o4o("com.yandex.go.taxi.order.models.api.cancel.CancelSimilarAction.CancelOrders", iz7.INSTANCE, new Annotation[0]);
            case 8:
                return new o4o("com.yandex.go.taxi.order.models.api.cancel.CancelSimilarAction.DoNothing", kz7.INSTANCE, new Annotation[0]);
            case 9:
                return new o4o("com.yandex.go.taxi.order.models.api.cancel.CancelSimilarAction.Unknown", mz7.INSTANCE, new Annotation[0]);
            case 10:
                return new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "CancelSimilarOrdersFeatureInteractor");
            case 11:
                z zVar = CancelSimilarOrdersNotification.Companion;
                return new p53(auu0.a, 0);
            case 12:
                z zVar2 = CancelSimilarOrdersNotification.Companion;
                return CancelSimilarOrdersNotification.ModalType.Companion.serializer();
            case 13:
                return vez0.g("com.yandex.go.taxi.order.models.api.cancel.CancelSimilarOrdersNotification.ModalType", CancelSimilarOrdersNotification.ModalType.values(), new String[]{"order_card", "image"}, new Annotation[][]{null, null});
            case 14:
                return new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "CancelSimilarOrdersPresenter");
            case 15:
                return new oke(qoi0.a(vm50.class), new v5e0(qoi0.a(vm50.class), new Annotation[0]), new KSerializer[0]);
            case 16:
                costString$lambda$0 = CancelledOrderCostModalView.getCostString$lambda$0();
                return costString$lambda$0;
            case 17:
                costMessage$lambda$0 = CancelledOrderCostModalView.getCostMessage$lambda$0();
                return costMessage$lambda$0;
            case 18:
                i48 i48Var = j48.Companion;
                return VehicleType.Companion.serializer();
            case 19:
                s68 s68Var = CarPlateAppearanceExperiment.Companion;
                return jsq0.Companion.serializer(CarPlateAppearanceExperiment.CarPlateUsage.Companion.serializer());
            case 20:
                return vez0.g("ru.yandex.taxi.carplates.experiments.CarPlateAppearanceExperiment.CarPlateUsage", CarPlateAppearanceExperiment.CarPlateUsage.values(), new String[]{"order_list_item", "single_order_card", "state_bar", "car_map_object"}, new Annotation[][]{null, null, null, null});
            case 21:
                y68 y68Var = a78.Companion;
                return new k8u(auu0.a, u68.a, 1);
            case 22:
                h78 h78Var = e78.Companion;
                return new k8u(auu0.a, c78.a, 1);
            case 23:
                d78 d78Var = e78.a.Companion;
                return new k8u(auu0.a, f78.a, 1);
            case 24:
                s sVar = Card.Companion;
                return Card.VerifyStrategy.Companion.serializer();
            case 25:
                return vez0.g("com.yandex.go.payments.data.model.response.Card.VerifyStrategy", Card.VerifyStrategy.values(), new String[]{"card_antifraud", null}, new Annotation[][]{null, null});
            case 26:
                bp8 bp8Var = new bp8(null, null);
                return new s98("", "", CardActivationInputState.CARD, null, v98.a, CardCvvValidationResult.VALID, CardNumberValidationResult.VALID, YBProduct.PRO, bp8Var, null, null, null, null, null, null);
            case 27:
                return UUID.randomUUID().toString();
            case 28:
                zy11Var = zy11.a;
                return zy11Var;
            default:
                f fVar = CardDto.Companion;
                return VerifyStrategy.Companion.serializer();
        }
    }
}
